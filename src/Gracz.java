public class Gracz extends Haslo {
    String imie;


    protected Gracz(String imie, int dlugosc, String wartosc){
        super(dlugosc,wartosc);
        this.imie=imie;

    }

    @Override
    public String toString() {
        return "Gracz{" +
                "imie='" + imie + '\'' +
                ", dlugosc=" + dlugosc +
                ", wartosc='" + wartosc + '\'' +
                '}';
    }
}
