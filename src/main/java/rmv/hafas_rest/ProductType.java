//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package rmv.hafas_rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Product context, provides access to internal data. For the product category attributes, their
 * assignments are defined in the "zugart" file from the raw Hafas plan data.
 *
 * <p>Java-Klasse für ProductType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lineId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catOut" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catOutS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="catOutL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operatorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType")
public class ProductType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "num")
    protected String num;
    @XmlAttribute(name = "line")
    protected String line;
    @XmlAttribute(name = "lineId")
    protected String lineId;
    @XmlAttribute(name = "catOut")
    protected String catOut;
    @XmlAttribute(name = "catIn")
    protected String catIn;
    @XmlAttribute(name = "catCode")
    protected String catCode;
    @XmlAttribute(name = "catOutS")
    protected String catOutS;
    @XmlAttribute(name = "catOutL")
    protected String catOutL;
    @XmlAttribute(name = "operatorCode")
    protected String operatorCode;
    @XmlAttribute(name = "operator")
    protected String operator;
    @XmlAttribute(name = "admin")
    protected String admin;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der num-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNum() {
        return num;
    }

    /**
     * Legt den Wert der num-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Ruft den Wert der line-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLine() {
        return line;
    }

    /**
     * Legt den Wert der line-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Ruft den Wert der lineId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Legt den Wert der lineId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Ruft den Wert der catOut-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCatOut() {
        return catOut;
    }

    /**
     * Legt den Wert der catOut-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCatOut(String value) {
        this.catOut = value;
    }

    /**
     * Ruft den Wert der catIn-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCatIn() {
        return catIn;
    }

    /**
     * Legt den Wert der catIn-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCatIn(String value) {
        this.catIn = value;
    }

    /**
     * Ruft den Wert der catCode-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCatCode() {
        return catCode;
    }

    /**
     * Legt den Wert der catCode-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCatCode(String value) {
        this.catCode = value;
    }

    /**
     * Ruft den Wert der catOutS-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCatOutS() {
        return catOutS;
    }

    /**
     * Legt den Wert der catOutS-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCatOutS(String value) {
        this.catOutS = value;
    }

    /**
     * Ruft den Wert der catOutL-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCatOutL() {
        return catOutL;
    }

    /**
     * Legt den Wert der catOutL-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCatOutL(String value) {
        this.catOutL = value;
    }

    /**
     * Ruft den Wert der operatorCode-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Legt den Wert der operatorCode-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Ruft den Wert der operator-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Legt den Wert der operator-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Ruft den Wert der admin-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * Legt den Wert der admin-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdmin(String value) {
        this.admin = value;
    }

}
