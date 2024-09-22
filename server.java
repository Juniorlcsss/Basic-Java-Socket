import java.net.*;
import java.io.*;

public class server{
    public static void main(String[] args) throws IOException{
        ServerSocket listener = new ServerSocket(4832);
        System.out.println("Server is listening on port 4832...");

        //when client connects to server
        Socket socket = listener.accept();
        System.out.println("Client connected!");

        //reading client data
        InputStreamReader reader = new InputStreamReader(socket.getInputStream());
        BufferedReader buff = new BufferedReader(reader);

        String line = buff.readLine();
        System.out.println("Received from client: " + line);

        //sending response to client
        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Server received your message!");
}
}