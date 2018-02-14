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

        while ((l = inputStream.readLine()) != null) {

          // If it starts with X: then its a new song
          if (l.startsWith("X:")) {
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
          tune.addToNotation(l);
        }


    } catch (IOException e) {
        e.printStackTrace();



    } finally {
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

  // Display a tune thats similar to
  public Tune findTune(String matchingTitle) {
    for (Tune t : tunes) {
      if (t.getTitle().toLowerCase().contains(matchingTitle.toLowerCase())) {
        return t;
      }
    }

    return null;
  }



}
