public class Kategoria extends Haslo {
    String nazwaKategorii;

    protected Kategoria(int dlugosc, String wartosc, String nazwaKategorii) {
        super(dlugosc, wartosc);
        this.nazwaKategorii = nazwaKategorii;
    }

    @Override
    public String toString() {
        return "Kategoria{" +
                "nazwaKategorii='" + nazwaKategorii + '\'' +
                ", dlugosc=" + dlugosc +
                ", wartosc='" + wartosc + '\'' +
                '}';
    }
}
