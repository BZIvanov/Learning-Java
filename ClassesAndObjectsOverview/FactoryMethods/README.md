# Factory Methods

A **factory method** is a method that creates and returns an object.

In Java, factory methods are often `static` methods inside the class they create.
They can make object creation easier to read, hide setup details, and give names to different ways of creating an object.

## Constructor First

The usual way to create an object is with a constructor:

```java
Book book = new Book("Effective Java", "Joshua Bloch", 416);
```

This is clear when the constructor parameters are simple and obvious.

## Factory Method

A factory method gives a name to the creation logic:

```java
Book book = Book.fromTitle("Effective Java");
```

The method name explains what kind of object is being created.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Book first = new Book("Effective Java", "Joshua Bloch", 416);
        Book second = Book.unknownAuthor("Clean Code", 464);

        System.out.println(first.getSummary());
        System.out.println(second.getSummary());
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public static Book unknownAuthor(String title, int pages) {
        return new Book(title, "Unknown", pages);
    }

    public String getSummary() {
        return title + " by " + author + ", " + pages + " pages";
    }
}
```

Output:

```text
Effective Java by Joshua Bloch, 416 pages
Clean Code by Unknown, 464 pages
```

## Why Use Factory Methods?

Factory methods are useful when:

- Constructor parameters are not easy to understand.
- There are several common ways to create the same type of object.
- You want to hide default values or setup logic.
- You want a method name that explains the intention.

Example:

```java
User admin = User.admin("Maria");
User guest = User.guest();
```

This is easier to read than passing several boolean values into a constructor.

```java
User admin = new User("Maria", true, false);
```

## Constructor vs Factory Method

```text
Constructor: always creates an object with new.
Factory method: method that decides how to create and return an object.

Constructor name: must match the class name.
Factory method name: can describe the purpose.
```

## Naming Factory Methods

Common names include:

- `of(...)`
- `from(...)`
- `create(...)`
- `newInstance(...)`
- Names that describe a special case, such as `guest()` or `unknownAuthor(...)`

## Key Idea

Use constructors for simple object creation.
Use factory methods when a named method makes the creation code clearer.
