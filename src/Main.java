import Bildirim.BildirimGonder;

public class Main {
    public static void main(String[] args) {

        Musteri musteri = new Musteri("Mehmet","Akif","Musteri");
        musteri.Login(musteri);
        musteri.abonelikOlustur();
        musteri.odemeYap();

        Arac a1 = new Arac();
        a1.otoparkaGir();

       Otopark o1= Otopark.getInstance(150);
       o1.cikisKaydiOlustur();

       Mudur m1 = new Mudur();
       m1.oneriSikyetTakibi();

       Muhasebeci muhasebeci1 = new Muhasebeci();
       muhasebeci1.odemePlaniOlustur();

       Gorevli gorevli1 = new Gorevli();
       gorevli1.gorevYap();

       BildirimGonder bildirim = new BildirimGonder();
       bildirim.gecikmeBildirimi();

    }
}