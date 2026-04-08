package DAY8;
import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int rows=sc.nextInt();
        System.out.println(zigzagpattern(s,rows));
        sc.close();

    }
    static String zigzagpattern(String  s,int row)
    {
    //      StringBuilder[] sb = new StringBuilder[row];
    //     for (int j = 0; j < row; j++) {
    //         sb[j] = new StringBuilder();
    //     }
    //     int i = 0, n = s.length();
    //     while (i < n) {
    //         for (int j = 0; j < row; j++) {
    //             if (i == n)
    //                 break;
    //             sb[j].append(s.charAt(i++));
    //         }
    //         for (int j = row - 2; j > 0; j--) {
    //             if (i == n)
    //                 break;
    //             sb[j].append(s.charAt(i++));
    //         }
    //     }
    //     StringBuilder res = new StringBuilder();
    //     for (int j = 0; j < row; j++) {
    //         res.append(sb[j]);
    //     }
    //     return res.toString();
    // }
     StringBuilder[] sb = new StringBuilder[row];
        for (int j = 0; j < row; j++) {
            sb[j] = new StringBuilder();
        }
        boolean upward = true;
        int cur = 0;
        for(char c: s.toCharArray()){
            sb[cur].append(c);
            if(cur==0 || cur==row-1) upward = !upward;
            cur += upward ? -1 : 1;

        }
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < row; j++) {
            res.append(sb[j]);
        }
        return res.toString();
    }
    
    
}
