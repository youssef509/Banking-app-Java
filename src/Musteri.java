public class Musteri extends Kisi {
    private int musteriNumarasi;
    private VadesizHesap vadesizHesap;
    private VadeliHesap vadeliHesap;
    private MaasHesabi maasHesabi;
    private KrediKarti[] krediler;

    public Musteri(String ad, String soyad, String adres, String telefonNumarasi, String email, int musteriNumarasi) {
        super(ad, soyad, adres, telefonNumarasi, email);
        this.musteriNumarasi = musteriNumarasi;
        this.krediler = new KrediKarti[3];
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public VadesizHesap getVadesizHesap() {
        return vadesizHesap;
    }

    public void setVadesizHesap(VadesizHesap vadesizHesap) {
        this.vadesizHesap = vadesizHesap;
    }

    public VadeliHesap getVadeliHesap() {
        return vadeliHesap;
    }

    public void setVadeliHesap(VadeliHesap vadeliHesap) {
        this.vadeliHesap = vadeliHesap;
    }

    public MaasHesabi getMaasHesabi() {
        return maasHesabi;
    }

    public void setMaasHesabi(MaasHesabi maasHesabi) {
        this.maasHesabi = maasHesabi;
    }

    public KrediKarti[] getKrediler() {
        return krediler;
    }

    public void setKrediler(KrediKarti[] krediler) {
        this.krediler = krediler;
    }

    public void hesapAc() {
        System.out.println("Hesap acma islemi basarili!");
    }

    public void hesapKapat() {
        System.out.println("Hesap kapatma islemi basarili!");
    }

    public void hesapBilgileriYazdir() {
        System.out.println("Musteri numarasi: " + musteriNumarasi);
        if (vadesizHesap != null) {
            System.out.println("Vadesiz hesap bakiyesi: " + vadesizHesap.getBakiye());
        }
        if (vadeliHesap != null) {
            System.out.println("Vadeli hesap bakiyesi: " + vadeliHesap.getBakiye());
        }
        if (maasHesabi != null) {
            System.out.println("Maas hesabi bakiyesi: " + maasHesabi.getBakiye());
        }
        for (KrediKarti krediKarti : krediler) {
            if (krediKarti != null) {
                System.out.println("Kredi karti limiti: " + krediKarti.getLimit());
            }
        }
    }
}
