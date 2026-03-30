package DAY9;

class Battery
{
    public void powerSupply()
    {
        System.out.println("still have 40 % power");
    }
}
class Remote{
    Battery miniBattery;
    Remote()
    {
        miniBattery=new Battery();
    }
    public void changeChannel()
    {
        miniBattery.powerSupply();;
        System.out.println("Changel changed");
    }
}
// class TV{
//     Remote tvRemote;
//     TV (Remote tvRemote)
//     {
//         this.tvRemote=tvRemote;
//     }
// }
public class Relationship {
    public static void main(String[] args) {
     Remote tvremote= new Remote();
     tvremote.changeChannel();
    }
}
