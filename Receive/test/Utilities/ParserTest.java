/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Objects.Message;
import Objects.Timestamp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dixon
 */
public class ParserTest {

    public ParserTest() {
    }

    /**
     * Test of getLine method, of class Parser.
     */
    @Test
    public void testGetLine() {
        System.out.println("getLine");
        Message message = new Message();
        Timestamp timestamp = new Timestamp();
        timestamp.setSeconds(33);
        timestamp.setNanoseconds(44);
        message.setTimestamp(timestamp);
        message.setId(true);
        message.setConfidence(0);
        message.setNormalizedPosX(1);
        message.setNormalizedPosY(1);
        message.setPupilDiameter(34);
        Parser instance = new Parser();
        String expResult = "33:44,1,0,1,1,34";
        String result = instance.getLine(message);
        assertEquals(expResult, result);
    }

}
