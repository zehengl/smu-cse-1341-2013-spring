# lab-3

## Sieve of Eratosthenes

In mathematics, the Sieve of Eratosthenes is an algorithm for finding all prime numbers up to a specified integer.
Consider a contiguous list of numbers from two to some maximum.
Strike off all multiples of 2 greater than 2 from the list.
The next highest, uncrossed off number in the list is a prime number.
Strike off all multiples of this number from the list.
The crossing-off of multiples can be started at the square of the number, as lower multiples have already been crossed out in previous steps.
Repeat steps 3 and 4 until you reach a number greater than or equal to the square root of the highest number in the list, all the numbers remaining in the list are prime numbers.

For example: Eratosthenes's sieve of 20 = 1, 3, 5, 7, 11, 13, 17, and 19
Write a program called `SieveOfEratosthenes` that prompts the user to enter a number and displays the Eratosthenes's sieve.

The program will need to include an additional method outside of the `main()` method as below:

|   Method   |             Signature             |
| :--------: | :-------------------------------: |
| seiveOfNum | public static int seiveOfNum(int) |

Sample Run:

```
Enter number (or -1 to exit) :20
1, 2, 3, 5, 7, 11, 13, 17, and 19
Enter number (or -1 to exit) :-1
Thank You!
```

## Lucas Numbers

The Lucas Number of a non-negative integer n, written as L(n), is defined as follows:
L(n) = L(n-1) + L(n-2) for n > 1
L(0) = 2, L(1) = 1

Write a program called `LucasNumbers` that prompts the user to enter a number and displays the Lucas of that number.

The program will need to include an additional methods outside of the main() method as below:

| Method |          Signature           |
| :----: | :--------------------------: |
| lucas  | public static int lucas(int) |

Sample Run:

```
Enter number (or -1 to exit) :20
Lucas of 20 is 15127
Enter number (or -1 to exit) :-1
Thank You!
```

## Commission

A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% commission of their gross sales for that week.
For example, a salesperson who sells $5000 worth of merchandise in a week receives $200 plus 9% of $5000, or a total of \$650.
You are to prompt user for the salesperson's firstName, lastName, and N number of items sold.

Write a program called `Commission` that inputs one salesperson's firstName, lastName, and the number of items and quantity of each iterm sold for last week and calculates and display that salesperson's firstName, lastName, and earnings. There is no limit to the number of items sold by a salesperson.

Note: we are not working with lists or arrays; store item type and value in variables for later computations.

Sample Run:

```
Enter Salesperson Data -
First name : John
Last name : Doe
Total quantity of item #1 sold: 1000
Total quantity of item #2 sold: 200
Total quantity of item #3 sold: 500
Total quantity of item #4 sold: 300
Total quantity of item #5 sold: 1000
Sales total is $600687.00
Commission is $54061.83
Total compensation is $54261.83
```

---

## Compile and Run

### SieveOfEratosthenes

    javac SieveOfEratosthenes.java
    java SieveOfEratosthenes

### LucasNumbers

    javac LucasNumbers.java
    java LucasNumbers

### Commission

    javac Commission.java
    java Commission
