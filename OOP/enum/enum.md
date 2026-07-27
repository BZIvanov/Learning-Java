# Enum

Enums are a special kind of class that define a set of named constants.

Use an enum when a value should be one option from a fixed list.

---

## Basic Example

```java
public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```

Each value is a constant.

```java
Day today = Day.MONDAY;
System.out.println(today);
```

Output:

```text
MONDAY
```

## Why Use Enums?

Enums help avoid invalid values.

Without an enum, you might use a `String`:

```java
String direction = "NORTH";
```

But the program would also allow invalid text:

```java
String direction = "banana";
```

With an enum, only the declared values are allowed.

```java
Direction direction = Direction.NORTH;
```

## Enum in a Switch

```java
public enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}
```

```java
Direction direction = Direction.NORTH;

switch (direction) {
    case NORTH -> System.out.println("Moving up");
    case SOUTH -> System.out.println("Moving down");
    case EAST -> System.out.println("Moving right");
    case WEST -> System.out.println("Moving left");
}
```

## Enum Values

You can loop through all enum values:

```java
for (Direction direction : Direction.values()) {
    System.out.println(direction);
}
```

## Key Idea

Enums make code clearer and safer when a variable should only have one value from a known set.
