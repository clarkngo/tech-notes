# Remove Column

In your terminal,

```bash
rails generate migration RemoveCodeInCourses
```

Locate migration file

Format:
`remove_column :TABLE_NAME, :COLUMN_NAME`

```
class RemoveCodeInCourses < ActiveRecord::Migration[5.2]
  def change
    remove_column :courses, :code
  end
end
```
