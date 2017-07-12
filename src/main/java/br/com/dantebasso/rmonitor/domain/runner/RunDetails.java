/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dantebasso.rmonitor.domain.runner;

import de.odysseus.staxon.json.jaxb.JsonXML;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dcbasso
 */
@JsonXML(virtualRoot = true, prettyPrint = false)
@XmlRootElement
public class RunDetails implements Serializable {
    
    @XmlElement(name = "POS")
    private Integer pos;
    @XmlElement(name = "Pic")
    private Integer pic;
    @XmlElement(name = "class")
    private String raceClass;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Laps")
    private Integer laps;
    @XmlElement(name = "Total Time")
    private String TotalTime;
    @XmlElement(name = "Last Time")
    private String LastTime;
    @XmlElement(name = "fastestLap")
    private String BestTime;   
    @XmlElement(name = "Avg. Time")
    private String AvgTime;
    @XmlElement(name = "#")
    private String number;
    private String fastestLap;   
    
    public RunDetails() {}

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public String getRaceClass() {
        return raceClass;
    }

    public void setRaceClass(String raceClass) {
        this.raceClass = raceClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLaps() {
        return laps;
    }

    public void setLaps(Integer laps) {
        this.laps = laps;
    }

    public String getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(String TotalTime) {
        this.TotalTime = TotalTime;
    }

    public String getLastTime() {
        return LastTime;
    }

    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    public String getBestTime() {
        return BestTime;
    }

    public void setBestTime(String BestTime) {
        this.BestTime = BestTime;
    }

    public String getAvgTime() {
        return AvgTime;
    }

    public void setAvgTime(String AvgTime) {
        this.AvgTime = AvgTime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(String fastestLap) {
        this.fastestLap = fastestLap;
    }
    
}
