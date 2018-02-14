package ie.dit;

public class Tune implements Player {
  private int x;
  private String title;
  private String altTitle;
  private String notation;

  Tune() {
    this.title = "";
    this.altTitle = "";
    this.notation = "";
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

  public void setX(int _x) {
    this.x = _x;
  }

  public void setTitle(String _title) {
    this.title = _title;
  }

  public void setAltTitle(String _altTitle) {
    this.altTitle = _altTitle;
  }

  public void setNotation(String _notation) {
    this.notation = _notation;
  }

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
