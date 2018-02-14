package ie.dit;

// This class will contain the information about a Tune
public class Tune implements Player {
  private int x;
  private String title;
  private String altTitle;
  private String notation;

  // Constructor to initialize the string as empty strings
  Tune() {
    this.title = "";
    this.altTitle = "";
    this.notation = "";
  }


  // to get this.x
  public int getX() {
    return this.x;
  }

  // to get this.title
  public String getTitle() {
    return this.title;
  }

  // to get this.altTitle
  public String getAltTitle() {
    return this.altTitle;
  }

  // to get this.notation
  public String getNotation() {
    return this.notation;
  }

  // to set this.x
  public void setX(int _x) {
    this.x = _x;
  }

  // to set this.title
  public void setTitle(String _title) {
    this.title = _title;
  }

  // to set this.altTitle
  public void setAltTitle(String _altTitle) {
    this.altTitle = _altTitle;
  }

  // to set this.notation
  public void setNotation(String _notation) {
    this.notation = _notation;
  }

  // to append things to notation
  public void addToNotation(String _notation) {
    this.notation += _notation;
  }

  // To display
  public String toString() {
    String s = String.valueOf(this.x) + ", " + this.title + ", " + this.altTitle;
    return s;
  }


  // Method to play tune on console
  public void play() {
    System.out.println(this.notation);
  }
}
