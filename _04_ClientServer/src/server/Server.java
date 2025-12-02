package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(){
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            while(true) { // Server läuft immer
                System.out.println("Server wartet...");
                Socket socket = serverSocket.accept();

                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                String msg = String.valueOf(in.readObject());
                out.writeObject(msg.toUpperCase()); // Response to Client
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
