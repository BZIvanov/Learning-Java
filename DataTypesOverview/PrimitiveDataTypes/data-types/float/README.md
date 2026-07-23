# float data type

The `float` data type is a **32-bit floating-point number** used for decimal values when memory is more limited.
It stores less precision than `double`, so use it when precision is not critical.

```java
float price = 9.99f;
float speed = 12.5f;
float ratio = 1.0f / 3.0f;
```

## Float literals

Floating-point literals must include an `f` or `F` suffix for `float`.

```java
float value = 3.14f;
float scientific = 2.5e2f; // 250.0f
```

## Common mistakes

```java
float value = 3.14; // invalid: literal is double by default
float value2 = 1.23456789012345f; // precision is limited
```

## Float class

The wrapper class `Float` provides useful constant values and helper methods.

```java
System.out.println(Float.MIN_VALUE);
System.out.println(Float.MAX_VALUE);
System.out.println(Float.parseFloat("2.5f"));
System.out.println(Float.isInfinite(1f / 0f));
```
