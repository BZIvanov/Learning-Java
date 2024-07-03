# Basic syntax

## Running a program using the terminal

Below is an example of how to run a program using the terminal without using an IDE.

Here is the content of the program file, which is named `PrintSum.java`:

```java
public class PrintSum {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + 5;

        System.out.println(a + " + " + b + " = " + sum);
    }
}
```

Now in the terminal run the below command to compile the program, this command will create executable file `PrintSum.class`. It will invoke the java compiler.

```
javac PrintSum.java
```

The above command will create the compiled version of our program. With the below command we can execute the program. It will invoke the java runtime.

```
java PrintSum 10 15
```

## Recommended learning order

You can run the below examples using your IDE for easier learning/development instead of compiling and running java programs using the terminal.

Recommended order to go through the different examples.

1. StudentInformation
2. Passed
3. PassedOrFailed
4. BackThirthyMinutes
5. MonthPrinter
6. ForeignLanguages
7. TheatrePromotions
8. DivisibleByThree
9. SumOddNumbers
10. MultiplicationTable
11. MultiplicationTableTwo
12. EvenNumber
13. SumBigNumbers
14. Ages
15. Division
16. Vacation
17. PrintAndSum
18. Login
19. StrongNumber
20. VendingMachine
21. TriangleOfNumbers
22. PadawanEquipment
23. RageExpenses
24. DiagonalWidthMatrix

## Test input data

Below are examples of input data to be provided for the different programs and expected outputs.

1. StudentInformation

```
Input:
Iva
23
2.3

Output:
Name: Iva, Age: 23, Grade: 2.30
```

2. Passed

```
Input:
5

Output:
Passed!
```

3. PassedOrFailed

```
Input:
5

Output:
Passed!
```

4. BackThirthyMinutes

```
Input:
2
45

Output:
3:15
```

5. MonthPrinter

```
Input:
7

Output:
July
```

6. ForeignLanguages

```
Input:
Spain

Output:
Spanish
```

7. TheatrePromotions

```
Input:
weekend
27

Output:
20$
```

8. DivisibleByThree

_No inputs!_

9. SumOddNumbers

```
Input:
3

Output:
1
3
5
Sum: 9
```

10. MultiplicationTable

```
Input:
3

Output:
3 X 1 = 3
3 X 2 = 6
3 X 3 = 9
3 X 4 = 12
3 X 5 = 15
3 X 6 = 18
3 X 7 = 21
3 X 8 = 24
3 X 9 = 27
3 X 10 = 30
```

11. MultiplicationTableTwo

```
Input:
3
8

Output:
3 X 8 = 24
3 X 9 = 27
3 X 10 = 30
```

12. EvenNumber

```
Input:
3

Output:
Please write an even number.
```

```
Input:
2

Output:
The number is: 2
```

13. SumBigNumbers

```
Input:
123456788
123456789999

Output:
7620781877701131694922
```

14. Ages

```
Input:
27

Output:
adult
```

15. Division

```
Input:
21

Output:
The number is divisible by 7
```

16. Vacation

```
Input:
3
Regular
Sunday

Output:
Total price: 67.50
```

17. PrintAndSum

```
Input:
3
5

Output:
3 4 5
Sum: 12
```

18. Login

```
Input:
Elena
anelE

Output:
User Elena logged in.
```

19. StrongNumber

```
Input:
225

Output:
no
```

20. VendingMachine

```
Input:
0.2
1
0.1
0.5
0.2
Start
Water

Output:
Purchased Water

Input:
Nuts

Output:
Sorry, not enough money

Input:
End

Output:
Change: 1.30
```

21. TriangleOfNumbers

```
Input:
3

Output:
1
2 2
3 3 3
```

22. PadawanEquipment

```
Input:
234
3
12.5
18.5
8

Output:
The money is enough - it would cost 125.50lv.
```

23. RageExpenses

```
Input:
2
1.2
1.6
2.1
2.3

Output:
Rage expenses: 1.20 lv.
```

24. DiagonalWidthMatrix

```
Input:
8
0

Output:
*  0  0  0  0  0  0  0
0  *  0  0  0  0  0  0
0  0  *  0  0  0  0  0
0  0  0  *  0  0  0  0
0  0  0  0  *  0  0  0
0  0  0  0  0  *  0  0
0  0  0  0  0  0  *  0
0  0  0  0  0  0  0  *
```

```
Input:
8
3

Output:
*  *  *  *  0  0  0  0
*  *  *  *  *  0  0  0
*  *  *  *  *  *  0  0
*  *  *  *  *  *  *  0
0  *  *  *  *  *  *  *
0  0  *  *  *  *  *  *
0  0  0  *  *  *  *  *
0  0  0  0  *  *  *  *
```
