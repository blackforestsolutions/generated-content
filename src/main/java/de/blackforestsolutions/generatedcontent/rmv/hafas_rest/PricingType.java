//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für pricingType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="pricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idx" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricingType", propOrder = {
        "any"
})
public class PricingType {

    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "idx", required = true)
    protected int idx;

    /**
     * Ruft den Wert der any-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getAny() {
        return any;
    }

    /**
     * Legt den Wert der any-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Ruft den Wert der idx-Eigenschaft ab.
     */
    public int getIdx() {
        return idx;
    }

    /**
     * Legt den Wert der idx-Eigenschaft fest.
     */
    public void setIdx(int value) {
        this.idx = value;
    }

}
