public class Kisi {

    private String ad,soyAd,telefonNo,adres,kullaniciRol;

    public Kisi() {
    }
    public Kisi(String ad, String soyAd, String kullaniciRol) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.kullaniciRol=kullaniciRol;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getKullaniciRol() {
        return kullaniciRol;
    }
    public void setKullaniciRol(String kullaniciRol) {
        this.kullaniciRol = kullaniciRol;
    }

    public void Login(Kisi kisi) {
            System.out.println("Hoşgeldiniz, " +kisi.kullaniciRol + " " + kisi.ad + " " + kisi.soyAd);
    }

    public void yeniKullaniciOlustur() {
        System.out.println("Yeni kullanıcı oluşturuluyor.");
    }
}
