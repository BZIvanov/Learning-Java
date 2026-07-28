# Records

A `record` is a concise way to declare a simple, immutable data carrier (introduced in Java 16).
Records are often a better alternative to plain old Java objects (POJOs) when you only need to store data.

## Quick Example

```java
public record Book(String title, String author, int pages) {}

// Usage
Book b = new Book("Effective Java", "Joshua Bloch", 416);
System.out.println(b.title()); // accessor method
```

## Why use records

- Records automatically provide a canonical constructor.
- Records generate accessor methods, `equals()`, `hashCode()`, and `toString()`.
- Components are final: records are best for immutable data.
- Records are implicitly `final` and cannot extend other classes; they can implement interfaces.

## Compact constructor and validation

You can add validation or normalization with a compact constructor:

```java
public record Book(String title, String author, int pages) {
    public Book {
        if (title == null || author == null) {
            throw new IllegalArgumentException("title and author required");
        }
        if (pages < 0) pages = 0; // normalization
    }
}
```

## Records vs POJOs (short)

- POJO: full control, mutable fields, explicit constructors, accessors, and overrides.
- Record: concise, immutable by default, less boilerplate for simple data holders.

Use records when the class is primarily a simple container for data; use regular classes when you need mutable state, complex behavior, or inheritance.
