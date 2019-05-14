import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(new Motocykl("subaru", 12, "motur"));
        pojazdy.add(new Motocykl("jamaha", 560, "motur"));
        pojazdy.add(new Samochod("volvo", 1200, "auto"));
        pojazdy.add(new Motocykl("sruuuu", 45, "motur"));

        for (Pojazd P: pojazdy) {
            System.out.println(P.getMasaCalkowita() + " " + P.getRodzaj());

        }
        pojazdy.sort(Pojazd::compareTo);

        for (Pojazd P: pojazdy) {
            System.out.println(P.getMasaCalkowita() + " " + P.getRodzaj());

        }
    }
}
