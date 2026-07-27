# Primitive Data Types

Read the docs [here](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) for more info.

Primitive data types store simple values directly. They are built into the Java language and are not created from classes.

Example:

```java
int age = 25;
double price = 19.99;
char grade = 'A';
boolean isValid = true;
```

## Summary Table

| Data Type   | Size          | Example                  |
| ----------- | ------------- | ------------------------ |
| **byte**    | 1 byte        | `byte b = 23;`           |
| **short**   | 2 bytes       | `short s = 21000;`       |
| **int**     | 4 bytes       | `int i = 45000;`         |
| **long**    | 8 bytes       | `long l = 12345678912L;` |
| **float**   | 4 bytes       | `float f = 1.5f;`        |
| **double**  | 8 bytes       | `double d = 1.5;`        |
| **char**    | 2 bytes       | `char c = 'A';`          |
| **boolean** | JVM-dependent | `boolean b = true;`      |

## What is a bit? (the smallest unit)

A bit is the smallest piece of data a computer understands.

- It can be 0 or 1
- Think of it as a light switch:
  - OFF = 0
  - ON = 1

That's it. Just two possibilities.

## What is a byte?

A byte = 8 bits.

So instead of one light switch, a byte is like 8 switches in a row.

```txt
01001011
```

Because each switch can be ON or OFF, 8 switches can represent:

- 256 different values (from 0 to 255)

## Default values

When primitive fields are declared inside a class, Java gives them default values.

| Data Type | Default Value |
| --------- | ------------- |
| Numbers   | `0` or `0.0`  |
| `char`    | `'\u0000'`    |
| `boolean` | `false`       |

Local variables inside methods do not get automatic default values. They must be assigned before use.

## Content of this section

- **[data-types](data-types/)**
