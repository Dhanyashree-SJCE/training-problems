package DAY18;

import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            // FileReader fr= new FileReader("test.txt");
            // int character;
            // while( (character=fr.read())!=-1)
            // {
              
            //     System.out.print((char)character);
            // }
            BufferedReader fr= new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line=fr.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
           System.out.println(e);
        }
    }
}
