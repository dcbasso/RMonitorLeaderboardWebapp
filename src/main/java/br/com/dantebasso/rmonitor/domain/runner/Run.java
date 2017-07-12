/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dantebasso.rmonitor.domain.runner;

import de.odysseus.staxon.json.jaxb.JsonXML;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dcbasso
 */
@JsonXML(virtualRoot = true, prettyPrint = false)
@XmlRootElement
public class Run implements Serializable {
    
    private String runName;
    private String elapsedTime;
    private String timeToGo;
    private String flagStatus;
    private String trackName;
    private Double trackLength;
    private List<RunDetails> leaderBoard;
    
    public Run() {}

    public String getRunName() {
        return runName;
    }

    public void setRunName(String runName) {
        this.runName = runName;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(String timeToGo) {
        this.timeToGo = timeToGo;
    }

    public String getFlagStatus() {
        return flagStatus;
    }

    public void setFlagStatus(String flagStatus) {
        this.flagStatus = flagStatus;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Double trackLength) {
        this.trackLength = trackLength;
    }

    public List<RunDetails> getLeaderBoard() {
        return leaderBoard;
    }

    public void setLeaderBoard(List<RunDetails> leaderBoard) {
        this.leaderBoard = leaderBoard;
    }       
    
}
