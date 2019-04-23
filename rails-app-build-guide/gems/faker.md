# Faker

https://github.com/stympy/faker

## Installation
In your Gemfile,

```
gem 'faker'     '~>1.x.x'
```

In your terminal,

```bash
bundle install
```

In your `seeds.rb`,

```
Book.delete_all
Author.delete_all
Authorship.delete_all

book_list = []

50.times do
  Book.create(
    title: Faker::Book.title,
    genre: Faker::Book.genre,
    classification: Book.classifications.sample,
    book_type: Book.book_types.sample,
    year: rand(1900..2018)
  )
end

25.times do
  Author.create(
    first_name: Faker::Name.first_name,
    last_name: Faker::Name.last_name,
    age: Faker::Number.between(14,70)
  )
end

book_ids = Book.pluck(:id)
author_ids = Author.pluck(:id)

book_ids.each do |book_id|
  rand(1..4).times do
    Authorship.create!(
      book_id: book_id,
      author_id: author_ids.sample
    )
  end
end
```

## Execute seeds file

In your terminal,

```bash
rails db:seed
```
