import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws TooManyPassangersException{
        List<Pojazd> pojazdy = new ArrayList<>();
        try{
            pojazdy.add(new Motocykl(200, 2));
            pojazdy.add(new Samochod(300, 4));
            pojazdy.add(new Motocykl(567, 1));
            pojazdy.add(new Samochod(5899, 3));
        }
        catch(TooManyPassangersException e){
            System.out.println("Wyjątek!");
            e.printStackTrace();
        }
        for (Pojazd p:pojazdy) {
            System.out.println("Rodzaj: " + p.getRodzaj() + " Liczba pasażerów: " + p.getLiczbaPasażerów() +  " Przebieg: " + p.getPrzebieg());
            System.out.println(p.toString());

        }
    }
}
