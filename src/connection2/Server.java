package connection2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class Server {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;


    public Server(int port) {
        try {

            server = new ServerSocket(port);
            System.out.println("server started");
            System.out.println("waiting for client");
            socket = server.accept();
            System.out.println("connected");
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String message = "";
            while (!message.equals("over")) {
                try {
                    message = input.readUTF();
                    System.out.println(message);
                } catch (IOException e) {
                    System.out.println(e);
                    ;
                }
            }
            System.out.println("closing connection");
            socket.close();
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Server server1 = new Server(3000);
    }
}
