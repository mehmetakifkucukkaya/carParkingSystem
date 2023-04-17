// //Peşin ödeme yapmak için Decorator sınıfımız
class PesinDecorator extends OdemeDecorator {
    public PesinDecorator(Odeme decoratedOdeme) {
        super(decoratedOdeme);
    }

    @Override
    public void odemeYap() {
        super.odemeYap();
        System.out.println("Peşin ödeme yapıldı.");
    }
}
