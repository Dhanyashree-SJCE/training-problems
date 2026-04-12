//package DAY17;
import java.util.*;
public class HLSort {
    public static List<Character>  shortchar(String s)
    {
        Map<Character,Integer>  map= new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        //2.Map stored in list and using comparator we  can sort
        List<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet()); 
        //3.short
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {
            @Override
            public int  compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b)
            {
                if(!a.getValue().equals(b.getValue()))
                {
                    return b.getValue()-a.getValue();
                }
                return a.getKey()-b.getKey();

            }
        });
        List<Character> result= new ArrayList<>();
        for(Map.Entry<Character,Integer> i: list)
        {
            result.add(i.getKey());
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        System.out.println(shortchar(s));
        sc.close();
    }
}
