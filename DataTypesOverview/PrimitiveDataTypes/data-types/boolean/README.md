# boolean data type

The `boolean` data type represents one of two values: `true` or `false`.
It is commonly used for conditions, flags, and any logic that has only two possible outcomes.

```java
boolean isJavaFun = true;
boolean hasErrors = false;
```

## Boolean values

- `true` — means the condition is correct or enabled.
- `false` — means the condition is incorrect or disabled.

## When to use boolean

- In `if` statements and loops.
- To store on/off flags.
- To hold the result of a comparison.

```java
int a = 5;
int b = 10;
boolean isGreater = a > b; // false
boolean isEqual = a == b;  // false
boolean hasSpace = text.isEmpty();
```

## Boolean in conditionals

```java
boolean isActive = true;

if (isActive) {
    System.out.println("The feature is active.");
} else {
    System.out.println("The feature is not active.");
}
```

## Boolean expressions

Boolean values are often produced by comparison operators:

```java
boolean result1 = 3 < 7;    // true
boolean result2 = 4 >= 4;   // true
boolean result3 = 5 != 5;   // false
boolean result4 = (2 + 2) == 4; // true
```

## Boolean class

The wrapper class `Boolean` provides useful methods when working with boolean values.

```java
System.out.println(Boolean.TRUE);            // true
System.out.println(Boolean.FALSE);           // false
System.out.println(Boolean.parseBoolean("true")); // true
System.out.println(Boolean.toString(false));       // "false"
```

## Common mistakes

- `boolean value = 1;` is invalid in Java. Only `true` and `false` are allowed.
- `boolean check = "true";` is also invalid because strings are not booleans.

Use `boolean` for simple yes/no and true/false logic in your programs.
