class Student
{
    int marks;
}public class Method3 {
    static void change(Student s)
    {
        s.marks=80;
        System.out.println(s.marks);

    }
    public static void main(String[] args) {
        Student s1= new Student();
        s1.marks=20;
        change(s1);
        System.out.println("Outside the method:"+s1.marks);
    }
}
