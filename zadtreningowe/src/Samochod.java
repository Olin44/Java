public class Samochod extends Pojazd{
    public Samochod(String marka, int masa_calkowita, String rodzaj){
        super(marka, masa_calkowita);
        this.rodzaj = rodzaj;
    }

    @Override
    public String getRodzaj() {
        return rodzaj;
    }
}
