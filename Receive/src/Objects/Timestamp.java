/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author Juan
 */
public class Timestamp implements Serializable {
    
    private int seconds;
    private int Nanoseconds;

    /**
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * @param seconds the seconds to set
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * @return the Nanoseconds
     */
    public int getNanoseconds() {
        return Nanoseconds;
    }

    /**
     * @param Nanoseconds the Nanoseconds to set
     */
    public void setNanoseconds(int Nanoseconds) {
        this.Nanoseconds = Nanoseconds;
    }
    
}
