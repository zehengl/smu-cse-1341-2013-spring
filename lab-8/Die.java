import java.util.Random;

public class Die {
  private int rollValue;

  public Die() {
    //
    // Call the roll() method to set the inital rollValue
    //
    roll();
  }

  public int roll() {
    //
    // Generate a random number from 1..6 and store the result in rollValue
    //

    Random r = new Random();
    rollValue = r.nextInt(6) + 1;
    return rollValue;
  }

  public String toString() {
    return "DIE: " + rollValue;
  }

}
