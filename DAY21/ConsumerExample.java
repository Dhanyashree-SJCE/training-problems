package DAY21;

import java.util.List;
import java.util.function.Consumer;

class student{
    String name;
    student(String name)
    {
        this.name=name;
    }
}
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printString=(s)->System.out.println(s);
        Consumer<student> printName=(s)->System.out.println(s.name);
        printName.accept(new student("test1"));
        printString.accept("From consumer");
        List<String> names=List.of("abc","def","ghi");
        names.forEach(name->System.out.println(name));
        //Shortcut for lambda fuction...
        names.forEach(System.out::println);
    }
}
