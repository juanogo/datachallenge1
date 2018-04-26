/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Objects.Message;

/**
 *
 * @author Juan
 */
public class Process implements Runnable  {
    
    private final Message message;

    public Process(Message message) {
        this.message = message;
    }
    
    /**
     * Set the name of the file and save the message on a new line.
     */
    @Override
    public void run() {
        Parser parser = new Parser();
        File file = new File();
        
        file.setFilename("dataRecive.txt");
        String line = parser.getLine(message);
        file.addLine(line);
        System.out.println("New message saved!");
    }
    
}
