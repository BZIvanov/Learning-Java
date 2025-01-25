# Java Advanced

## Java Memory

### Stack

Stack memory is used for managing method execution and local variables.

The data on the stack is short-lived, existing only during the execution of a method. Once the method finishes execution, the stack frame for that method is removed, and the memory is reclaimed.

Access to stack memory is fast because it is managed in a sequential manner, with memory being allocated and deallocated automatically by the Java Virtual Machine (JVM).

### Heap

Heap memory is used for dynamic memory allocation of objects

Objects on the heap live until they are no longer referenced by any part of the program. The JVM's garbage collector reclaims heap memory by removing objects that are no longer needed.

Access to heap memory is slower compared to stack memory due to the need for dynamic memory management and garbage collection.

### Metaspace

Metaspace is a memory area used for class metadata and is separate from both the stack and the heap.

### Garbage collector

The garbage collector is a part of the Java Virtual Machine (JVM) that automatically manages memory by identifying and removing objects that are no longer in use, freeing up space in the heap for new objects. This process helps prevent memory leaks and reduces the need for manual memory management. The garbage collector works by periodically scanning the heap, finding objects that are no longer reachable by any active reference, and reclaiming their memory.

## Stack and Queue

### Stack

Stack is a data structure working with LIFO (last in first out) principle.

_Basic example_:

```java
ArrayDeque<Integer> myStack = new ArrayDeque<>();
```

_Common methods:_

- push(element)
- pop()
- peek()

### Queue

A **Queue** is a data structure that works on the **FIFO (First In, First Out)** principle. It is commonly used in task scheduling, managing requests, and other scenarios where elements are processed in the order they arrive.

```java
Queue<Integer> myQueue = new ArrayDeque<>();

myQueue.offer(10); // Adds 10 to the queue
myQueue.offer(20); // Adds 20 to the queue
System.out.println(myQueue.peek()); // Retrieves, but does not remove, the head (10)
System.out.println(myQueue.poll()); // Retrieves and removes the head (10)
System.out.println(myQueue); // Remaining elements: [20]
```

#### Queue implementations

- **ArrayDeque**
  - A double-ended queue implementation, which is efficient for both FIFO and LIFO operations.
  - Preferred over `LinkedList` for queues.
- **LinkedList**
  - Implements both `Queue` and `Deque` interfaces.
  - Can be used as a queue or a stack.
- **PriorityQueue**

  - A special queue where elements are ordered based on their natural order or a custom comparator.

  ```java
  PriorityQueue<Integer> pq = new PriorityQueue<>();
  pq.offer(30);
  pq.offer(10);
  pq.offer(20);
  System.out.println(pq.poll()); // Retrieves and removes the smallest element (10)
  ```

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
