package ie.dit;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TuneBook {
  private ArrayList<Tune> tunes = new ArrayList<Tune>;


  // Constructor
  TuneBook(String s) {
    BufferedReader inputStream = null;

    // Try to read from bufeer
    try {
        inputStream = new BufferedReader(new FileReader(s));

        String l;

        while ((l = inputStream.readLine()) != null) {

          // If there is an empty line, there is a new tume
          if (l.trim().isEmpty()) {
            System.out.println("LINEEEEE");
          }
          System.out.println(l);
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
