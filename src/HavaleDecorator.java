class HavaleDecorator extends OdemeDecorator {

    public HavaleDecorator(Odeme decoratedOdeme) {
        super(decoratedOdeme);
    }

    @Override
    public void odemeYap() {
        super.odemeYap();
        havaleYap();
    }

    private void havaleYap() {
        System.out.println("Havale yapılıyor...");
    }
}
