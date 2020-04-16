//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.GeoSRSType;
import de.blackforestsolutions.generatedcontent.vrs.generated.ObjectSearchType;
import de.blackforestsolutions.generatedcontent.vrs.generated.PublicTransportProductType;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Haltestellenfahrplan abfragen
 * 
 * <p>Java-Klasse für RequestStopTimetableType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestStopTimetableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{}ObjectSearchType"/&gt;
 *         &lt;element name="SearchTime" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
 *                 &lt;attribute name="SearchDirection" default="Departure"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Arrival"/&gt;
 *                       &lt;enumeration value="Departure"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SearchInterval" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="NumOfStopEvents" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                     &lt;element name="NumOfStopEventsBefore" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                     &lt;element name="NumOfStopEventsAfter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}PublicTransportProductType"&gt;
 *               &lt;enumeration value="LongDistanceTrains"/&gt;
 *               &lt;enumeration value="RegionalTrains"/&gt;
 *               &lt;enumeration value="SuburbanTrains"/&gt;
 *               &lt;enumeration value="Underground"/&gt;
 *               &lt;enumeration value="LightRail"/&gt;
 *               &lt;enumeration value="Bus"/&gt;
 *               &lt;enumeration value="OnDemandServices"/&gt;
 *               &lt;enumeration value="CommunityBus"/&gt;
 *               &lt;enumeration value="Boat"/&gt;
 *               &lt;enumeration value="RailReplacementServices"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplementalPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisabledAccessRequired" type="{}DisabledAccessPublicTransportType" minOccurs="0"/&gt;
 *         &lt;element name="RadiusExtensionOrigin" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="RadiusExtensionDestination" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Options" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Output" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestStopTimetableType", propOrder = {
    "lineName",
    "direction",
    "location",
    "searchTime",
    "searchInterval",
    "product",
    "supplementalPayment",
    "disabledAccessRequired",
    "radiusExtensionOrigin",
    "radiusExtensionDestination",
    "options"
})
public class RequestStopTimetableType {

    @XmlElement(name = "LineName")
    protected String lineName;
    @XmlElement(name = "Direction")
    protected Object direction;
    @XmlElement(name = "Location", required = true)
    protected ObjectSearchType location;
    @XmlElement(name = "SearchTime")
    protected RequestStopTimetableType.SearchTime searchTime;
    @XmlElement(name = "SearchInterval")
    protected RequestStopTimetableType.SearchInterval searchInterval;
    @XmlElement(name = "Product")
    protected List<PublicTransportProductType> product;
    @XmlElement(name = "SupplementalPayment", defaultValue = "0")
    protected Boolean supplementalPayment;
    @XmlElement(name = "DisabledAccessRequired")
    protected String disabledAccessRequired;
    @XmlElement(name = "RadiusExtensionOrigin")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger radiusExtensionOrigin;
    @XmlElement(name = "RadiusExtensionDestination")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger radiusExtensionDestination;
    @XmlElement(name = "Options")
    protected RequestStopTimetableType.Options options;

    /**
     * Ruft den Wert der lineName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * Legt den Wert der lineName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineName(String value) {
        this.lineName = value;
    }

    /**
     * Ruft den Wert der direction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDirection() {
        return direction;
    }

    /**
     * Legt den Wert der direction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDirection(Object value) {
        this.direction = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectSearchType }
     *     
     */
    public ObjectSearchType getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectSearchType }
     *     
     */
    public void setLocation(ObjectSearchType value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der searchTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestStopTimetableType.SearchTime }
     *     
     */
    public RequestStopTimetableType.SearchTime getSearchTime() {
        return searchTime;
    }

    /**
     * Legt den Wert der searchTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStopTimetableType.SearchTime }
     *     
     */
    public void setSearchTime(RequestStopTimetableType.SearchTime value) {
        this.searchTime = value;
    }

    /**
     * Ruft den Wert der searchInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestStopTimetableType.SearchInterval }
     *     
     */
    public RequestStopTimetableType.SearchInterval getSearchInterval() {
        return searchInterval;
    }

    /**
     * Legt den Wert der searchInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStopTimetableType.SearchInterval }
     *     
     */
    public void setSearchInterval(RequestStopTimetableType.SearchInterval value) {
        this.searchInterval = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicTransportProductType }
     * 
     * 
     */
    public List<PublicTransportProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<PublicTransportProductType>();
        }
        return this.product;
    }

    /**
     * Ruft den Wert der supplementalPayment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplementalPayment() {
        return supplementalPayment;
    }

    /**
     * Legt den Wert der supplementalPayment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplementalPayment(Boolean value) {
        this.supplementalPayment = value;
    }

    /**
     * Ruft den Wert der disabledAccessRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabledAccessRequired() {
        return disabledAccessRequired;
    }

    /**
     * Legt den Wert der disabledAccessRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabledAccessRequired(String value) {
        this.disabledAccessRequired = value;
    }

    /**
     * Ruft den Wert der radiusExtensionOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadiusExtensionOrigin() {
        return radiusExtensionOrigin;
    }

    /**
     * Legt den Wert der radiusExtensionOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadiusExtensionOrigin(BigInteger value) {
        this.radiusExtensionOrigin = value;
    }

    /**
     * Ruft den Wert der radiusExtensionDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadiusExtensionDestination() {
        return radiusExtensionDestination;
    }

    /**
     * Legt den Wert der radiusExtensionDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadiusExtensionDestination(BigInteger value) {
        this.radiusExtensionDestination = value;
    }

    /**
     * Ruft den Wert der options-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestStopTimetableType.Options }
     *     
     */
    public RequestStopTimetableType.Options getOptions() {
        return options;
    }

    /**
     * Legt den Wert der options-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStopTimetableType.Options }
     *     
     */
    public void setOptions(RequestStopTimetableType.Options value) {
        this.options = value;
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
     *         &lt;element name="Output" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "output"
    })
    public static class Options {

        @XmlElement(name = "Output")
        protected RequestStopTimetableType.Options.Output output;

        /**
         * Ruft den Wert der output-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RequestStopTimetableType.Options.Output }
         *     
         */
        public RequestStopTimetableType.Options.Output getOutput() {
            return output;
        }

        /**
         * Legt den Wert der output-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestStopTimetableType.Options.Output }
         *     
         */
        public void setOutput(RequestStopTimetableType.Options.Output value) {
            this.output = value;
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
         *         &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
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
            "srsName"
        })
        public static class Output {

            @XmlElement(name = "SRSName")
            @XmlSchemaType(name = "NMTOKEN")
            protected GeoSRSType srsName;

            /**
             * Ruft den Wert der srsName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link GeoSRSType }
             *     
             */
            public GeoSRSType getSRSName() {
                return srsName;
            }

            /**
             * Legt den Wert der srsName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link GeoSRSType }
             *     
             */
            public void setSRSName(GeoSRSType value) {
                this.srsName = value;
            }

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
     *       &lt;choice&gt;
     *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="NumOfStopEvents" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *           &lt;element name="NumOfStopEventsBefore" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *           &lt;element name="NumOfStopEventsAfter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "size",
        "numOfStopEvents",
        "numOfStopEventsBefore",
        "numOfStopEventsAfter"
    })
    public static class SearchInterval {

        @XmlElement(name = "Size")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger size;
        @XmlElement(name = "NumOfStopEvents")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numOfStopEvents;
        @XmlElement(name = "NumOfStopEventsBefore")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numOfStopEventsBefore;
        @XmlElement(name = "NumOfStopEventsAfter")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numOfStopEventsAfter;

        /**
         * Ruft den Wert der size-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSize() {
            return size;
        }

        /**
         * Legt den Wert der size-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSize(BigInteger value) {
            this.size = value;
        }

        /**
         * Ruft den Wert der numOfStopEvents-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumOfStopEvents() {
            return numOfStopEvents;
        }

        /**
         * Legt den Wert der numOfStopEvents-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumOfStopEvents(BigInteger value) {
            this.numOfStopEvents = value;
        }

        /**
         * Ruft den Wert der numOfStopEventsBefore-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumOfStopEventsBefore() {
            return numOfStopEventsBefore;
        }

        /**
         * Legt den Wert der numOfStopEventsBefore-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumOfStopEventsBefore(BigInteger value) {
            this.numOfStopEventsBefore = value;
        }

        /**
         * Ruft den Wert der numOfStopEventsAfter-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumOfStopEventsAfter() {
            return numOfStopEventsAfter;
        }

        /**
         * Legt den Wert der numOfStopEventsAfter-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumOfStopEventsAfter(BigInteger value) {
            this.numOfStopEventsAfter = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
     *       &lt;attribute name="SearchDirection" default="Departure"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Arrival"/&gt;
     *             &lt;enumeration value="Departure"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SearchTime {

        @XmlValue
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "SearchDirection")
        protected String searchDirection;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der searchDirection-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchDirection() {
            if (searchDirection == null) {
                return "Departure";
            } else {
                return searchDirection;
            }
        }

        /**
         * Legt den Wert der searchDirection-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchDirection(String value) {
            this.searchDirection = value;
        }

    }

}
