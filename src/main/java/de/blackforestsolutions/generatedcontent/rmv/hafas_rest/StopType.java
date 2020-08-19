//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * The element Stop contains the name of the stop/station, the route index, the latitude, the
 * longitude, the departure time and date, the arrival time and date, the track, the realtime departure time and
 * date, the realtime arrival time and date and the realtime track.
 *
 * <p>Java-Klasse für StopType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{hafas_rest}Notes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Stop"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopType", propOrder = {
        "notes"
})
public class StopType {

    @XmlElement(name = "Notes")
    protected Notes notes;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "extId", required = true)
    protected String extId;
    @XmlAttribute(name = "routeIdx")
    protected Long routeIdx;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "arrPrognosisType")
    protected PrognosisType arrPrognosisType;
    @XmlAttribute(name = "depPrognosisType")
    protected PrognosisType depPrognosisType;
    @XmlAttribute(name = "depTime")
    protected String depTime;
    @XmlAttribute(name = "depDate")
    protected String depDate;
    @XmlAttribute(name = "depTz")
    protected Long depTz;
    @XmlAttribute(name = "arrTime")
    protected String arrTime;
    @XmlAttribute(name = "arrDate")
    protected String arrDate;
    @XmlAttribute(name = "arrTz")
    protected Long arrTz;
    @XmlAttribute(name = "passingTime")
    protected String passingTime;
    @XmlAttribute(name = "passingDate")
    protected String passingDate;
    @XmlAttribute(name = "passingTz")
    protected Long passingTz;
    @XmlAttribute(name = "arrTrack")
    protected String arrTrack;
    @XmlAttribute(name = "depTrack")
    protected String depTrack;
    @XmlAttribute(name = "rtDepTime")
    protected String rtDepTime;
    @XmlAttribute(name = "rtDepDate")
    protected String rtDepDate;
    @XmlAttribute(name = "rtDepTz")
    protected Long rtDepTz;
    @XmlAttribute(name = "rtArrTime")
    protected String rtArrTime;
    @XmlAttribute(name = "rtArrDate")
    protected String rtArrDate;
    @XmlAttribute(name = "rtArrTz")
    protected Long rtArrTz;
    @XmlAttribute(name = "rtArrTrack")
    protected String rtArrTrack;
    @XmlAttribute(name = "rtDepTrack")
    protected String rtDepTrack;
    @XmlAttribute(name = "rtPassingTime")
    protected String rtPassingTime;
    @XmlAttribute(name = "rtPassingDate")
    protected String rtPassingDate;
    @XmlAttribute(name = "rtPassingTz")
    protected Long rtPassingTz;
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "hasMainMast")
    protected Boolean hasMainMast;
    @XmlAttribute(name = "mainMastId")
    protected String mainMastId;
    @XmlAttribute(name = "mainMastExtId")
    protected String mainMastExtId;
    @XmlAttribute(name = "alighting")
    protected Boolean alighting;
    @XmlAttribute(name = "boarding")
    protected Boolean boarding;
    @XmlAttribute(name = "rtAlighting")
    protected Boolean rtAlighting;
    @XmlAttribute(name = "rtBoarding")
    protected Boolean rtBoarding;
    @XmlAttribute(name = "additional")
    protected Boolean additional;

    /**
     * Contains a list of notes to be displayed for this location, like attributes or footnotes.
     *
     * @return possible object is
     * {@link Notes }
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Legt den Wert der notes-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Notes }
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der extId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtId() {
        return extId;
    }

    /**
     * Legt den Wert der extId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtId(String value) {
        this.extId = value;
    }

    /**
     * Ruft den Wert der routeIdx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRouteIdx() {
        return routeIdx;
    }

    /**
     * Legt den Wert der routeIdx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRouteIdx(Long value) {
        this.routeIdx = value;
    }

    /**
     * Ruft den Wert der lon-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * Legt den Wert der lon-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLon(BigDecimal value) {
        this.lon = value;
    }

    /**
     * Ruft den Wert der lat-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * Legt den Wert der lat-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLat(BigDecimal value) {
        this.lat = value;
    }

    /**
     * Ruft den Wert der arrPrognosisType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PrognosisType }
     */
    public PrognosisType getArrPrognosisType() {
        return arrPrognosisType;
    }

    /**
     * Legt den Wert der arrPrognosisType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PrognosisType }
     */
    public void setArrPrognosisType(PrognosisType value) {
        this.arrPrognosisType = value;
    }

    /**
     * Ruft den Wert der depPrognosisType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PrognosisType }
     */
    public PrognosisType getDepPrognosisType() {
        return depPrognosisType;
    }

    /**
     * Legt den Wert der depPrognosisType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PrognosisType }
     */
    public void setDepPrognosisType(PrognosisType value) {
        this.depPrognosisType = value;
    }

    /**
     * Ruft den Wert der depTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepTime() {
        return depTime;
    }

    /**
     * Legt den Wert der depTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepTime(String value) {
        this.depTime = value;
    }

    /**
     * Ruft den Wert der depDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepDate() {
        return depDate;
    }

    /**
     * Legt den Wert der depDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepDate(String value) {
        this.depDate = value;
    }

    /**
     * Ruft den Wert der depTz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getDepTz() {
        if (depTz == null) {
            return 0;
        } else {
            return depTz;
        }
    }

    /**
     * Legt den Wert der depTz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDepTz(Long value) {
        this.depTz = value;
    }

    /**
     * Ruft den Wert der arrTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArrTime() {
        return arrTime;
    }

    /**
     * Legt den Wert der arrTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArrTime(String value) {
        this.arrTime = value;
    }

    /**
     * Ruft den Wert der arrDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArrDate() {
        return arrDate;
    }

    /**
     * Legt den Wert der arrDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArrDate(String value) {
        this.arrDate = value;
    }

    /**
     * Ruft den Wert der arrTz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getArrTz() {
        if (arrTz == null) {
            return 0;
        } else {
            return arrTz;
        }
    }

    /**
     * Legt den Wert der arrTz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setArrTz(Long value) {
        this.arrTz = value;
    }

    /**
     * Ruft den Wert der passingTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPassingTime() {
        return passingTime;
    }

    /**
     * Legt den Wert der passingTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPassingTime(String value) {
        this.passingTime = value;
    }

    /**
     * Ruft den Wert der passingDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPassingDate() {
        return passingDate;
    }

    /**
     * Legt den Wert der passingDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPassingDate(String value) {
        this.passingDate = value;
    }

    /**
     * Ruft den Wert der passingTz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getPassingTz() {
        if (passingTz == null) {
            return 0;
        } else {
            return passingTz;
        }
    }

    /**
     * Legt den Wert der passingTz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPassingTz(Long value) {
        this.passingTz = value;
    }

    /**
     * Ruft den Wert der arrTrack-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArrTrack() {
        return arrTrack;
    }

    /**
     * Legt den Wert der arrTrack-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArrTrack(String value) {
        this.arrTrack = value;
    }

    /**
     * Ruft den Wert der depTrack-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepTrack() {
        return depTrack;
    }

    /**
     * Legt den Wert der depTrack-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepTrack(String value) {
        this.depTrack = value;
    }

    /**
     * Ruft den Wert der rtDepTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtDepTime() {
        return rtDepTime;
    }

    /**
     * Legt den Wert der rtDepTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtDepTime(String value) {
        this.rtDepTime = value;
    }

    /**
     * Ruft den Wert der rtDepDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtDepDate() {
        return rtDepDate;
    }

    /**
     * Legt den Wert der rtDepDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtDepDate(String value) {
        this.rtDepDate = value;
    }

    /**
     * Ruft den Wert der rtDepTz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getRtDepTz() {
        if (rtDepTz == null) {
            return 0;
        } else {
            return rtDepTz;
        }
    }

    /**
     * Legt den Wert der rtDepTz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRtDepTz(Long value) {
        this.rtDepTz = value;
    }

    /**
     * Ruft den Wert der rtArrTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtArrTime() {
        return rtArrTime;
    }

    /**
     * Legt den Wert der rtArrTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtArrTime(String value) {
        this.rtArrTime = value;
    }

    /**
     * Ruft den Wert der rtArrDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtArrDate() {
        return rtArrDate;
    }

    /**
     * Legt den Wert der rtArrDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtArrDate(String value) {
        this.rtArrDate = value;
    }

    /**
     * Ruft den Wert der rtArrTz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getRtArrTz() {
        if (rtArrTz == null) {
            return 0;
        } else {
            return rtArrTz;
        }
    }

    /**
     * Legt den Wert der rtArrTz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRtArrTz(Long value) {
        this.rtArrTz = value;
    }

    /**
     * Ruft den Wert der rtArrTrack-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtArrTrack() {
        return rtArrTrack;
    }

    /**
     * Legt den Wert der rtArrTrack-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtArrTrack(String value) {
        this.rtArrTrack = value;
    }

    /**
     * Ruft den Wert der rtDepTrack-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtDepTrack() {
        return rtDepTrack;
    }

    /**
     * Legt den Wert der rtDepTrack-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtDepTrack(String value) {
        this.rtDepTrack = value;
    }

    /**
     * Ruft den Wert der rtPassingTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtPassingTime() {
        return rtPassingTime;
    }

    /**
     * Legt den Wert der rtPassingTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtPassingTime(String value) {
        this.rtPassingTime = value;
    }

    /**
     * Ruft den Wert der rtPassingDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtPassingDate() {
        return rtPassingDate;
    }

    /**
     * Legt den Wert der rtPassingDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtPassingDate(String value) {
        this.rtPassingDate = value;
    }

    /**
     * Ruft den Wert der rtPassingTz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getRtPassingTz() {
        if (rtPassingTz == null) {
            return 0;
        } else {
            return rtPassingTz;
        }
    }

    /**
     * Legt den Wert der rtPassingTz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRtPassingTz(Long value) {
        this.rtPassingTz = value;
    }

    /**
     * Ruft den Wert der cancelled-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isCancelled() {
        if (cancelled == null) {
            return false;
        } else {
            return cancelled;
        }
    }

    /**
     * Legt den Wert der cancelled-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCancelled(Boolean value) {
        this.cancelled = value;
    }

    /**
     * Ruft den Wert der hasMainMast-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isHasMainMast() {
        return hasMainMast;
    }

    /**
     * Legt den Wert der hasMainMast-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setHasMainMast(Boolean value) {
        this.hasMainMast = value;
    }

    /**
     * Ruft den Wert der mainMastId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMainMastId() {
        return mainMastId;
    }

    /**
     * Legt den Wert der mainMastId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMainMastId(String value) {
        this.mainMastId = value;
    }

    /**
     * Ruft den Wert der mainMastExtId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMainMastExtId() {
        return mainMastExtId;
    }

    /**
     * Legt den Wert der mainMastExtId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMainMastExtId(String value) {
        this.mainMastExtId = value;
    }

    /**
     * Ruft den Wert der alighting-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAlighting() {
        return alighting;
    }

    /**
     * Legt den Wert der alighting-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAlighting(Boolean value) {
        this.alighting = value;
    }

    /**
     * Ruft den Wert der boarding-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBoarding() {
        return boarding;
    }

    /**
     * Legt den Wert der boarding-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setBoarding(Boolean value) {
        this.boarding = value;
    }

    /**
     * Ruft den Wert der rtAlighting-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRtAlighting() {
        return rtAlighting;
    }

    /**
     * Legt den Wert der rtAlighting-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRtAlighting(Boolean value) {
        this.rtAlighting = value;
    }

    /**
     * Ruft den Wert der rtBoarding-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRtBoarding() {
        return rtBoarding;
    }

    /**
     * Legt den Wert der rtBoarding-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRtBoarding(Boolean value) {
        this.rtBoarding = value;
    }

    /**
     * Ruft den Wert der additional-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isAdditional() {
        if (additional == null) {
            return false;
        } else {
            return additional;
        }
    }

    /**
     * Legt den Wert der additional-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAdditional(Boolean value) {
        this.additional = value;
    }

}
