# Casting

Consider this code:

```java
byte someValue = 10;
byte myValue = someValue / 2;
```

The compiler reports something like: `Type mismatch: cannot convert from int to byte`.
At first glance, this is surprising. Both variables are `byte`, so why isn't the result also a `byte`?

**The reason: numeric promotion**

In Java, all arithmetic on `byte`, `short`, and `char` is automatically promoted to `int` before the operation is performed.

So the compiler treats your code as if you had written:

```java
int temp = (int) someValue / 2;
byte myValue = temp;   // Error
```

The division itself produces an `int`, not a `byte`.

Even though the result happens to be `5`, Java only knows that the expression's type is `int`.

---

**Why does Java do this?**

Historically, CPUs perform arithmetic most efficiently using machine word sizes (typically 32 bits or larger). Supporting arithmetic directly on 8-bit and 16-bit integers would require many extra language rules and special cases.

So Java simplifies the rules:

- `byte + byte` → `int`
- `byte - byte` → `int`
- `byte * byte` → `int`
- `byte / byte` → `int`

The same is true for `short` and `char`.

For example:

```java
byte a = 10;
byte b = 20;

int c = a + b;   // OK
```

But:

```java
byte c = a + b;  // Error
```

because `a + b` is an `int`.

---

## Casting

If you're certain the result fits in a `byte`, you can explicitly tell the compiler to convert it:

```java
byte someValue = 10;
byte myValue = (byte) (someValue / 2);
```

The cast `(byte)` means: "I know this expression is an `int`, but I want you to convert it to a `byte`.". Now the code compiles.

---

## What exactly is a cast?

A cast is an explicit instruction to convert a value from one type to another.

Syntax:

```java
(targetType) expression
```

Example:

```java
int x = 100;
byte y = (byte) x;
```

Without the cast:

```java
byte y = x;    // Compile-time error
```

Java refuses because an `int` may not fit into a `byte`.

---

## Why does Java require the cast?

A `byte` can hold only values from -128 to 127.

An `int` can hold values from about -2.1 billion to +2.1 billion.

If Java allowed this automatically:

```java
int x = 100000;
byte y = x;
```

the value wouldn't fit.

The compiler forces you to acknowledge the possible loss of information by writing:

```java
byte y = (byte) x;
```

---

## What happens if the value doesn't fit?

Casting doesn't prevent overflow—it simply keeps the low-order 8 bits.

Example:

```java
int x = 130;
byte y = (byte) x;

System.out.println(y);
```

Output: `-126`

This surprises many beginners. The bits of `130` are: `10000010`.

A `byte` interprets those same 8 bits as a signed two's complement value, which is -126.

So a cast is **not** the same as a mathematical conversion—it may lose information.

---

## Widening vs. narrowing conversions

There are two broad categories of numeric conversions:

**Widening (automatic)**

These are safe because the destination type can represent every value of the source type.

```java
byte b = 10;
int i = b;

int x = 20;
long y = x;

float f = x;
```

No cast is required.

**Narrowing (requires a cast)**

These may lose information.

```java
int x = 100;

byte b = (byte) x;
short s = (short) x;
```

Java requires an explicit cast because not every `int` value fits into a `byte` or `short`.

---

## A rule worth remembering

Whenever you perform arithmetic with `byte`, `short`, or `char`, ask yourself: **What type is the result?**

In Java, unless a larger type is already involved, the answer is almost always `int`.

That's why code like these all produce compile-time errors:

```java
byte a = 1;
byte b = 2;

byte c = a + b;     // Error
byte d = a * b;     // Error
byte e = a / b;     // Error
byte f = a - b;     // Error
```

All four expressions have type `int`, so assigning them back to a `byte` requires an explicit cast. Understanding this rule makes Java's casting behavior much more predictable.
