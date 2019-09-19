# TechModuleJava

## StringBuilder
StringBuilder making working with strings very fast because for example concatenating is usually slow operation.

Basic example:
    `StringBuilder sb = new StringBuilder();`

It is operating the string with methods. Example methods are *.append* and more

## Map / Dictionary

* **HashMap**
    It stores key, value pairs.

    Basic example:
    `Map<String, String> myMap = new HashMap<>();`

* **LinkedHashMap**
    It stores key, value pairs and keep the insertion order.

    Basic example:
    `Map<String, String> myMap = new LinkedHashMap<>();`

* **TreeMap**
    It stores key, value pairs where the keys are sorted on some criteria.

    Basic example:
    `Map<Double, Integer> myMap = new TreeMap<>();`

## Set

It stores only unique elements.
    Basic example:
    `Set<Integer> mySet = new HashSet<>();`

# JavaAdvanced

## Stack and Queue
### Stack
Stack is a data structure working with LIFO (last in first out) principle.

*Basic example*:
    `ArrayDeque<Integer> myStack = new ArrayDeque<>();`

*Common methods:*
- push(element)
- pop()
- peek()

### Queue
Queue is a data structure working with FIFO (first in first out) principle

*Basic example*:
    `ArrayDeque<Integer> myQueue = new ArrayDeque<>();`

*Common methods:*
- offer(element)
- poll()
- peek()    

## Sets and Maps
### Set
The **Set** keeps only unique elements. The types of sets are:
- HashSet - it keeps elements randomly ordered, the insertion order is nor preserved
*Basic example*:
    `HashSet<Integer> myData = new HashSet<>();`
- LinkedHashSet - it keep the order of appearance/insertion
*Basic example*:
    `LinkedHashSet<Integer> myData = new LinkedHashSet<>();`
- TreeSet - the elements are ordered incrementally
*Basic example*:
    `TreeSet<Integer> myData = new TreeSet<Integer>();`

### Map 
The **Map** keeps key-value pairs. The types of maps are:
- HasMap - it keeps elements randomly ordered, the insertion order is nor preserved
*Basic example*:
    `HashMap<String, Integer> myData = new HashMap<>();`
- LinkedHashMap - it keep the order of appearance/insertion
*Basic example*:
    `LinkedHashMap<String, Integer> myData = new LinkedHashMap<>();`
- TreeMap - the elements are ordered incrementally
*Basic example*:
    `TreeMap<String, Integer> myData = new TreeMap<Integer>();`

