import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class  Student implements Serializable
{
    String name;
    int mark;
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    
}
class CustomObjectOutputStream extends ObjectOutputStream
{
    CustomObjectOutputStream(FileOutputStream ObjStream) throws IOException 
    {
        super(ObjStream);
    }
    @Override
    protected void writeStreamHeader()
    {

    }
}
public class SerializationExample {
    public static void main(String[] args) throws IOException{
        //Student s= new Student("XYZ", 44);
         Student s= new Student("Ram", 44);
         File file= new File("Student.txt");
        FileOutputStream fo=new FileOutputStream("Student.txt",true);//open file
       // ObjectOutputStream ObjStream= new ObjectOutputStream(fo);// obj to byte stream
        ObjectOutputStream ObjStream;
        if(file.length()==0)
        {
          ObjStream= new ObjectOutputStream(fo);
        }
        else{
            ObjStream= new CustomObjectOutputStream(fo);
        }
        ObjStream.writeObject(s);//writing on files
        fo.close();
        ObjStream.close();
    }
}
