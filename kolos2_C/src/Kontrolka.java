public abstract class Kontrolka {
    protected double wysokosc, szerokosc;
    String rodzaj;
    protected double x, y;

    public Kontrolka(double wysokosc, double szerokosc, String rodzaj, double x, double y) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.rodzaj = rodzaj;
        this.x = x;
        this.y = y;
    }

    public abstract void przesun(double nx, double ny);
    public abstract void setWysokosc(double wys);
    public abstract void setSzerokosc(double szer);
}
