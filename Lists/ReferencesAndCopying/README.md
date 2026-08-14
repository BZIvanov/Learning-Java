# List references and copying

Complete [List basics](../Basics/README.md) first. Lists are reference types, so
it is important to distinguish another reference to a list from a new list
object.

## Assignment creates another reference

As with arrays, assigning a list variable does not copy its elements:

```java
List<String> original = new ArrayList<>(List.of("A", "B"));
List<String> alias = original;

alias.set(0, "changed");
System.out.println(original); // [changed, B]
```

Both variables refer to the same list object, so a change made through either
variable is visible through the other one.

## Creating a shallow copy

Create a separate list when independent structure is needed:

```java
List<String> copy = new ArrayList<>(original);
```

This is a **shallow copy**. The two list structures are independent, so adding,
removing, or replacing an element in one list does not change the other list's
structure. If the elements are mutable objects, however, both lists still
refer to the same element objects.

Lists compare their contents with `equals`, so two different list objects can
be equal when they contain equal elements in the same order:

```java
List<Integer> first = List.of(1, 2, 3);
List<Integer> second = new ArrayList<>(first);

System.out.println(first.equals(second)); // true
```

## Common mistake

Do not expect assignment or a shallow copy to duplicate mutable element
objects. Copying an entire object graph is a separate design decision and is
not performed automatically by a list constructor.

Next, compare `ArrayList` with the alternative
[`LinkedList`](../LinkedList/README.md) implementation.
