public class BankaHesap {
    private int hesapNumarasi;
    private String hesapBilgisi;
    private double toplamBakiye;
    private String iban;

    public BankaHesap(int hesapNumarasi, String hesapBilgisi, String iban) {
        this.hesapNumarasi = hesapNumarasi;
        this.hesapBilgisi = hesapBilgisi;
        this.iban = iban;
        this.toplamBakiye = 0;
    }

    public void paraTransferi(BankaHesap aliciHesap, double transferMiktari) {
        if (this.toplamBakiye >= transferMiktari) {
            this.toplamBakiye -= transferMiktari;
            aliciHesap.toplamBakiye += transferMiktari;
            System.out.println("Para transferi basarili.");
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public int getHesapNumarasi() {
        return hesapNumarasi;
    }

    public String getHesapBilgisi() {
        return hesapBilgisi;
    }

    public double getToplamBakiye() {
        return toplamBakiye;
    }

    public String getIban() {
        return iban;
    }
}
