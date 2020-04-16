//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.MonitorSegmentResponseType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Antwort Fahrtueberwachung
 * 
 * <p>Java-Klasse für ResponseMonitorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseMonitorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="MonitorSegment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}MonitorSegmentResponseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Origin"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="Departure" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Destination"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="Arrival" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Next" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="Arrival" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMonitorType", propOrder = {
    "monitorSegment"
})
public class ResponseMonitorType {

    @XmlElement(name = "MonitorSegment", required = true)
    protected List<ResponseMonitorType.MonitorSegment> monitorSegment;

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
     * {@link ResponseMonitorType.MonitorSegment }
     * 
     * 
     */
    public List<ResponseMonitorType.MonitorSegment> getMonitorSegment() {
        if (monitorSegment == null) {
            monitorSegment = new ArrayList<ResponseMonitorType.MonitorSegment>();
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
     *     &lt;extension base="{}MonitorSegmentResponseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Origin"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="Departure" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Destination"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="Arrival" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Next" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="Arrival" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
        "origin",
        "destination",
        "next"
    })
    public static class MonitorSegment
        extends MonitorSegmentResponseType
    {

        @XmlElement(name = "Origin", required = true)
        protected ResponseMonitorType.MonitorSegment.Origin origin;
        @XmlElement(name = "Destination", required = true)
        protected ResponseMonitorType.MonitorSegment.Destination destination;
        @XmlElement(name = "Next")
        protected ResponseMonitorType.MonitorSegment.Next next;
        @XmlAttribute(name = "ID")
        @XmlSchemaType(name = "anySimpleType")
        protected String id;

        /**
         * Ruft den Wert der origin-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ResponseMonitorType.MonitorSegment.Origin }
         *     
         */
        public ResponseMonitorType.MonitorSegment.Origin getOrigin() {
            return origin;
        }

        /**
         * Legt den Wert der origin-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseMonitorType.MonitorSegment.Origin }
         *     
         */
        public void setOrigin(ResponseMonitorType.MonitorSegment.Origin value) {
            this.origin = value;
        }

        /**
         * Ruft den Wert der destination-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ResponseMonitorType.MonitorSegment.Destination }
         *     
         */
        public ResponseMonitorType.MonitorSegment.Destination getDestination() {
            return destination;
        }

        /**
         * Legt den Wert der destination-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseMonitorType.MonitorSegment.Destination }
         *     
         */
        public void setDestination(ResponseMonitorType.MonitorSegment.Destination value) {
            this.destination = value;
        }

        /**
         * Ruft den Wert der next-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ResponseMonitorType.MonitorSegment.Next }
         *     
         */
        public ResponseMonitorType.MonitorSegment.Next getNext() {
            return next;
        }

        /**
         * Legt den Wert der next-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseMonitorType.MonitorSegment.Next }
         *     
         */
        public void setNext(ResponseMonitorType.MonitorSegment.Next value) {
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
         *       &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *       &lt;attribute name="Arrival" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Destination {

            @XmlAttribute(name = "ASSID")
            @XmlSchemaType(name = "anySimpleType")
            protected String assid;
            @XmlAttribute(name = "Arrival")
            @XmlSchemaType(name = "anySimpleType")
            protected String arrival;

            /**
             * Ruft den Wert der assid-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASSID() {
                return assid;
            }

            /**
             * Legt den Wert der assid-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASSID(String value) {
                this.assid = value;
            }

            /**
             * Ruft den Wert der arrival-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrival() {
                return arrival;
            }

            /**
             * Legt den Wert der arrival-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrival(String value) {
                this.arrival = value;
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
         *       &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *       &lt;attribute name="Arrival" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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

            @XmlAttribute(name = "ASSID")
            @XmlSchemaType(name = "anySimpleType")
            protected String assid;
            @XmlAttribute(name = "Arrival")
            @XmlSchemaType(name = "anySimpleType")
            protected String arrival;

            /**
             * Ruft den Wert der assid-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASSID() {
                return assid;
            }

            /**
             * Legt den Wert der assid-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASSID(String value) {
                this.assid = value;
            }

            /**
             * Ruft den Wert der arrival-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrival() {
                return arrival;
            }

            /**
             * Legt den Wert der arrival-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrival(String value) {
                this.arrival = value;
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
         *       &lt;attribute name="ASSID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *       &lt;attribute name="Departure" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Origin {

            @XmlAttribute(name = "ASSID")
            @XmlSchemaType(name = "anySimpleType")
            protected String assid;
            @XmlAttribute(name = "Departure")
            @XmlSchemaType(name = "anySimpleType")
            protected String departure;

            /**
             * Ruft den Wert der assid-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASSID() {
                return assid;
            }

            /**
             * Legt den Wert der assid-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASSID(String value) {
                this.assid = value;
            }

            /**
             * Ruft den Wert der departure-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeparture() {
                return departure;
            }

            /**
             * Legt den Wert der departure-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeparture(String value) {
                this.departure = value;
            }

        }

    }

}
