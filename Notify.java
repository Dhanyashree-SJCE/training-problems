class Notification
{
    String name;
    String message;
    Notification(String name,String message)
    {
        this.name=name;
        this.message=message;
    }
    void send()
    {
        System.out.println("Sending Notification");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name,String message)
    {
       super(name, message);
    }
    void send()
    {
        System.out.println("-------------------------");
        System.out.println("Sending Email Notification to:"+name);
        System.out.println("Message:"+message);
        System.out.println("-------------------------");
    }
    void changeReceivermail()
    {
        System.out.println("Changing Receiver mail");
        //this method cannot be accesed by parent class because this is not in parent class .
    }
}
class SMSNotification extends Notification
{
    SMSNotification(String name,String message)
    {
        super(name, message);
    }
    void send()
    {
        System.out.println("-------------------------");
        System.out.println("Sending SMS Notification to:"+name);
        System.out.println("Message:"+message);
        System.out.println("-------------------------");
    }
}
public class Notify {
    public static void main(String[] args) {
    //     Notification n;
    //     n= new EmailNotification("test","Order confirmed");
    //     n.send();
    //    // n.changeReceivermail();
    //     n=new  SMSNotification("test2","OTP is 234");
    //     n.send();
    Notification[] n={new EmailNotification("test","Order confirmed"),new SMSNotification("test2", "OTP is 234")};
    for(Notification n1:n)
    {
        n1.send();
        System.out.println();
    }


    }
}
