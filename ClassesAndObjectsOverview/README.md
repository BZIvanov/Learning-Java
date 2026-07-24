# Classes and Objects overview

So far in this repository, every example has been written inside a **single Java class** containing the `main()` method.

This approach is useful when learning Java fundamentals because it allows us to focus on one concept at a time without introducing additional files or project structure.

However, real Java applications are built differently.

Instead of placing everything inside one class, a program is usually divided into many classes, each with its own responsibility.

This section introduces the building blocks of object-oriented programming (OOP) and explains how Java programs are organized using classes, objects, and packages.

---

## Why Do We Need Multiple Classes?

Imagine writing an application for a library.

Instead of putting everything into one file, it makes more sense to separate the program into multiple classes.

For example:

```text
Library
Book
Member
Loan
```

Each class has its own responsibility.

- `Book` stores information about a book.
- `Member` stores information about a library member.
- `Loan` represents a borrowed book.
- `Library` manages books and members.

Breaking a program into smaller classes makes the code easier to read, understand, maintain, and reuse.

---

## What Is a Class?

A **class** is a blueprint or template used to create objects.

It defines:

- What data an object stores.
- What actions an object can perform.

Think of a class as the design or plan for something.

For example:

- A house blueprint describes what a house should look like.
- A car blueprint describes how a car is built.

The blueprint itself is **not** the finished object.

It simply describes how one can be created.

---

## What Is an Object?

An **object** is an actual instance of a class.

If a class is a blueprint, an object is the real thing built from that blueprint.

For example:

Class:

```text
Car
```

Possible objects:

```text
Red Toyota Corolla
Blue Honda Civic
White Tesla Model 3
```

All three objects belong to the same class, but each object has its own data.

---

## Classes and Objects Work Together

A class defines the structure.

Objects use that structure.

For example, imagine the following class:

```java
class Car {
    String brand;
    int year;
}
```

Later, objects can be created from this class.

At this point, don't worry about the syntax or the `new` keyword.

You'll learn how to create objects in the following pages.

For now, remember the relationship:

- A **class** describes what an object looks like.
- An **object** is created from a class.

---

## Why Are Objects Useful?

Objects allow us to model real-world things.

For example:

Instead of storing unrelated variables:

```text
bookTitle
bookAuthor
bookPages
```

we can create a `Book` object that keeps all related information together.

This makes programs easier to organize and understand.

Objects are one of the core ideas behind object-oriented programming.

---

## Organizing Classes with Packages

As programs grow, they may contain dozens, hundreds, or even thousands of classes.

Java uses **packages** to organize related classes.

A package works much like a folder on your computer.

For example:

```text
com.example.library

├── Book.java
├── Member.java
├── Loan.java
└── Library.java
```

Packages help:

- Organize code.
- Avoid class name conflicts.
- Make projects easier to navigate.
- Group related functionality together.

You'll learn more about packages later in this section.

---

## Classes Can Work Together

One class can use another class.

For example:

A `Library` class may contain multiple `Book` objects.

A `Student` class may contain an `Address` object.

Classes rarely exist in isolation.

Instead, they work together to solve larger problems.

---

## From One Class to Many

Until now, every example in this repository has looked similar to this:

```text
MyFirstClass
└── main()
```

As you continue learning Java, your programs will gradually evolve into something like this:

```text
Application
├── Main
├── User
├── Product
├── Order
├── ShoppingCart
├── Payment
└── Database
```

Each class has a specific responsibility.

This approach makes applications much easier to develop and maintain than placing all code into one large class.

---

# What You'll Learn in This Section

In the following pages, you'll learn:

- What classes are.
- What objects are.
- How to create classes.
- How to create objects.
- Fields (instance variables).
- Constructors.
- Instance methods.
- The `this` keyword.
- Static fields and methods.
- Packages.
- Object references.

By the end of this section, you'll be able to create your own classes, create objects from those classes, and organize them into a small Java application.

## Content of this section

- **tasks**
