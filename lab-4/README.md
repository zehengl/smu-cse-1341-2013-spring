# lab-4

## ArrayUtility

Implement a class ArrayUtility that will contain three methods in addition to the main method.
For each of these methods, you must create an int array in main and pass it to the other method for processing.
The result of processing should be returned to the main method where the array and the result should be printed on the console.

`removeNeighboringDuplicates` will remove any neighboring duplicates from an array of positive integers.
It will move the unique elements to the front (smaller subscripted elements).
Any unused elements at the end of the array will be filled with -1.

Example1:

    array(input) [1, 1, 2, 2, 2, 3, 4, 5, 5, 0, 0]
    array(output) [1, 2, 3, 4, 5, 0, -1, -1, -1, -1, -1]

Example2:

    array(input) [0, 0, 0, 0, 9]
    array(output) [0, 9, -1, -1, -1]

`countUnique` will count and return the number of elements of array that do not appear anywhere else in the array.

Example1:

    array(input) [1, 1, 2, 3, 4, 5, 6, 6, 7]
    return: 5

Example2:

    array(input) [1, 1, 1]
    return: 0

`createUniqueArray` will accept an integer array and create (and return) a new array that contains the contents of the parameter array with duplicates removed.

Example1:

    array(input) [9, 3, 9, 3, 9]
    array(output) [9, 3] (or [3, 9] would be ok also)

The `main` method should exhaustively test your methods implemented in ArrayUtility class.
Use the sample data shown above, and include some additional test data of your own.
The program will need to include an additional methods outside of the main() method as below:

|           Method            |                                        Signature                                        |
| :-------------------------: | :-------------------------------------------------------------------------------------: |
| removeNeighboringDuplicates | removeNeighboringDuplicates public static void removeNeighboringDuplicates(int [ ] arr) |
|         countUnique         |                  countUnique public static int countUnique(int [] arr)                  |
|      createUniqueArray      |           createUniqueArray public static int[] createUniqueArray(int [] arr)           |

Sample Run:

```
array(input) [1, 1, 2, 2, 2, 1, 3, 4, 5, 5, 0, 0]
array(output) [1, 2, 1, 3, 4, 5, 0, -1, -1, -1, -1, -1]

array(input) [1, 1, 2, 3, 4, 5, 6, 6, 7]
return: 5

array(input) [9, 3, 9, 3, 9]
array(output) [9, 3]
```

## InventoryItemList

Implement a class named InventoryItemList.

The main method declares three arrays of size 10 that are “parallel” – the first element of each array belong together, the second element of each array belong together, etc. The array names are:

- itemUPCArray[ ] to store the item upc code (int) – initialize each to 0

- itemNameArray[ ] to hold the item name (a String) – initialize each to “None”

- itemUnitPrice[ ] to hold the unit price of each item (a double) – initialize each to 0

The main method will prompt the user for the number of inventory items; and then prompt for the item upc, item name, and item unit price.
The class will contain one additional method that will receive the 3 arrays and will display the inventory items as depicted in the sample output.

Sample Run:

```
How many items in the inventory (max 10)? 2

Item 1:
Item upc: 1001
Item Name: a1001
Unit Price: 10

Item 2:
Item upc: 2002
Item Name: b2002
Unit Price: 20

Item upc        Item Name       Unit Price
1001            a1001           10.00
2002            b2002           20.00
0               None            0.00
0               None            0.00
0               None            0.00
0               None            0.00
0               None            0.00
0               None            0.00
0               None            0.00
0               None            0.00
```

---

## Compile and Run

### ArrayUtility

    javac ArrayUtility.java
    java ArrayUtility

### InventoryItemList

    javac InventoryItemList.java
    java InventoryItemList
