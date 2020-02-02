
public class Player {
  private String name;
  private int score;

  public Player(String s) {
    name = s;
    score = 0;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int x) {
    score = x;
  }

  public String toString() {
    return "PLAYER: " + name;
  }

}
