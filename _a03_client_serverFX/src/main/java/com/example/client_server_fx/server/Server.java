package com.example.client_server_fx.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;

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


                String msg = String.valueOf(in.readObject());

                out.writeObject(msg +"-"+ LocalDate.now()); // Response to Client
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
