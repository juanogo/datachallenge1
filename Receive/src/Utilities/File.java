/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan
 */
public class File {

    private String filename;

    /**
     * Set the file name
     * @param filename 
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Open the file and add the new line
     * @param line 
     * @return  
     */
    public boolean addLine(String line) {
        boolean success = false;
        FileWriter fileWriter = null;
        try {
            String workingDir = System.getProperty("user.dir");
            fileWriter = new FileWriter(workingDir + "\\" + this.filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
            success = true;
        } catch (IOException ex) {
            System.out.println("Error (IOException): " + ex.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException ex) {
                System.out.println("Error (IOException): " + ex.getMessage());
            }
        }
        return success;
    }
}
