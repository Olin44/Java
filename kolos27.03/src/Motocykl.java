public class Motocykl extends Pojazd {
    String rodzaj = "Motocykl";
    public Motocykl(double przebieg, int liczbaPasazerow) throws TooManyPassangersException{
        super(przebieg, liczbaPasazerow);
        if (liczbaPasazerow > 2) throw new TooManyPassangersException();
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
        return "Motocykl{" +
                "rodzaj='" + rodzaj + '\'' +
                ", przebieg=" + przebieg +
                ", liczbaPasazerow=" + liczbaPasazerow +
                '}';
    }
}
