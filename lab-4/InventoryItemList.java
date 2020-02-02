import java.util.*;

public class InventoryItemList {

	public static void main(String[] args) {

		final int MAX = 10;
		int count;

		int itemUPCArray[] = new int[MAX];
		String itemNameArray[] = new String[MAX];
		double itemUnitPrice[] = new double[MAX];

		for (int i = 0; i < MAX; ++i) {
			itemUPCArray[i] = 0;
			itemNameArray[i] = "None";
			itemUnitPrice[i] = 0.0;
		}

		Scanner reader = new Scanner(System.in);
		System.out.print("How many items in the inventory (max 10)? ");

		count = reader.nextInt();

		for (int i = 0; i < count; ++i) {
			System.out.printf("\nItem %d:\n", i + 1);

			System.out.print("Item upc: ");
			itemUPCArray[i] = reader.nextInt();

			System.out.print("Item Name: ");
			itemNameArray[i] = reader.next();

			System.out.print("Unit Price: ");
			itemUnitPrice[i] = reader.nextFloat();
		}

		System.out.printf("\n%-15s %-15s %-15s %n", "Item upc", "Item Name", "Unit Price");

		for (int i = 0; i < MAX; ++i) {
			System.out.printf("%-15d %-15s %-15.2f %n", itemUPCArray[i], itemNameArray[i], itemUnitPrice[i]);
		}

  }

}
