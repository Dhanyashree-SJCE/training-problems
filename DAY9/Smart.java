package DAY9;

abstract class SmartDevice
{
    abstract  void turnOn();
    abstract void turnOff();
    abstract void setLevel(String level);
    void deviceInfo()
    {
        System.out.println("Smart Device Information...");
    }
}
class Ac extends SmartDevice{
    void turnOn()
    {
        System.out.println("Turn On the AC");
    }
    void turnOff()
    {
        System.out.println("Turn Off the AC");
    }
    void setLevel(String Level)
    {
        System.out.println("Now the current level is: "+Level);
    }
}
class Light extends SmartDevice
{
    @Override
    void turnOn()
    {
         System.out.println("Light On");
    }
    @Override
    void turnOff()
    {
        System.out.println("Light Off");
    }
    void setLevel(String Level)
    {
       System.out.println("Now the Current level is: "+ Level);
    }
}
interface Remote
{
    void change(); 
}
interface WifiControl
{
    //void change();
    void connect();
}
class TV implements Remote,WifiControl
{
    public void change()
    {
        System.out.println("Change Channel");
    }
    public void connect()
    {
        System.out.println("Connecting Network PTC");
    }
}
public class Smart {
    public static void main(String[] args) {
        // SmartDevice device= new Ac();
        // device.deviceInfo();
        // device.turnOn();
        // device.turnOff();
        // device.setLevel("High");


        // Remote r= new TV();
        // r.change();
        WifiControl w= new TV();
        w.connect();

    }
    
}
