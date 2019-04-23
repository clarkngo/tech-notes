# Add Column

In your terminal,

```bash
rails generate migration AddCategoryInCourses
```

Locate migration file

Format:
`add_column :TABLE_NAME, :COLUMN_NAME, :VARIABLE_TYPE`

```
class AddCategoryInCourses < ActiveRecord::Migration[5.2]
  def change
    add_column :courses, :category, :string
  end
end
```
