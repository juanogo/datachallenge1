/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Objects.Message;
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
public class ParserTest {
    
    public ParserTest() {
    }
    
    /**
     * Test of getMessage method, of class Parser.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        String line = "11:11,0,1,1,1,50";
        Parser instance = new Parser();
        Message result = instance.getMessage(line);
        assertEquals(false, result.isId());
    }
    
}
