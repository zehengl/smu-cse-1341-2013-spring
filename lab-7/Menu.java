import java.util.*;

public class Menu {

  private ArrayList<MenuItem> menuItemList;

  public Menu() {
    menuItemList = new ArrayList<MenuItem>();
  }

  void setMenuItem(MenuItem item) {
    menuItemList.add(item);
  }

  public String toString() {
    String output = new String();
    for (int i = 0; i < menuItemList.size(); i++)
      output += menuItemList.get(i).getItemCode() + "\t" + menuItemList.get(i).getItemName() + "\t"
          + menuItemList.get(i).getItemPrice() + "\n";

    return output;
  }

}
