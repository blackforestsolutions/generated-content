//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{hafas_rest}Origin"/&gt;
 *         &lt;element ref="{hafas_rest}Destination"/&gt;
 *         &lt;element ref="{hafas_rest}Notes" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}JourneyDetailRef" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}GisRef" minOccurs="0"/&gt;
 *         &lt;element name="GisRoute" type="{hafas_rest}GisRouteType" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}Messages" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}JourneyStatus" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{hafas_rest}ProductType" minOccurs="0"/&gt;
 *         &lt;element name="Polyline" type="{hafas_rest}Polyline" minOccurs="0"/&gt;
 *         &lt;element name="PolylineGroup" type="{hafas_rest}PolylineGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}Stops" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}ServiceDays" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Leg"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "origin",
        "destination",
        "notes",
        "journeyDetailRef",
        "gisRef",
        "gisRoute",
        "messages",
        "journeyStatus",
        "product",
        "polyline",
        "polylineGroup",
        "stops",
        "serviceDays"
})
@XmlRootElement(name = "Leg")
public class Leg {

    @XmlElement(name = "Origin", required = true)
    protected OriginDestType origin;
    @XmlElement(name = "Destination", required = true)
    protected OriginDestType destination;
    @XmlElement(name = "Notes")
    protected Notes notes;
    @XmlElement(name = "JourneyDetailRef")
    protected JourneyDetailRef journeyDetailRef;
    @XmlElement(name = "GisRef")
    protected GisRef gisRef;
    @XmlElement(name = "GisRoute")
    protected GisRouteType gisRoute;
    @XmlElement(name = "Messages")
    protected Messages messages;
    @XmlElement(name = "JourneyStatus")
    protected String journeyStatus;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "Polyline")
    protected Polyline polyline;
    @XmlElement(name = "PolylineGroup")
    protected PolylineGroup polylineGroup;
    @XmlElement(name = "Stops")
    protected Stops stops;
    @XmlElement(name = "ServiceDays")
    protected List<ServiceDays> serviceDays;
    @XmlAttribute(name = "idx", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String idx;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "type", required = true)
    protected String type;
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
    @XmlAttribute(name = "duration")
    protected Duration duration;
    @XmlAttribute(name = "dist")
    protected Long dist;
    @XmlAttribute(name = "hide")
    protected Boolean hide;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     *
     * @return possible object is
     * {@link OriginDestType }
     */
    public OriginDestType getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link OriginDestType }
     */
    public void setOrigin(OriginDestType value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     *
     * @return possible object is
     * {@link OriginDestType }
     */
    public OriginDestType getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link OriginDestType }
     */
    public void setDestination(OriginDestType value) {
        this.destination = value;
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
     * Ruft den Wert der gisRef-Eigenschaft ab.
     *
     * @return possible object is
     * {@link GisRef }
     */
    public GisRef getGisRef() {
        return gisRef;
    }

    /**
     * Legt den Wert der gisRef-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link GisRef }
     */
    public void setGisRef(GisRef value) {
        this.gisRef = value;
    }

    /**
     * Ruft den Wert der gisRoute-Eigenschaft ab.
     *
     * @return possible object is
     * {@link GisRouteType }
     */
    public GisRouteType getGisRoute() {
        return gisRoute;
    }

    /**
     * Legt den Wert der gisRoute-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link GisRouteType }
     */
    public void setGisRoute(GisRouteType value) {
        this.gisRoute = value;
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
     * Ruft den Wert der idx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdx() {
        return idx;
    }

    /**
     * Legt den Wert der idx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdx(String value) {
        this.idx = value;
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
     * Ruft den Wert der number-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Ruft den Wert der duration-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der dist-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDist() {
        return dist;
    }

    /**
     * Legt den Wert der dist-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDist(Long value) {
        this.dist = value;
    }

    /**
     * Ruft den Wert der hide-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isHide() {
        if (hide == null) {
            return true;
        } else {
            return hide;
        }
    }

    /**
     * Legt den Wert der hide-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setHide(Boolean value) {
        this.hide = value;
    }

}
