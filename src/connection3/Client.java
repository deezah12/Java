package connection3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;


public class Client {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        server = new ServerSocket(1234);
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        while (true){
            try{
                socket = server.accept();
                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);
                while (true){
                    String messageFromClient = bufferedReader.readLine();
                    System.out.println("client" + messageFromClient);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    if (messageFromClient.equalsIgnoreCase("BYE"));
                    break;
                }
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
