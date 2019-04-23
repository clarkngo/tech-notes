# Test for index action

## Go to controller spec folder

```
/APP_NAME/spec/controllers/courses
```

## Adding the following
```
require 'rails_helper'

RSpec.describe CoursesController, type: :controller do
  describe "courses#index action" do
    it "should successfully show the page" do
      get :index
      expect(response).to have_http_status(:success)
    end
  end
end
```


## Error 1:
```
  1) CoursesController grams#index action should successfully show the page
     Failure/Error: get :index
     
     ActionController::UrlGenerationError:
       No route matches {:action=>"index", :controller=>"courses"}
```

To fix, update `routes.rb`:

```
  resources :courses, only: [:index]
```

## Error 2:

```
  1) CoursesController courses#index action should successfully show the page
     Failure/Error: get :index
     
     AbstractController::ActionNotFound:
       The action 'index' could not be found for CoursesController
```             

To fix, update `courses_controller.rb`:

```
class CoursesController < ApplicationController
  def index
  end
end
```

## Error 3:

```
  1) CoursesController courses#index action should successfully show the page
     Failure/Error: get :index
     
     ActionController::UnknownFormat:
       CoursesController#index is missing a template for this request format and variant.
     
       request.formats: ["text/html"]
       request.variant: []
     
       NOTE! For XHR/Ajax or API requests, this action would normally respond with 204 No Content: an empty white screen. Since you're loading it in a web browser, we assume that you expected to actually render a template, not nothing, so we're showing an error to be extra-clear. If you expect 204 No Content, carry on. That's what you'll get from an XHR or API request. Give it a shot.
```             

To fix, create a `index.html.erb` in `app/assets/views/courses`:
