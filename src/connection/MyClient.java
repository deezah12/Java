package connection;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try{
            Socket server = new Socket("192.168.88.15", 6666);
            DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
            dataOutputStream.writeUTF("hello server");
            dataOutputStream.flush();
            dataOutputStream.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}

