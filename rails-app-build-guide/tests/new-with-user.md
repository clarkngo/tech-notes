# Test for create action

## Go to controller spec folder

```
/APP_NAME/spec/controllers/courses
```

## Adding the following
```
require 'rails_helper'

RSpec.describe CoursesController, type: :controller do
  describe "courses#new action" do
    it "should require users to be logged in" do
      get :new
      expect(response).to redirect_to new_user_session_path
    end

    it "should successfully show the new form " do
      get :new
      expect(response).to have_http_status(:success)
    end
  end
end
```


## Error 1:
```
  1) CoursesController courses#new action should require users to be logged in
     Failure/Error: expect(response).to redirect_to new_user_session_path
     
       Expected response to be a <3XX: redirect>, but was a <200: OK>
```

To fix, update `courses_controller.rb`:

```
  def new
    @course = Course.new
  end
```

## Error 2:

```
  1) CoursesController courses#new action should successfully show the new form 
     Failure/Error: get :new
     
     ActionController::UrlGenerationError:
       No route matches {:action=>"new", :controller=>"courses"}
```             

To fix, update `courses_controller.rb`:

```
class CoursesController < ApplicationController
  def new
  end
end
```

## Error 3:

```
 1) CoursesController courses#new action should successfully show the new form 
     Failure/Error: get :new
     
     ActionController::UnknownFormat:
       CoursesController#new is missing a template for this request format and variant.
     
       request.formats: ["text/html"]
       request.variant: []
     
       NOTE! For XHR/Ajax or API requests, this action would normally respond with 204 No Content: an empty white screen. Since you're loading it in a web browser, we assume that you expected to actually render a template, not nothing, so we're showing an error to be extra-clear. If you expect 204 No Content, carry on. That's what you'll get from an XHR or API request. Give it a shot.
```             

To fix, create a `new.html.erb` in `app/assets/views/courses`:
