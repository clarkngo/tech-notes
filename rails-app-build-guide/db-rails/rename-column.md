# Rename Column

In your terminal,

```bash
rails generate migration ChangeColumnNames
```

Locate migration file

Format:
`remove_column :TABLE_NAME, :COLUMN_NAME`

```
class ChangeColumnNames < ActiveRecord::Migration[5.2]
  def change
    rename_column :courses, :email, :email_address
  end
end
```
