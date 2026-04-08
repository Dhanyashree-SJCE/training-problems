package DAY15;
import java.util.*;
public class treeset {
    public static int closest(int[] arr,int target)
    {
         TreeSet<Integer> tset=new TreeSet<Integer>();
         for(int i:arr)
         {
            tset.add(i);
         }
         Integer low=tset.lower(target);
         Integer high=tset.higher(target);
         if(low==null) low=Integer.MIN_VALUE;
         if(high==null) high=Integer.MAX_VALUE;
         Integer result=(target-low)<=(high-target)?low:high;
         return result;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int targ=sc.nextInt();
        System.out.println(closest(arr, targ));
    }
}
