import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Programista("Kowalski", 11100));
        pracownicy.add(new Projektant("Aloński", 2000));
        pracownicy.add(new Programista("Zych", 5000));
        for (Pracownik p: pracownicy) {
            System.out.println(p.toString());
        }

        pracownicy.sort(new Comparator<Pracownik>() {
            @Override
            public int compare(Pracownik p1, Pracownik p2) {
                return Integer.valueOf(p1.getPensja()).compareTo(p2.getPensja());
            }
        });

        System.out.println("\nPo posortowaniu:");

        for (Pracownik p: pracownicy) {
            System.out.println(p.toString());

        }
    }
}
