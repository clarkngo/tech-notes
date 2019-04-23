Run
```
bundle install
```
Output
```
rbenv: version `ruby-2.6.1' is not installed (set by /Users/clarkngo/dev/rails-projects/DoublePay/.ruby-version)
```

Run
```
rbenv install 2.6.1
```

Output
```
ruby-build: definition not found: 2.6.1

See all available versions with `rbenv install --list'.

If the version you need is missing, try upgrading ruby-build:

  cd /Users/clarkngo/.rbenv/plugins/ruby-build && git pull && cd -
No gem directory for 2.6.1
```

Run
```
cd /Users/clarkngo/.rbenv/plugins/ruby-build && git pull && cd -
```

Output
```
...
 create mode 100644 share/ruby-build/truffleruby-1.0.0-rc11
 create mode 100644 share/ruby-build/truffleruby-1.0.0-rc12
 create mode 100644 share/ruby-build/truffleruby-1.0.0-rc13
 create mode 100644 share/ruby-build/truffleruby-1.0.0-rc14
/Users/clarkngo/dev/rails-projects/DoublePay
```

Run
```
rbenv install 2.6.1
```

Output
- success

Run
```
bundle install
```

Output
```
...
2.6.0/rubygems.rb:283:in `find_spec_for_exe': Could not find 'bundler' (1.17.2) 
...
```

Run
```
gem install bundler
```

Output
```
Fetching bundler-2.0.1.gem
Successfully installed bundler-2.0.1
Parsing documentation for bundler-2.0.1
Installing ri documentation for bundler-2.0.1
Done installing documentation for bundler after 2 seconds
1 gem installed
```

Run
```
bundle install
```

Output
```
Traceback (most recent call last):
	2: from /Users/clarkngo/.rbenv/versions/2.6.1/bin/bundle:23:in `<main>'
	1: from /Users/clarkngo/.rbenv/versions/2.6.1/lib/ruby/2.6.0/rubygems.rb:302:in `activate_bin_path'
/Users/clarkngo/.rbenv/versions/2.6.1/lib/ruby/2.6.0/rubygems.rb:283:in `find_spec_for_exe': Could not find 'bundler' (1.17.2) required by your /Users/clarkngo/dev/rails-projects/DoublePay/Gemfile.lock. (Gem::GemNotFoundException)
To update to the latest version installed on your system, run `bundle update --bundler`.
To install the missing version, run `gem install bundler:1.17.2`
```

Run
```
bundle update --bundler
```

Output
```
```

