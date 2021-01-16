# Java

## StringBuilder

StringBuilder making working with strings very fast because for example concatenating is usually slow operation.

Basic example:
`StringBuilder sb = new StringBuilder();`

It is operating the string with methods. Example methods are _.append_ and more

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

## Set

It stores only unique elements.
Basic example:
`Set<Integer> mySet = new HashSet<>();`

## Stack and Queue

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
