# The `switch` Statement in Java

The `switch` statement is another way to implement conditional logic.

It is useful when you want to compare **one value against multiple possible options**.

Instead of writing many `else-if` conditions, a `switch` statement can make the code easier to read when checking for specific values.

---

# Why Do We Need `switch`?

Imagine a program that displays the name of a day based on a number.

Using `else-if`:

```java
int day = 3;

if (day == 1) {
    System.out.println("Monday");
} else if (day == 2) {
    System.out.println("Tuesday");
} else if (day == 3) {
    System.out.println("Wednesday");
} else if (day == 4) {
    System.out.println("Thursday");
} else {
    System.out.println("Unknown day");
}
```

This works, but as the number of options grows, the code becomes longer.

A `switch` statement provides a cleaner alternative.

---

# Basic `switch` Syntax

The basic syntax is:

```java
switch (value) {
    case option1:
        // Code to execute
        break;

    case option2:
        // Code to execute
        break;

    default:
        // Code to execute if no option matches
}
```

The `switch` expression is compared with each `case`.

- If a matching `case` is found, its code executes.
- The `break` statement stops the `switch`.
- The `default` block runs if no case matches.

---

# A Simple Example

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Unknown day");
}
```

Output:

```text
Wednesday
```

The value of `day` is `3`, so Java executes:

```java
case 3:
```

Then the `break` statement ends the `switch`.

---

# How a `switch` Statement Works

Consider:

```java
int number = 2;

switch (number) {

    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;

    case 3:
        System.out.println("Three");
        break;

    default:
        System.out.println("Other");
}
```

Execution:

1. Evaluate the value inside `switch`:

```java
number
```

2. Compare it with each `case`.

3. Find a match:

```java
case 2:
```

4. Execute the code inside that case.

5. Reach `break` and exit the `switch`.

Output:

```text
Two
```

---

# The `break` Statement in `switch`

The `break` statement prevents execution from continuing into the next cases.

Example without `break`:

```java
int number = 1;

switch (number) {

    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");
}
```

Output:

```text
One
Two
Three
```

This behavior is called **fall-through**.

After matching `case 1`, Java continues executing the following cases because there is no `break`.

Usually, this is not what you want.

The typical approach is:

```java
case 1:
    System.out.println("One");
    break;
```

---

# The `default` Case

The `default` case is similar to the final `else` in an `if-else` chain.

It runs when no other case matches.

Example:

```java
int month = 15;

switch (month) {

    case 1:
        System.out.println("January");
        break;

    case 2:
        System.out.println("February");
        break;

    default:
        System.out.println("Invalid month");
}
```

Output:

```text
Invalid month
```

The `default` case is optional, but it is often useful for handling unexpected values.

---

# `switch` with `String`

Java also allows switching on `String` values.

Example:

```java
String command = "start";

switch (command) {

    case "start":
        System.out.println("Starting program");
        break;

    case "stop":
        System.out.println("Stopping program");
        break;

    default:
        System.out.println("Unknown command");
}
```

Output:

```text
Starting program
```

---

# `switch` vs `else-if`

Both can solve similar problems, but they are useful in different situations.

## Use `switch` when:

- You compare one value against specific options.
- The possible values are known.
- You want cleaner code.

Example:

```java
switch (menuOption) {
    case 1:
        ...
    case 2:
        ...
}
```

---

## Use `else-if` when:

- You have more complex conditions.
- You use comparisons like `>`, `<`, `>=`.
- Conditions are not simple value matches.

Example:

```java
if (score >= 90) {

} else if (score >= 80) {

}
```

---

# Common Mistakes

## Forgetting `break`

Without `break`, execution continues into the next cases.

Example:

```java
case 1:
    System.out.println("One");
// Missing break
```

Always check whether you need a `break`.

---

## Using Conditions Inside Cases

A `switch` compares values, not general conditions.

This is not valid:

```java
switch (score) {

    case score >= 90:
        System.out.println("Excellent");
}
```

For conditions like this, use `if-else`:

```java
if (score >= 90) {
    System.out.println("Excellent");
}
```

---

# When Should You Use a `switch` Statement?

Use a `switch` statement when:

- You have one value with multiple possible exact matches.
- A long `else-if` chain becomes difficult to read.
- Each possible value has a different action.
