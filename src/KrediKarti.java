public class KrediKarti {
    private int kartNumarasi;
    private double limit;
    private double kullanilabilirLimit;
    private double guncelBorc;

    public KrediKarti(int kartNumarasi, double limit) {
        this.kartNumarasi = kartNumarasi;
        this.limit = limit;
        this.kullanilabilirLimit = limit;
        this.guncelBorc = 0.0;
    }

    public int getKartNumarasi() {
        return kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public double getKullanilabilirLimit() {
        return kullanilabilirLimit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void krediKartiEkle(KrediKarti kart) {
        // add the credit card to the list
    }

    public void krediKartiSil() {
        if (guncelBorc > 0.0) {
            System.out.println("Lutfen once borcunuzu odeyin.");
        } else {
            // remove the credit card from the list
        }
    }

    public void krediKartiBorcOdeme(double odemeMiktari) {
        if (odemeMiktari > kullanilabilirLimit - guncelBorc) {
            System.out.println("Odeme miktari kullanilabilir limiti asti.");
        } else {
            kullanilabilirLimit += guncelBorc - odemeMiktari;
            guncelBorc = odemeMiktari;
            System.out.println("Borcunuz basariyla odeyildi.");
        }
    }

    public void kullanilabilirLimitHesapla() {
        double kalanLimit = limit - guncelBorc;
        if (kalanLimit < 5000) {
            System.out.println("Kalan limitiniz: " + kalanLimit);
            System.out.println("Kredi teklifi icin lutfen bankamiza basvurunuz.");
        } else {
            System.out.println("Kullanilabilir limitiniz: " + kullanilabilirLimit);
        }
    }
}
