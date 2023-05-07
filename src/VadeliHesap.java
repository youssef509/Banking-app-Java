public class VadeliHesap extends BankaHesap {
    private double faizOrani;

    public VadeliHesap(int hesapNumarasi, String hesapBilgisi, String iban) {
        super(hesapNumarasi, hesapBilgisi, iban);
        this.faizOrani = 0.2;
    }

    public double getFaizOrani() {
        return faizOrani;
    }
}
