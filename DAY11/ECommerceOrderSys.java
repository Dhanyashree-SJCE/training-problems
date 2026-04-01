package DAY11;
class ProductOutOfstock extends Exception
{
    public ProductOutOfstock(String msg)
    {
        super(msg);
    }
}
class Paymentfailed extends Exception
{

    public Paymentfailed(String message) {
        super(message);
    }
    

}
class OrderProcessingFailure extends Exception
{

    public OrderProcessingFailure(String message) {
        super(message);
    }
   
}
class InvalidAddressException extends Exception
{

    public InvalidAddressException(String message) {
        super(message);
    }
    
}
class Product
{
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price)
    {
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User
{
    String username;
    String address;
    User(String username, String address)
    {
        this.username=username;
        this.address=address;
    }
}
class Order 
{
    Product p;
    User u;
    int quantity;
    Order(Product p,User u,int quantity)
    {
        this.p=p;
        this.u=u;
        this.quantity=quantity;
    }
}
class OrderService 
{
    void placeOrder(Order order) throws ProductOutOfstock,Paymentfailed,OrderProcessingFailure,InvalidAddressException
    {
        order.p.stock-=order.quantity;
        if(order.p.stock <=0)
        {
            throw new ProductOutOfstock("Product Out Of Stock");
        }
        if(Math.random()<0.4) //Using math.random() that ranges from 0.0 to 1.0
        {
            throw new Paymentfailed("Payment Failed");
        }
        if(Math.random()<0.2)
        {
            throw new OrderProcessingFailure("Order Processing Failed");
        }
        if(order.u.address==null)
        {
            throw new InvalidAddressException("Invalid address given");
        }
       
        System.out.println(" Order Placed successdfully..."); 
    }
}
public class ECommerceOrderSys {
 public static void main(String[] args) {
    Product p=new Product("mouse",5,200.0 );
    User u= new User("test1", "abc,chennai");
    Order o= new Order(p, u, 3);
    OrderService s= new OrderService();
    try{
        s.placeOrder(o);
    }
    catch(ProductOutOfstock e)
    {
        System.out.println(e.getMessage());
    }
    catch(Paymentfailed e)
    {
        System.out.println(e.getMessage());
    }
    catch(InvalidAddressException e)
    {
        System.out.println(e.getMessage());
    }
    catch(OrderProcessingFailure e)
    {
        System.out.println(e.getMessage());
    }
 }   
}
