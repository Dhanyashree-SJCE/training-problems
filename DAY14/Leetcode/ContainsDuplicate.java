package DAY14.Leetcode;
import java.util.*;
public class ContainsDuplicate {
    public static boolean Duplicate(int[] nums)
    {
        Set<Integer> set= new HashSet<>();
      for(int a:nums)
      {
        if(!set.contains(a))
        {
            return true;
        }
        set.add(a);
      }
      return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nums= new int[4];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(Duplicate(nums));
    sc.close();
    }
}
