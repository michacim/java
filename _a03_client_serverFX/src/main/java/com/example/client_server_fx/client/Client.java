package com.example.client_server_fx.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

        /*
    Socket erzeugen
    ObjectInputStream , ObjectOutputStream
    writeObject,readObject
     */

    public static String sendMessage(String msg) {
        try (Socket socket = new Socket("localhost",1234);){

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            System.out.println("Client schreibt...");
            out.writeObject(msg);
            return ""+in.readObject();//easy toString
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }





}
