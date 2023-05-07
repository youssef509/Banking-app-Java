public class Kredi {
    private int krediID;
    private int musteriNumarasi;
    private double krediMiktari;
    private double faizOrani;

    public Kredi(int krediID, int musteriNumarasi, double krediMiktari) {
        this.krediID = krediID;
        this.musteriNumarasi = musteriNumarasi;
        this.krediMiktari = krediMiktari;
    }

    public void krediFaizOraniHesapla(double yillikKazanc) {
        this.faizOrani = yillikKazanc * 0.5;
    }

    public int getKrediID() {
        return krediID;
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public double getKrediMiktari() {
        return krediMiktari;
    }

    public double getFaizOrani() {
        return faizOrani;
    }
}
