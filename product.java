public class product {
    int id;
    String name;
    double price;
    int quantity;
    product(int id,String name,double price,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double getTotalPrice()
      {
        return price*quantity;   
    }
    void displayDetails()
    {
        System.out.println("Product ID:"+id);
        System.out.println("product Name:"+name);
        System.out.println("product Price"+price);
        System.out.println("product Quantity:"+quantity);
        System.out.println("Total price:"+getTotalPrice());
        System.out.println("----------------");
    }
    public static void main(String[] args)
    {
         
      product p1= new product(1,"ram",87.0,5);
      product  p2= new product(2,"raja",86.0,4);
      product   p3= new product(3,"ravi",85.0,3);
     product[] parr={p1,p2,p3};
         int grandtotal=0;
        for(product p:parr)
        {
            p.displayDetails();
          grandtotal+=p.getTotalPrice();
        }
        System.out.println("The Grand total :"+grandtotal);
       
        
    }
}
