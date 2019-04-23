Source: https://stackoverflow.com/questions/33199923/undefined-method-comments-path-for-class-rails

You encounter this error when you have a nested routes.

```
resources :photos do
  resources :comments
end
```

undefined method `comments_path' for #<#<Class:… > (RAILS)

To fix:

```
<%= form_for [@picture, @comment] do |f| %>
  <%= f.label :comments %>
  <%= f.text_area :comments %>
  <%= f.submit 'Leave Comment' %>
<% end %>
```
