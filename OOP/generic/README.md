# Generics

Generics allow classes, interfaces, and methods to work with different types while still keeping type safety.

They are often used when a class should store or process a value, but the exact type should be decided later.

---

## Without Generics

Without generics, you may need to use `Object`.

```java
public class Box {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
```

This works, but it is not type-safe.

```java
Box box = new Box();
box.setItem("Hello");

String text = (String) box.getItem();
```

You need casting, and mistakes can appear at runtime.

## With Generics

```java
public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
```

`T` is a type parameter. It is a placeholder for the real type.

```java
Box<String> textBox = new Box<>();
textBox.setItem("Hello");

String text = textBox.getItem();
```

No cast is needed.

You can use the same class with another type:

```java
Box<Integer> numberBox = new Box<>();
numberBox.setItem(42);

int number = numberBox.getItem();
```

## Common Type Parameter Names

```text
T  Type
E  Element
K  Key
V  Value
```

These names are conventions, not special keywords.

## Generic Methods

A method can also define its own type parameter.

```java
public static <T> void printItem(T item) {
    System.out.println(item);
}
```

Usage:

```java
printItem("Hello");
printItem(123);
```

## Unknown class type `Class<?>`

Consider the below example:

```java
public boolean supports(Class<?> authentication) {
  // ...
}
```

The syntax `Class<?>` in the Java code snippet `public boolean supports(Class<?> authentication)` signifies a **generic class type with an unknown type parameter**.

Let's break it down:

- `Class`: This refers to the `java.lang.Class` class, which represents classes and interfaces in a running Java application. It's used to obtain runtime information about types.
- `<...>`: These angle brackets denote a generic type. Generics allow you to parameterize classes and interfaces with types.
- `?`: This is the wildcard character. It represents an unknown type. In the context of `Class<?>`, it means that the Class object can represent any type.

**In essence, `Class<?>` means "a Class object representing some unknown type."**

## Key Idea

Generics let you write reusable code while letting the compiler check that the correct types are used.
