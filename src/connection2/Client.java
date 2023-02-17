package connection2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private Socket socket = null;
    private Scanner input = null;
    private DataOutputStream output = null;

    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("connected");

            input = new Scanner(System.in);
            output = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException i) {
            System.out.println((i));
        }
        String message = "";
        while (!message.equals("over")) {
            try {
                message = input.nextLine();
                output.writeUTF( message);
            } catch (IOException e) {
                System.out.println(e);

            }
        }
        try {
            socket.close();
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("172.16.0.48", 3000);
    }
}

