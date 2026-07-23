# byte data type

The `byte` data type is an **8-bit signed integer** used to store small whole numbers.
Because it uses very little memory, it is useful when working with large arrays or binary data.

```java
byte age = 25;
byte score = -5;
byte maxValue = 127;
byte minValue = -128;
```

## Byte range

The allowed range is from `-128` to `127`.

```java
System.out.println(Byte.MIN_VALUE); // -128
System.out.println(Byte.MAX_VALUE); // 127
```

## Common byte usage

Use `byte` when you need a small integer value and want to reduce memory usage.
It is often used in low-level programming, file I/O, and binary protocols.

## Common mistakes

```java
byte value = 128; // invalid: out of range
byte value2 = 1000; // invalid: out of range
```

If you assign from an expression that produces an `int`, you may need a cast:

```java
int sum = 10 + 20;
byte result = (byte) sum;
```

The cast should be used carefully because the value may wrap if it is outside the `byte` range.
