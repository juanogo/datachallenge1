/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.Message;
import Utilities.File;
import Utilities.Parser;
import Utilities.Sockets;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Main {
    
    public static void main(String[] args) {
        File file = new File();
        Parser parser = new Parser();
        Sockets sendMessage = new Sockets();
        
        // read the file
        file.setFilename("data.txt");
        ArrayList<String> lines = file.getLines();
        
        // send each line by using socket connection 
        lines.forEach((String line) -> {
            Message newMessage = parser.getMessage(line);
            sendMessage.sendMessage(newMessage);
        });
    }
    
}
