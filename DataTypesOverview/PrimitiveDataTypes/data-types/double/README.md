# double data type

The `double` data type is a **64-bit floating-point number** used for decimal values.
It is the default choice for real numbers in Java because it provides good precision and range.

```java
double price = 9.99;
double temperature = -4.5;
double ratio = 2.0 / 3.0;
```

## Decimal literals

Floating-point literals are `double` by default.

```java
double value = 3.14;
double scientific = 1.2e3; // 1200.0
```

## Precision and comparisons

`double` values are not always exact for decimal fractions.
Avoid direct equality checks when working with floating-point numbers.

```java
double result = 0.1 + 0.2;
System.out.println(result); // 0.30000000000000004

boolean equal = result == 0.3; // usually false
```

## Double class

The wrapper class `Double` includes helper methods for parsing and checking values.

```java
System.out.println(Double.MIN_VALUE);
System.out.println(Double.MAX_VALUE);
System.out.println(Double.parseDouble("3.14"));
System.out.println(Double.isNaN(Double.NaN));
```
