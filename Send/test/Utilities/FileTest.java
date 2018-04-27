/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
     * Test of getLines method, of class File.
     */
    @Test
    public void testGetLines() {
        System.out.println("getLines");
        File instance = new File();
        instance.setFilename("dataTest.txt");
        ArrayList<String> result = instance.getLines();
        assertEquals(2, result.size());
    }
    
}
