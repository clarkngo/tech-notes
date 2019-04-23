# Registering a Comment Model

## Error: You're trying to register ActiveAdmin::Comment as Comment, but the existing ActiveAdmin::Resource config was built for Comment!

### Comments

By default Active Admin includes comments on resources. Sometimes, this is undesired. To disable comments:
```
# You can completely disable comments:
config.comments = false
#
# You can change the name under which comments are registered:
config.comments_registration_name = 'AdminComment'
#
```

Source: https://activeadmin.info/1-general-configuration.html
