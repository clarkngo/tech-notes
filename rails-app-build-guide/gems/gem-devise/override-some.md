# Override Only Some Functionality of Devise

Have your controller setup and inheriting from Devise
Example:
```
RegistrationsController < Devise::RegistrationsController
```
Use `super`
```
def create
  super # this calls Devise::RegistrationsController#create
  # whenever a new user is created, create a new Vertifier and
  # populate the verifier.user_id the same user_id that was just created
  if resource.save
    @verifier = Verifier.new()
    @verifier.user_id = resource.id
    @verified.save
  end
end
```


Source: https://howilearnedrails.wordpress.com/2013/12/27/how-to-override-and-customize-the-devise-controller-in-rails/