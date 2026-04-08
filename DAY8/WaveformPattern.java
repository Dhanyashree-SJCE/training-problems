package DAY8;

import java.util.*;

public class WaveformPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        StringBuilder odd= new StringBuilder();
        StringBuilder even= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                odd.append(s.charAt(i));
            }
            else
            {
                even.append(s.charAt(i));
            }
        }
        System.out.println(odd.toString()+even.toString());
        sc.close();
    }
}
