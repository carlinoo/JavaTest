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
        boolean isNewTune = true;
        boolean isTitleSet = false;

        while ((l = inputStream.readLine()) != null) {

          // If there is an empty line, there is a new tume
          if (l.trim().isEmpty()) {
            tunes.add(tune);
            isNewTune = true;
            isTitleSet = false;
            tune = new Tune();
            continue;
          } else {
            isNewTune = false;
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
  }


}
