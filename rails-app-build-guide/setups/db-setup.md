# SETUP

## Create a dev folder

```bash
mkdir dev
```

Note: This is just for organizing files. This step is not necessary

## Go to dev folder

cd dev

## Create a new Rails App with PostgreSQL as database

```bash
rails new YOUR_APP_NAME --database=postgresql
```

## Edit  `database.yml`

### After this line: `pool: <%= ENV.fetch("RAILS_MAX_THREADS") { 5 } %>`

### Add this code block:

```
username: postgres
password: password
host: localhost
```

### After this line: database: YOUR_APP_NAME_production

Comment out this code block:
# username: YOUR_APP_NAME
# password: <%= ENV['FLIXTER_DATABASE_PASSWORD'] %>
