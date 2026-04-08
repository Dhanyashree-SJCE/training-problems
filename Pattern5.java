import java.util.*;
public class Pattern5 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        if(i<n)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
          else
        {
            for(int k=n;k>=1;k--)
            {
            for(int j=k;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
        

    }
    sc.close();
}    
}
