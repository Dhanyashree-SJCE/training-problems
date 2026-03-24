public class App {
    public static void main(String[] args) {
        Driver d=new Driver("dhanya","Yamaha");
        d.displayDriver();
    }
}

class User{
    String name;
    String phone;
    String address;
    String role="User";
    User()
    {
        System.out.println("hello");
    }
    User(String name)
    {
        this.name=name;
       // this.phone=phone;
       // this.address=address;
        System.out.println("User created");
    }
    void display()
    {
        System.out.println("User permitted to go with this vehicle......");
        System.out.println("Name:"+name);
        System.out.println("Role:"+role);
       
    }
}
class Driver extends User
{
String role="Driver";
String vehicle;
Driver(String name,String vehicle)
{
    super(name);
    this.vehicle=vehicle;
}
void displayDriver()
{
super.display();;
System.out.println("vehicle"+vehicle);
System.out.println("role:"+role);
System.out.println("User role:"+super.role);
}
}
class  FoodUser extends User
{
    
    String  favouriteFood;
    FoodUser()
    {
        System.out.println("Food User created");
    }

}
class TravelUser extends User
{
    String prefferedVechile;
}