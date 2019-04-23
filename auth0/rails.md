
Error:
```
rbenv: version `2.3.1' is not installed (set by /Users/clarkngo/dev/rails-projects/auth0-rubyonrails-sample/01-Login/.ruby-version)
```
Execute:
```
rbenv install 2.3.1
```
Error:
```
rbenv: bundle: command not found

The `bundle' command exists in these Ruby versions:
  2.5
  2.5.3
```

Execute:
```
gem install bundler
```

Error:
```
Gem::LoadError (Specified 'sqlite3' for database adapter, but the gem is not loaded. Add `gem 'sqlite3'` to your Gemfile (and ensure its version is at the minimum required by ActiveRecord).)
```
Execute:
```
gem 'sqlite3', '~> 1.3.13'
```

```
bundle update
```
Error:
```
OmniAuth::Error (missing_client_id):
```
