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
 * Suchklasse Halt
 * 
 * <p>Java-Klasse für SearchClassStopType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchClassStopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ASSID" type="{}ASSIDType" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="NumberRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="NumberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="UseAbbr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumOfObjects" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchClassStopType", propOrder = {
    "assid",
    "numberRange",
    "numberID",
    "useAbbr",
    "numOfObjects"
})
public class SearchClassStopType {

    @XmlElement(name = "ASSID")
    protected String assid;
    @XmlElement(name = "NumberRange")
    protected String numberRange;
    @XmlElement(name = "NumberID")
    protected String numberID;
    @XmlElement(name = "UseAbbr")
    protected Boolean useAbbr;
    @XmlElement(name = "NumOfObjects")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numOfObjects;

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
     * Ruft den Wert der numberRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRange() {
        return numberRange;
    }

    /**
     * Legt den Wert der numberRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRange(String value) {
        this.numberRange = value;
    }

    /**
     * Ruft den Wert der numberID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberID() {
        return numberID;
    }

    /**
     * Legt den Wert der numberID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberID(String value) {
        this.numberID = value;
    }

    /**
     * Ruft den Wert der useAbbr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAbbr() {
        return useAbbr;
    }

    /**
     * Legt den Wert der useAbbr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAbbr(Boolean value) {
        this.useAbbr = value;
    }

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

}
