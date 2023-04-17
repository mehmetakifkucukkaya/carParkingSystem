import java.util.ArrayList;
import java.util.Date;

// Otoparkın kendisinden 1 tane olabileceği için Singleton tasarım deseni kullanmak daha doğru olacktır.
public class Otopark {
    // Singleton otopark nesnesi
    private static Otopark otopark = null;

    // Otopark özellikleri
    private int kapasite,doluYerSayisi;
    private ArrayList<Musteri> musteriler;
    private ArrayList<Gorevli> gorevliler;
    private ArrayList<Date> girisCikisKayitlari;

    private Otopark(int kapasite) {
    }

    // Singleton ınstancesını geriye döndüren metot
    public static Otopark getInstance(int kapasite) {
        if (otopark == null) {
            otopark = new Otopark(kapasite);
        }
        return otopark;
    }

    public void girisKaydiOlustur() {
        System.out.println("Giris kaydi olusturuluyor...");
    }

    public void cikisKaydiOlustur() {
        System.out.println("Cikis kaydi olusturuluyor...");
    }


    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getDoluYerSayisi() {
        return doluYerSayisi;
    }

    public void setDoluYerSayisi(int doluYerSayisi) {
        this.doluYerSayisi = doluYerSayisi;
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }

    public ArrayList<Gorevli> getGorevliler() {
        return gorevliler;
    }

    public void setGorevliler(ArrayList<Gorevli> gorevliler) {
        this.gorevliler = gorevliler;
    }

    public ArrayList<Date> getGirisCikisKayitlari() {
        return girisCikisKayitlari;
    }

    public void setGirisCikisKayitlari(ArrayList<Date> girisCikisKayitlari) {
        this.girisCikisKayitlari = girisCikisKayitlari;
    }
}
