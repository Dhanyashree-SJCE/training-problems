package DAY12;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("10");
        System.out.println(a);
        int c=a;
        System.out.println(c);//unboxing
        Integer b=Integer.parseInt(("01234"));
        System.out.println(b);
    //  Integer x=100;
    //  int  y=100;
    //  System.out.println(x==y);
        Integer x=200;
        Integer y=200;
      //System.out.println(x==y);
     // System.out.println(x.equals(y));//Integer ranges from -128 to 127 since it crosses the limit the op:true bcoz it checks the only the values by using equals method
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);   //AutoBoxing(int to Integer)
        
        int i=list.get(0); //UnBoxing(Integer to int)
    }
}
