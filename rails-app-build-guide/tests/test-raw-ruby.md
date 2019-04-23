# Ruby tests

In your project folder, create a `Gemfile`

```
group :development, :test do
  gem 'rspec'
end
```
Save the file. In order for the Gemfile to work, we need to add `source 'https://rubygems.org'` on the very top of the Gemfile.

Run the bundle install command

```bash
bundle install
```

Initialize a project with rspec tests
```bash
bundle exec rspec --init
```

Create a folder `lib`.
```bash
mkdir lib
```

Create a file called `lib/RUBY_FILE.rb`. Sample test:
```
require 'spec_helper'

RSpec.describe Image, type: :model do
  describe "blurring should work" do
    it "should blur a standard image" do
      input = [
        [0, 0, 0, 0],
        [0, 0, 0, 0],
        [0, 0, 0, 0],
        [0, 1, 0, 0],
        [0, 0, 0, 0],
        [0, 0, 0, 0]
      ]

      expected = [
        [0, 0, 0, 0],
        [0, 0, 0, 0],
        [0, 1, 0, 0],
        [1, 1, 1, 0],
        [0, 1, 0, 0],
        [0, 0, 0, 0]
      ]
     image = Image.new(input)
     expect(image.blur.data).to eq expected
    end
  end
end
```

Run tests
```bash
bundle exec rspec
```

Run specific test
```bash
rspec spec/NAME_OF_TEST.rb
```

In `spec/spec_helper.rb`:

Add `require 'RUBY_FILE'`
# a lot of comments
```
require 'image'
RSpec.configure do |config|
  # a lot of code

end
```