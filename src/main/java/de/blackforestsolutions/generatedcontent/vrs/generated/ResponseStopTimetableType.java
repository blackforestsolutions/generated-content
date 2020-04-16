//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Antwort Haltestellenfahrplan.
 * 
 * <p>Java-Klasse für ResponseStopTimetableType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseStopTimetableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopEvents"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StopEvent" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}StopPublicTransportType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VehicleJourney" type="{}VehicleJourneyType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Lines" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Line" type="{}LineType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Objects" type="{}ResponseStopTimeTableObjectType"/&gt;
 *         &lt;element name="ResponseStatus" type="{}SystemMessageResponseStopTimetableType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStopTimetableType", propOrder = {
    "stopEvents",
    "lines",
    "objects",
    "responseStatus"
})
public class ResponseStopTimetableType {

    @XmlElement(name = "StopEvents", required = true)
    protected ResponseStopTimetableType.StopEvents stopEvents;
    @XmlElement(name = "Lines")
    protected ResponseStopTimetableType.Lines lines;
    @XmlElement(name = "Objects", required = true)
    protected ResponseStopTimeTableObjectType objects;
    @XmlElement(name = "ResponseStatus", required = true)
    protected SystemMessageResponseStopTimetableType responseStatus;

    /**
     * Ruft den Wert der stopEvents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStopTimetableType.StopEvents }
     *     
     */
    public ResponseStopTimetableType.StopEvents getStopEvents() {
        return stopEvents;
    }

    /**
     * Legt den Wert der stopEvents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStopTimetableType.StopEvents }
     *     
     */
    public void setStopEvents(ResponseStopTimetableType.StopEvents value) {
        this.stopEvents = value;
    }

    /**
     * Ruft den Wert der lines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStopTimetableType.Lines }
     *     
     */
    public ResponseStopTimetableType.Lines getLines() {
        return lines;
    }

    /**
     * Legt den Wert der lines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStopTimetableType.Lines }
     *     
     */
    public void setLines(ResponseStopTimetableType.Lines value) {
        this.lines = value;
    }

    /**
     * Ruft den Wert der objects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStopTimeTableObjectType }
     *     
     */
    public ResponseStopTimeTableObjectType getObjects() {
        return objects;
    }

    /**
     * Legt den Wert der objects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStopTimeTableObjectType }
     *     
     */
    public void setObjects(ResponseStopTimeTableObjectType value) {
        this.objects = value;
    }

    /**
     * Ruft den Wert der responseStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SystemMessageResponseStopTimetableType }
     *     
     */
    public SystemMessageResponseStopTimetableType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Legt den Wert der responseStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMessageResponseStopTimetableType }
     *     
     */
    public void setResponseStatus(SystemMessageResponseStopTimetableType value) {
        this.responseStatus = value;
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
     *         &lt;element name="Line" type="{}LineType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "line"
    })
    public static class Lines {

        @XmlElement(name = "Line")
        protected List<LineType> line;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineType }
         * 
         * 
         */
        public List<LineType> getLine() {
            if (line == null) {
                line = new ArrayList<LineType>();
            }
            return this.line;
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
     *         &lt;element name="StopEvent" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}StopPublicTransportType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VehicleJourney" type="{}VehicleJourneyType"/&gt;
     *                 &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "stopEvent"
    })
    public static class StopEvents {

        @XmlElement(name = "StopEvent")
        protected List<ResponseStopTimetableType.StopEvents.StopEvent> stopEvent;

        /**
         * Gets the value of the stopEvent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stopEvent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStopEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponseStopTimetableType.StopEvents.StopEvent }
         * 
         * 
         */
        public List<ResponseStopTimetableType.StopEvents.StopEvent> getStopEvent() {
            if (stopEvent == null) {
                stopEvent = new ArrayList<ResponseStopTimetableType.StopEvents.StopEvent>();
            }
            return this.stopEvent;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}StopPublicTransportType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="VehicleJourney" type="{}VehicleJourneyType"/&gt;
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
            "vehicleJourney"
        })
        public static class StopEvent
            extends StopPublicTransportType
        {

            @XmlElement(name = "VehicleJourney", required = true)
            protected VehicleJourneyType vehicleJourney;

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

        }

    }

}
