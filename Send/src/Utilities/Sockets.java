/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Objects.Message;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Juan
 */
public class Sockets {
    
    private final String ip = "localhost";
    private final int port = 5000;

    /**
     * Send the message with socket connection.
     * @param message 
     */
    public void sendMessage(Message message) {
        try {
            Socket skCliente = new Socket(ip, port);
            OutputStream salida = skCliente.getOutputStream();
            ObjectOutputStream salidaObjetos = new ObjectOutputStream(salida);
            salidaObjetos.writeObject(message);
            skCliente.close();
        } catch (IOException ex) {
            System.out.println("Error al deshabilitar la comunicación con los identificadores, el error es: " + ex.getMessage());
        }
    }

}
