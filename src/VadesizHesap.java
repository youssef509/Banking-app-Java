public class VadesizHesap extends BankaHesap {
    private double toplamBakiye;

    public VadesizHesap(int hesapNumarasi, String hesapSifresi, String iban) {
        super(hesapNumarasi, hesapSifresi, iban);
        this.toplamBakiye = 0.0;
    }

    public void setToplamBakiye(double toplamBakiye) {
        this.toplamBakiye = toplamBakiye;
    }

    public double getToplamBakiye() {
        return this.toplamBakiye;
    }

    public void paraYatir(double miktar) {
        this.toplamBakiye += miktar;
        super.paraYatir(miktar);
    }

    public boolean paraCek(double miktar) {
        if (this.toplamBakiye >= miktar) {
            this.toplamBakiye -= miktar;
            super.paraCek(miktar);
            return true;
        }
        return false;
    }
}
