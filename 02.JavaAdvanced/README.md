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

## Stack and Queue data types

### Stack

Stack is a data structure working with LIFO (last in first out) principle.

_Basic example_:
`ArrayDeque<Integer> myStack = new ArrayDeque<>();`

_Common methods:_

- push(element)
- pop()
- peek()

### Queue

Queue is a data structure working with FIFO (first in first out) principle

_Basic example_:
`ArrayDeque<Integer> myQueue = new ArrayDeque<>();`

_Common methods:_

- offer(element)
- poll()
- peek()

## Set

It stores only unique elements.
Basic example:
`Set<Integer> mySet = new HashSet<>();`

## Sets and Maps

### Set

The **Set** keeps only unique elements. The types of sets are:

- HashSet - it keeps elements randomly ordered, the insertion order is nor preserved
  _Basic example_:
  `HashSet<Integer> myData = new HashSet<>();`
- LinkedHashSet - it keep the order of appearance/insertion
  _Basic example_:
  `LinkedHashSet<Integer> myData = new LinkedHashSet<>();`
- TreeSet - the elements are ordered incrementally
  _Basic example_:
  `TreeSet<Integer> myData = new TreeSet<Integer>();`

### Map

The **Map** keeps key-value pairs. The types of maps are:

- HasMap - it keeps elements randomly ordered, the insertion order is nor preserved
  _Basic example_:
  `HashMap<String, Integer> myData = new HashMap<>();`
- LinkedHashMap - it keep the order of appearance/insertion
  _Basic example_:
  `LinkedHashMap<String, Integer> myData = new LinkedHashMap<>();`
- TreeMap - the elements are ordered incrementally
  _Basic example_:
  `TreeMap<String, Integer> myData = new TreeMap<Integer>();`

## Map / Dictionary

- **HashMap**
  It stores key, value pairs.

  Basic example:
  `Map<String, String> myMap = new HashMap<>();`

- **LinkedHashMap**
  It stores key, value pairs and keep the insertion order.

  Basic example:
  `Map<String, String> myMap = new LinkedHashMap<>();`

- **TreeMap**
  It stores key, value pairs where the keys are sorted on some criteria.

  Basic example:
  `Map<Double, Integer> myMap = new TreeMap<>();`
