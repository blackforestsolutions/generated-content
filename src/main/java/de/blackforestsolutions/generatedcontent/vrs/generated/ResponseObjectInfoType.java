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
 * Antwort Informationen zu Objekten.
 * 
 * <p>Java-Klasse für ResponseObjectInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseObjectInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Objects" type="{}ObjectsType"/&gt;
 *         &lt;element name="ReferencedObjects" type="{}ObjectsType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseStatus" type="{}SystemMessageResponseObjectInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseObjectInfoType", propOrder = {
    "objects",
    "referencedObjects",
    "responseStatus"
})
public class ResponseObjectInfoType {

    @XmlElement(name = "Objects", required = true)
    protected ObjectsType objects;
    @XmlElement(name = "ReferencedObjects")
    protected ObjectsType referencedObjects;
    @XmlElement(name = "ResponseStatus")
    protected SystemMessageResponseObjectInfoType responseStatus;

    /**
     * Ruft den Wert der objects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectsType }
     *     
     */
    public ObjectsType getObjects() {
        return objects;
    }

    /**
     * Legt den Wert der objects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectsType }
     *     
     */
    public void setObjects(ObjectsType value) {
        this.objects = value;
    }

    /**
     * Ruft den Wert der referencedObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectsType }
     *     
     */
    public ObjectsType getReferencedObjects() {
        return referencedObjects;
    }

    /**
     * Legt den Wert der referencedObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectsType }
     *     
     */
    public void setReferencedObjects(ObjectsType value) {
        this.referencedObjects = value;
    }

    /**
     * Ruft den Wert der responseStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SystemMessageResponseObjectInfoType }
     *     
     */
    public SystemMessageResponseObjectInfoType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Legt den Wert der responseStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMessageResponseObjectInfoType }
     *     
     */
    public void setResponseStatus(SystemMessageResponseObjectInfoType value) {
        this.responseStatus = value;
    }

}
