package DAY11;

public class CompileTimeExcp {
    public static void main(String[] args) {
        Thread T= new Thread(()->{
            try
            {
            System.out.println("thread sleep");
             Thread.sleep(5000);
             System.out.println("thread wake");
            }
            catch(InterruptedException e)
            {
                System.out.println("sleep Interrupted");
            }
        }
    );
    T.start();
    try{
        Thread.sleep(2000);
    }
    catch(Exception e)

    {
        System.out.println("Not T");
    }
    T.interrupt();
    }
    
}

