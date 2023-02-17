package connection;

import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(5000);
            Socket client = server.accept();
            DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
            String string = (String) dataInputStream.readUTF();
            System.out.println("client says = " +string);
            server.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
