# Devise/Capybara Ambiguous match
With Capybara 2.1, this works:
```
  fill_in("Password", with: '123456', :match => :prefer_exact)
  fill_in("Password confirmation", with: '123456', :match => :prefer_exact)
```
From here :prefer_exact is the behaviour present in Capybara 1.x. If multiple matches are found, some of which are exact, and some of which are not, then the first eaxctly matching element is returned.

Source: https://stackoverflow.com/questions/14951124/devise-capybara-ambiguous-match
