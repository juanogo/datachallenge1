/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Objects.Message;
import Objects.Timestamp;

/**
 *
 * @author Juan
 */
public class Parser {

    /**
     * Get the Message for one line
     * @param line
     * @return 
     */
    public Message getMessage(String line) {
        Message message = null;
        String[] items = line.split(",");

        if (items.length == 6) {
            message = new Message();
            Timestamp timestamp = new Timestamp();
            timestamp.setSeconds(Integer.parseInt(items[0].split(":")[0]));
            timestamp.setNanoseconds(Integer.parseInt(items[0].split(":")[1]));
            message.setTimestamp(timestamp);
            message.setId(Boolean.parseBoolean(items[1]));
            message.setConfidence(Float.parseFloat(items[2]));
            message.setNormalizedPosX(Float.parseFloat(items[3]));
            message.setNormalizedPosY(Float.parseFloat(items[4]));
            message.setPupilDiameter(Integer.parseInt(items[5]));
        }

        return message;
    }

}
