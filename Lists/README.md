# Lists

List is immutable, which means we cannot add additional elements.

Lists in Java are part of the `java.util` package and allow us to store ordered collections of elements. Some lists are mutable, while others, like those created with `List.of()`, are immutable.

## List syntax examples

```java
List<String> fruits = List.of("Apple", "Kiwi", "Banana");
```

## List types

### ArrayList

The ArrayList provides a resizable array implementation. Unlike arrays, which have a fixed size, an ArrayList can dynamically grow or shrink as needed.

#### Example

```java
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Kiwi");
fruits.add("Banana");
```

### LinkedList

The LinkedList implements a doubly-linked list, making it efficient for insertion and deletion operations compared to ArrayList.

#### Example

```java
LinkedList<String> fruits = new LinkedList<>();

fruits.add("Apple");
fruits.add("Kiwi");
fruits.add("Banana");
```

### Vector

The Vector is a legacy class that provides synchronized methods, making it thread-safe. However, it is less commonly used due to newer alternatives like ArrayList.

#### Example

```java
Vector<String> fruits = new Vector<>();

fruits.add("Apple");
fruits.add("Kiwi");
fruits.add("Banana");
```
