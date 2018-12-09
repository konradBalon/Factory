import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FabrykaHasel> lista = new ArrayList<>();

        FabrykaKategorii fabrykaKategorii = new FabrykaKategorii();
        FabrykaGraczy fabrykaGraczy = new FabrykaGraczy();

        Kategoria haslo12 = fabrykaKategorii.zrobHaslo();
        Haslo haslo = fabrykaKategorii.zrobHaslo();
        Gracz gracz = fabrykaGraczy.zrobHaslo();

        gracz.imie="adam";
        lista.add(fabrykaGraczy);
        lista.add(fabrykaKategorii);


//        for (FabrykaHasel fh : lista) {
//            Haslo hasloZFabryki = fh.zrobHaslo();
//            hasloZFabryki.zgaduj();
//        }

        Randomizing randomizing = new Randomizing(4,"kura");
        randomizing.reader();
        randomizing.toString();


    }

}

