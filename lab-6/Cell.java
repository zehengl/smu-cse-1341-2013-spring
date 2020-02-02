
public class Cell {
  private int value;

  public Cell(int x) {
    //
    // Store the integer passed in in the instance variable "value"
    //
    value = x;
  }

  public void setValue(int x) {
    // setter method for the value attribute
    value = x;
  }

  public int getValue() {
    // getter method for the value attribute
    return value;
  }

  public String getName() {
    //
    // Determine the cell name based on its value and return the name
    // 5=Star
    // 10=Smiley
    // -5=Lightning
    // -10=X

    String s;
    if (value == 5)
      s = "Star";
    else if (value == 10)
      s = "Smiley";
    else if (value == -5)
      s = "Lightning";
    else if (value == -10)
      s = "X";
    else
      s = "blank";
    return s;
  }

  public String toString() {
    // call the getName() method and return the String it sends you
    return getName();
  }

}
