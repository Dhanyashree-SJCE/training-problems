package DAY12.com.Ecommerce.main;
import DAY12.com.Ecommerce.model.*;
import DAY12.com.Ecommerce.service.OrderService;

public class Main {
 public static void main(String[] args) {
    User u= new User("Testuser", "dubai");
    Product p= new Product("keyboard", 800);
    Order o= new Order(u,p,4);
    OrderService service= new OrderService();
    service.placeorder(o);
 }   
}
