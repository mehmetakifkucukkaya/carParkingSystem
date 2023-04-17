//Kredi kartı ile ödeme yapmak için Decorator sınıfımız
class KrediKartiDecorator extends OdemeDecorator {
    public KrediKartiDecorator(Odeme decoratedOdeme) {
        super(decoratedOdeme);
    }

    @Override
    public void odemeYap() {
        super.odemeYap();
        System.out.println("Kredi Kartı ile ödeme yapıldı.");
    }

}
