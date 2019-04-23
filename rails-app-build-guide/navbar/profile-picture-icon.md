# Profile Picture Icon

#### create a thumb version and auto resize image on upload

In `app/uploaders/avatar_uploader.rb`

```
include CarrierWave::MiniMagick

## some code ###

version :thumb do
  process resize_to_fit: [50, 50]
end

process resize_to_fill: [180, 180]
```

#### To allow upload picture during sign up and sign in (account update)

In `app/controllers/application_controller.rb`

```
class ApplicationController < ActionController::Base
  before_action :configure_permitted_parameters, if: :devise_controller?

  def configure_permitted_parameters
    devise_parameter_sanitizer.permit(:sign_up, keys: [:avatar])
    devise_parameter_sanitizer.permit(:account_update, keys: [:avatar])
  end
end
```

In views,

```
  <li class="nav-item">
    <div class="dropdown show">
      <a class="" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <%= image_tag current_user.avatar.thumb.url, class: 'profile-image' %>
      </a>
    
      <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
        <a class="dropdown-item" href="#">My Profile</a>
        <a class="dropdown-item" href="<%= edit_user_registration_path %>">Edit My Profile</a>
      </div>
    </div>
  </li>     
```
