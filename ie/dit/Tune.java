package ie.dit;

public class Tune {
  private int x;
  private String title;
  private String altTitle;
  private String notation;


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

  public String toString() {
    String s = String.valueOf(this.x) + ", " + this.title + ", " + this.altTitle;
    return s;
  }
}
