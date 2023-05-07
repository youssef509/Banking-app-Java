public class YatirimHesap extends BankaHesap {
    private double yatirimBakiye;
    private String yatirimTuru;

    public YatirimHesap(int hesapNumarasi, String hesapBilgisi, String iban) {
        super(hesapNumarasi, hesapBilgisi, iban);
        this.yatirimBakiye = 0;
        this.yatirimTuru = "";
    }

    public void paraEkle(double miktar, double kur) {
        this.yatirimBakiye += miktar * kur;
    }

    public void paraBoz(double miktar, double kur) {
        this.yatirimBakiye -= miktar * kur;
    }

    public double getYatirimBakiye() {
        return yatirimBakiye;
    }

    public String getYatirimTuru() {
        return yatirimTuru;
    }

    public void setYatirimTuru(String yatirimTuru) {
        this.yatirimTuru = yatirimTuru;
    }
}
