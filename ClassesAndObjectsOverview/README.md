# Classes and Objects Overview

So far in this repository, most examples have been written inside a **single Java class** that contains the `main()` method.

That approach is useful while learning the fundamentals because it lets you focus on one concept at a time. Real Java applications, however, are usually divided into many classes. Each class describes one part of the program and has its own responsibility.

This section introduces the building blocks of object-oriented programming (OOP): classes, objects, fields, constructors, factory methods, instance methods, static members, packages, and object references.

---

## Why Do We Need Multiple Classes?

Imagine writing an application for a library.

Instead of placing every variable and method into one large file, it is easier to split the program into smaller classes:

```text
Library
Book
Member
Loan
```

Each class has its own job:

- `Book` stores information about a book.
- `Member` stores information about a library member.
- `Loan` represents a borrowed book.
- `Library` manages books, members, and loans.

Breaking a program into smaller classes makes the code easier to read, test, maintain, and reuse.

---

## What Is a Class?

A **class** is a blueprint or template used to create objects.

It defines:

- What data an object stores.
- What actions an object can perform.

For example, a `Car` class can describe that every car has a brand, model, color, and year.

```java
public class Car {
    String brand;
    String model;
    String color;
    int year;
}
```

The class itself is not a specific car. It only describes what a car object should contain.

---

## What Is an Object?

An **object** is an actual instance of a class.

If a class is the blueprint, an object is the real thing created from that blueprint.

```java
Car firstCar = new Car();
Car secondCar = new Car();
```

Both variables store `Car` objects, but each object can have different field values.

```java
firstCar.brand = "Toyota";
firstCar.model = "Corolla";
firstCar.color = "red";
firstCar.year = 2021;

secondCar.brand = "Honda";
secondCar.model = "Civic";
secondCar.color = "blue";
secondCar.year = 2023;
```

The class defines the structure. The objects hold the actual data.

---

## From Variables to Objects

Without objects, related data is often stored in separate variables:

```java
String firstBookTitle = "Clean Code";
String firstBookAuthor = "Robert C. Martin";
int firstBookPages = 464;

String secondBookTitle = "Effective Java";
String secondBookAuthor = "Joshua Bloch";
int secondBookPages = 416;
```

This works for very small programs, but it becomes messy quickly.

With objects, related information can stay together:

```java
Book firstBook = new Book("Clean Code", "Robert C. Martin", 464);
Book secondBook = new Book("Effective Java", "Joshua Bloch", 416);
```

This makes the code easier to understand because each `Book` object represents one complete thing.

---

# What You'll Learn in This Section

In the following pages, you will learn:

- What classes are.
- What objects are.
- How to create classes.
- How to create objects.
- Fields, also called instance variables.
- Constructors.
- Factory methods.
- Instance methods.
- The `this` keyword.
- Static fields and methods.
- Packages.
- Object references.

By the end of this section, you will be able to create your own classes, create objects from those classes, and organize them into a small Java application.

## Recommended Learning Order

1. **[ClassesAndObjects](ClassesAndObjects/)** - learn the relationship between a class and an object.
2. **[Fields](Fields/)** - store data inside objects.
3. **[Constructors](Constructors/)** - create objects with valid starting data.
4. **[Records](Records/)** - concise, immutable data carriers (a modern alternative to simple POJOs).
5. **[FactoryMethods](FactoryMethods/)** - create objects through named methods.
6. **[InstanceMethods](InstanceMethods/)** - add behavior to objects.
7. **[ThisKeyword](ThisKeyword/)** - understand how an object refers to itself.
8. **[StaticMembers](StaticMembers/)** - learn what belongs to the class instead of one object.
9. **[Packages](Packages/)** - organize classes into folders and namespaces.
10. **[ObjectReferences](ObjectReferences/)** - understand how object variables point to objects in memory.
11. **[tasks](tasks/)** - practice the concepts with small exercises.

## Key Idea

When writing Java, try to think in terms of **responsibilities**.

Ask yourself:

- What thing am I trying to model?
- What information does that thing need?
- What actions should that thing be able to perform?
- Which code belongs inside this class, and which code belongs somewhere else?

This way of thinking is the foundation for writing larger Java programs.
