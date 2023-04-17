// Ana Decorator soyut sınıfımız
abstract class OdemeDecorator implements Odeme {
    private Odeme decoratedOdeme;

    public OdemeDecorator(Odeme decoratedOdeme) {
        this.decoratedOdeme = decoratedOdeme;
    }

    public OdemeDecorator() {

    }

    @Override
    public void odemeYap() {
        decoratedOdeme.odemeYap();
    }
}
