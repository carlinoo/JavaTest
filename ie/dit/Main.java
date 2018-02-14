package ie.dit;
// import Tune;

public class Main {
  public static void main(String[] args) {
    // Get the full path and pass it as a parameter
    TuneBook tb = new TuneBook(System.getProperty("user.dir") + "/file.abc");

    System.out.println(tb);

    Tune t = tb.findTune("Scotsman over the Border");
    t.play();
  }
}
