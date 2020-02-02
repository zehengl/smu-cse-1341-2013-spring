
public class MenuItem {
  private String itemCode;
  String itemName;
  double itemPrice;

  public

  MenuItem(String cd, String nm, double pr) {
    itemCode = cd;
    itemName = nm;
    itemPrice = pr;
  }

  MenuItem() {
    itemCode = "";
    itemName = "";
    itemPrice = 0.0;
  }

  void setItemCode(String c) {
    itemCode = c;
  }

  void setItemName(String n) {
    itemName = n;
  }

  void setItemPrice(double p) {
    itemPrice = p;
  }

  String getItemCode() {
    return itemCode;
  }

  String getItemName() {
    return itemName;
  }

  double getItemPrice() {
    return itemPrice;
  }

}
