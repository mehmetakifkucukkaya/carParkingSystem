package Bildirim;

public class BildirimGonder {
public  void gecikmeBildirimi()
{
     Subject subject = new MessageStream();
     SmsClient smsClient = new SmsClient(subject);
     EmailClient emailClient = new EmailClient(subject);

     subject.setState("Bildirim Gönderildi");

     smsClient.addMessage("Ödemeniz Gecikti. Lütfen ödemenizi yapın!");
     emailClient.addMessage("Ödemeniz Gecikti. Lütfen ödemenizi yapın!");

}




}
