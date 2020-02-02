import java.util.Scanner;

public class SieveOfEratosthenes {

  public static int seiveOfNum(int num) {

    String result = "";
    for (int i = 1; i <= num; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++)
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      if (isPrime)
        result += i + ", ";

    }

    result = result.substring(0, result.length() - 2);
    int lastSpace = result.lastIndexOf(" ");
    result = result.substring(0, lastSpace) + " and " + result.substring(lastSpace + 1, result.length());

    System.out.println(result);
    return 0;
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
        seiveOfNum(number);
    }

  }

}
