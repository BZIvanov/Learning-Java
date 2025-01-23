# Inheritance

Inheritance is a feature in Object-Oriented Programming (OOP) that allows a class (called the child or subclass) to inherit properties and methods from another class (called the parent or superclass).

This helps reuse code, reduce duplication, and create a clear hierarchy between classes.

One class cannot inherit from 2 other classes.

## Example:

If a `Vehicle` class defines common properties like `speed` and `color`, and methods like `start()` and `stop()`, a `Car` class can inherit these features and add its own unique behavior, such as a `honk()` method.

## Why use Inheritance?

- **Code Reusability:** Write shared logic once in the parent class.
- **Extensibility:** Add new features by extending existing classes.
- **Hierarchy:** Represent real-world relationships (e.g., `Bird` is a type of `Animal`).

## Implicit Inheritance: The Object Class

In Java, all classes automatically inherit from the built-in `Object` class, if we didn't explicitly extended from another class. This is because `Object` is the root superclass of all Java classes.
