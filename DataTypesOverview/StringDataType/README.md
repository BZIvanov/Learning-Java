# String data type

A **String** is a sequence of characters used to store text.

Whenever you want to work with words, sentences, names, or any other text, you use the `String` data type.

Examples of strings:

```text
"Hello"
"Java"
"John"
"This is my first Java program!"
"123"
```

Notice that strings are always enclosed in **double quotation marks (`"`).**

---

## Declaring a String

You can create a string just like any other variable.

```java
String message = "Hello, World!";
```

Here:

- `String` is the data type.
- `message` is the variable name.
- `"Hello, World!"` is the value assigned to the variable.

You can then use the variable anywhere in your program.

```java
System.out.println(message);
```

Output:

```text
Hello, World!
```

---

## Strings can store any text

A string can contain:

- Letters
- Numbers
- Spaces
- Symbols
- Punctuation

For example:

```java
String name = "Alice";
String city = "London";
String password = "abc123";
String sentence = "Java is fun!";
```

Even though `"123"` contains only numbers, it is still a **String** because it is enclosed in quotation marks.

```java
String number = "123";
```

This is different from:

```java
int number = 123;
```

The first stores **text**, while the second stores a **numeric value**.

---

## Text blocks

A **text block** is another way to create a `String`.

Text blocks use three double quotation marks (`"""`) and are useful when you need to store text on multiple lines.

Example:

```java
String message = """
        Hello, Java!
        This text is written
        on multiple lines.
        """;

System.out.println(message);
```

Output:

```text
Hello, Java!
This text is written
on multiple lines.
```

Text blocks are easier to read than writing one long string with many `\n` newline characters.

For example, this is harder to read:

```java
String message = "Hello, Java!\nThis text is written\non multiple lines.";
```

Use text blocks when the text itself has multiple lines, such as:

- Messages
- Simple menus
- HTML or JSON examples
- SQL queries

---

## Concatenating strings

You can join strings together using the `+` operator. This is called **concatenation**.

Example:

```java
String firstName = "Alice";
String lastName = "Johnson";

String fullName = firstName + " " + lastName;

System.out.println(fullName);
```

Output:

```text
Alice Johnson
```

The `" "` adds a space between the first and last name.

You can also combine strings directly:

```java
System.out.println("Hello, " + "World!");
```

Output:

```text
Hello, World!
```

---

## Combining strings and variables

The `+` operator can also combine strings with other values.

```java
String name = "Emma";
int age = 25;

System.out.println(name + " is " + age + " years old.");
```

Output:

```text
Emma is 25 years old.
```

Java automatically converts the number to text when it is joined with a string.

---

## Formatting strings

`String.format()` creates a new string by placing values inside a text pattern.

This is useful when you want the final text to follow a specific structure.

Example:

```java
String name = "Emma";
int age = 25;

String message = String.format("%s is %d years old.", name, age);

System.out.println(message);
```

Output:

```text
Emma is 25 years old.
```

The placeholders start with `%`.

Common placeholders are:

| Placeholder | Used For        | Example Value |
| ----------- | --------------- | ------------- |
| `%s`        | Text            | `"Java"`      |
| `%d`        | Whole numbers   | `42`          |
| `%f`        | Decimal numbers | `3.14`        |
| `%n`        | New line        |               |

Example with a decimal number:

```java
String product = "Book";
double price = 12.5;

String result = String.format("%s costs %.2f dollars.", product, price);

System.out.println(result);
```

Output:

```text
Book costs 12.50 dollars.
```

The `.2` in `%.2f` means that the number should be shown with 2 digits after the decimal point.

---

## Comparing strings

Use `.equals()` when you want to compare the text inside two strings.

```java
String first = "Java";
String second = "Java";

System.out.println(first.equals(second)); // true
```

Avoid using `==` for string content comparison.

```java
String first = new String("Java");
String second = new String("Java");

System.out.println(first == second);      // false
System.out.println(first.equals(second)); // true
```

The `==` operator checks whether two variables refer to the same object. The `.equals()` method checks whether the text is the same.

---

## Strings are immutable

Strings cannot be changed after they are created.

When a method appears to change a string, Java creates a new string instead.

```java
String word = "java";
String upper = word.toUpperCase();

System.out.println(word);  // java
System.out.println(upper); // JAVA
```

---

## Common String methods

Since `String` is a special type in Java, it comes with many useful methods.

### `length()`

Returns the number of characters in a string.

```java
String language = "Java";

System.out.println(language.length());
```

Output:

```text
4
```

---

### `toUpperCase()`

Returns the string in uppercase letters.

```java
String language = "Java";

System.out.println(language.toUpperCase());
```

Output:

```text
JAVA
```

---

### `toLowerCase()`

Returns the string in lowercase letters.

```java
String language = "JAVA";

System.out.println(language.toLowerCase());
```

Output:

```text
java
```

---

## Strings are case-sensitive

Java treats uppercase and lowercase letters as different characters.

For example:

```java
String first = "Java";
String second = "java";
```

These are **not** the same because the first letter has a different case.
