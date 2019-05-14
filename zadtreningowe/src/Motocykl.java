public class Motocykl extends Pojazd{
    public Motocykl(String marka, int masa_calkowita, String rodzaj){
        super(marka, masa_calkowita);
        this.rodzaj = rodzaj;
    }

    @Override
    public String getRodzaj() {
        return rodzaj;
    }
}
