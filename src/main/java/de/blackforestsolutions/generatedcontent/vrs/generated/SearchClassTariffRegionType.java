//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchClassTariffRegionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchClassTariffRegionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffRegionNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="TariffRegionName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchClassTariffRegionType", propOrder = {
    "tariffRegionNumber",
    "tariffRegionName"
})
public class SearchClassTariffRegionType {

    @XmlElement(name = "TariffRegionNumber", required = true)
    protected Object tariffRegionNumber;
    @XmlElement(name = "TariffRegionName", required = true)
    protected Object tariffRegionName;

    /**
     * Ruft den Wert der tariffRegionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTariffRegionNumber() {
        return tariffRegionNumber;
    }

    /**
     * Legt den Wert der tariffRegionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTariffRegionNumber(Object value) {
        this.tariffRegionNumber = value;
    }

    /**
     * Ruft den Wert der tariffRegionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTariffRegionName() {
        return tariffRegionName;
    }

    /**
     * Legt den Wert der tariffRegionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTariffRegionName(Object value) {
        this.tariffRegionName = value;
    }

}
