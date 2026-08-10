# Multidimensional array exercises

Run each program from your IDE and provide the sample input through standard
input. Output spacing at the end of a line is not significant.

## Recommended learning order

1. Start with `CompareMatrices`, `PositionsOf`, `IntersectionOfTwoMatrices`, and
   `SumMatrixElements` to practise matrix input and nested traversal.
2. Continue with `MaximumSumSubmatrix`, `PrintDiagonals`, `FindRealQueen`, and
   `WrongMeasurements` for indexes, neighbors, and bounds checking.
3. Use `FillTheMatrix`, `MatrixOfPalindromes`, `DiagonalDifference`, and
   `MaximalSum` to practise construction and common matrix patterns.
4. Finish with the command-driven and simulation exercises from
   `MatrixShuffling` through `ThueMorse`.

Each exercise below includes one valid input/output example. Read the matching
Java file for the implementation.

### CompareMatrices

Test inputs and outputs:

```
Input:
2 2
1 2
3 4
3 3
1 2 3
4 5 6
7 8 9

Output:
not equal
```

### PositionsOf

Test inputs and outputs:

```
Input:
3 3
1 2 3
4 5 6
7 8 9
9

Output:
2 2
```

### IntersectionOfTwoMatrices

Test inputs and outputs:

```
Input:
2
3
a b c
d e f
a b c
g h i

Output:
a b c
* * *
```

### SumMatrixElements

Test inputs and outputs:

```
Input:
2 3
2 3 4
5 6 7

Output:
2
3
27
```

### MaximumSumSubmatrix

Test inputs and outputs:

```
Input:
2 3
8 3 9
1 5 4

Output:
3 9
5 4
21
```

### PrintDiagonals

Test inputs and outputs:

```
Input:
3
2 7 9
1 4 5
0 8 3

Output:
2 4 3
0 4 9
```

### FindRealQueen

Test inputs and outputs:

```
Input:
q . . . . . . .
. . . . . q . .
. . . . . . . .
. . . . . . . .
. q . . . . . .
. . . . . . . .
. . . . . . . .
. . . . q . . .

Output:
0 0
```

```
Input:
q . . . . . . q
. q . . . . q .
. . q . . q . .
. . . q q . . .
. . . q q . . .
. . q . . q . .
. q . . . . q .
q . . . . . . q

Output:
```

```
Input:
. . q . . . . .
. . . . . . q .
. . . . . . . .
. . . q . . . .
. . . . . . . .
. . . . . q . .
. . . . . . . .
q . . . . . . .

Output:
0 2
```

### WrongMeasurements

Test inputs and outputs:

```
Input:
3
1 2 1
2 1 1
1 0 1
1 1

Output:
4 2 2
2 4 0
2 0 0
```

### FillTheMatrix

Test inputs and outputs:

```
Input:
5 A

Output:
1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25
```

### MatrixOfPalindromes

Test inputs and outputs:

```
Input:
3 6

Output:
aaa aba aca ada aea afa
bbb bcb bdb beb bfb bgb
ccc cdc cec cfc cgc chc
```

### DiagonalDifference

Test inputs and outputs:

```
Input:
3
2 8 9
1 4 7
0 5 2

Output:
5
```

### MaximalSum

Test inputs and outputs:

```
Input:
3 4
2 8 9 1
0 5 2 3
4 8 3 9

Output:
Sum = 48
8 9 1
5 2 3
8 3 9
```

### MatrixShuffling

Process valid `swap row1 col1 row2 col2` commands and print the matrix after
each swap. Print `Invalid input!` for malformed or out-of-bounds commands.

Test inputs and outputs:

```
Input:
3
3
1 2 3
4 5 6
7 8 9
swap 0 2 2 1
END

Output:
1 2 8
4 5 6
7 3 9
```

### StringMatrixRotation

Test inputs and outputs:

```
Input:
90
kiwi
apple
banana
END

Output:
bak
api
npw
ali
ne
a
```

### Crossfire

Generate a numbered matrix, destroy the requested cross-shaped areas, then
collapse the surviving values to the left and remove empty rows.

Test inputs and outputs:

```
Input:
3
4
1 1 1
2 0 1
Nuke it

Output:
1 3 4
8
9 11 12
```

### HeiganDance

Test inputs and outputs:

```
Input:
12500
Eruption 10 10
Cloud 7 7
Eruption 5 5
Eruption 7 7
Eruption 10 10
Cloud 7 7
Eruption 5 5

Output:
Heigan: 2912500.00
Player: Killed by Plague Cloud
Final position: 7, 7
```

### ReverseMatrixDiagonals

Test inputs and outputs:

```
Input:
4
4
2 8 9 1
3 5 7 2
0 1 5 2
9 3 1 8

Output:
8
1 2
3 5 2
9 1 7 1
0 5 9
3 8
2
```

### ThueMorse

Read a positive integer _n_ and print an _n_ by _n_ pattern based on the
Thue-Morse sequence.

The Thue-Morse sequence is an infinite sequence of 0s and 1s constructed by starting with 0 and successively appending the bitwise negation (interchanging 0s and 1s) of the sequence obtained so far. The first few steps of this construction are:

- Step 0: 0
- Step 1: 01
- Step 2: 0110
- Step 3: 01101001
- Step 4: 0110100110010110

Create an _n_ x _n_ pattern by printing a + (plus sign) if the bits at positions _i_ and _j_ in the Thue-Morse sequence are equal, and a - (minus sign) if they are different. There should be two spaces between each + and - character.

Test inputs and outputs:

```
Input:
4

Output:
+  -  -  +
-  +  +  -
-  +  +  -
+  -  -  +
```

```
Input:
8

Output:
+  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +
```

```
Input:
16

Output:
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
```
