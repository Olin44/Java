public abstract class Pracownik implements Personalia, Wynagrodzenie {
    String nazwisko;
    int pensja;

    public Pracownik(String nazwisko, int pensja) {
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    @Override
    public int getPensja() {
        return pensja;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "nazwisko='" + nazwisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
