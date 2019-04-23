
# CSS override fix

1 - Ensure that your Active Admin assets are not in the root folders which are applied to the whole application:
```
cd app/assets/javascripts
mkdir admin
mv active_admin.js.coffee admin/

cd ../stylesheets
mkdir admin
mv active_admin.css.scss admin/
```
2 - And actually, make sure that the assets are not included, via editing both files `assets/stylesheets/application.css` and `assets/javascripts/application.js` change `require_tree .` to `require_directory .`

3 - Now you need to change your Active Admin initializer to grab the two files you just excluded in steps 1 and 2: In file config/initializers/active_admin.rb add the following lines:

```
config.clear_stylesheets!
config.register_stylesheet 'admin/active_admin.css'

config.clear_javascripts!
config.register_javascript 'admin/active_admin.js'
```

https://stackoverflow.com/questions/22267512/how-to-stop-an-active-admin-css-scss-file-changing-the-whole-look-of-my-applicat
