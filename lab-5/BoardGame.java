import java.util.Random;

public class BoardGame {

  public static void main(String[] args) {

    int[] gameBoard = new int[22];
    setupBoard(gameBoard);
    // STEP 1: TEST THE GAME BOARD
    System.out.println("GAME BOARD TEST: ");
    for (int i : gameBoard)
      System.out.print(i + " ");
    System.out.println();

    // STEP 2: TEST THE DIE
    System.out.println("DIE TEST: ");
    for (int i = 0; i < 10; i++)
      System.out.print(rollDie() + " ");
    System.out.println();

    // STEP 3: TEST THE GET CELL NAME
    System.out.println("CELL NAME TEST: ");
    System.out.println("5 is " + getCellName(5));
    System.out.println("10 is " + getCellName(10));
    System.out.println("-5 is " + getCellName(-5));
    System.out.println("-10 is " + getCellName(-10));
    System.out.println("0 is " + getCellName(0));

    // STEP 4: RUN THE GAME SIMULATION
    System.out.println("GAME SIMULATION: ");
    int catTreatsWon = playGame("CAT", gameBoard);
    System.out.println("Cat finished with " + catTreatsWon + " treats!\n");

    int dogTreatsWon = playGame("DOG", gameBoard);
    System.out.println("Dog finished with " + dogTreatsWon + " treats!\n");

    if (catTreatsWon > dogTreatsWon)
      System.out.println("Cat won!");
    else if (dogTreatsWon > catTreatsWon)
      System.out.println("Dog won!");
    else
      System.out.println("Cat and Dog tied!");
  }

  public static int playGame(String playerName, int[] board) {
    // Print the name of the player and create variables
    // that set the starting location and number of treats to 0
    System.out.println(playerName + "'S TURN:");
    int location = 0;
    int treats = 0;
    // Create a loop that repeats the following until
    // the player lands on the last square:
    // * Roll the die and print the rolled value
    // * Move forward that number of squares and print "moved forward"
    // * OR
    // * Move backward if moving forward will cause the player to
    // * move past the last square, and print "moved backward"
    // Add or subtract treats to the player's total based on the
    // value of the square landed on.
    //
    // REPEAT until the last square is landed on
    // When the last square is landed on, break out of the loop
    // and return the total treats owned by the player to the main method
    while (true) {
      int roll = rollDie();
      System.out.print("Rolled " + roll);
      if (location + roll > 21) {
        System.out.print(" moved backward...");
        location -= roll;
        System.out.print("now on square #" + (location + 1));
      } else {
        System.out.print(" moved forward...");
        location += roll;
        System.out.print("now on square #" + (location + 1));
      }
      int value = board[location];
      String s = getCellName(value);

      treats = Math.max(treats += value, 0);

      System.out.print(" - Now has " + treats + " treats\n");

      if (location == 21) {
        System.out.println("REACHED THE END!");
        break;
      }

    }
    return treats;

  }

  public static int rollDie() {
    // return a random number in the range 1 - 6
    Random r = new Random();
    return r.nextInt(6) + 1;
  }

  public static String getCellName(int cellValue) {
    // return a String containing Star, Smile, Lightning, X, or Blank
    // based on the cell value passed in

    String cellName;
    if (cellValue == 5)
      cellName = "Star";
    else if (cellValue == 10)
      cellName = "Smiley";
    else if (cellValue == -5)
      cellName = "Lightning";
    else if (cellValue == -10)
      cellName = "X";
    else
      cellName = "blank";
    return cellName;
  }

  public static void setupBoard(int[] board) {
    // Set the cell value of each of the spaces on the game board
    // as 0, 5, 10, -5, or -10 based on its location on the board
    // THEY COULD USE A FEW LOOPS OR MULTIPLE ASSIGNMENT STATEMENTS FOR THIS
    board[0] = 0;
    board[1] = 0;
    board[2] = 5;
    board[3] = -10;
    board[4] = 10;
    board[5] = 0;
    board[6] = 5;
    board[7] = -5;
    board[8] = 0;
    board[9] = -10;
    board[10] = 0;
    board[11] = 0;
    board[12] = 5;
    board[13] = -5;
    board[14] = 0;
    board[15] = 5;
    board[16] = 0;
    board[17] = -10;
    board[18] = -5;
    board[19] = 10;
    board[20] = 5;
    board[21] = 0;

  }

}
