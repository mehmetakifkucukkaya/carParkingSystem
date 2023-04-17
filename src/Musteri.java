public class Musteri extends  Kisi{

    private String abonelikTuru,odemeYontemi;
    public Musteri(String ad,String soyAd,String rol){
        setAd(ad);
        setSoyAd(soyAd);
        setKullaniciRol(rol);
    }

    public Musteri(String ad,String soyAd,String rol,String abonelikTuru,String odemeYontemi){
        setAd(ad);
        setSoyAd(soyAd);
        setKullaniciRol(rol);
        setAbonelikTuru(abonelikTuru);
        setOdemeYontemi(odemeYontemi);
    }
    public void abonelikOlustur()
    {
        Abonelik abonelik = new Abonelik.Builder("Ahmet", "Mehmet", "34MAB25", Enums.AbonelikTipi.Aylık)
                .setTckNo("12626262626")
                .setAdres("Istanbul")
                .setTelefon("55555555")
                .setEposta("deneme@gmail.com")
                .build();
             System.out.println( getAd() + " " + getSoyAd()  + " Aboneligi olusturuldu.");
    }

    public void oneriVeSikayetOlustur()
    {
        System.out.println("Oneri ve Sikayet olusturuldu");
    }

    public void abonelikSorgula(){
        System.out.println("Abonelik Sorgulanıyor...");
    }

    public void  odemeYap()
    {
        // Decorator sınıfından nesne üretip ödeme yapıyoruz.
        Odeme odeme = new BankaHavalesi();

        odeme.odemeYap();
    }
    public String getAbonelikTuru() {
        return abonelikTuru;
    }

    public void setAbonelikTuru(String abonelikTuru) {
        this.abonelikTuru = abonelikTuru;
    }

    public String getOdemeYontemi() {
        return odemeYontemi;
    }

    public void setOdemeYontemi(String odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }

}
