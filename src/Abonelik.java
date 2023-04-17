//Abonelik sınıfında girilen bilgiler arasında opsiyonellik bulunduğu için Builder tasarım deseni kullanmak daha işlevsel olacaktır. Musteri sınıfının içerisinde kullanılıyor.
public class Abonelik {
    private String ad,soyad,tckNo,aracPlakaNo,adres,telefon,eposta;
    private Enums.AbonelikTipi abonelikTuru;

    private Abonelik(Builder builder) {
        this.ad = builder.ad;
        this.soyad = builder.soyad;
        this.tckNo = builder.tckNo;
        this.aracPlakaNo = builder.aracPlakaNo;
        this.adres = builder.adres;
        this.telefon = builder.telefon;
        this.eposta = builder.eposta;
        this.abonelikTuru = builder.abonelikTuru;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTckNo() {
        return tckNo;
    }

    public String getAracPlakaNo() {
        return aracPlakaNo;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public Enums.AbonelikTipi getAbonelikTuru() {
        return abonelikTuru;
    }

    //inner Class
    public static class Builder {
        private String ad,soyad,tckNo,aracPlakaNo,adres,telefon,eposta;
        private Enums.AbonelikTipi abonelikTuru;

        public Builder(String ad, String soyad, String aracPlakaNo, Enums.AbonelikTipi abonelikTuru) {
            this.ad = ad;
            this.soyad = soyad;
            this.aracPlakaNo = aracPlakaNo;
            this.abonelikTuru = abonelikTuru;
        }

        public Builder setTckNo(String tckNo) {
            this.tckNo = tckNo;
            return this;
        }
        public Builder setAdres(String adres) {
            this.adres = adres;
            return this;
        }
        public Builder setTelefon(String telefon) {
            this.telefon = telefon;
            return this;
        }
        public Builder setEposta(String eposta) {
            this.eposta = eposta;
            return this;
        }
        public Abonelik build() {
            return new Abonelik(this);
        }
    }
}
