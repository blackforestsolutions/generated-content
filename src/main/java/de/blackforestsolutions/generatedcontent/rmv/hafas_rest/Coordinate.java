//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * Coordinate
 *
 * <p>Java-Klasse für Coordinate complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Coordinate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="lon" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="lat" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="alt" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coordinate")
public class Coordinate {

    @XmlAttribute(name = "lon", required = true)
    protected BigDecimal lon;
    @XmlAttribute(name = "lat", required = true)
    protected BigDecimal lat;
    @XmlAttribute(name = "alt")
    protected BigDecimal alt;

    /**
     * Ruft den Wert der lon-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * Legt den Wert der lon-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLon(BigDecimal value) {
        this.lon = value;
    }

    /**
     * Ruft den Wert der lat-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * Legt den Wert der lat-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLat(BigDecimal value) {
        this.lat = value;
    }

    /**
     * Ruft den Wert der alt-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAlt() {
        return alt;
    }

    /**
     * Legt den Wert der alt-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAlt(BigDecimal value) {
        this.alt = value;
    }

}
