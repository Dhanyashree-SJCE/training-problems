package DAY12.com.Ecommerce.service;
import DAY12.com.Ecommerce.model.*;
public class OrderService {
    public void placeorder(Order o)
    {
       System.out.println("USER NAME:"+o.u.name);
       System.out.println("PRODUCT NAME:"+o.p.Prodname);
       System.out.println("TOTAL QUANTITY"+o.quantity);
       double totalprice=o.p.price*o.quantity;
       System.out.println("TOTAL PRICE:"+totalprice);
    }
    
}
