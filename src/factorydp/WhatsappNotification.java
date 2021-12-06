package factorydp;

public class WhatsappNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending whatsapp Notification to the user");
    }
}
