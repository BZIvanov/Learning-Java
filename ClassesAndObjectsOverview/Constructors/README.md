# Constructors

A **constructor** is a special block of code that runs when an object is created.

Constructors are commonly used to give an object its starting values.

```java
public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
```

## Creating an Object with a Constructor

```java
Book book = new Book("Effective Java", "Joshua Bloch", 416);
```

The values inside the parentheses are passed to the constructor.

After this line runs:

- `book.title` is `"Effective Java"`.
- `book.author` is `"Joshua Bloch"`.
- `book.pages` is `416`.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 416);

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.pages);
    }
}

class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
```

## Constructor Rules

- A constructor has the same name as the class.
- A constructor does not have a return type, not even `void`.
- A constructor runs automatically when `new` creates an object.
- A class can have more than one constructor if the parameter lists are different.

## Default Constructor

If you do not write any constructor, Java provides a default constructor with no parameters.

```java
Book book = new Book();
```

However, once you create your own constructor, Java no longer provides the default one automatically.

```java
class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }
}
```

With the class above, this line will not compile:

```java
Book book = new Book();
```

The class expects a `String` title when a `Book` object is created.

## Why Constructors Matter

Constructors help prevent objects from being created without important data.

Instead of this:

```java
Book book = new Book();
book.title = "Effective Java";
book.author = "Joshua Bloch";
book.pages = 416;
```

you can write this:

```java
Book book = new Book("Effective Java", "Joshua Bloch", 416);
```

## Constructor Chaining

A constructor can call another constructor in the same class using `this(...)`.
This helps reuse common setup logic and keep constructors consistent.
The call to another constructor must be the first statement inside the constructor.

```java
class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book() {
        this("Unknown", "Unknown", 0);
    }
}
```

Using constructor chaining like this avoids repeating initialization code.
