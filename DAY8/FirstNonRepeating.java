package DAY8;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s="abcbad";
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[i]==1) 
            {
                System.out.println(s.charAt(i));
                return;
            }
        }
       

    }
}
