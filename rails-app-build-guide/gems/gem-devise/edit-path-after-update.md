# Edit Path After User Updates Account Information

Create controller Registrations
```bash
rails generate controller registrations
```

Example subclass/override (`registrations_controller.rb`):
```
class RegistrationsController < Devise::RegistrationsController

  protected

    def after_update_path_for(resource)
      edit_user_registration_path(resource)
    end
end
```
Example routing config (in `routes.rb`):
```
devise_for :users, :controllers => { :registrations => :registrations }
```
Source: https://github.com/plataformatec/devise/wiki/How-To:-Customize-the-redirect-after-a-user-edits-their-profile