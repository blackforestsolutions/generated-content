//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.*;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Verfügbare Anfrage
 * 
 * <p>Java-Klasse für RequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Ping" type="{}RequestPingType"/&gt;
 *         &lt;element name="ObjectInfo" type="{}RequestObjectInfoType"/&gt;
 *         &lt;element name="StopTimetable" type="{}RequestStopTimetableType"/&gt;
 *         &lt;element name="ShortHaul" type="{}RequestShortHaulType"/&gt;
 *         &lt;element name="Journey" type="{}RequestJourneyType"/&gt;
 *         &lt;element name="Monitor"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}RequestMonitorType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="MonitorSegment"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}MonitorSegmentType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Line" type="{}MonitorLineType"/&gt;
 *                             &lt;element name="Origin" type="{}MonitorOriginType"/&gt;
 *                             &lt;element name="Destination" type="{}MonitorDestinationType"/&gt;
 *                             &lt;element name="Next"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="SearchTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "ping",
    "objectInfo",
    "stopTimetable",
    "shortHaul",
    "journey",
    "monitor"
})
public class RequestType {

    @XmlElement(name = "Ping")
    protected RequestPingType ping;
    @XmlElement(name = "ObjectInfo")
    protected RequestObjectInfoType objectInfo;
    @XmlElement(name = "StopTimetable")
    protected RequestStopTimetableType stopTimetable;
    @XmlElement(name = "ShortHaul")
    protected RequestShortHaulType shortHaul;
    @XmlElement(name = "Journey")
    protected RequestJourneyType journey;
    @XmlElement(name = "Monitor")
    protected RequestType.Monitor monitor;

    /**
     * Ruft den Wert der ping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestPingType }
     *     
     */
    public RequestPingType getPing() {
        return ping;
    }

    /**
     * Legt den Wert der ping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPingType }
     *     
     */
    public void setPing(RequestPingType value) {
        this.ping = value;
    }

    /**
     * Ruft den Wert der objectInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestObjectInfoType }
     *     
     */
    public RequestObjectInfoType getObjectInfo() {
        return objectInfo;
    }

    /**
     * Legt den Wert der objectInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestObjectInfoType }
     *     
     */
    public void setObjectInfo(RequestObjectInfoType value) {
        this.objectInfo = value;
    }

    /**
     * Ruft den Wert der stopTimetable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestStopTimetableType }
     *     
     */
    public RequestStopTimetableType getStopTimetable() {
        return stopTimetable;
    }

    /**
     * Legt den Wert der stopTimetable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStopTimetableType }
     *     
     */
    public void setStopTimetable(RequestStopTimetableType value) {
        this.stopTimetable = value;
    }

    /**
     * Ruft den Wert der shortHaul-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestShortHaulType }
     *     
     */
    public RequestShortHaulType getShortHaul() {
        return shortHaul;
    }

    /**
     * Legt den Wert der shortHaul-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShortHaulType }
     *     
     */
    public void setShortHaul(RequestShortHaulType value) {
        this.shortHaul = value;
    }

    /**
     * Ruft den Wert der journey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestJourneyType }
     *     
     */
    public RequestJourneyType getJourney() {
        return journey;
    }

    /**
     * Legt den Wert der journey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestJourneyType }
     *     
     */
    public void setJourney(RequestJourneyType value) {
        this.journey = value;
    }

    /**
     * Ruft den Wert der monitor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestType.Monitor }
     *     
     */
    public RequestType.Monitor getMonitor() {
        return monitor;
    }

    /**
     * Legt den Wert der monitor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType.Monitor }
     *     
     */
    public void setMonitor(RequestType.Monitor value) {
        this.monitor = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}RequestMonitorType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="MonitorSegment"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}MonitorSegmentType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Line" type="{}MonitorLineType"/&gt;
     *                   &lt;element name="Origin" type="{}MonitorOriginType"/&gt;
     *                   &lt;element name="Destination" type="{}MonitorDestinationType"/&gt;
     *                   &lt;element name="Next"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="SearchTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "monitorSegment"
    })
    public static class Monitor
        extends RequestMonitorType
    {

        @XmlElement(name = "MonitorSegment", required = true)
        protected List<RequestType.Monitor.MonitorSegment> monitorSegment;

        /**
         * Gets the value of the monitorSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the monitorSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMonitorSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestType.Monitor.MonitorSegment }
         * 
         * 
         */
        public List<RequestType.Monitor.MonitorSegment> getMonitorSegment() {
            if (monitorSegment == null) {
                monitorSegment = new ArrayList<RequestType.Monitor.MonitorSegment>();
            }
            return this.monitorSegment;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}MonitorSegmentType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Line" type="{}MonitorLineType"/&gt;
         *         &lt;element name="Origin" type="{}MonitorOriginType"/&gt;
         *         &lt;element name="Destination" type="{}MonitorDestinationType"/&gt;
         *         &lt;element name="Next"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="SearchTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "line",
            "origin",
            "destination",
            "next"
        })
        public static class MonitorSegment
            extends MonitorSegmentType
        {

            @XmlElement(name = "Line", required = true)
            protected MonitorLineType line;
            @XmlElement(name = "Origin", required = true)
            protected MonitorOriginType origin;
            @XmlElement(name = "Destination", required = true)
            protected MonitorDestinationType destination;
            @XmlElement(name = "Next", required = true)
            protected RequestType.Monitor.MonitorSegment.Next next;
            @XmlAttribute(name = "ID")
            @XmlSchemaType(name = "anySimpleType")
            protected String id;

            /**
             * Ruft den Wert der line-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link MonitorLineType }
             *     
             */
            public MonitorLineType getLine() {
                return line;
            }

            /**
             * Legt den Wert der line-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link MonitorLineType }
             *     
             */
            public void setLine(MonitorLineType value) {
                this.line = value;
            }

            /**
             * Ruft den Wert der origin-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link MonitorOriginType }
             *     
             */
            public MonitorOriginType getOrigin() {
                return origin;
            }

            /**
             * Legt den Wert der origin-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link MonitorOriginType }
             *     
             */
            public void setOrigin(MonitorOriginType value) {
                this.origin = value;
            }

            /**
             * Ruft den Wert der destination-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link MonitorDestinationType }
             *     
             */
            public MonitorDestinationType getDestination() {
                return destination;
            }

            /**
             * Legt den Wert der destination-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link MonitorDestinationType }
             *     
             */
            public void setDestination(MonitorDestinationType value) {
                this.destination = value;
            }

            /**
             * Ruft den Wert der next-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link RequestType.Monitor.MonitorSegment.Next }
             *     
             */
            public RequestType.Monitor.MonitorSegment.Next getNext() {
                return next;
            }

            /**
             * Legt den Wert der next-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link RequestType.Monitor.MonitorSegment.Next }
             *     
             */
            public void setNext(RequestType.Monitor.MonitorSegment.Next value) {
                this.next = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
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
             *       &lt;attribute name="SearchTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Next {

                @XmlAttribute(name = "SearchTime")
                @XmlSchemaType(name = "anySimpleType")
                protected String searchTime;

                /**
                 * Ruft den Wert der searchTime-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSearchTime() {
                    return searchTime;
                }

                /**
                 * Legt den Wert der searchTime-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSearchTime(String value) {
                    this.searchTime = value;
                }

            }

        }

    }

}
