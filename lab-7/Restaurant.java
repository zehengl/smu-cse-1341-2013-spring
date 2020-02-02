import java.util.*;

public class Restaurant {

  private Menu myMenu;
  ArrayList<Server> serverList;

  public Restaurant() {
    myMenu = new Menu();
    serverList = new ArrayList<Server>();

    // In LAB 8 we will read this from a file
    int[] tList1 = { 1, 2, 5, 9, 11, 15 };
    Server s1 = new Server("John", tList1);

    int[] tList2 = { 3, 4, 6, 7, 17, 18 };
    Server s2 = new Server("Maria", tList2);

    int[] tList3 = { 8, 10, 12, 13, 14, 16 };
    Server s3 = new Server("Maria", tList3);

    serverList.add(s1);
    serverList.add(s2);
    serverList.add(s3);

  }

  void createMenuItems() {
    Scanner reader = new Scanner(System.in);
    String code, name;
    double price;

    System.out.print("Enter item code: ");
    code = reader.nextLine();

    System.out.print("Enter item name: ");
    name = reader.nextLine();

    System.out.print("Enter item price: ");
    price = reader.nextDouble();

    MenuItem item = new MenuItem(code, name, price);
    myMenu.setMenuItem(item);

  }

  void displayMenu() {
    System.out.println(myMenu);
  }

  void displayServerList() {

    for (int j = 0; j < serverList.size(); ++j)
      System.out.print(serverList.get(j));
    System.out.println();
  }

  void restaurantActivity() {
    String activity;
    int choice;
    Scanner reader = new Scanner(System.in);
    while (true) {
      System.out.println();
      System.out.print("1. Restaurant activity\n");
      System.out.print("2. Quit\n");
      System.out.print("Enter choice: ");
      choice = reader.nextInt();
      reader.nextLine();
      if (choice == 1) {
        System.out.print("Enter activity: ");
        activity = reader.nextLine();
        processActivity(activity);
      } else if (choice == 2) {
        break;
      }

    }
  }

  void processActivity(String activity) {
    System.out.println("\nActivity: " + activity);
    String[] element = activity.split("\\s");

    if (element.length > 1) {
      String table = element[0];
      if (element[1].charAt(0) == 'P') {
        for (int k = 0; k < serverList.size(); ++k) {
          if (!serverList.get(k).searchName(table).equals("None")) {
            System.out.print("Welcome! ");
            System.out.print(serverList.get(k).searchName(table));
            System.out.println(" will be here soon to take care of you.");
          }
        }
      } else if (element[1].charAt(0) == 'O') // An order is placed; and will handle in Lab8
      {
        System.out.println("Table: " + table + " has placed an order!");
        System.out.println("OK");
      } else if (element[1].charAt(0) == 'S') {
        System.out.println("Food arrives at table:  " + table);
      } else if (element[1].charAt(0) == 'C') {
        System.out.println("Party at table:  " + table + " gets the check, pays and leaves.");
        System.out.println("Table: " + table + " is now available!");
      }
    }
  }
}
