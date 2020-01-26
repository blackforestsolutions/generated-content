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


/**
 * <p>Java-Klasse für EcoType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EcoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="co2" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="part" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="partV" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="nmhc" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="nox" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="prime" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="so2" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcoType")
public class EcoType {

    @XmlAttribute(name = "co2")
    protected Double co2;
    @XmlAttribute(name = "part")
    protected Double part;
    @XmlAttribute(name = "partV")
    protected Double partV;
    @XmlAttribute(name = "nmhc")
    protected Double nmhc;
    @XmlAttribute(name = "nox")
    protected Double nox;
    @XmlAttribute(name = "prime")
    protected Double prime;
    @XmlAttribute(name = "so2")
    protected Double so2;

    /**
     * Ruft den Wert der co2-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getCo2() {
        if (co2 == null) {
            return 0.0D;
        } else {
            return co2;
        }
    }

    /**
     * Legt den Wert der co2-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setCo2(Double value) {
        this.co2 = value;
    }

    /**
     * Ruft den Wert der part-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getPart() {
        if (part == null) {
            return 0.0D;
        } else {
            return part;
        }
    }

    /**
     * Legt den Wert der part-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setPart(Double value) {
        this.part = value;
    }

    /**
     * Ruft den Wert der partV-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getPartV() {
        if (partV == null) {
            return 0.0D;
        } else {
            return partV;
        }
    }

    /**
     * Legt den Wert der partV-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setPartV(Double value) {
        this.partV = value;
    }

    /**
     * Ruft den Wert der nmhc-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getNmhc() {
        if (nmhc == null) {
            return 0.0D;
        } else {
            return nmhc;
        }
    }

    /**
     * Legt den Wert der nmhc-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setNmhc(Double value) {
        this.nmhc = value;
    }

    /**
     * Ruft den Wert der nox-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getNox() {
        if (nox == null) {
            return 0.0D;
        } else {
            return nox;
        }
    }

    /**
     * Legt den Wert der nox-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setNox(Double value) {
        this.nox = value;
    }

    /**
     * Ruft den Wert der prime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getPrime() {
        if (prime == null) {
            return 0.0D;
        } else {
            return prime;
        }
    }

    /**
     * Legt den Wert der prime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setPrime(Double value) {
        this.prime = value;
    }

    /**
     * Ruft den Wert der so2-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getSo2() {
        if (so2 == null) {
            return 0.0D;
        } else {
            return so2;
        }
    }

    /**
     * Legt den Wert der so2-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setSo2(Double value) {
        this.so2 = value;
    }

}
