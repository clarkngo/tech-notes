Source: https://stackoverflow.com/questions/21708256/no-route-matches-missing-required-keys-id

No route matches missing required keys: [:id]

You need to include the user as well since its a nested route. So something like:
```
<td><%= link_to "Edit", edit_user_item_path(@user, item) %></td>
```
