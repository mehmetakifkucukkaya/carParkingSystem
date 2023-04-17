package Bildirim;

public class EmailClient extends Observer {

    public EmailClient (Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - email gönderildi");
    }

    @Override
    void update() {
        System.out.println("Email Stream: " + subject.getState());
    }
}
