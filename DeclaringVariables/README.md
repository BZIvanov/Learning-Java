# Declaring variables

A **variable** is just a **named box in memory** that stores a value.

## Working with variables

### Declaring a variable

When you declare a variable, you are telling Java: _“I want a box of this size, and I will call it this.”_

#### Syntax

```java
dataType variableName;
```

#### Example

```java
int age;
```

This means:

- `int` → make a 4-byte number box
- `age` → name of the box

At this point:

- The box exists
- But it is empty (uninitialized)

### Assigning a value

When you **assign**, you put something inside the box.

#### Syntax

```java
variableName = value;
```

#### Example

```java
age = 25;
```

### Declaring and assigning at the same time

Most of the time you do both together:

```java
int age = 25;
```

## Examples with different data types

```java
byte level = 3;
short temperature = -10;
int score = 1500;
long population = 8000000000L;

float price = 19.99f;
double pi = 3.14159;

char grade = 'A';
boolean isLoggedIn = true;
```

## Java is type-strict

Once you choose a data type, it cannot change.

❌ This is illegal:

```java
int age = 25;
age = 25.5;   // ERROR: 25.5 is not an int
```

## Variable naming rules

Java variable names:

- Must start with a letter, `_`, or `$`
- Cannot start with a number
- Cannot be a keyword (`int`, `class`, `if`, etc.)

**Good names:**

```java
age
totalScore
userName
isValid
```

**Bad names:**

```java
2ndPlace   ❌
int        ❌
user-name  ❌
```
