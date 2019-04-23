# Carrierwave with Devise

Install gem `devise`

https://github.com/plataformatec/devise

## Installation
In your Gemfile,

```
gem 'carrierwave',             '~> 1.x.x'
```

In your terminal,

```bash
bundle install
```

## Getting Started
Start off by generating an uploader:

rails generate uploader Avatar
this should give you a file in:

```
app/uploaders/avatar_uploader.rb
```

Add a string column to the model you want to mount the uploader by creating a migration:

```
rails g migration add_avatar_to_users avatar:string
rails db:migrate
```

Open your model file and mount the uploader:

```
class User < ActiveRecord::Base
  mount_uploader :avatar, AvatarUploader
end
```

## Common Gotcha: Carrierwave. image field displaying as #<ActionDispatch::Http::UploadedFile:0x007f51c0d88a88> instead of image name

check your model

```
  mount_uploader :avatar, AvatarUploader
```


## In case you want to permit additional parameters (the lazy way™), you can do so using a simple before filter in your ApplicationController:

https://github.com/plataformatec/devise

```
class ApplicationController < ActionController::Base
  before_action :configure_permitted_parameters, if: :devise_controller?

  protected

  def configure_permitted_parameters
    devise_parameter_sanitizer.permit(:sign_up, keys: [:avatar])
  end
end
```

## Switch Carrierwave to S3
http://blog.thefirehoseproject.com/posts/switching-carrierwave-to-use-s3-with-heroku-and-localhost/

## Using MiniMagick for adjusting resolution

Edit `app/uploaders/avatar_uploader.rb`

```
include CarrierWave::MiniMagick
```

```
process resize_to_fill: [800, 350]
```

To check image
```
<%= image_tag user.avatar.to_s %>
```


