//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ÖV-Routensegment
 * 
 * <p>Java-Klasse für SegmentPublicTransportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentPublicTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}OriginType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DepartureTimeScheduled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ActualData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Destination"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}DestinationType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ArrivalTimeScheduled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ActualData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VehicleJourney" type="{}VehicleJourneyType"/&gt;
 *         &lt;element name="Vias" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Via" type="{}StopPublicTransportType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AST" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Shape" type="{}GeoLineType" minOccurs="0"/&gt;
 *         &lt;element name="DisabledAccessOrigin" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="User" type="{}DisabledAccessPublicTransportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisabledAccessDestination" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="User" type="{}DisabledAccessPublicTransportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
 *         &lt;element name="MonitorSegment" type="{}MonitorSegmentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPublicTransportType", propOrder = {
    "origin",
    "destination",
    "travelTime",
    "distance",
    "vehicleJourney",
    "vias",
    "ast",
    "shape",
    "disabledAccessOrigin",
    "disabledAccessDestination",
    "infoMessages",
    "monitorSegment"
})
public class SegmentPublicTransportType {

    @XmlElement(name = "Origin", required = true)
    protected SegmentPublicTransportType.Origin origin;
    @XmlElement(name = "Destination", required = true)
    protected SegmentPublicTransportType.Destination destination;
    @XmlElement(name = "TravelTime", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger travelTime;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    @XmlElement(name = "VehicleJourney", required = true)
    protected VehicleJourneyType vehicleJourney;
    @XmlElement(name = "Vias")
    protected SegmentPublicTransportType.Vias vias;
    @XmlElement(name = "AST")
    protected Object ast;
    @XmlElement(name = "Shape")
    protected GeoLineType shape;
    @XmlElement(name = "DisabledAccessOrigin")
    protected SegmentPublicTransportType.DisabledAccessOrigin disabledAccessOrigin;
    @XmlElement(name = "DisabledAccessDestination")
    protected SegmentPublicTransportType.DisabledAccessDestination disabledAccessDestination;
    @XmlElement(name = "InfoMessages")
    protected InfoMessagesType infoMessages;
    @XmlElement(name = "MonitorSegment")
    protected MonitorSegmentType monitorSegment;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPublicTransportType.Origin }
     *     
     */
    public SegmentPublicTransportType.Origin getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPublicTransportType.Origin }
     *     
     */
    public void setOrigin(SegmentPublicTransportType.Origin value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPublicTransportType.Destination }
     *     
     */
    public SegmentPublicTransportType.Destination getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPublicTransportType.Destination }
     *     
     */
    public void setDestination(SegmentPublicTransportType.Destination value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der travelTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelTime() {
        return travelTime;
    }

    /**
     * Legt den Wert der travelTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelTime(BigInteger value) {
        this.travelTime = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der vehicleJourney-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyType }
     *     
     */
    public VehicleJourneyType getVehicleJourney() {
        return vehicleJourney;
    }

    /**
     * Legt den Wert der vehicleJourney-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyType }
     *     
     */
    public void setVehicleJourney(VehicleJourneyType value) {
        this.vehicleJourney = value;
    }

    /**
     * Ruft den Wert der vias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPublicTransportType.Vias }
     *     
     */
    public SegmentPublicTransportType.Vias getVias() {
        return vias;
    }

    /**
     * Legt den Wert der vias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPublicTransportType.Vias }
     *     
     */
    public void setVias(SegmentPublicTransportType.Vias value) {
        this.vias = value;
    }

    /**
     * Ruft den Wert der ast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAST() {
        return ast;
    }

    /**
     * Legt den Wert der ast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAST(Object value) {
        this.ast = value;
    }

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoLineType }
     *     
     */
    public GeoLineType getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLineType }
     *     
     */
    public void setShape(GeoLineType value) {
        this.shape = value;
    }

    /**
     * Ruft den Wert der disabledAccessOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPublicTransportType.DisabledAccessOrigin }
     *     
     */
    public SegmentPublicTransportType.DisabledAccessOrigin getDisabledAccessOrigin() {
        return disabledAccessOrigin;
    }

    /**
     * Legt den Wert der disabledAccessOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPublicTransportType.DisabledAccessOrigin }
     *     
     */
    public void setDisabledAccessOrigin(SegmentPublicTransportType.DisabledAccessOrigin value) {
        this.disabledAccessOrigin = value;
    }

    /**
     * Ruft den Wert der disabledAccessDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPublicTransportType.DisabledAccessDestination }
     *     
     */
    public SegmentPublicTransportType.DisabledAccessDestination getDisabledAccessDestination() {
        return disabledAccessDestination;
    }

    /**
     * Legt den Wert der disabledAccessDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPublicTransportType.DisabledAccessDestination }
     *     
     */
    public void setDisabledAccessDestination(SegmentPublicTransportType.DisabledAccessDestination value) {
        this.disabledAccessDestination = value;
    }

    /**
     * Ruft den Wert der infoMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessagesType }
     *     
     */
    public InfoMessagesType getInfoMessages() {
        return infoMessages;
    }

    /**
     * Legt den Wert der infoMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessagesType }
     *     
     */
    public void setInfoMessages(InfoMessagesType value) {
        this.infoMessages = value;
    }

    /**
     * Ruft den Wert der monitorSegment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonitorSegmentType }
     *     
     */
    public MonitorSegmentType getMonitorSegment() {
        return monitorSegment;
    }

    /**
     * Legt den Wert der monitorSegment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorSegmentType }
     *     
     */
    public void setMonitorSegment(MonitorSegmentType value) {
        this.monitorSegment = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}DestinationType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ArrivalTimeScheduled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ActualData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "arrivalTimeScheduled"
    })
    public static class Destination
        extends DestinationType
    {

        @XmlElement(name = "ArrivalTimeScheduled")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar arrivalTimeScheduled;
        @XmlAttribute(name = "ActualData")
        protected Boolean actualData;

        /**
         * Ruft den Wert der arrivalTimeScheduled-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalTimeScheduled() {
            return arrivalTimeScheduled;
        }

        /**
         * Legt den Wert der arrivalTimeScheduled-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalTimeScheduled(XMLGregorianCalendar value) {
            this.arrivalTimeScheduled = value;
        }

        /**
         * Ruft den Wert der actualData-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isActualData() {
            if (actualData == null) {
                return false;
            } else {
                return actualData;
            }
        }

        /**
         * Legt den Wert der actualData-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setActualData(Boolean value) {
            this.actualData = value;
        }

    }


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
     *         &lt;element name="User" type="{}DisabledAccessPublicTransportType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "user",
        "infoMessages"
    })
    public static class DisabledAccessDestination {

        @XmlElement(name = "User")
        protected List<String> user;
        @XmlElement(name = "InfoMessages")
        protected InfoMessagesType infoMessages;

        /**
         * Gets the value of the user property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the user property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUser() {
            if (user == null) {
                user = new ArrayList<String>();
            }
            return this.user;
        }

        /**
         * Ruft den Wert der infoMessages-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link InfoMessagesType }
         *     
         */
        public InfoMessagesType getInfoMessages() {
            return infoMessages;
        }

        /**
         * Legt den Wert der infoMessages-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link InfoMessagesType }
         *     
         */
        public void setInfoMessages(InfoMessagesType value) {
            this.infoMessages = value;
        }

    }


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
     *         &lt;element name="User" type="{}DisabledAccessPublicTransportType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "user",
        "infoMessages"
    })
    public static class DisabledAccessOrigin {

        @XmlElement(name = "User")
        protected List<String> user;
        @XmlElement(name = "InfoMessages")
        protected InfoMessagesType infoMessages;

        /**
         * Gets the value of the user property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the user property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUser() {
            if (user == null) {
                user = new ArrayList<String>();
            }
            return this.user;
        }

        /**
         * Ruft den Wert der infoMessages-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link InfoMessagesType }
         *     
         */
        public InfoMessagesType getInfoMessages() {
            return infoMessages;
        }

        /**
         * Legt den Wert der infoMessages-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link InfoMessagesType }
         *     
         */
        public void setInfoMessages(InfoMessagesType value) {
            this.infoMessages = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}OriginType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DepartureTimeScheduled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ActualData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "departureTimeScheduled"
    })
    public static class Origin
        extends OriginType
    {

        @XmlElement(name = "DepartureTimeScheduled")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar departureTimeScheduled;
        @XmlAttribute(name = "ActualData")
        protected Boolean actualData;

        /**
         * Ruft den Wert der departureTimeScheduled-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureTimeScheduled() {
            return departureTimeScheduled;
        }

        /**
         * Legt den Wert der departureTimeScheduled-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureTimeScheduled(XMLGregorianCalendar value) {
            this.departureTimeScheduled = value;
        }

        /**
         * Ruft den Wert der actualData-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isActualData() {
            if (actualData == null) {
                return false;
            } else {
                return actualData;
            }
        }

        /**
         * Legt den Wert der actualData-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setActualData(Boolean value) {
            this.actualData = value;
        }

    }


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
     *         &lt;element name="Via" type="{}StopPublicTransportType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "via"
    })
    public static class Vias {

        @XmlElement(name = "Via", required = true)
        protected List<StopPublicTransportType> via;

        /**
         * Gets the value of the via property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the via property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StopPublicTransportType }
         * 
         * 
         */
        public List<StopPublicTransportType> getVia() {
            if (via == null) {
                via = new ArrayList<StopPublicTransportType>();
            }
            return this.via;
        }

    }

}
