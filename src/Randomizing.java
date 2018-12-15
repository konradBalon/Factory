import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Randomizing  {
    final String filePath = "FourLetterWords.txt";

    String word;
    List<String> listaHasel = new ArrayList<>();


    public Haslo reader() {

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            word = fileReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        } catch (IOException e) {
            System.out.println("can't read the data!!!");
        }
        while (word != null) {
            try {
                word = fileReader.readLine();
                listaHasel.add(word);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Can't close the file!!");
        }

        return new Haslo(this.listaHasel);
    }


}
