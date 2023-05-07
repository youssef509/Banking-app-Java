public class Main {
    public static void main(String[] args) {
        // create a new bank
        Bank bank = new Bank();

        // create some customers and add their accounts to the bank
        Musteri musteri1 = new Musteri("John", "Doe", "12345678901");
        VadesizHesap vadesizHesap1 = new VadesizHesap(1000, "TL", "Vadesiz Hesap");
        musteri1.hesapEkle(vadesizHesap1);
        bank.musteriEkle(musteri1);

        Musteri musteri2 = new Musteri("Jane", "Doe", "23456789012");
        VadesizHesap vadesizHesap2 = new VadesizHesap(2000, "USD", "Checking Account");
        musteri2.hesapEkle(vadesizHesap2);
        bank.musteriEkle(musteri2);

        // perform some transactions
        bank.havaleYap(musteri1, musteri2, vadesizHesap1, vadesizHesap2, 500);
        vadesizHesap1.paraCek(100);

        // print customer and account information
        System.out.println(musteri1.getMusteriBilgileri());
        System.out.println(vadesizHesap1.getHesapBilgileri());
        System.out.println(musteri2.getMusteriBilgileri());
        System.out.println(vadesizHesap2.getHesapBilgileri());
    }
}
