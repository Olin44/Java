public class Przycisk extends Kontrolka {
    public Przycisk(double wysokosc, double szerokosc, String rodzaj, double x, double y) {
        super(wysokosc, szerokosc, rodzaj, x, y);
    }
    public void przesun(double nx, double ny) {
        x += nx;
        y += ny;
    }
    public void setWysokosc(double wys){
        wysokosc += wys;
    }
    public void setSzerokosc(double szer){
        szerokosc += szer;
    }

    @Override
    public String toString() {
        return "Przycisk{" +
                "wysokosc=" + wysokosc +
                ", szerokosc=" + szerokosc +
                ", rodzaj='" + rodzaj + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
