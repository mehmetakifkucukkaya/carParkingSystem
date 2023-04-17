package Bildirim;

public class SmsClient extends Observer {

    public SmsClient (Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " sms gönderildi");
    }

    @Override
    void update() {
        System.out.println("Sms Stream: " + subject.getState());
    }
}
