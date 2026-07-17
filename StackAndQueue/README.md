# Stack and Queue

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

## Stack

Stack is a data structure working with LIFO (last in first out) principle.

_Basic example_:

```java
ArrayDeque<Integer> myStack = new ArrayDeque<>();
```

_Common methods:_

- push(element)
- pop()
- peek()

## Queue

A **Queue** is a data structure that works on the **FIFO (First In, First Out)** principle. It is commonly used in task scheduling, managing requests, and other scenarios where elements are processed in the order they arrive.

```java
Queue<Integer> myQueue = new ArrayDeque<>();

myQueue.offer(10); // Adds 10 to the queue
myQueue.offer(20); // Adds 20 to the queue
System.out.println(myQueue.peek()); // Retrieves, but does not remove, the head (10)
System.out.println(myQueue.poll()); // Retrieves and removes the head (10)
System.out.println(myQueue); // Remaining elements: [20]
```

### Queue implementations

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
