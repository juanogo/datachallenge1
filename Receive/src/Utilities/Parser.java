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
public class Parser {

    /**
     * Get the String to create the new line
     * @param message
     * @return 
     */
    public String getLine(Message message) {
        String line = "";
        line = line.concat(message.getTimestamp().getSeconds() + ":" + message.getTimestamp().getNanoseconds());
        line = line.concat("," + (message.isId() ? "1" : "0"));
        line = line.concat("," + String.format("%.0f", message.getConfidence()));
        line = line.concat("," + String.format("%.0f", message.getNormalizedPosX()));
        line = line.concat("," + String.format("%.0f", message.getNormalizedPosY()));
        line = line.concat("," + message.getPupilDiameter());
        return line;
    }

}
