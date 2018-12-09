import java.util.Scanner;

public abstract class Haslo {
    Scanner scanner = new Scanner(System.in);

    public final int dlugosc;
    public final String wartosc;

    protected Haslo(int dlugosc, String wartosc){
        this.dlugosc=dlugosc;
        this.wartosc=wartosc; }


        public void zgaduj(){
            System.out.println("odgadnij haslo " + toString());
            String input = scanner.next();
            if(input.equals(wartosc)){
                System.out.println("correct!");}
                else{
                    System.out.println("wrong!");
            }

        }
    @Override
    public String toString() {
        return "{" +
                "dlugosc=" + dlugosc +
                ", wartosc='" + wartosc + '\'' +
                '}';
    }

}
