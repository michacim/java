package server;

import model.Message;

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
                go(socket);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void go(Socket socket) {
        Thread t = new Thread(()->{
            try {
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                Object obj = in.readObject();
                if (! (obj instanceof Message)){
                    System.out.println("kein Message-Objekt!");
                    return;
                }
                Message msg = (Message) obj;

                out.writeObject("Antwort vom Server: "+msg); // Response to Client
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        new Server();
    }
}
