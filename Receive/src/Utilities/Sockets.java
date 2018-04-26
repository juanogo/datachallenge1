/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Objects.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Juan
 */
public class Sockets{
    
    private final int port = 5000;

    /**
     * Listen a socket port and create a thread to process each message receive.
     */
    public void receiveMessage() {
        ServerSocket skServidor = null;
        try {
            skServidor = new ServerSocket(port);
            while (true) {
                Socket skCliente = skServidor.accept();
                InputStream entrada = skCliente.getInputStream();
                ObjectInputStream entradaObjetos = new ObjectInputStream(entrada);
                Message messageRecieved = (Message)entradaObjetos.readObject();
                Process processMessage = new Process(messageRecieved);
                new Thread(processMessage).start();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            try {
                if(skServidor != null){
                skServidor.close();
                } 
           } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    
}
