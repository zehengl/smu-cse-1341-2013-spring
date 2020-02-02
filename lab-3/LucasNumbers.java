import java.util.Scanner;

public class LucasNumbers {

  public static int lucas(int num) {

    int a = 2;
    int b = 1;
    if (num == 0)
      return a;
    else if (num == 1)
      return b;
    else {
      int c = 0;
      for (int i = 2; i <= num; i++) {
        c = a + b;
        a = b;
        b = c;
      }
      return c;
    }

  }

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    int number = 0;

    while (number != -1) {
      System.out.print("Enter number (or -1 to exit) :");
      number = input.nextInt();
      if (number == -1)
        System.out.println("Thank You!");
      else
        System.out.println("Lucas of " + number + " is " + lucas(number));
    }

  }

}
