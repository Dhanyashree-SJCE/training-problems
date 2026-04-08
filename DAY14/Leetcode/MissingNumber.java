package DAY14.Leetcode;

import java.util.*;

public class MissingNumber {
    public static int Missing(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
          set.add(nums[i]);
        }
        for(int i=0;i<set.size();i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return nums.length;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nums = new int[3];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(Missing(nums));
    sc.close();
    }
}
