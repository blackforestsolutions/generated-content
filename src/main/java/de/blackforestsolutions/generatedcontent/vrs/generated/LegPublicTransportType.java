//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;


import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ÖV-Teilabschnitt einer Route
 * 
 * <p>Java-Klasse für LegPublicTransportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LegPublicTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Segments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{}SegmentsType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="SegmentPublicTransport" type="{}SegmentPublicTransportType"/&gt;
 *                     &lt;element name="SegmentBicycle" type="{}SegmentBicycleType"/&gt;
 *                     &lt;element name="SegmentWalk" type="{}SegmentWalkType"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumOfChanges" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Costs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tariff" type="{}TariffType" minOccurs="0"/&gt;
 *                   &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
 *         &lt;element name="TimetablePeriod"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="DateVersion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "LegPublicTransportType", propOrder = {
    "segments",
    "numOfChanges",
    "costs",
    "infoMessages",
    "timetablePeriod"
})
public class LegPublicTransportType {

    @XmlElement(name = "Segments", required = true)
    protected LegPublicTransportType.Segments segments;
    @XmlElement(name = "NumOfChanges", required = true)
    protected BigInteger numOfChanges;
    @XmlElement(name = "Costs")
    protected LegPublicTransportType.Costs costs;
    @XmlElement(name = "InfoMessages")
    protected InfoMessagesType infoMessages;
    @XmlElement(name = "TimetablePeriod", required = true)
    protected LegPublicTransportType.TimetablePeriod timetablePeriod;

    /**
     * Ruft den Wert der segments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegPublicTransportType.Segments }
     *     
     */
    public LegPublicTransportType.Segments getSegments() {
        return segments;
    }

    /**
     * Legt den Wert der segments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegPublicTransportType.Segments }
     *     
     */
    public void setSegments(LegPublicTransportType.Segments value) {
        this.segments = value;
    }

    /**
     * Ruft den Wert der numOfChanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfChanges() {
        return numOfChanges;
    }

    /**
     * Legt den Wert der numOfChanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfChanges(BigInteger value) {
        this.numOfChanges = value;
    }

    /**
     * Ruft den Wert der costs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegPublicTransportType.Costs }
     *     
     */
    public LegPublicTransportType.Costs getCosts() {
        return costs;
    }

    /**
     * Legt den Wert der costs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegPublicTransportType.Costs }
     *     
     */
    public void setCosts(LegPublicTransportType.Costs value) {
        this.costs = value;
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
     * Ruft den Wert der timetablePeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegPublicTransportType.TimetablePeriod }
     *     
     */
    public LegPublicTransportType.TimetablePeriod getTimetablePeriod() {
        return timetablePeriod;
    }

    /**
     * Legt den Wert der timetablePeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegPublicTransportType.TimetablePeriod }
     *     
     */
    public void setTimetablePeriod(LegPublicTransportType.TimetablePeriod value) {
        this.timetablePeriod = value;
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
     *         &lt;element name="Tariff" type="{}TariffType" minOccurs="0"/&gt;
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
        "tariff",
        "infoMessages"
    })
    public static class Costs {

        @XmlElement(name = "Tariff")
        protected TariffType tariff;
        @XmlElement(name = "InfoMessages")
        protected InfoMessagesType infoMessages;

        /**
         * Ruft den Wert der tariff-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TariffType }
         *     
         */
        public TariffType getTariff() {
            return tariff;
        }

        /**
         * Legt den Wert der tariff-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffType }
         *     
         */
        public void setTariff(TariffType value) {
            this.tariff = value;
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
     *     &lt;restriction base="{}SegmentsType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;choice&gt;
     *           &lt;element name="SegmentPublicTransport" type="{}SegmentPublicTransportType"/&gt;
     *           &lt;element name="SegmentBicycle" type="{}SegmentBicycleType"/&gt;
     *           &lt;element name="SegmentWalk" type="{}SegmentWalkType"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Segments
        extends SegmentsType
    {


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
     *         &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="DateVersion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
        "dateFrom",
        "dateTo",
        "dateVersion"
    })
    public static class TimetablePeriod {

        @XmlElement(name = "DateFrom")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateFrom;
        @XmlElement(name = "DateTo")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTo;
        @XmlElement(name = "DateVersion")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateVersion;

        /**
         * Ruft den Wert der dateFrom-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFrom() {
            return dateFrom;
        }

        /**
         * Legt den Wert der dateFrom-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateFrom(XMLGregorianCalendar value) {
            this.dateFrom = value;
        }

        /**
         * Ruft den Wert der dateTo-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTo() {
            return dateTo;
        }

        /**
         * Legt den Wert der dateTo-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTo(XMLGregorianCalendar value) {
            this.dateTo = value;
        }

        /**
         * Ruft den Wert der dateVersion-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateVersion() {
            return dateVersion;
        }

        /**
         * Legt den Wert der dateVersion-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateVersion(XMLGregorianCalendar value) {
            this.dateVersion = value;
        }

    }

}
