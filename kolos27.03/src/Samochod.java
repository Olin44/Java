public class Samochod extends Pojazd {
    String rodzaj = "Samochod";
    public Samochod(double przebieg, int liczbaPasazerow) throws TooManyPassangersException{
        super(przebieg, liczbaPasazerow);
        if (liczbaPasazerow > 5) throw new TooManyPassangersException();
    }

    public String getRodzaj(){
        return rodzaj;
    }

    public double getPrzebieg(){
        return przebieg;
    }

    public int getLiczbaPasażerów(){
        return liczbaPasazerow;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "rodzaj='" + rodzaj + '\'' +
                ", przebieg=" + przebieg +
                ", liczbaPasazerow=" + liczbaPasazerow +
                '}';
    }
}
