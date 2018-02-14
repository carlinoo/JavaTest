package ie.dit;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TuneBook {
  private ArrayList<Tune> tunes = new ArrayList<Tune>();


  // Constructor
  TuneBook(String s) {
    BufferedReader inputStream = null;

    // Try to read from bufeer
    try {
        inputStream = new BufferedReader(new FileReader(s));

        String l;
        Tune tune = new Tune();
        boolean isTitleSet = false;
        boolean isFirstTune = true;

        // Until we don't get to the end of file
        while ((l = inputStream.readLine()) != null) {

          // If it starts with X: then its a new song
          if (l.startsWith("X:")) {
            // If it is not the first tune, we add it to the list.
            // I use the boolean to make sure the first comments of the file are not added as a tune
            if (!isFirstTune) {
              tunes.add(tune);
            }

            isFirstTune = false;
            isTitleSet = false;
            tune = new Tune();
          }

          if (l.startsWith("X:")) {
            // If there is a title
            tune.setX(Integer.parseInt(l.substring(2)));
          } else if (l.startsWith("T:")) {
            // If the title is set, set the altitle
            if (!isTitleSet) {
              tune.setTitle(l.substring(2));
              isTitleSet = true;
            } else {
              tune.setAltTitle(l.substring(2));
            }
          }

          // Add notation always
          tune.addToNotation(l + "\n");
        }


    } catch (IOException e) {
        e.printStackTrace();

    } finally {
      // Close all the inputStream
        if (inputStream != null) {
            try {
                inputStream.close();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
  } // end constructor



  // Display all tunes
  public String toString() {
    String s = "";

    for (Tune t : tunes) {
      s += t;
      s += "\n";
    }

    return s;
  }

  // Display a tune that contains the matchingTitle
  public Tune findTune(String matchingTitle) {
    for (Tune t : tunes) {
      if (t.getTitle().toLowerCase().contains(matchingTitle.toLowerCase())) {
        // I use toLowerCase to make it case insensitive
        return t;
      }
    }

    // If there isn't any, return null
    return null;
  }

}
