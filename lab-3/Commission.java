import java.util.Scanner;

public class Commission {

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Salesperson Data -");
    System.out.print("First name : ");
    input.next();
    System.out.print("Last name : ");
    input.next();

    double total = 0;
    double[] price = { 239.99, 129.75, 99.96, 350.89, 179.5 };
    for (int i = 1; i <= 5; i++) {

      System.out.print("Total quantity of item #" + i + " sold: ");
      int quality = input.nextInt();
      total += quality * price[i - 1];

    }

    System.out.printf("Sales total is $%.2f\n", total);
    System.out.printf("Commission is $%.2f\n", total * .09);
    System.out.printf("Total compensation is $%.2f\n", total * .09 + 200);
  }

}
