package ie.dit;
// import Tune;

public class Main {
  public static void main(String[] args) {
    // Get the full path and pass it as a parameter
    TuneBook tb = new TuneBook(System.getProperty("user.dir") + "/" + args[0]);
  }
}
