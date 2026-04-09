package DAY16;
import  java.util.*;
public class Traversal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        // for(int i:list)
        // {
        //     if(i==4) {list.remove(i);}
        //     System.out.println(i);
                 
        // }
        ListIterator<Integer> it =list.listIterator();
        while(it.hasNext())
        {
            int current=it.next();
            if(current==4)
            {
                it.remove();
            }
            System.out.print(current+" ");
        }
        System.out.println();
        System.out.print("After the removal of 4 ,The List is:");
        System.out.println(list);
        System.out.println("Now it is to be printed in reverse Order");
        while(it.hasPrevious())
        {
            int prev=it.previous();
            System.out.print(prev+" ");
        }
       
    }
}
