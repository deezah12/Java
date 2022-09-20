package chapter15.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutputStreamSample {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("test.txt"); PrintWriter writer = new PrintWriter(fos)){
            writer.println("we are africans");
        }catch(IOException exception){
            System.out.println(exception.getLocalizedMessage());
        }

    }
}
