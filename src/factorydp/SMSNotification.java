package factorydp;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("sending SMS notification to the user");
    }
}
