public class Projektant extends Pracownik {
    String stanowisko = "Projektant";
    public Projektant(String nazwiskoe, int pensja) {
        super(nazwiskoe, pensja);
    }

    @Override
    public String toString() {
        return "Projektant{" +
                "stanowisko='" + stanowisko + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
