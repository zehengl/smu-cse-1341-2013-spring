public class BoardGame {

  private Cell[] cells;
  private Die theDie;
  private int player1Score;
  private int player2Score;

  public BoardGame() {
    //
    // call the buildBoard method and also create a Die and assign it to theDie
    // attribute
    //
    buildBoard();
    theDie = new Die();
  }

  public void buildBoard() {
    //
    // Create the cells array and create 22 instances of Cell and put them in the
    // array
    // When creating each Cell instance, pass its point value in the constructor (0,
    // 5, 10, -5, -10)
    //
    cells = new Cell[22];
    cells[0] = new Cell(0);
    cells[1] = new Cell(0);
    cells[2] = new Cell(5);
    cells[3] = new Cell(-10);
    cells[4] = new Cell(10);
    cells[5] = new Cell(0);
    cells[6] = new Cell(5);
    cells[7] = new Cell(-5);
    cells[8] = new Cell(0);
    cells[9] = new Cell(-10);
    cells[10] = new Cell(0);
    cells[11] = new Cell(0);
    cells[12] = new Cell(5);
    cells[13] = new Cell(-5);
    cells[14] = new Cell(0);
    cells[15] = new Cell(5);
    cells[16] = new Cell(0);
    cells[17] = new Cell(-10);
    cells[18] = new Cell(-5);
    cells[19] = new Cell(10);
    cells[20] = new Cell(5);
    cells[21] = new Cell(0);
  }

  public void runSimulation() {
    //
    // Call the takeTurn method for the first player, passing in the player name
    // which will return the score for that player, then call the takeTurn method
    // for the second player and get that score.
    // Compare the two scores and print out which player won (or if it was a tie)
    //

    System.out.println("STARTING GAME:");
    this.player1Score = takeTurn("dog");
    this.player2Score = takeTurn("cat");

    if (this.player1Score > this.player2Score)
      System.out.printf("dog (%d) beat cat (%d)\n", this.player1Score, this.player2Score);
    else if (this.player1Score < this.player2Score)
      System.out.printf("cat (%d) beat dog (%d)\n", this.player2Score, this.player1Score);
    else
      System.out.printf("cat (%d) and dog (%d) tied!\n", this.player2Score, this.player1Score);

  }

  public int takeTurn(String playerName) {
    //
    // Use the logic from the previous lab to handle a single player's turn
    // including all the print statements to report "moved backward", "moved
    // forward",
    // "Now on square nn", etc.
    // After exiting the loop, return the player's score to the runSimulation method
    //
    // CAUTION: You will need to make some changes to your logic from the previous
    // lab.
    // Remember that the cells array does not contain int values this time.
    // It contains Cell instances. When you retrieve a Cell object from the
    // cells array, you will need to send messages to it to get its point value
    // and its name using the methods you built in the Cell class.
    //

    int treatCount = 0;
    int location = 0;
    System.out.println(playerName + "'s Turn:");
    while (true) {
      int roll = theDie.roll();
      System.out.print("Rolled " + roll);
      if (location + roll > 21) {
        System.out.print(" moved backward...");
        location -= roll;
      } else {
        System.out.print(" moved forward....");
        location += roll;
      }
      Cell myCell = cells[location];
      System.out.print("now on " + myCell + " (#" + (location + 1) + ")");
      treatCount = Math.max(treatCount += myCell.getValue(), 0);

      System.out.print(" - Now has " + treatCount + " treats\n");

      if (location == 21) {
        System.out.println("REACHED THE END!");
        break;
      }

    }

    return treatCount;
  }

  public String toString() {
    //
    // Display the Board contents
    //
    String s = "BOARD: ";
    for (int i = 0; i < cells.length; i++)
      s += cells[i] + " ";
    return s;
  }

}
