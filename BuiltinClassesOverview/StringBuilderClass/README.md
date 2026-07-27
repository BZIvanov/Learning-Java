# StringBuilder Class

`StringBuilder` is a Java standard library class used for building and changing text efficiently.

It is useful when you need to add many pieces of text together, especially inside a loop.

---

## Why Use StringBuilder?

`String` values cannot be changed after they are created.

For example:

```java
String text = "Hello";
text = text + "!";
```

This works, but Java creates a new `String` value behind the scenes.
For small examples this is fine, but when repeated many times it can become slower than necessary.

`StringBuilder` allows you to build text step by step.

---

## Creating a StringBuilder

```java
StringBuilder sb = new StringBuilder();
```

You can also start with existing text:

```java
StringBuilder sb = new StringBuilder("Hello");
```

---

## Adding Text

Use the `append()` method to add text or characters:

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("Java");

System.out.println(sb);
```

Output:

```text
Hello Java
```

---

## Useful Methods

```java
StringBuilder text = new StringBuilder("Java");

text.append("!");
text.insert(0, "Hello ");
text.reverse();

System.out.println(text);
```

Some common methods are:

- `append()` - adds text at the end.
- `insert()` - adds text at a specific position.
- `delete()` - removes part of the text.
- `reverse()` - reverses the text.
- `toString()` - converts the result back to a `String`.

---

## Example: Separating Characters

In the tasks for this section, `StringBuilder` is used to collect different character groups:

```java
StringBuilder digits = new StringBuilder();
StringBuilder letters = new StringBuilder();
StringBuilder others = new StringBuilder();

digits.append('1');
letters.append('A');
others.append('!');
```

At the end, each `StringBuilder` can be printed:

```java
System.out.println(digits);
System.out.println(letters);
System.out.println(others);
```
