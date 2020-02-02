import java.util.*;

public class Server {
  private String name;
  ArrayList<Table> tableList;

  public Server(String nm, int[] t) {
    name = nm;
    tableList = new ArrayList<Table>();

    for (int i = 0; i < t.length; ++i) {
      Table tab = new Table("T" + t[i]); // Available by default at construction
      tableList.add(tab);
    }

  }

  void setName(String n) {
    name = n;
  }

  String getName() {
    return name;
  }

  String searchName(String tab) {
    for (int i = 0; i < tableList.size(); ++i)
      if (tableList.get(i).getLabel().equals(tab))
        return name;
    return "None";
  }

  public String toString() {
    String output = new String();
    output += "\nName: " + name + "\n";

    output += "Tables: ";
    for (int i = 0; i < tableList.size(); ++i)
      output += tableList.get(i).getLabel() + " ";

    return output;
  }
}
