package factorydp;

public class NotificationFactory {
    public Notification createNotification(String medium){
        if(medium == null && medium.isEmpty())
            return null;
        if(medium.equals("SMS")){
            return new SMSNotification();
        }
        else if(medium.equals("Email")){
            return new SMSNotification();
        }
        else if(medium.equals("Whatsapp")){
            return new SMSNotification();
        }
        return null;
    }
}
