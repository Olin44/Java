import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Kontrolka> kontrolki = new ArrayList<>();
        kontrolki.add(new Przycisk(10,20, "zielona", 10, 10));
        for (Kontrolka k:
             kontrolki) {
            System.out.println(k.toString());
            k.przesun(0,-5);
            k.setSzerokosc(10);
            System.out.println(k.toString());

        }
    }
}
