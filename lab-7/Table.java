
public class Table {
  private String label;
  char status;

  public Table(String lab) {
    label = lab;
    status = 'A';
  }

  void setLabel(String l) {
    label = l;
  }

  void setStatus(char s) {
    status = s;
  }

  String getLabel() {
    return label;
  }

  char getStatus() {
    return status;
  }
}
