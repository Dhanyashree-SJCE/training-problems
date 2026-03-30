package DAY8;

import java.util.*;
public class WordswithEvenlen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(withEven(s));
    }
    static String withEven(String s)
    {
      s=s+" ";
      StringBuilder sb= new StringBuilder();
      StringBuilder word= new StringBuilder();
      int i=0,n=s.length()-1;
      for(char ch:s.toCharArray())
      {
        i++;
       if(ch==' ')
       {
         if(word.length()%2==0)
         { sb.append(word);
             }
             if (i<n-1) {
               sb.append(" ");
             }
             word.setLength(0);
       }
       else
       {
           word.append(ch);
       }

      }
      return sb.toString();
    }
}

