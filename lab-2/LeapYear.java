import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = input.nextInt();

    if (year % 4 != 0)
      System.out.println(year + " is NOT a leap year");
    else if ((year % 400 != 0) && (year % 100 == 0))
      System.out.println(year + " is NOT a leap year");
    else
      System.out.println(year + " IS a leap year");

  }

}
