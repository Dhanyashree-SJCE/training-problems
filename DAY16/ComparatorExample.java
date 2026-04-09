package DAY16;

import java.util.*;

class Student
{
      int id;
     String name;
     int mark;

  Student(int id,String name,int mark)
  {
    this.id=id;
    this.name=name;
    this.mark=mark;
  }
  
  @Override
    public String toString()
    {
        return id+"-"+ name+"-"+mark;
    }

}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> s= new ArrayList<>();
        s.add(new Student(1,"A",70));
        s.add(new Student(2,"B", 75));
        s.add(new Student(3,"C",80));
        s.add(new Student(4,"D", 65));
        Comparator<Student> byId= new Comparator<Student>()
        {
            public int compare(Student a,Student b)
            {
                return a.id-b.id;
             }    
       };
       Collections.sort(s,byId);
       System.out.println("Student byId"+s);
       Collections.sort(s,(a,b)->a.mark-b.mark);
       System.out.println("Student by marks"+s);

        }
    }

