package DAY22;

import java.util.List;
class Employee
{
    String name;
    int salary;
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        return salary+" ";
    }
}
public class StreamsExample {
    public static void main(String[] args) {
        //map
        List<Integer> nums=List.of(2,3,4,5,6);
        List<Integer> multiplyBy2=nums.stream().map((i)->i*2).toList();
        System.out.println("MAP  EXAMPLE:");
        System.out.println("MUltiply By 2:"+multiplyBy2);
        //obj
        List<Employee> employee= List.of(new Employee("Employee1", 222222),new Employee("Employee2", 4444444));
        List<String> map=employee.stream().map((e)->e.getName()).toList();
        List<Integer> map2=employee.stream().map((i)->i.getSalary()).toList();
        System.out.println();
        System.out.println();
        // Employee details
        System.out.println("EMPLOYEE DETAILS....");
        System.out.println();
        System.out.println("Employee name :"+ map);
        System.out.println("Employee salary :"+map2);


        //filter -> checks condition 
        System.out.println();
        List<Integer> even= nums.stream().filter((i)->i%2==0).toList(); 
        System.out.println("FILTER BY CHECKING THE NUMBERS IS EVEN :");      // filtering by checking the elements in the nums list is even and adding in the evenNumbers list
        System.out.println();
        System.out.println("The Even numbers are:"+even);
    
        // employee salary >300000 using filter
        System.out.println();
        List<Employee> HighSalary=employee.stream().filter((i)->(i.getSalary()>30000)).toList();
        System.out.println("EMPLOYEE WITH SALARY > 30000");
        System.out.println("Employee salaries:" +HighSalary.toString());

        // reduce
        System.out.println();
        System.out.println();
        System.out.println("Reduce .....");
        int total=multiplyBy2.stream().reduce(0,(a,b)->a+b);
        System.out.println("Total by reduce:"+total);
    }
}
