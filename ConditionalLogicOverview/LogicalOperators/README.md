# Logical Operators

Logical operators are used to **combine multiple conditions** or **reverse a condition**.

So far, we have worked with simple conditions:

```java
age >= 18
```

This condition produces either:

```text
true
```

or:

```text
false
```

Logical operators allow us to create more complex decisions by combining multiple boolean expressions.

---

# Why Do We Need Logical Operators?

Imagine a login system.

A user should be allowed access only when:

- The username is correct.
- The password is correct.

A single condition is not enough.

We need a way to check both conditions together.

Example:

```java
if (usernameCorrect && passwordCorrect) {
    System.out.println("Login successful");
}
```

The `&&` operator combines two conditions into one.

---

# Available Logical Operators

Java provides three main logical operators:

| Operator | Name        | Description                  |            |                                     |
| -------- | ----------- | ---------------------------- | ---------- | ----------------------------------- |
| `&&`     | Logical AND | Both conditions must be true |            |                                     |
| `        |             | `                            | Logical OR | At least one condition must be true |
| `!`      | Logical NOT | Reverses a boolean value     |            |                                     |

---

# Logical AND (`&&`)

The AND operator requires **both conditions to be true**.

Syntax:

```java
condition1 && condition2
```

Example:

```java
int age = 25;
boolean hasTicket = true;

if (age >= 18 && hasTicket) {
    System.out.println("You can enter.");
}
```

Output:

```text
You can enter.
```

Both conditions are true:

```text
age >= 18       → true
hasTicket       → true
```

Therefore:

```text
true && true → true
```

---

# AND Truth Table

A truth table shows all possible combinations:

| Condition 1 | Condition 2 | Result |
| ----------- | ----------- | ------ |
| true        | true        | true   |
| true        | false       | false  |
| false       | true        | false  |
| false       | false       | false  |

With `&&`, both sides must be true.

---

# Logical OR (`||`)

The OR operator requires **at least one condition to be true**.

Syntax:

```java
condition1 || condition2
```

Example:

```java
boolean isAdmin = false;
boolean isManager = true;

if (isAdmin || isManager) {
    System.out.println("Access granted.");
}
```

Output:

```text
Access granted.
```

Only one condition is true:

```text
isAdmin     → false
isManager   → true
```

Therefore:

```text
false || true → true
```

---

# OR Truth Table

| Condition 1 | Condition 2 | Result |
| ----------- | ----------- | ------ |
| true        | true        | true   |
| true        | false       | true   |
| false       | true        | true   |
| false       | false       | false  |

With `||`, only both being false produces `false`.

---

# Logical NOT (`!`)

The NOT operator reverses a boolean value.

Syntax:

```java
!condition
```

Examples:

```java
boolean isLoggedIn = false;

if (!isLoggedIn) {
    System.out.println("Please log in.");
}
```

Output:

```text
Please log in.
```

The value changes:

```text
isLoggedIn      → false
!isLoggedIn     → true
```

---

# NOT Truth Table

| Condition | Result |
| --------- | ------ |
| true      | false  |
| false     | true   |

---

# Combining Multiple Logical Operators

Logical operators can be combined.

Example:

```java
int age = 25;
boolean hasLicense = true;
boolean hasCar = false;

if (age >= 18 && hasLicense && !hasCar) {
    System.out.println("You can rent a car.");
}
```

Conditions:

```text
age >= 18     → true
hasLicense    → true
!hasCar       → true
```

Result:

```text
true && true && true → true
```

Output:

```text
You can rent a car.
```

---

# Operator Precedence

When multiple logical operators are used, Java follows an order of evaluation.

The important order for beginners is:

1. `!` (NOT)
2. `&&` (AND)
3. `||` (OR)

Example:

```java
true || false && false
```

Java evaluates:

```text
false && false → false

true || false → true
```

Result:

```text
true
```

---

# Using Parentheses

Parentheses make conditions easier to read and remove confusion.

Example:

```java
if ((age >= 18 && hasTicket) || isVip) {
    System.out.println("Entry allowed");
}
```

The parentheses clearly show which conditions belong together.

A good practice is to use parentheses when a condition becomes complex.

---

# Common Mistakes

## Using `&` Instead of `&&`

These operators look similar but are different.

Incorrect for normal conditions:

```java
if (age >= 18 & hasTicket)
```

Correct:

```java
if (age >= 18 && hasTicket)
```

For now, focus on `&&`, `||`, and `!`.

---

## Confusing `||` with `&&`

Example:

```java
if (age >= 18 && hasTicket)
```

means:

> Both conditions must be true.

While:

```java
if (age >= 18 || hasTicket)
```

means:

> At least one condition must be true.

---

# Logical Operators and Loops

Logical operators are also commonly used with loops.

Example:

```java
int number = 1;

while (number <= 10 && number != 5) {
    System.out.println(number);
    number++;
}
```

The loop continues only while both conditions are true.

Output:

```text
1
2
3
4
```

When `number` becomes `5`, the second condition becomes false and the loop stops.

---

# When Should You Use Logical Operators?

Use logical operators when:

- A decision depends on multiple conditions.
- Several requirements must be satisfied.
- A condition should be true when any one of several options is true.
- You need to reverse a condition.
