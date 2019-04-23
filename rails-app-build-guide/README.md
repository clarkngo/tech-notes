# I keep forgetting how to build and the syntax, so here's a guide

## Create you Rails App and configure DB:

[DB setup](db-setup.md)

## Initialize DB:

```bash
rails db:create
```

## Test server

```bash
rails server -b 0.0.0.0 -p 3000
```

Shorcut command:

```bash
rails s
```

## Creating a Model

Format: rails generate model SINGULAR_NAME

```bash
rails generate model course
```

## Adding table and table columns

Go to generated migration file

```
t.string :name
t.text :description
```
If have a User model

```
t.string :name
t.text :description
t.integer :user_id

end 

add_index :courses, :user_id
```

Sample: 
```
class CreateCourses < ActiveRecord::Migration[5.2]
  def change
    create_table :courses do |t|
      t.string :code
      t.string :name
      t.text :description
      t.integer :user_id
      t.timestamps
    end

    add_index :courses, :user_id
  end
end
```

## Creating a Controller

Format: rails generate model PLURAL_NAME

```bash
rails generate controller courses
```

Tests
[index](tests/index.md)
[create new](tests/new.md)
