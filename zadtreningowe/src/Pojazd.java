public abstract class Pojazd implements General_information, Technical_data, Comparable<Pojazd> {
    protected String marka, rodzaj;
    protected int masa_calkowita;

    public Pojazd(String marka, int masa_calkowita) {
        this.marka = marka;
        this.masa_calkowita = masa_calkowita;
    }

    public String getMarka(){
        return marka;
    }

    public int getMasaCalkowita(){
        return masa_calkowita;
    }

    @Override
    public int compareTo(Pojazd pojazd) {
        return Integer.compare(this.getMasaCalkowita(), pojazd.getMasaCalkowita());
    }

    public abstract String getRodzaj();
}
