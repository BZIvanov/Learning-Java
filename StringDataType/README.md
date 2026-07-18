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

## Strings Can Store Any Text

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

## Concatenating Strings

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

## Combining Strings and Variables

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

## Common String Methods

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

## Strings Are Case-Sensitive

Java treats uppercase and lowercase letters as different characters.

For example:

```java
String first = "Java";
String second = "java";
```

These are **not** the same because the first letter has a different case.
