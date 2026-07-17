# Set and Map

## Set

Set stores only unique elements.

### Examples

```java
Set<Integer> mySet = new HashSet<>();
```

### Set types

The types of sets are:

- **HashSet** - it keeps elements randomly ordered, the insertion order is nor preserved`

  ```java
  HashSet<Integer> myData = new HashSet<>();
  ```

- **LinkedHashSet** - it keep the order of appearance/insertion

  ```java
  LinkedHashSet<Integer> myData = new LinkedHashSet<>();
  ```

- **TreeSet** - the elements are ordered incrementally

  ```java
  TreeSet<Integer> myData = new TreeSet<Integer>();
  ```

## Map

The **Map** interface in Java represents a collection of key-value pairs where each key is unique.

### Common implementations

#### **HashMap**

- Stores elements in a hash table.
- Does **not preserve the insertion order**; elements are stored in random order.
- Allows `null` keys and values.

##### Examples

```java
HashMap<String, Integer> myData = new HashMap<>();
myData.put("Apple", 3);
myData.put("Kiwi", 5);
```

#### LinkedHashMap

- Stores elements in a hash table with a linked list to maintain the **insertion order**.
- Slower than `HashMap` due to its additional structure.

##### Examples

```java
LinkedHashMap<String, Integer> myData = new LinkedHashMap<>();
myData.put("Apple", 3);
myData.put("Kiwi", 5);
```

#### TreeMap

- Stores elements in a **sorted order** (natural ordering of keys or a custom comparator).
- Backed by a Red-Black Tree, with O(log n) performance for basic operations.
- Does not allow `null` keys.

##### Examples

```java
TreeMap<String, Integer> myData = new TreeMap<Integer>();
myData.put("Apple", 3);
myData.put("Kiwi", 5);
```

### Iterating over a Map

You can iterate over a `Map` in various ways. For example, using `entrySet()`:

```java
Map<String, Integer> myMap = new HashMap<>();
myMap.put("Apple", 3);
myMap.put("Kiwi", 5);

for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```
