package DAY11;

public class Except {
 public static void main(String[] args) {
    try{
        // int a=8;
        // int b=0;
        // int c=a/b;
         //System.out.println(c);
        String  s= "dhanya";
        System.out.println(s.length());
       
    }
    catch(ArithmeticException e)
    {
        System.out.println("Error: Number is divided by zero ");
    }
    catch(NullPointerException e)
    {
        System.out.println("String value is null");
    }

    finally{
        System.out.println("Finally block always execute");
    }

    // catch(Exception e)
    // {
    //     System.out.println(e);
    // }
 }   
}
