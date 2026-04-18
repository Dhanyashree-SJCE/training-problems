package DAY21;
@FunctionalInterface
interface Math
{
    int add(int a,int b);
    //int sub(int a,int b); In functional interface only method should be created so you cannot define sub()
}
interface Exercise
{
    void sayHello();
}
public class LambdaExample {
    // public static int add(int a,int b)          // NORMAL FUNCTION
    // {
    //     return a+b;
    // }
    public static void main(String[] args) {
       // System.out.println(add(22,33));
       
    //    Math obj= new Math() {
    //     @Override
    //     public int add(int a,int b)              ------> Lambda Function
    //     {
    //         return a+b;
    //     }
    
      // };


      Math obj=(a,b)->a+b;          //              ------> Anonymous function
     System.out.println(obj.add(12, 33));



    //  Exercise obj1=new Exercise() {
    //     @Override
    //     public void sayHello()
    //     {
    //         System.out.println("Helloooo");
    //     }
    //  };
    //  obj1.sayHello();

    // --------> Anonymous function for Exercise

    Exercise ex=()->System.out.println("Helloooo");
    ex.sayHello();     
    
    Math obj2=(a,b)->{
        System.out.println("Adding two numbers....");                  // if use {} after (->) then you must give the return stmt
        return a +b;
    }

   }
}
