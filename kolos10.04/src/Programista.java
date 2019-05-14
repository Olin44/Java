public class Programista extends Pracownik {
    String stanowisko = "Programista";
    public Programista(String nazwiskoe, int pensja) {
        super(nazwiskoe, pensja);
    }

    @Override
    public String toString() {
        return "Programista{" +
                "stanowisko='" + stanowisko + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
