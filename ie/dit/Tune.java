package ie.dit;

public class Tune {
  private int x;
  private String title;
  private String altTitle;
  private String notation;


  // Contructor
  Tune(int _x, String _title, String _altTitle, String _notation) {
    this.x = _x;
    this.title = _title;
    this.altTitle = _altTitle;
    this.notation = _notation;
  }


  public int getX() {
    return this.x;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAltTitle() {
    return this.altTitle;
  }

  public String getNotation() {
    return this.notation;
  }

  // To display
  public String toString() {
    String s = String.valueOf(this.x) + ", " + this.title + ", " + this.altTitle;
    return s;
  }
}
