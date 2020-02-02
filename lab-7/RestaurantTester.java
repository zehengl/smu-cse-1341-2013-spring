import java.util.*;

public class RestaurantTester {

  public static void main(String[] args) {
    int choice;
    Scanner reader = new Scanner(System.in);
    Restaurant restaurant = new Restaurant();
    System.out.println("\n\t\tWelcome to Java Restaurant");

    while (true) {
      System.out.println();
      System.out.print("1. Add a menu item\n");
      System.out.print("2. Display menu\n");
      System.out.print("3. Display Server List\n");
      System.out.print("4. Restaurant Activity\n");
      System.out.print("5. Quit\n");
      System.out.print("Enter choice: ");
      choice = reader.nextInt();
      if (choice == 1) {
        restaurant.createMenuItems();
      } else if (choice == 2) {
        restaurant.displayMenu();
      } else if (choice == 3) {
        restaurant.displayServerList();
      } else if (choice == 4) {
        restaurant.restaurantActivity();
      } else if (choice == 5) {
        break;
      }
    }
  }
}

/*
 * myMenu.displayMenu(); cout << endl << endl << endl;
 * 
 * string theOrder; string tkt; cin.ignore(); do { cout <<
 * "Enter order here: (0 to exit): "; getline(cin, theOrder); cout <<
 * "You ordered: " << theOrder << endl; process(myMenu, theOrder);
 * 
 * } while (theOrder != "0");
 * 
 * return 0; }
 * 
 * void process(Menu &menu, string line) { istringstream istr(line); double
 * total = 0.0; string table; string code;
 * 
 * istr >> table; // process the next item in the order while (istr >> code) {
 * double price = menu.LookUpPrice(code); if (price <= 0) { cout << code <<
 * " is invalid entry." << endl; return; } else total += price; } cout << table
 * << " total : $ " << fixed << setprecision(2) << total << endl; }
 * 
 */
