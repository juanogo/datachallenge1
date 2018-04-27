/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dixon
 */
public class FileTest {
    
    public FileTest() {
    }

    /**
     * Test of addLine method, of class File.
     */
    @Test
    public void testAddLine() {
        System.out.println("addLine");
        String line = "66:66,0,1,1,0,66";
        File instance = new File();
        instance.setFilename("dataReciveTest.txt");
        boolean expResult = true;
        boolean result = instance.addLine(line);
        assertEquals(expResult, result);
    }
    
}
