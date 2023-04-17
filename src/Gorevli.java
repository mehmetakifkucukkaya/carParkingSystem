public class Gorevli {

    private int gorevliId;
    private String gorevliRol;

    public String getGorevliRol() {
        return gorevliRol;
    }

    public void setGorevliRol(String gorevliRol) {
        this.gorevliRol = gorevliRol;
    }

    public int getGorevliId() {
        return gorevliId;
    }

    public void setGorevliId(int gorevliId) {
        this.gorevliId = gorevliId;
    }

    public void gorevYap(){
        System.out.println("Gorev Yapılıyor");
    }
}
