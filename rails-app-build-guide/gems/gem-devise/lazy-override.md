# Lazy Overide of Devise controller actions

The devise documentation (https://github.com/plataformatec/devise#strong-parameters) suggests a "lazy way" of setting this up.
```
class ApplicationController < ActionController::Base
  before_action :configure_permitted_parameters, if: :devise_controller?

  def configure_permitted_parameters
    devise_parameter_sanitizer.permit(:sign_up, keys: [:avatar])
    devise_parameter_sanitizer.permit(:account_update, keys: [:avatar])
  end
end
```

Source: https://stackoverflow.com/questions/42572124/adding-custom-parameters-to-devise-registration-unpermitted-parameters
