package DAY10;

class BankAccount
{
   private double balance;
   public void setBalance(double balance)
   {
      if(balance >0)
      {
        this.balance=balance;
      }
      else
      {
        System.out.println("Input not valid");
      }
   }
   public void withdraw(int amount)
   {
    if(amount>0 && balance>=amount)
    {
        balance-=amount;
        System.out.println("Amount debited:"+amount);
    }
    else
    {
        System.out.println("Entered Invalid amount");
    }
    
   }
   public void deposit(int amount)
   {
    if(amount>0)
    {
        balance+=amount;
        System.out.println("Amount credited:"+amount);
    }
    else 
    {
        System.out.println("Entered Invalid amount");
    }
   }
   public double getBalance()
   {
    return balance;
   }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.setBalance(1000);//balance+=-1000;
        System.out.println("Balance:"+b.getBalance());
        b.withdraw(500);
       System.out.println("Now,Current Balance:"+b.getBalance()); 
       b.deposit(2000);
       System.out.println("Now the Current baalance is:"+b.getBalance());

       // System.out.println(b.balance);
    }
}
