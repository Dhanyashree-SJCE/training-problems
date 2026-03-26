class User
{
    String name,phone,location;
    User()
    {
        name="raja";
        phone="965688968";
        location="kanchii";

    }
    User(String name,String phone,String location)
    {
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
   void displayInfo()
   {
    System.out.println("Name:"+name);
    System.out.println("Phone:"+phone);
    System.out.println("Location:"+location);
   }
}
class RideUser extends User
{
    String Vehicletype;
    RideUser()
    {
        super();
        Vehicletype="scootypep";
    }
    RideUser(String name,String phone,String location,String Vehicletype)
    {  
       super(name,phone,location);
       this.Vehicletype=Vehicletype;
    }
    void displayRide()
    {
      // System.out.println("#####################");
      // displayInfo(); 
       System.out.println("Vehicle type:"+Vehicletype);
    //System.out.println("#####################");
    }
}
class FoodUser extends User
{
    String favfood;
    FoodUser(String favfood)
    {
        super();
        this.favfood=favfood;
    }
    FoodUser(String name,String phone,String location,String favfood)
    {
        super(name,phone,location);
        this.favfood=favfood;
    }
    void displayFood()
    {
        
        //displayInfo();
        System.out.println("Fav Food:"+favfood);
        System.out.println();
       
    }

}
class ParcelUser extends User
{
 String Parcelweight;
 ParcelUser()
 {
   super();
   Parcelweight="5kg";
 }
 ParcelUser(String Parcelweight)
 {
    super();
    this.Parcelweight=Parcelweight;
 }
 void  displayParcel()
 {
    //displayInfo();
    System.out.println("Parcel Weight:"+Parcelweight);
    System.out.println();
 }
}
public class MultipleBooking {
    public static void main(String[] args) {
        // System.out.println("****************************************");
        // RideUser r= new RideUser("Ram", "9988776655", "Chennai", "Formula1");
        // r.displayInfo();
        // r.displayRide();
        // System.out.println("****************************************");
        // System.out.println("Food detailss");
        // FoodUser f= new FoodUser("Panner butter masala");
        // f.displayInfo();
        // f.displayFood();
        // System.out.println("****************************************");
        // ParcelUser p= new ParcelUser();
        // p.displayInfo();
        // p.displayParcel();
        // System.out.println("****************************************");



    }
}