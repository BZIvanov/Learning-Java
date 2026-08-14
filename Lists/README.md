# Lists

A list is an ordered collection that can grow and shrink while a program runs.
Java's `List` interface provides indexed access and common collection
operations, while classes such as `ArrayList` and `LinkedList` decide how the
elements are stored internally.

Complete the [Arrays](../Arrays/README.md) section first. The lessons in this
chapter also build on loops, interfaces, generics, and reference types covered
earlier in the curriculum.

## Learning path

Read the subsections in this order:

1. **[List basics](Basics/)** introduces `List`, `ArrayList`, element types,
   mutability, indexing, and the main operations for changing a list.
2. **[Iterating over lists](Iteration/)** compares indexed and enhanced loops,
   then introduces `Iterator` and `ListIterator`.
3. **[Reading and converting lists](InputAndConversion/)** covers a common
   console-input recipe and conversion between arrays and lists.
4. **[List references and copying](ReferencesAndCopying/)** explains aliases,
   shallow copies, and content equality.
5. **[LinkedList and choosing a list type](LinkedList/)** compares the internal
   structures and common operations of `ArrayList` and `LinkedList`.

Each subsection keeps its examples and common caveats beside the concept they
explain. Additional examples can be added to the relevant subsection without
turning this chapter index into another long lesson.

## Practice

Work through the [list exercises](tasks/Tasks.md) after completing the learning
path. They progress from adding, removing, merging, and rearranging elements to
command-driven list manipulation and more involved simulations.

## Official documentation

The local lessons provide the learning sequence and explanation. Use the
official Java 21 documentation for complete API contracts:

- [`List`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html)
- [`ArrayList`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html)
- [`LinkedList`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html)
- [`Iterator`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Iterator.html)
- [`ListIterator`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ListIterator.html)
