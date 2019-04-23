Modifying the User Model
First, add `devise :confirmable` to your `models/user.rb` file
```
devise :registerable, :confirmable
```

Create a New Migration
Then, do the migration as:

rails g migration add_confirmable_to_devise
Will generate `db/migrate/YYYYMMDDxxx_add_confirmable_to_devise.rb`. Add the following to it in order to do the migration.

```
class AddConfirmableToDevise < ActiveRecord::Migration
  # Note: You can't use change, as User.update_all will fail in the down migration
  def up
    add_column :users, :confirmation_token, :string
    add_column :users, :confirmed_at, :datetime
    add_column :users, :confirmation_sent_at, :datetime
    # add_column :users, :unconfirmed_email, :string # Only if using reconfirmable
    add_index :users, :confirmation_token, unique: true
    # User.reset_column_information # Need for some types of updates, but not for update_all.
    # To avoid a short time window between running the migration and updating all existing
    # users as confirmed, do the following
    User.update_all confirmed_at: DateTime.now
    # All existing user accounts should be able to log in after this.
  end

  def down
    remove_columns :users, :confirmation_token, :confirmed_at, :confirmation_sent_at
    # remove_columns :users, :unconfirmed_email # Only if using reconfirmable
  end
end
```

You can also generate the corresponding Devise views if they have not yet been created:
```
rails generate devise:views users
```
Do the migration `rake db:migrate`

Restart the server.

If you are not using :reconfirmable (i.e leave the commented out lines as they are in the change method described above), update the configuration in config/initializers/devise.rb

`config.reconfirmable = false`
Before you can actually send the confirmation mail, you need the `Devise::Mailer` or a custom mailer configured.

Source: https://github.com/plataformatec/devise/wiki/How-To:-Add-:confirmable-to-Users
Source: https://github.com/plataformatec/devise/wiki/How-To:-Use-custom-mailer

`/config/initializers/devise.rb` -- change config
```
config.reconfirmable = false
```
`/config/environments/development.rb`
`/config/environments/test.rb`
```
config.action_mailer.default_url_options = { host: 'localhost', port: 3000 }  
```
Create /spec/mailers/devise_mailer_spec.rb

```
require "rails_helper"
RSpec.describe Devise::Mailer do
 it "sends a confirmation email to correct email with custom text" do
    user = FactoryBot.create(:user)
    confirmation_email = Devise.mailer.deliveries.last

    expect(user.email).to eq confirmation_email.to[0]
    expect(confirmation_email.body.to_s).to have_content "Welcome jdoe1@example.com!\n\nYou can confirm your account email through the link below:\n\nConfirm my account\n"
 end 
end

```

Create /spec/features/user_sign_up_confirmation.rb

```
require 'rails_helper'

RSpec.feature "user signup process confirmation", type: :feature do
  scenario 'user signup' do
    # arrange
    visit "/users/sign_up"
    
    fill_in 'Email', with: 'jdoe@example.com'
    # cannot use Password because it appears in Password Confirmation
    fill_in 'user_password', with: 'password'
    fill_in 'Password confirmation', with: 'password'

    # act
    click_button 'Sign up'

    # assert
    expect(page).to have_content 'Success A message with a confirmation link has been sent to your email address. Please follow the link to activate your account.' 
  end
end

```
