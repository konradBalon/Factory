import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Randomizing {
    final String filePath = "FourLetterWords.txt";
    int dlugosc;
    String word;
    List<String> list = new ArrayList<>();


    protected Randomizing(int dlugosc, String word){
        this.dlugosc=dlugosc;
        this.word=word;
    }


    public void reader() {

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
                list.add(word);
            } catch (IOException e) {
                e.printStackTrace(); } }
        try {
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Can't close the file!!"); }
        System.out.println(list); }

    @Override
    public String toString() {
        return "Randomizing{" +
                "dlugosc=" + dlugosc +
                ", word='" + word + '\'' +
                '}';
    }
}
