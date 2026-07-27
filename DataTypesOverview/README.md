# Data Types overview

In Java, every value has a **data type**.

A data type tells Java:

- What kind of value can be stored
- How much memory may be needed
- What operations are allowed with that value

For example:

```java
int age = 25;
String name = "Alice";
boolean isStudent = true;
```

Here:

- `int` stores whole numbers
- `String` stores text
- `boolean` stores either `true` or `false`

Java is a **statically typed** language. This means that the type of a variable must be known before the program runs.

```java
int score = 100;
score = "one hundred";   // Error: score is an int, not a String
```

---

## Why data types matter

Data types help Java understand how to work with values.

For example, numbers can be used in mathematical operations:

```java
int a = 10;
int b = 5;

System.out.println(a + b);
```

Output:

```text
15
```

Text values can be joined together:

```java
String firstName = "Alice";
String lastName = "Johnson";

System.out.println(firstName + " " + lastName);
```

Output:

```text
Alice Johnson
```

The `+` operator works in both examples, but Java treats the operation differently depending on the data types.

---

## Main groups of data types

Java data types can be split into two main groups:

1. **Primitive data types**
2. **Reference data types**

---

## Primitive data types

Primitive data types store simple values directly.

Java has 8 primitive data types:

| Data Type | Used For                         | Example                  |
| --------- | -------------------------------- | ------------------------ |
| `byte`    | Small whole numbers              | `byte level = 3;`        |
| `short`   | Whole numbers                    | `short year = 2024;`     |
| `int`     | Common whole numbers             | `int age = 25;`          |
| `long`    | Very large whole numbers         | `long stars = 999999L;`  |
| `float`   | Decimal numbers                  | `float price = 9.99f;`   |
| `double`  | More precise decimal numbers     | `double pi = 3.14159;`   |
| `char`    | A single character               | `char grade = 'A';`      |
| `boolean` | True or false values             | `boolean active = true;` |

Example:

```java
int apples = 5;
double weight = 2.75;
char size = 'M';
boolean isAvailable = true;
```

Primitive types are usually used for numbers, single characters, and simple true/false conditions.

---

## Reference data types

Reference data types do not store the actual value directly in the same simple way as primitives.

Instead, they store a reference to an object.

The most common reference type for beginners is `String`.

```java
String message = "Hello, Java!";
```

Even though `String` is used very often, it is not a primitive type. It is a class.

Other reference types include:

- Arrays
- Objects
- Classes you create yourself

You will learn more about these in later sections.

---

## Whole numbers vs decimal numbers

Use whole-number types when the value does not need a decimal point.

```java
int students = 30;
long population = 8000000000L;
```

Use decimal-number types when the value may contain a fractional part.

```java
double temperature = 36.6;
float discount = 15.5f;
```

Most of the time:

- Use `int` for whole numbers
- Use `double` for decimal numbers
- Use `boolean` for true/false checks
- Use `String` for text

---

## Type conversion and casting

Sometimes you need to convert a value from one type to another.

Some conversions are automatic:

```java
int number = 10;
long biggerNumber = number;
```

This works because every `int` value can fit inside a `long`.

Other conversions require a cast:

```java
double price = 19.99;
int wholePrice = (int) price;
```

After the cast, `wholePrice` becomes `19`. The decimal part is lost.

Casting should be used carefully because it can lose information.

## Content of this section

1. **[PrimitiveDataTypes](PrimitiveDataTypes/)**
2. **[StringDataType](StringDataType/)**
3. **[casting](casting.md)**
