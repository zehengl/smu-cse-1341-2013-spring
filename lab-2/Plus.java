import java.util.Scanner;

public class Plus {

  public static void main(String[] args) {

    int size;
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("Enter size: ");
      size = input.nextInt();
      if (size % 2 == 0)
        System.out.println("\nSIZE MUST BE ODD");
      else
        break;
    }

    // print size / 2 lines
    for (int a = 0; a < (size / 2); a++) {
      // print contents of one line
      for (int x = 0; x < (size / 2); x++)
        System.out.print(" ");
      System.out.println("*");
    }

    // print middle line
    for (int b = 0; b < size; b++)
      System.out.print("*");
    System.out.println();

    // print size / 2 lines
    for (int a = 0; a < (size / 2); a++) {
      // print contents of one line
      for (int x = 0; x < (size / 2); x++)
        System.out.print(" ");
      System.out.println("*");
    }

  }

}
