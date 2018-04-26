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
public class Message implements Serializable {
    
    private Timestamp timestamp;  // Timestamp of message received
    private boolean id;           // 0 – left eye, 1 – right eye
    private float confidence;     // 0 – no confidence, 1 – perfect confidence
    private float normalizedPosX; // Normalized x­coordinate of the pupil location, 0 – left, 1 – right
    private float normalizedPosY; // Normalized y­coordinate of the pupil location, 0 – bottom, 1 – top
    private int pupilDiameter;    // Diameter of the pupil in image pixels

    /**
     * @return the timestamp
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the id
     */
    public boolean isId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(boolean id) {
        this.id = id;
    }

    /**
     * @return the confidence
     */
    public float getConfidence() {
        return confidence;
    }

    /**
     * @param confidence the confidence to set
     */
    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }

    /**
     * @return the normalizedPosX
     */
    public float getNormalizedPosX() {
        return normalizedPosX;
    }

    /**
     * @param normalizedPosX the normalizedPosX to set
     */
    public void setNormalizedPosX(float normalizedPosX) {
        this.normalizedPosX = normalizedPosX;
    }

    /**
     * @return the normalizedPosY
     */
    public float getNormalizedPosY() {
        return normalizedPosY;
    }

    /**
     * @param normalizedPosY the normalizedPosY to set
     */
    public void setNormalizedPosY(float normalizedPosY) {
        this.normalizedPosY = normalizedPosY;
    }

    /**
     * @return the pupilDiameter
     */
    public int getPupilDiameter() {
        return pupilDiameter;
    }

    /**
     * @param pupilDiameter the pupilDiameter to set
     */
    public void setPupilDiameter(int pupilDiameter) {
        this.pupilDiameter = pupilDiameter;
    }
    
}
