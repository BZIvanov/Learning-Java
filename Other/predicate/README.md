# Predicate filter

## Explanation:

1. **Predicate<? super User> predicate** → This is a lambda expression that checks if a **User** object's **id** matches the given **id**.
2. **users.stream().filter(predicate)** → Filters the **users** list based on the **predicate**.
3. **findFirst().orElseThrow()** → Retrieves the first matching user or throws an exception if not found.
4. `Predicate<? super User>` → Allows filtering on **User** and any of its parent classes (if they existed)
