# short data type

The `short` data type is a **16-bit signed integer** used to store whole numbers with a smaller range than `int`.
It is useful when memory is limited but values still need to be larger than `byte`.

```java
short year = 2024;
short score = 32000;
short temperature = -100;
```

## Short range

The allowed range is from `-32_768` to `32_767`.

```java
System.out.println(Short.MIN_VALUE); // -32768
System.out.println(Short.MAX_VALUE); // 32767
```

## Common usage

Use `short` for small numeric values when you want smaller storage than `int`,
for example in arrays or old file formats.

## Common mistakes

```java
short value = 40000; // invalid: out of range
short result = 10000 * 4; // invalid without cast because expression is int
```

If you assign from an `int` expression, use a cast:

```java
int sum = 10000 + 20000;
short result = (short) sum;
```

This can cause overflow if the value falls outside the `short` range.
