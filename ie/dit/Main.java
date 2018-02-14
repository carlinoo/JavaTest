package ie.dit;

public class Main {
  public static void main(String[] args) {
    // Get the full path and pass it as a parameter
    TuneBook tb = new TuneBook(System.getProperty("user.dir") + "/file.abc");

    // Print all Tunes
    System.out.println(tb);

    // Find a tune and play it
    Tune t = tb.findTune("Scotsman over the Border");
    t.play();
  }
}
