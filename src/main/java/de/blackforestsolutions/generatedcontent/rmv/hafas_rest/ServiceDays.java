//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;


/**
 * Irregular service days for this trip meaning the days there this train runs on a different
 * schedule.
 *
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="planningPeriodBegin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="planningPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDaysR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDaysI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sDaysB" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="routeIdxFrom" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="routeIdxTo" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ServiceDays")
public class ServiceDays {

    @XmlAttribute(name = "planningPeriodBegin")
    protected String planningPeriodBegin;
    @XmlAttribute(name = "planningPeriodEnd")
    protected String planningPeriodEnd;
    @XmlAttribute(name = "sDaysR")
    protected String sDaysR;
    @XmlAttribute(name = "sDaysI")
    protected String sDaysI;
    @XmlAttribute(name = "sDaysB")
    protected String sDaysB;
    @XmlAttribute(name = "routeIdxFrom")
    protected Long routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Long routeIdxTo;

    /**
     * Ruft den Wert der planningPeriodBegin-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlanningPeriodBegin() {
        return planningPeriodBegin;
    }

    /**
     * Legt den Wert der planningPeriodBegin-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlanningPeriodBegin(String value) {
        this.planningPeriodBegin = value;
    }

    /**
     * Ruft den Wert der planningPeriodEnd-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlanningPeriodEnd() {
        return planningPeriodEnd;
    }

    /**
     * Legt den Wert der planningPeriodEnd-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlanningPeriodEnd(String value) {
        this.planningPeriodEnd = value;
    }

    /**
     * Ruft den Wert der sDaysR-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSDaysR() {
        return sDaysR;
    }

    /**
     * Legt den Wert der sDaysR-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSDaysR(String value) {
        this.sDaysR = value;
    }

    /**
     * Ruft den Wert der sDaysI-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSDaysI() {
        return sDaysI;
    }

    /**
     * Legt den Wert der sDaysI-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSDaysI(String value) {
        this.sDaysI = value;
    }

    /**
     * Ruft den Wert der sDaysB-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSDaysB() {
        return sDaysB;
    }

    /**
     * Legt den Wert der sDaysB-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSDaysB(String value) {
        this.sDaysB = value;
    }

    /**
     * Ruft den Wert der routeIdxFrom-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRouteIdxFrom() {
        return routeIdxFrom;
    }

    /**
     * Legt den Wert der routeIdxFrom-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRouteIdxFrom(Long value) {
        this.routeIdxFrom = value;
    }

    /**
     * Ruft den Wert der routeIdxTo-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRouteIdxTo() {
        return routeIdxTo;
    }

    /**
     * Legt den Wert der routeIdxTo-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRouteIdxTo(Long value) {
        this.routeIdxTo = value;
    }

}
