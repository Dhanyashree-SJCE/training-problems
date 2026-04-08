import java.util.*;
public class Pattern4 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n-1;i>=0;i--)
    {
       
        for(int j=0;j<=(n-i);j++)
        {
            System.out.print(" ");
        }
         for(int k=1;k<=2*i-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
  }    
}

