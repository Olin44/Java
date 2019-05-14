public abstract class Pojazd {
    double przebieg;
    int liczbaPasazerow;

    public Pojazd(double przebieg, int liczbaPasazerow) {
        this.przebieg = przebieg;
        this.liczbaPasazerow = liczbaPasazerow;
    }

    public abstract String getRodzaj();
    public abstract double getPrzebieg();
    public abstract int getLiczbaPasażerów();
}
