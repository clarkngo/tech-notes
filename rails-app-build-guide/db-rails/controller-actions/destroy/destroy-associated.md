## Destroy Associated 


If you have a relation has_many in Post model, you can set a dependent option to remove all associated comments
```
has_many :comments, dependent: :destroy
```

This way you can simplify the function:

```
def delete_post
  if params[:alibaba]
    Post.find(params[:id]).destroy
  else
    PostMotivation.find(params[:id]).destroy
  end
  redirect_to admin_path
end
```

Source: https://stackoverflow.com/questions/24805936/rails-4-deleting-comments-belonging-to-a-certain-post
