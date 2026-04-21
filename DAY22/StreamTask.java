package DAY22;

import java.util.List;

class Employee{
    String name;
    String dept;
    int age;
    int salary;
    Employee(String name,String dept,int age,int salary)
    {
        this.name=name;
        this.dept=dept;
        this.age=age;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public String getdept()
    {
        return dept;
    }
    public int getage()
    {
        return age;
    }
    public int getsalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        return name+" " +salary+" "+age;
    }

}
public class StreamTask {
    public static void main(String[] args) {
        List<Employee> emp= List.of(new Employee("Ram", "dev", 20, 250000),new Employee("Sita", "dev", 19, 300000),new Employee("Raja", "hr", 25, 70000),new Employee("Rani", "support", 23, 80000));
        List<Employee> devfilter= emp.stream().filter((i)->(i.getdept().equals("dev"))).toList();
        
        System.out.println("Filtered by dev dept:"+devfilter.toString());
        List<Employee> salaryfilter=emp.stream().filter((i)->(i.getsalary()>50000)).toList();
        System.out.println("Salary > 50000: "+salaryfilter.toString());
        int sum=emp.stream().map(e->e.getsalary()).reduce(0,(a,b)->a+b);
        System.out.println(sum);
        double avg= emp.stream().mapToInt(e->e.getsalary()).average().orElse(0);
        System.out.println(avg);
        long count=emp.stream().count();
        System.out.println(count);
        


    }
}
