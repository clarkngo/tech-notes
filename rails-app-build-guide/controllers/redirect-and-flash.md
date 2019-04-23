As stated in the Rails API only :notice and :alert are by default applied as a flash hash value. If you need to set the :error value, you can do it like this:

```
redirect_to show_path, :flash => { :error => "Insufficient rights!" }
```

Source: https://stackoverflow.com/questions/7510418/rails-redirect-to-with-error-but-flasherror-empty
