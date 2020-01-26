//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{hafas_rest}ticket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="param" type="{hafas_rest}KVType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="cur" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shpCtx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ticket",
        "param"
})
@XmlRootElement(name = "fareItem")
public class FareItem {

    protected List<Ticket> ticket;
    protected List<KVType> param;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "desc")
    protected String desc;
    @XmlAttribute(name = "price")
    protected Integer price;
    @XmlAttribute(name = "cur")
    protected String cur;
    @XmlAttribute(name = "shpCtx")
    protected String shpCtx;

    /**
     * Gets the value of the ticket property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticket property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicket().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ticket }
     */
    public List<Ticket> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<Ticket>();
        }
        return this.ticket;
    }

    /**
     * Gets the value of the param property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KVType }
     */
    public List<KVType> getParam() {
        if (param == null) {
            param = new ArrayList<KVType>();
        }
        return this.param;
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
     * Ruft den Wert der desc-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Legt den Wert der desc-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public int getPrice() {
        if (price == null) {
            return 0;
        } else {
            return price;
        }
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPrice(Integer value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der cur-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCur() {
        return cur;
    }

    /**
     * Legt den Wert der cur-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCur(String value) {
        this.cur = value;
    }

    /**
     * Ruft den Wert der shpCtx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getShpCtx() {
        return shpCtx;
    }

    /**
     * Legt den Wert der shpCtx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShpCtx(String value) {
        this.shpCtx = value;
    }

}
