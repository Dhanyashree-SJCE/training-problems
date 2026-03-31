package DAY10;
class Locker
{
    private int lockerId;
    private boolean isLocked;
    private int pin;
    private String storedItem;
    Locker(int lockerId,int pin)
    {
       this.lockerId=lockerId;
       this.pin=pin;
       isLocked=true;
    }
    public void storeItem(String item,int pin)
    {
        if(this.pin==pin)
        {
            if(!isLocked)
            {
             this.storedItem=item;
            System.out.println("your Item "+ this.storedItem +" stored successfully");
            }
            else
            {
                System.out.println("Locker is locked");
            }
        }
        else{
            System.out.println("Entered pin is wrong");
        }
    }
    public void retreiveItem(int pin)
    {
        if(this.pin==pin)
        {
            if( storedItem!=null && !isLocked )
            {
             System.out.println("The retreived item is:"+storedItem);
             storedItem=null;
             //isLocked=true;
             }
             else if(storedItem==null)
             {
                System.out.println("Locker is empty");
             }
           else
            {
             System.out.println("Locker is locked");
            }
        }
        else
        {
            System.out.println("Pin is wrong");
        }
        
    }
    public void Lock()
    {
        isLocked=true;
        System.out.println("Locker is locked:");
    }
    public void unLock(int pin)
    {
        if(this.pin==pin)
        {
            isLocked=false;
            System.out.println("Unlocked");
        }
        else
        {
            System.out.println("Wrong pin");
        }
    }
}

public class LockerSystem {
    public static void main(String[] args) {
        Locker l= new Locker(101,123456);
        // l.unLock(123456);
        // l.storeItem("purse", 123456);
        // l.retreiveItem(123456);
        // l.Lock();

        // l.unLock(12345);
        // l.storeItem("bag", 12345);
        // l.retreiveItem(12345);


        

    }
}
