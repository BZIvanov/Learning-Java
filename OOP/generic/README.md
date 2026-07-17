# Generics

Generics allow us to create classes, interfaces, and methods that operate on types specified by the user. They provide a way to write code that is type-safe, reusable, and avoids type-casting.

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
