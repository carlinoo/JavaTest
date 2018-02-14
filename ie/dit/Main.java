package ie.dit;
// import Tune;

public class Main {
  public static void main(String[] args) {
    // Get the full path and pass it as a parameter
    TuneBook tb = new TuneBook(System.getProperty("user.dir") + "/file.abc");
    // System.out.println(tb);
    // System.out.println(tb.findTune("Hello World"));
    tb.findTune("A").play();
  }
}
