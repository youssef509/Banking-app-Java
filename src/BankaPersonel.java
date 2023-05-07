import java.util.ArrayList;

public class BankaPersonel extends Kisi {
    private String personelID;
    private ArrayList<Musteri> musteriler;

    public BankaPersonel() {
        musteriler = new ArrayList<Musteri>();
    }

    public String getPersonelID() {
        return personelID;
    }

    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public void musteriSil(Musteri musteri) {
        musteriler.remove(musteri);
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }
}
