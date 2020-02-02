import java.util.*;

public class ArrayUtility {

	/**********************************************************
	 * This method will remove ONLY the neighboring duplicates
	 ***********************************************************/
	public static void removeNeighboringDuplicates(int[] array) {
		int tmp = array[0];
		int k = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] != tmp) {
				array[k] = array[i];
				tmp = array[i];
				k++;
			}
		}
		for (int i = k; i < array.length; i++) {
			array[i] = -1;
		}
	}

	/**********************************************************
	 * This method will count the unique values in the array
	 ***********************************************************/
	public static int countUnique(int[] array) {
		int counter = 0;
		boolean unique;

		for (int i = 0; i < array.length; ++i) {
			unique = true;
			for (int j = 0; j < array.length; ++j) {
				if (j != i) {
					if (array[j] == array[i]) {
						unique = false;
						break;
					}
				}
			}
			if (unique)
				++counter;
		}
		return counter;
	}

	/**********************************************************
	 * This method will create an array of unique values
	 ***********************************************************/
	public static int[] createUniqueArray(int[] array) {
		int uniqueCount = 1;
		for (int i = 1; i < array.length; ++i) {
			boolean flag = true;
			for (int j = 0; j < uniqueCount; ++j) {
				if (array[j] == array[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				array[uniqueCount] = array[i];
				uniqueCount++;
			}
		}

		int[] uniqueArray = new int[uniqueCount];
		for (int i = 0; i < uniqueCount; i++) {
			uniqueArray[i] = array[i];
		}
		return uniqueArray;
	}

	public static void main(String[] args) {
		{ // removeNeighboringDuplicates block
			int firstArray[] = { 1, 1, 2, 2, 2, 1, 3, 4, 5, 5, 0, 0 };

			System.out.print("array(input) [");
			for (int i = 0; i < firstArray.length; ++i) {
				if (i == firstArray.length - 1)
					System.out.printf("%d", firstArray[i]);
				else
					System.out.printf("%d, ", firstArray[i]);
			}
			System.out.print("]\n");

			removeNeighboringDuplicates(firstArray);

			System.out.print("array(output) [");
			for (int i = 0; i < firstArray.length; ++i) {
				if (i == firstArray.length - 1)
					System.out.printf("%d", firstArray[i]);
				else
					System.out.printf("%d, ", firstArray[i]);
			}

			System.out.print("]\n\n");
		}

		{ // countUnique block
			int secondArray[] = { 1, 1, 2, 3, 4, 5, 6, 6, 7 };
			int k = countUnique(secondArray);

			System.out.print("array(input) [");
			for (int i = 0; i < secondArray.length; ++i) {
				if (i == secondArray.length - 1)
					System.out.printf("%d", secondArray[i]);
				else
					System.out.printf("%d, ", secondArray[i]);
			}
			System.out.print("]\n");
			System.out.printf("return: %d  ", k);
		}

		{ // createUniqueArray block

			int[] thirdArray = { 9, 3, 9, 3, 9 };

			System.out.print("\n\narray(input) [");
			for (int i = 0; i < thirdArray.length; ++i) {
				if (i == thirdArray.length - 1)
					System.out.printf("%d", thirdArray[i]);
				else
					System.out.printf("%d, ", thirdArray[i]);
			}
			System.out.print("]\n");

			int uniqueArray[] = createUniqueArray(thirdArray);

			System.out.print("array(output) [");
			for (int i = 0; i < uniqueArray.length; ++i) {
				if (i == uniqueArray.length - 1)
					System.out.printf("%d", uniqueArray[i]);
				else
					System.out.printf("%d, ", uniqueArray[i]);

			}
			System.out.print("]\n\n");

		}
	}
}
