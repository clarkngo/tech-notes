You would use collection_select if you had a model for the scores. Something like:

f.collection_select :score_id, Score.all, :id, :name
See the API docs for collection_select

https://stackoverflow.com/questions/6191352/rails-form-for-with-collection-select
