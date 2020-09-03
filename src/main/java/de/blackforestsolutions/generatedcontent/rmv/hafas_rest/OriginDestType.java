//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für OriginDestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OriginDestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{hafas_rest}Notes" minOccurs="0"/&gt;
 *         &lt;element name="mcpData" type="{hafas_rest}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.OriginDestType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestType", propOrder = {
        "notes",
        "mcpData"
})
public class OriginDestType {

    @XmlElement(name = "Notes")
    protected Notes notes;
    protected List<KVType> mcpData;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "extId")
    protected String extId;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "routeIdx")
    protected Long routeIdx;
    @XmlAttribute(name = "prognosisType")
    protected PrognosisType prognosisType;
    @XmlAttribute(name = "time", required = true)
    protected String time;
    @XmlAttribute(name = "date", required = true)
    protected String date;
    @XmlAttribute(name = "tz")
    protected Long tz;
    @XmlAttribute(name = "track")
    protected String track;
    @XmlAttribute(name = "rtTime")
    protected String rtTime;
    @XmlAttribute(name = "rtDate")
    protected String rtDate;
    @XmlAttribute(name = "rtTz")
    protected Long rtTz;
    @XmlAttribute(name = "rtTrack")
    protected String rtTrack;
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
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "additional")
    protected Boolean additional;
    @XmlAttribute(name = "mcp")
    protected Boolean mcp;

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
     * Gets the value of the mcpData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcpData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMcpData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     */
    public List<KVType> getMcpData() {
        if (mcpData == null) {
            mcpData = new ArrayList<KVType>();
        }
        return this.mcpData;
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
     * Ruft den Wert der type-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
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
     * Ruft den Wert der prognosisType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PrognosisType }
     */
    public PrognosisType getPrognosisType() {
        return prognosisType;
    }

    /**
     * Legt den Wert der prognosisType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PrognosisType }
     */
    public void setPrognosisType(PrognosisType value) {
        this.prognosisType = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der tz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getTz() {
        if (tz == null) {
            return 0;
        } else {
            return tz;
        }
    }

    /**
     * Legt den Wert der tz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setTz(Long value) {
        this.tz = value;
    }

    /**
     * Ruft den Wert der track-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTrack() {
        return track;
    }

    /**
     * Legt den Wert der track-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTrack(String value) {
        this.track = value;
    }

    /**
     * Ruft den Wert der rtTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtTime() {
        return rtTime;
    }

    /**
     * Legt den Wert der rtTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtTime(String value) {
        this.rtTime = value;
    }

    /**
     * Ruft den Wert der rtDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtDate() {
        return rtDate;
    }

    /**
     * Legt den Wert der rtDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtDate(String value) {
        this.rtDate = value;
    }

    /**
     * Ruft den Wert der rtTz-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getRtTz() {
        if (rtTz == null) {
            return 0;
        } else {
            return rtTz;
        }
    }

    /**
     * Legt den Wert der rtTz-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRtTz(Long value) {
        this.rtTz = value;
    }

    /**
     * Ruft den Wert der rtTrack-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtTrack() {
        return rtTrack;
    }

    /**
     * Legt den Wert der rtTrack-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtTrack(String value) {
        this.rtTrack = value;
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

    /**
     * Ruft den Wert der mcp-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isMcp() {
        if (mcp == null) {
            return false;
        } else {
            return mcp;
        }
    }

    /**
     * Legt den Wert der mcp-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMcp(Boolean value) {
        this.mcp = value;
    }

}
