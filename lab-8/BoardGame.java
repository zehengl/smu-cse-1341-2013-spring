import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class BoardGame {

  private ArrayList<Cell> cells = new ArrayList<Cell>();
  private Die theDie;
  private ArrayList<Player> players = new ArrayList<Player>();

  public BoardGame() {
    //
    // call the buildBoard method and also create a Die and assign it to theDie
    // attribute
    //
    buildBoard();
    theDie = new Die();
    Scanner input = null;
    try {
      input = new Scanner(new File("players.txt"));
    } catch (FileNotFoundException fnfe) {
      System.out.println("Cannot find players.txt");
    }
    while (input.hasNext())
      players.add(new Player(input.next()));
  }

  public void buildBoard() {
    //
    // Create the cells array and create 22 instances of Cell and put them in the
    // array
    // When creating each Cell instance, pass its point value in the constructor (0,
    // 5, 10, -5, -10)
    //

    cells.add(new Cell());
    cells.add(new Cell());
    cells.add(new Star());
    cells.add(new X());
    cells.add(new Smiley());
    cells.add(new Cell());
    cells.add(new Star());
    cells.add(new Lightning());
    cells.add(new Cell());
    cells.add(new X());
    cells.add(new Cell());
    cells.add(new Cell());
    cells.add(new Star());
    cells.add(new Lightning());
    cells.add(new Cell());
    cells.add(new Star());
    cells.add(new Cell());
    cells.add(new X());
    cells.add(new Lightning());
    cells.add(new Smiley());
    cells.add(new Star());
    cells.add(new Cell());
  }

  public void runSimulation() {
    //
    // Call the takeTurn method for the first player, passing in the player name
    // which will return the score for that player, then call the takeTurn method
    // for the second player and get that score.
    // Compare the two scores and print out which player won (or if it was a tie)
    //

    System.out.println("STARTING GAME:");

    for (Player p : players)
      takeTurn(p);

    Player tempWinner = new Player("temp");

    try {
      Formatter output = new Formatter("results.txt");

      for (Player p : players) {
        if (p.getScore() > tempWinner.getScore())
          tempWinner = p;
        output.format(p + " score = " + p.getScore() + "\n");
        // System.out.println(p + " score = " + p.getScore());
      }

      output.format("The winner is " + tempWinner + "!!!\n");
      output.close();
    } catch (Exception e) {
      System.out.println("error writing file");
    }
  }

  public void takeTurn(Player thePlayer) {
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
    System.out.println(thePlayer + "'s Turn:");
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
      Cell myCell = cells.get(location);
      System.out.print("now on " + myCell + " (#" + (location + 1) + ")");
      treatCount = Math.max(treatCount += myCell.landOn(), 0);

      System.out.print(" - Now has " + treatCount + " treats\n");

      if (location == 21) {
        System.out.println("REACHED THE END! See results.txt for results");
        break;
      }

    }
    thePlayer.setScore(treatCount);

  }

  public String toString() {
    //
    // Display the Board contents
    //
    String s = "BOARD: ";
    for (int i = 0; i < cells.size(); i++)
      s += cells.get(i) + " ";
    return s;
  }

}
