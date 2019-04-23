# Add Index

In your terminal,

```bash
rails generate migration AddIndexCategoryIdToCourses
```

Locate migration file

Format:
`add_index :TABLE_NAME, :COLUMN_NAME`

```
class AddIndexCategoryIdToCourses < ActiveRecord::Migration[5.2]
  def change
    add_index :courses, :category_id
  end
end
```
