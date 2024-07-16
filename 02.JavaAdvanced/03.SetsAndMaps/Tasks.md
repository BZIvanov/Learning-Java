# About

Contains info about solving the tasks.

## Tasks

Below are the tasks requirements and examples of input data to be provided for the different programs and expected outputs.

#### 1. ParkingLot

Test inputs and outputs:

```
Input:
IN car1
IN car2
OUT car2
IN car3
END

Output:
car3
car1
```

#### 2. Party

Test inputs and outputs:

```
Input:
12345678
asdfghjk
87654321
PARTY
87654321
END

Output:
2
12345678
asdfghjk
```

#### 3. VoinaNumberGame

Test inputs and outputs:

```
Input:
2 8 5 3
3 8 6 9

Output:
Second player win!
```

#### 4. CountRealNumbers

Test inputs and outputs:

```
Input:
1.2 2 2.3 5 1.2 5.1 2

Output:
1.2 -> 2
2.0 -> 2
2.3 -> 1
5.0 -> 1
5.1 -> 1
```

#### 5. AverageStudentsGrades

Test inputs and outputs:

```
Input:
5
Iva 3.5
Miro 5.5
Iva 5.5
Elena 6
Miro 5

Output:
Elena -> 6.00 (avg: 6.00)
Iva -> 3.50 5.50 (avg: 4.50)
Miro -> 5.50 5.00 (avg: 5.25)
```

#### 6. ProductShop

Test inputs and outputs:

```
Input:
Shop1, kiwi, 2.5
Shop2, kiwi, 2.4
Shop1, banana, 1.3
Shop3, apple, 0.8
Shop1, apple, 0.9
Shop2, grapes, 1.1
Shop3, orange, 1.2
Shop1, orange, 1.4
Revision

Output:
Shop1->
Product: kiwi, Price: 2.5
Product: banana, Price: 1.3
Product: apple, Price: 0.9
Product: orange, Price: 1.4
Shop2->
Product: kiwi, Price: 2.4
Product: grapes, Price: 1.1
Shop3->
Product: apple, Price: 0.8
Product: orange, Price: 1.2
```

#### 7. CitiesByContinetAndCountry

Test inputs and outputs:

```
Input:
7
Europe Bulgaria Sofia
Europe Bulgaria Varna
Europe Bulgaria Burgas
Australia Australia Sydney
NorthAmerica UnitedStates NewYorkCity
NorthAmerica UnitedStates Washington
Europe France Paris

Output:
Europe:
  Bulgaria -> Sofia, Varna, Burgas
  France -> Paris
Australia:
  Australia -> Sydney
NorthAmerica:
  UnitedStates -> NewYorkCity, Washington
```

#### 8. AcademyGraduation

Test inputs and outputs:

```
Input:
3
Iva
4.5 5 4 5.5 6
Miro
4 5 4.5 6
Eli
5 6 5.5 5

Output:
Eli is graduated with 5.375
Iva is graduated with 5.0
Miro is graduated with 4.875
```

#### 9. UniqueUsernames

Test inputs and outputs:

```
Input:
4
Iva
Miro
Eli
Iva

Output:
Iva
Miro
Eli
```

#### 10. SetsOfElements

Test inputs and outputs:

```
Input:
2 3
7
5
1
9
5

Output:
5
```

#### 11. PeriodicTable

Test inputs and outputs:

```
Input:
3
kiwi apple banana
hello world
green blue

Output:
apple banana blue green hello kiwi world
```

#### 12. CountSymbols

Test inputs and outputs:

```
Input:
hello

Output:
e: 1 time/s
h: 1 time/s
l: 2 time/s
o: 1 time/s
```

#### 13. Phonebook

Test inputs and outputs:

```
Input:
Iva-32134
Eli-52342
Miro-09432
Tedi-23523
search
Iva
John
stop

Output:
Iva -> 32134
Contact John does not exist.
```

#### 14. MinerTask

Test inputs and outputs:

```
Input:
2
3
8
1
5
stop

Output:
2 -> 3
8 -> 1
5 -> 0
```

#### 15. FixEmails

Test inputs and outputs:

```
Input:
Iva
iva@mail.com
John
john@mail.uk
Eli
eli@mail.bg
stop

Output:
Eli -> eli@mail.bg
```

#### 16. HandsOfCards

Test inputs and outputs:

```
Input:
Alice: AS, 2H, 3D
Bob: KC, QS, 10C
Charlie: JH, 7S, 5C
JOKER

Output:
Alice: 68
Bob: 71
Charlie: 66
```

```
Input:
David: 8S, 9H, 10D
Emily: AD, JC, 2S
Frank: KH, 7C, 5D
George: QH, 6H, 4C
JOKER

Output:
David: 79
Emily: 47
Frank: 56
George: 58
```

#### 17. PopulationCounter

Test inputs and outputs:

```
Input:
Sofia|Bulgaria|41212341
Paris|France|522342344
New York|USA|5836345435
Washington|USA|753453454
report

Output:
USA (total population: 6589798889)
=>New York: 5836345435
=>Washington: 753453454
France (total population: 522342344)
=>Paris: 522342344
Bulgaria (total population: 41212341)
=>Sofia: 41212341
```

#### 18. DragonArmy

Test inputs and outputs:

```
Input:
3
fiery Ryu 50 300 15
ice Chimera null 200 20
electric Bolt 75 null 120

Output:
fiery::(50.00/300.00/15.00)
-Ryu -> damage: 50, health: 300, armor: 15
ice::(45.00/200.00/20.00)
-Chimera -> damage: 45, health: 200, armor: 20
electric::(75.00/250.00/120.00)
-Bolt -> damage: 75, health: 250, armor: 120
```

```
Input:
4
fiery Cinder 60 280 null
ice Chimera 80 null null
fiery Cinder 70 320 18
poison Venom 30 180 5

Output:
fiery::(70.00/320.00/18.00)
-Cinder -> damage: 70, health: 320, armor: 18
ice::(80.00/250.00/10.00)
-Chimera -> damage: 80, health: 250, armor: 10
poison::(30.00/180.00/5.00)
-Venom -> damage: 30, health: 180, armor: 5
```

```
Input:
2
electric Spark null 150 null
water Kraken 20 null null

Output:
electric::(45.00/150.00/10.00)
-Spark -> damage: 45, health: 150, armor: 10
water::(20.00/250.00/10.00)
-Kraken -> damage: 20, health: 250, armor: 10
```

#### 19. BirthdayParadox

Create a program that simulates the birthday paradox. The program will run multiple trials to determine the number of people who must enter a room before two people share the same birthday. The results will be summarized in a table.

The program should take two integer command-line arguments: n (the number of possible birthdays) and trials (the number of trials to perform).

For each trial:

- Randomly assign birthdays to people entering the room, with each birthday being a uniform random integer between 0 and n-1
- Continue until a birthday is repeated
- Count the number of people who entered the room until a repeated birthday is found

After all trials, summarize the results:

Test inputs and outputs:

- Print a table that includes
  - The count i (number of people who entered the room)
  - The number of times exactly i people entered the room before a shared birthday was found
  - The fraction of trials where i or fewer people entered the room before a shared birthday was found
- Stop printing the table once the cumulative fraction reaches or exceeds 50%.

```
Input:
31
1000000

Output:
i       Count   Fraction
1       0       0.000000
2       32410   0.032410
3       62269   0.094679
4       87314   0.181993
5       104966  0.286959
6       115288  0.402247
7       115849  0.518096
```
