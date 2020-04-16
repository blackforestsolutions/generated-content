//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Ein Linienobjekt
 * 
 * <p>Java-Klasse für LineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{}NonEmptyStringType"/&gt;
 *         &lt;element name="LineRef" type="{}NonEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="Name" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;NonEmptyStringType"&gt;
 *                 &lt;attribute name="Type"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Synonym"/&gt;
 *                       &lt;enumeration value="Temporary"/&gt;
 *                       &lt;enumeration value="Touristic"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Product" type="{}PublicTransportProductType"/&gt;
 *         &lt;element name="Group" type="{}GroupReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" use="required" type="{}IDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineType", propOrder = {
    "number",
    "lineRef",
    "name",
    "product",
    "group",
    "infoMessages"
})
public class LineType {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "LineRef")
    protected String lineRef;
    @XmlElement(name = "Name")
    protected List<LineType.Name> name;
    @XmlElement(name = "Product", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected PublicTransportProductType product;
    @XmlElement(name = "Group")
    protected List<GroupReferenceType> group;
    @XmlElement(name = "InfoMessages")
    protected InfoMessagesType infoMessages;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineRef(String value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineType.Name }
     * 
     * 
     */
    public List<LineType.Name> getName() {
        if (name == null) {
            name = new ArrayList<LineType.Name>();
        }
        return this.name;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicTransportProductType }
     *     
     */
    public PublicTransportProductType getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicTransportProductType }
     *     
     */
    public void setProduct(PublicTransportProductType value) {
        this.product = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupReferenceType }
     * 
     * 
     */
    public List<GroupReferenceType> getGroup() {
        if (group == null) {
            group = new ArrayList<GroupReferenceType>();
        }
        return this.group;
    }

    /**
     * Ruft den Wert der infoMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessagesType }
     *     
     */
    public InfoMessagesType getInfoMessages() {
        return infoMessages;
    }

    /**
     * Legt den Wert der infoMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessagesType }
     *     
     */
    public void setInfoMessages(InfoMessagesType value) {
        this.infoMessages = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;NonEmptyStringType"&gt;
     *       &lt;attribute name="Type"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Synonym"/&gt;
     *             &lt;enumeration value="Temporary"/&gt;
     *             &lt;enumeration value="Touristic"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Name {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * Nicht-leerer String
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
