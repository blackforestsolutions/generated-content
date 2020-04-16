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


/**
 * Suchklasse Adresse
 * 
 * <p>Java-Klasse für SearchClassAddressType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchClassAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumOfObjects" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="GKZ" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="BL" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchClassAddressType", propOrder = {
    "numOfObjects",
    "gkz",
    "bl"
})
public class SearchClassAddressType {

    @XmlElement(name = "NumOfObjects")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numOfObjects;
    @XmlElement(name = "GKZ")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gkz;
    @XmlElement(name = "BL")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bl;

    /**
     * Ruft den Wert der numOfObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfObjects() {
        return numOfObjects;
    }

    /**
     * Legt den Wert der numOfObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfObjects(BigInteger value) {
        this.numOfObjects = value;
    }

    /**
     * Ruft den Wert der gkz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGKZ() {
        return gkz;
    }

    /**
     * Legt den Wert der gkz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGKZ(BigInteger value) {
        this.gkz = value;
    }

    /**
     * Ruft den Wert der bl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBL() {
        return bl;
    }

    /**
     * Legt den Wert der bl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBL(BigInteger value) {
        this.bl = value;
    }

}
