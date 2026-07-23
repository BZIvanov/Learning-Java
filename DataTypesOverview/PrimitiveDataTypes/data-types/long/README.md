# long data type

The `long` data type is a **64-bit signed integer** used for whole numbers that are larger than `int` can store.
It is the best choice for large integer values such as timestamps, IDs, and currency calculations.

```java
long population = 8_000_000_000L;
long distance = 150_000_000L;
long milliseconds = System.currentTimeMillis();
```

## Long literals

Integer literals are `int` by default. Add the `L` suffix for `long` values.

```java
long value = 123456789L;
long bigValue = 9_000_000_000L;
```

## Range

The allowed range is from `-9_223_372_036_854_775_808` to `9_223_372_036_854_775_807`.

```java
System.out.println(Long.MIN_VALUE);
System.out.println(Long.MAX_VALUE);
```

## Common usage

Use `long` when `int` is too small, especially for large counts, high-precision timestamps, and financial values that require full integer accuracy.

## Common mistakes

```java
long value = 10000000000; // invalid: literal is int by default and too large
long value2 = 10000000000L; // valid
```

The wrapper class `Long` includes helpful methods for parsing and converting values.

```java
System.out.println(Long.parseLong("12345"));
System.out.println(Long.toString(12345L));
```
