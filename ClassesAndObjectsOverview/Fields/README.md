# Fields

A **field** is a variable that belongs to an object.

Fields store the state, or data, of an object.

```java
public class Book {
    String title;
    String author;
    int pages;
}
```

Here, `title`, `author`, and `pages` are fields.

## Accessing Fields

You can access an object's fields using the dot operator.

```java
Book book = new Book();

book.title = "Effective Java";
book.author = "Joshua Bloch";
book.pages = 416;

System.out.println(book.title);
```

Output:

```text
Effective Java
```

## Fields Belong to Objects

Each object has its own field values.

```java
Book firstBook = new Book();
firstBook.title = "Clean Code";

Book secondBook = new Book();
secondBook.title = "Effective Java";

System.out.println(firstBook.title);
System.out.println(secondBook.title);
```

Output:

```text
Clean Code
Effective Java
```

Both objects were created from the same `Book` class, but they store different data.

## Default Values

If you create an object but do not assign values to its fields, Java gives them default values.

Common default values:

- `int`, `double`, and other numeric types become `0` or `0.0`.
- `boolean` becomes `false`.
- Reference types such as `String` become `null`.

Example:

```java
Book book = new Book();

System.out.println(book.title);
System.out.println(book.pages);
```

Output:

```text
null
0
```

## Important Note

Fields are different from local variables.

- A **field** is declared inside a class, but outside methods.
- A **local variable** is declared inside a method.

```java
public class Book {
    String title; // field

    public void printTitle() {
        String message = "Book title: " + title; // local variable
        System.out.println(message);
    }
}
```
