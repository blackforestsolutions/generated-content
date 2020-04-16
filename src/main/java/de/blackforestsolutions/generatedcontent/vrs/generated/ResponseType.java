//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Verfügbare Antworten
 * 
 * <p>Java-Klasse für ResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Ping" type="{}ResponsePingType"/&gt;
 *           &lt;element name="Error" type="{}SystemMessageErrorType"/&gt;
 *           &lt;element name="ObjectInfo" type="{}ResponseObjectInfoType"/&gt;
 *           &lt;element name="StopTimetable" type="{}ResponseStopTimetableType"/&gt;
 *           &lt;element name="ShortHaul" type="{}ResponseShortHaulType"/&gt;
 *           &lt;element name="Journey" type="{}ResponseJourneyType"/&gt;
 *           &lt;element name="Monitor" type="{}ResponseMonitorType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="SystemStatus" type="{}SystemStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "ping",
    "error",
    "objectInfo",
    "stopTimetable",
    "shortHaul",
    "journey",
    "monitor",
    "systemStatus"
})
public class ResponseType {

    @XmlElement(name = "Ping")
    protected ResponsePingType ping;
    @XmlElement(name = "Error")
    protected SystemMessageErrorType error;
    @XmlElement(name = "ObjectInfo")
    protected ResponseObjectInfoType objectInfo;
    @XmlElement(name = "StopTimetable")
    protected ResponseStopTimetableType stopTimetable;
    @XmlElement(name = "ShortHaul")
    protected ResponseShortHaulType shortHaul;
    @XmlElement(name = "Journey")
    protected ResponseJourneyType journey;
    @XmlElement(name = "Monitor")
    protected ResponseMonitorType monitor;
    @XmlElement(name = "SystemStatus", required = true)
    protected SystemStatusType systemStatus;

    /**
     * Ruft den Wert der ping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePingType }
     *     
     */
    public ResponsePingType getPing() {
        return ping;
    }

    /**
     * Legt den Wert der ping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePingType }
     *     
     */
    public void setPing(ResponsePingType value) {
        this.ping = value;
    }

    /**
     * Ruft den Wert der error-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SystemMessageErrorType }
     *     
     */
    public SystemMessageErrorType getError() {
        return error;
    }

    /**
     * Legt den Wert der error-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMessageErrorType }
     *     
     */
    public void setError(SystemMessageErrorType value) {
        this.error = value;
    }

    /**
     * Ruft den Wert der objectInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseObjectInfoType }
     *     
     */
    public ResponseObjectInfoType getObjectInfo() {
        return objectInfo;
    }

    /**
     * Legt den Wert der objectInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseObjectInfoType }
     *     
     */
    public void setObjectInfo(ResponseObjectInfoType value) {
        this.objectInfo = value;
    }

    /**
     * Ruft den Wert der stopTimetable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStopTimetableType }
     *     
     */
    public ResponseStopTimetableType getStopTimetable() {
        return stopTimetable;
    }

    /**
     * Legt den Wert der stopTimetable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStopTimetableType }
     *     
     */
    public void setStopTimetable(ResponseStopTimetableType value) {
        this.stopTimetable = value;
    }

    /**
     * Ruft den Wert der shortHaul-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseShortHaulType }
     *     
     */
    public ResponseShortHaulType getShortHaul() {
        return shortHaul;
    }

    /**
     * Legt den Wert der shortHaul-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseShortHaulType }
     *     
     */
    public void setShortHaul(ResponseShortHaulType value) {
        this.shortHaul = value;
    }

    /**
     * Ruft den Wert der journey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseJourneyType }
     *     
     */
    public ResponseJourneyType getJourney() {
        return journey;
    }

    /**
     * Legt den Wert der journey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseJourneyType }
     *     
     */
    public void setJourney(ResponseJourneyType value) {
        this.journey = value;
    }

    /**
     * Ruft den Wert der monitor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMonitorType }
     *     
     */
    public ResponseMonitorType getMonitor() {
        return monitor;
    }

    /**
     * Legt den Wert der monitor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMonitorType }
     *     
     */
    public void setMonitor(ResponseMonitorType value) {
        this.monitor = value;
    }

    /**
     * Ruft den Wert der systemStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusType }
     *     
     */
    public SystemStatusType getSystemStatus() {
        return systemStatus;
    }

    /**
     * Legt den Wert der systemStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusType }
     *     
     */
    public void setSystemStatus(SystemStatusType value) {
        this.systemStatus = value;
    }

}
