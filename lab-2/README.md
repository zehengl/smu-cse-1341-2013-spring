# lab-2

## Month Names

Write a program called `Months` that prompts the user to enter a month number (1-12) and displays the name of the corresponding month using 12 if statements, and use a while loop to continue prompting for additional month numbers.
Continue to prompt for month numbers until the user enters the sentinel value -1.
If the user enters a number other than the sentinel value or a valid month number, you should display the message "Invalid value".
After the sentinel value has been entered, display "Thank You!" before exiting the program.

Sample Run:

```
Enter month number (or -1 to exit) : 1
January
Enter month number (or -1 to exit) : 2
February
Enter month number (or -1 to exit) : -1
Thank you!
```

## Leap Year

Write a program called `LeapYear` that prompts for a 4 digit year and calculates (and displays) whether or not that year is a leap year.
A year will be a leap year if it is divisible by 4 but not by 100 (with no remainders).
If a year is divisible by both 4 and by 100, it is not a leap year unless it is also divisible by 400.
The years 1996, 1992, 1988 and so on are leap years because they are divisible by 4 but not by 100.
The century years 1900, 1800 and 1700 are all divisible by 4 and are also exactly divisible by 100.
As they are not also divisible by 400, they are not leap years.

Sample Run:

```
Enter year: 2013
2013 is NOT a leap year
```

## Odd Even

Write a program called `OddEven` that will prompt the user for an integer and print/display a message indicating whether it is even or odd.
Continue prompting for numbers from the user and displaying odd/even until the user enters 0.
When 0 is entered, exit the loop and display "Goodbye".

Sample Run:

```
Enter a number: 1
Odd
Enter a number: 2
Even
Enter a number: 0
Goodbye!
```

## Display a Plus Sign

Write a program called `Plus` that will display asterisks in the shape of a plus sign which has the height and width specified by the user.
You must only allow entry of an odd number for the height.
When an odd number (n) has been entered, display a plus sign that is n asterisks tall and n asterisks wide.

Sample Run:

```
Enter size: 11
     *
     *
     *
     *
     *
***********
     *
     *
     *
     *
     *
```

---

## Compile and Run

### Months

    javac Months.java
    java Months

### LeapYear

    javac LeapYear.java
    java LeapYear

### OddEven

    javac OddEven.java
    java OddEven

### Plus

    javac Plus.java
    java Plus
