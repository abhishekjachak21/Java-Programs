package polymorphism.samjho;

public class SMSNotifier implements Notifier {
    public void send(String msg){
        System.out.println("Sms sent: "+msg);
    }

}
