package polymorphism.samjho;

public class Main {
    public static void main(String[] args) {

        Notifier n = new EmailNotifier();
        n.send("Hello via Email");

        n = new SMSNotifier();
        n.send("Hello via SMS");
    }
}

