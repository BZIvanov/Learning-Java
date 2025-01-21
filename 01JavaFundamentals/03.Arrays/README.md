# Arrays

## Declaring array

There are 2 main ways to decalare array variable and assign value to it.

```java
// option 1 - all values are 0
int[] arr1 = new int[3];

// option 2 - predefined values
int[] arr2 = { 1, 2, 3, 4, 5 };
```

## Default values

### object default values

For an object, the default values will be null.

```java
class Person {};

Person[] persons = new Person[3]; // value will be { null, null, null }

System.out.println(persons[0]); // null
```
