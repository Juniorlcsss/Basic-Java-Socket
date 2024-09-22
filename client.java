import java.net.*;
import java.io.*;

public class client{
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost", 4832);
        System.out.println("Client searching...");

        //Client to Server communication
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Testing client...");
        printWriter.flush();

        //Server to client communication
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Server response: " + bufferedReader.readLine());
    }
}