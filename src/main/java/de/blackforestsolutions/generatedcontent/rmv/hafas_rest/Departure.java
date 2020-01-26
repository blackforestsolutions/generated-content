//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{hafas_rest}JourneyDetailRef"/&gt;
 *         &lt;element ref="{hafas_rest}JourneyStatus" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{hafas_rest}ProductType" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}Notes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Departure"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "journeyDetailRef",
        "journeyStatus",
        "product",
        "notes"
})
@XmlRootElement(name = "Departure")
public class Departure {

    @XmlElement(name = "JourneyDetailRef", required = true)
    protected JourneyDetailRef journeyDetailRef;
    @XmlElement(name = "JourneyStatus")
    protected String journeyStatus;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "Notes")
    protected Notes notes;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "stop", required = true)
    protected String stop;
    @XmlAttribute(name = "stopid", required = true)
    protected String stopid;
    @XmlAttribute(name = "stopExtId")
    protected String stopExtId;
    @XmlAttribute(name = "prognosisType")
    protected PrognosisType prognosisType;
    @XmlAttribute(name = "time", required = true)
    protected String time;
    @XmlAttribute(name = "date", required = true)
    protected String date;
    @XmlAttribute(name = "tz")
    protected Integer tz;
    @XmlAttribute(name = "track")
    protected String track;
    @XmlAttribute(name = "rtTime")
    protected String rtTime;
    @XmlAttribute(name = "rtDate")
    protected String rtDate;
    @XmlAttribute(name = "rtTz")
    protected Integer rtTz;
    @XmlAttribute(name = "rtTrack")
    protected String rtTrack;
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "partCancelled")
    protected Boolean partCancelled;
    @XmlAttribute(name = "reachable")
    protected Boolean reachable;
    @XmlAttribute(name = "redirected")
    protected Boolean redirected;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "timeAtArrival")
    protected String timeAtArrival;
    @XmlAttribute(name = "dateAtArrival")
    protected String dateAtArrival;
    @XmlAttribute(name = "rtTimeAtArrival")
    protected String rtTimeAtArrival;
    @XmlAttribute(name = "rtDateAtArrival")
    protected String rtDateAtArrival;
    @XmlAttribute(name = "trainNumber")
    protected String trainNumber;
    @XmlAttribute(name = "trainCategory")
    protected String trainCategory;
    @XmlAttribute(name = "isFastest")
    protected Boolean isFastest;

    /**
     * Ruft den Wert der journeyDetailRef-Eigenschaft ab.
     *
     * @return possible object is
     * {@link JourneyDetailRef }
     */
    public JourneyDetailRef getJourneyDetailRef() {
        return journeyDetailRef;
    }

    /**
     * Legt den Wert der journeyDetailRef-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link JourneyDetailRef }
     */
    public void setJourneyDetailRef(JourneyDetailRef value) {
        this.journeyDetailRef = value;
    }

    /**
     * Ruft den Wert der journeyStatus-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJourneyStatus() {
        return journeyStatus;
    }

    /**
     * Legt den Wert der journeyStatus-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJourneyStatus(String value) {
        this.journeyStatus = value;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ProductType }
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ProductType }
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

    /**
     * Ruft den Wert der notes-Eigenschaft ab.
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
     * Ruft den Wert der stop-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStop() {
        return stop;
    }

    /**
     * Legt den Wert der stop-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStop(String value) {
        this.stop = value;
    }

    /**
     * Ruft den Wert der stopid-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStopid() {
        return stopid;
    }

    /**
     * Legt den Wert der stopid-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStopid(String value) {
        this.stopid = value;
    }

    /**
     * Ruft den Wert der stopExtId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStopExtId() {
        return stopExtId;
    }

    /**
     * Legt den Wert der stopExtId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStopExtId(String value) {
        this.stopExtId = value;
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
     * {@link Integer }
     */
    public int getTz() {
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
     *              {@link Integer }
     */
    public void setTz(Integer value) {
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
     * {@link Integer }
     */
    public int getRtTz() {
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
     *              {@link Integer }
     */
    public void setRtTz(Integer value) {
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
     * Ruft den Wert der partCancelled-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isPartCancelled() {
        if (partCancelled == null) {
            return false;
        } else {
            return partCancelled;
        }
    }

    /**
     * Legt den Wert der partCancelled-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPartCancelled(Boolean value) {
        this.partCancelled = value;
    }

    /**
     * Ruft den Wert der reachable-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isReachable() {
        if (reachable == null) {
            return true;
        } else {
            return reachable;
        }
    }

    /**
     * Legt den Wert der reachable-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReachable(Boolean value) {
        this.reachable = value;
    }

    /**
     * Ruft den Wert der redirected-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isRedirected() {
        if (redirected == null) {
            return false;
        } else {
            return redirected;
        }
    }

    /**
     * Legt den Wert der redirected-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRedirected(Boolean value) {
        this.redirected = value;
    }

    /**
     * Ruft den Wert der direction-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Legt den Wert der direction-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Ruft den Wert der timeAtArrival-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTimeAtArrival() {
        return timeAtArrival;
    }

    /**
     * Legt den Wert der timeAtArrival-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimeAtArrival(String value) {
        this.timeAtArrival = value;
    }

    /**
     * Ruft den Wert der dateAtArrival-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateAtArrival() {
        return dateAtArrival;
    }

    /**
     * Legt den Wert der dateAtArrival-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateAtArrival(String value) {
        this.dateAtArrival = value;
    }

    /**
     * Ruft den Wert der rtTimeAtArrival-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtTimeAtArrival() {
        return rtTimeAtArrival;
    }

    /**
     * Legt den Wert der rtTimeAtArrival-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtTimeAtArrival(String value) {
        this.rtTimeAtArrival = value;
    }

    /**
     * Ruft den Wert der rtDateAtArrival-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRtDateAtArrival() {
        return rtDateAtArrival;
    }

    /**
     * Legt den Wert der rtDateAtArrival-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRtDateAtArrival(String value) {
        this.rtDateAtArrival = value;
    }

    /**
     * Ruft den Wert der trainNumber-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Legt den Wert der trainNumber-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Ruft den Wert der trainCategory-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTrainCategory() {
        return trainCategory;
    }

    /**
     * Legt den Wert der trainCategory-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTrainCategory(String value) {
        this.trainCategory = value;
    }

    /**
     * Ruft den Wert der isFastest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsFastest() {
        return isFastest;
    }

    /**
     * Legt den Wert der isFastest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsFastest(Boolean value) {
        this.isFastest = value;
    }

}
