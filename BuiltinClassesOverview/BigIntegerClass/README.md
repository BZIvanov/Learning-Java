# BigInteger Class

`BigInteger` is a Java standard library class used for working with very large whole numbers.

Normal integer types have limits:

```java
int number = 2147483647;
long biggerNumber = 9223372036854775807L;
```

If a number becomes larger than the maximum value, primitive integer types cannot store it correctly.
`BigInteger` solves this problem.

---

## Importing BigInteger

`BigInteger` is provided by Java, but it is not available automatically like `String`, `System`, or `Math`.

To use it, import it from the `java.math` package:

```java
import java.math.BigInteger;
```

---

## Creating BigInteger Values

You can create a `BigInteger` from text:

```java
BigInteger number = new BigInteger("423234234256");
```

This is useful when reading very large numbers from the console:

```java
Scanner sc = new Scanner(System.in);

BigInteger number = new BigInteger(sc.nextLine());
```

For smaller numbers, you can also use `BigInteger.valueOf()`:

```java
BigInteger number = BigInteger.valueOf(10);
```

---

## BigInteger Constants

`BigInteger` provides useful ready-made values:

```java
BigInteger.ZERO
BigInteger.ONE
BigInteger.TWO
BigInteger.TEN
```

Example:

```java
BigInteger result = BigInteger.ONE;
```

This is common when calculating factorials, because multiplying by `1` is a good starting value.

---

## BigInteger Operations

`BigInteger` values are objects, so you do not use arithmetic operators such as `+`, `-`, `*`, or `/`.

Instead, you use methods:

```java
BigInteger a = new BigInteger("10000000000000000000");
BigInteger b = new BigInteger("5");

System.out.println(a.add(b));
System.out.println(a.subtract(b));
System.out.println(a.multiply(b));
System.out.println(a.divide(b));
```

Output:

```text
10000000000000000005
9999999999999999995
50000000000000000000
2000000000000000000
```

---

## Important Detail

`BigInteger` objects do not change after they are created.

This means methods like `add()` and `multiply()` return a new value:

```java
BigInteger number = BigInteger.ONE;

number.add(BigInteger.TEN); // this does not change number

System.out.println(number);
```

Output:

```text
1
```

To keep the result, assign it back to a variable:

```java
number = number.add(BigInteger.TEN);

System.out.println(number);
```

Output:

```text
11
```

---

## Example: Factorial

```java
int n = 23;

BigInteger result = BigInteger.ONE;

for (int i = 1; i <= n; i++) {
    result = result.multiply(BigInteger.valueOf(i));
}

System.out.println(result);
```

Output:

```text
25852016738884976640000
```
