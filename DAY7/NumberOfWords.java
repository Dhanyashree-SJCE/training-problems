package DAY7;

import java.util.*;
public class NumberOfWords {
    static int wordcount(String s)
    {
        int count=0;
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]!=' ' && ch[i+1]==' ')
            {
                count=count+1;
            }
        }
        if(ch[ch.length-1]!=' ')
        {
            count=count+1;
          
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter:");
        NumberOfWords n= new NumberOfWords();
        String s=sc.nextLine();
        System.out.println(n.wordcount(s));
    }
}
