//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product" type="{hafas_rest}ProductType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Name"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "product"
})
@XmlRootElement(name = "Name")
public class Name {

    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "number", required = true)
    protected String number;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "routeIdxFrom")
    protected Long routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Long routeIdxTo;

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ProductType }
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ProductType }
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

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
     * Ruft den Wert der number-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der routeIdxFrom-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public long getRouteIdxFrom() {
        if (routeIdxFrom == null) {
            return -1;
        } else {
            return routeIdxFrom;
        }
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
    public long getRouteIdxTo() {
        if (routeIdxTo == null) {
            return -1;
        } else {
            return routeIdxTo;
        }
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
