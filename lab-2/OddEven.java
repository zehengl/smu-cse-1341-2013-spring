import java.util.Scanner;

public class OddEven {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int value = 99;

    while (value != 0) {
      System.out.print("Enter a number (or 0 to exit) : ");
      value = input.nextInt();
      if (value == 0)
        break;
      if (value % 2 == 0)
        System.out.println("Even");
      else
        System.out.println("Odd");
    }
    System.out.println("Goodbye!");

  }

}
