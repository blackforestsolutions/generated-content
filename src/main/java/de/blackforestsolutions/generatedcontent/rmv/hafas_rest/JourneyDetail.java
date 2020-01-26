//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{hafas_rest}Stops"/&gt;
 *         &lt;element ref="{hafas_rest}Names" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}Directions" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}Notes" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}Messages" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}JourneyStatus" minOccurs="0"/&gt;
 *         &lt;element name="Polyline" type="{hafas_rest}Polyline" minOccurs="0"/&gt;
 *         &lt;element name="PolylineGroup" type="{hafas_rest}PolylineGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}ServiceDays" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastPos" type="{hafas_rest}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="lastPosReported" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastPassRouteIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lastPassStopRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rtLastPassRouteIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rtLastPassStopRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.JourneyDetail"/&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Common"/&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.JourneyDetailRef"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "stops",
        "names",
        "directions",
        "notes",
        "messages",
        "journeyStatus",
        "polyline",
        "polylineGroup",
        "serviceDays",
        "lastPos",
        "lastPosReported",
        "lastPassRouteIdx",
        "lastPassStopRef",
        "rtLastPassRouteIdx",
        "rtLastPassStopRef"
})
@XmlRootElement(name = "JourneyDetail")
public class JourneyDetail {

    @XmlElement(name = "Stops")
    protected Stops stops;
    @XmlElement(name = "Names")
    protected Names names;
    @XmlElement(name = "Directions")
    protected Directions directions;
    @XmlElement(name = "Notes")
    protected Notes notes;
    @XmlElement(name = "Messages")
    protected Messages messages;
    @XmlElement(name = "JourneyStatus")
    protected String journeyStatus;
    @XmlElement(name = "Polyline")
    protected Polyline polyline;
    @XmlElement(name = "PolylineGroup")
    protected PolylineGroup polylineGroup;
    @XmlElement(name = "ServiceDays")
    protected List<ServiceDays> serviceDays;
    protected Coordinate lastPos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPosReported;
    protected Integer lastPassRouteIdx;
    protected Integer lastPassStopRef;
    protected Integer rtLastPassRouteIdx;
    protected Integer rtLastPassStopRef;
    @XmlAttribute(name = "cancelled")
    protected Boolean cancelled;
    @XmlAttribute(name = "partCancelled")
    protected Boolean partCancelled;
    @XmlAttribute(name = "reachable")
    protected Boolean reachable;
    @XmlAttribute(name = "redirected")
    protected Boolean redirected;
    @XmlAttribute(name = "serverVersion")
    protected String serverVersion;
    @XmlAttribute(name = "dialectVersion")
    protected String dialectVersion;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "errorCode")
    protected String errorCode;
    @XmlAttribute(name = "errorText")
    protected String errorText;
    @XmlAttribute(name = "requestId")
    protected String requestId;
    @XmlAttribute(name = "ref", required = true)
    protected String ref;

    /**
     * Ruft den Wert der stops-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Stops }
     */
    public Stops getStops() {
        return stops;
    }

    /**
     * Legt den Wert der stops-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Stops }
     */
    public void setStops(Stops value) {
        this.stops = value;
    }

    /**
     * Ruft den Wert der names-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Names }
     */
    public Names getNames() {
        return names;
    }

    /**
     * Legt den Wert der names-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Names }
     */
    public void setNames(Names value) {
        this.names = value;
    }

    /**
     * Ruft den Wert der directions-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Directions }
     */
    public Directions getDirections() {
        return directions;
    }

    /**
     * Legt den Wert der directions-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Directions }
     */
    public void setDirections(Directions value) {
        this.directions = value;
    }

    /**
     * Contains notes to be displayed for this trip like attributes or footnotes.
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
     * Ruft den Wert der messages-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Messages }
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Legt den Wert der messages-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Messages }
     */
    public void setMessages(Messages value) {
        this.messages = value;
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
     * Ruft den Wert der polyline-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Polyline }
     */
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * Legt den Wert der polyline-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Polyline }
     */
    public void setPolyline(Polyline value) {
        this.polyline = value;
    }

    /**
     * Ruft den Wert der polylineGroup-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PolylineGroup }
     */
    public PolylineGroup getPolylineGroup() {
        return polylineGroup;
    }

    /**
     * Legt den Wert der polylineGroup-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PolylineGroup }
     */
    public void setPolylineGroup(PolylineGroup value) {
        this.polylineGroup = value;
    }

    /**
     * Gets the value of the serviceDays property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDays property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDays().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDays }
     */
    public List<ServiceDays> getServiceDays() {
        if (serviceDays == null) {
            serviceDays = new ArrayList<ServiceDays>();
        }
        return this.serviceDays;
    }

    /**
     * Ruft den Wert der lastPos-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Coordinate }
     */
    public Coordinate getLastPos() {
        return lastPos;
    }

    /**
     * Legt den Wert der lastPos-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Coordinate }
     */
    public void setLastPos(Coordinate value) {
        this.lastPos = value;
    }

    /**
     * Ruft den Wert der lastPosReported-Eigenschaft ab.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastPosReported() {
        return lastPosReported;
    }

    /**
     * Legt den Wert der lastPosReported-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastPosReported(XMLGregorianCalendar value) {
        this.lastPosReported = value;
    }

    /**
     * Ruft den Wert der lastPassRouteIdx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getLastPassRouteIdx() {
        return lastPassRouteIdx;
    }

    /**
     * Legt den Wert der lastPassRouteIdx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setLastPassRouteIdx(Integer value) {
        this.lastPassRouteIdx = value;
    }

    /**
     * Ruft den Wert der lastPassStopRef-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getLastPassStopRef() {
        return lastPassStopRef;
    }

    /**
     * Legt den Wert der lastPassStopRef-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setLastPassStopRef(Integer value) {
        this.lastPassStopRef = value;
    }

    /**
     * Ruft den Wert der rtLastPassRouteIdx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRtLastPassRouteIdx() {
        return rtLastPassRouteIdx;
    }

    /**
     * Legt den Wert der rtLastPassRouteIdx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRtLastPassRouteIdx(Integer value) {
        this.rtLastPassRouteIdx = value;
    }

    /**
     * Ruft den Wert der rtLastPassStopRef-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRtLastPassStopRef() {
        return rtLastPassStopRef;
    }

    /**
     * Legt den Wert der rtLastPassStopRef-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRtLastPassStopRef(Integer value) {
        this.rtLastPassStopRef = value;
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
     * Ruft den Wert der serverVersion-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServerVersion() {
        return serverVersion;
    }

    /**
     * Legt den Wert der serverVersion-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServerVersion(String value) {
        this.serverVersion = value;
    }

    /**
     * Ruft den Wert der dialectVersion-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDialectVersion() {
        return dialectVersion;
    }

    /**
     * Legt den Wert der dialectVersion-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDialectVersion(String value) {
        this.dialectVersion = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der errorText-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Legt den Wert der errorText-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Ruft den Wert der requestId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Legt den Wert der requestId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Ruft den Wert der ref-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRef() {
        return ref;
    }

    /**
     * Legt den Wert der ref-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
