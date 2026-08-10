# Array exercises

Run each program from your IDE and provide the sample input through standard
input. Output spacing at the end of a line is not significant.

## Recommended learning order

The exercises move from basic indexing and traversal to more involved array
algorithms.

### 1. DayOfWeek

Read a number from 1 to 7 and print the corresponding day of the week.

```text
Input:
7

Output:
Sunday
```

### 2. PrintReverse

Read a count followed by that many integers, then print them in reverse order.

```text
Input:
2
3
1

Output:
1 3
```

### 3. SumEvenNumbers

Print the sum of all even values in a space-separated integer array.

```text
Input:
1 4 8 3 2

Output:
14
```

### 4. CondenseToNumber

Repeatedly replace adjacent values with their sums until one value remains.

```text
Input:
2 8 1 9

Output:
38
```

### 5. ReverseArray

Reverse a space-separated string array in place.

```text
Input:
aa bb cc dd

Output:
dd cc bb aa
```

### 6. EvenOddSubtraction

Subtract the sum of the odd values from the sum of the even values.

```text
Input:
2 4 5 11 9 3 1 8

Output:
-15
```

### 7. EqualArrays

Compare two integer arrays. Print their sum when they are identical; otherwise,
print the index of the first difference.

```text
Input:
1 2 3 4
1 2 3 4

Output:
Arrays are identical. Sum: 10
```

### 8. CommonElements

Print the values that appear in both string arrays.

```text
Input:
one two
three four one

Output:
one
```

### 9. Train

Read the passenger count for each wagon, print all counts, and print their sum.

```text
Input:
2
12
11

Output:
12 11
23
```

### 10. ArrayRotation

Rotate an array to the left by the requested number of positions.

```text
Input:
2 8 9 1 0 5 7
2

Output:
9 1 0 5 7 2 8
```

### 11. ZigZagArrays

Read pairs of integers and distribute them alternately between two arrays.

```text
Input:
2
1 7
4 5

Output:
1 5
7 4
```

### 12. TopIntegers

Print every value that is greater than all values to its right.

```text
Input:
2 8 5 9 1

Output:
9 1
```

### 13. EqualSum

Find an index whose left-side sum equals its right-side sum.

```text
Input:
2 6 3 0 8

Output:
2
```

### 14. MaxSequenceOfEqual

Print the longest consecutive sequence of equal values.

```text
Input:
2 5 5 9 1

Output:
5 5
```

### 15. MagicSum

Print each pair of values whose sum equals the target.

```text
Input:
2 3 9 1 5
4

Output:
3 1
```

### 16. ArrayManipulator

Apply `exchange`, `max`, `min`, `first`, and `last` commands to an integer array
until the `end` command is received.

```text
Input:
2 8 9 3 4
exchange 2
end

Output:
[3, 4, 2, 8, 9]
```

### 17. KaminoFactory

Select the DNA sample with the longest sequence of consecutive `1` values.
Resolve ties by earliest starting index, then by greatest sum, then by input
order.

```text
Input:
5
1!0!1!1!0
0!0!1!1!0
Clone them!

Output:
Best DNA sample 1 with sum: 3.
1 0 1 1 0
```

### 18. LadyBugs

Move ladybugs left or right across a field. A bug skips occupied cells and
leaves the field when no valid landing position remains.

```text
Input:
5
0 2
1 right 1
end

Output:
1 0 1 0 0
```
