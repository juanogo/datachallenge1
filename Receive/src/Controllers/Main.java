/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Utilities.Sockets;

/**
 *
 * @author Juan
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Stat Receive");
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);
        // Start the listening process
        Sockets listenMessages = new Sockets();
        listenMessages.receiveMessage();
    }

}
