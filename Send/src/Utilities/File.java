/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class File {
    
    private String filename;

    /**
     * Set the name of the file.
     * @param filename 
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    /**
     * Gets the lines of the file
     * @return 
     */
    public ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();
        FileReader f = null;
        String line;
        try {
            String workingDir = System.getProperty("user.dir");
            f = new FileReader(workingDir + "\\" + this.filename);
            try (BufferedReader b = new BufferedReader(f)) {
                while ((line = b.readLine()) != null) {
                    System.out.println(line);
                    lines.add(line);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error (FileNotFoundException): " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error (IOException): " + ex.getMessage());
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
            } catch (IOException ex) {
                System.out.println("Error (IOException): " + ex.getMessage());
            }
        }
        return lines;
    }
}
