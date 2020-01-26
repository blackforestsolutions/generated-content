//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package rmv.hafas_rest;

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
 *         &lt;element name="affectedProduct" type="{hafas_rest}ProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="edge" type="{hafas_rest}MessageEdgeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{hafas_rest}MessageRegionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Message"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "affectedProduct",
        "edge",
        "region"
})
@XmlRootElement(name = "Message")
public class Message {

    protected List<ProductType> affectedProduct;
    protected List<MessageEdgeType> edge;
    protected List<MessageRegionType> region;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "externalId")
    protected String externalId;
    @XmlAttribute(name = "act", required = true)
    protected boolean act;
    @XmlAttribute(name = "pub")
    protected String pub;
    @XmlAttribute(name = "head", required = true)
    protected String head;
    @XmlAttribute(name = "lead")
    protected String lead;
    @XmlAttribute(name = "text", required = true)
    protected String text;
    @XmlAttribute(name = "tckr")
    protected String tckr;
    @XmlAttribute(name = "company")
    protected String company;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "priority", required = true)
    protected int priority;
    @XmlAttribute(name = "products")
    protected Integer products;
    @XmlAttribute(name = "icon")
    protected String icon;
    @XmlAttribute(name = "routeIdxFrom")
    protected Integer routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Integer routeIdxTo;
    @XmlAttribute(name = "sTime")
    protected String sTime;
    @XmlAttribute(name = "sDate")
    protected String sDate;
    @XmlAttribute(name = "eTime")
    protected String eTime;
    @XmlAttribute(name = "eDate")
    protected String eDate;
    @XmlAttribute(name = "altStart")
    protected String altStart;
    @XmlAttribute(name = "altEnd")
    protected String altEnd;

    /**
     * Gets the value of the affectedProduct property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedProduct property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedProduct().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     */
    public List<ProductType> getAffectedProduct() {
        if (affectedProduct == null) {
            affectedProduct = new ArrayList<ProductType>();
        }
        return this.affectedProduct;
    }

    /**
     * Gets the value of the edge property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edge property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdge().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageEdgeType }
     */
    public List<MessageEdgeType> getEdge() {
        if (edge == null) {
            edge = new ArrayList<MessageEdgeType>();
        }
        return this.edge;
    }

    /**
     * Gets the value of the region property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageRegionType }
     */
    public List<MessageRegionType> getRegion() {
        if (region == null) {
            region = new ArrayList<MessageRegionType>();
        }
        return this.region;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der externalId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Legt den Wert der externalId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Ruft den Wert der act-Eigenschaft ab.
     */
    public boolean isAct() {
        return act;
    }

    /**
     * Legt den Wert der act-Eigenschaft fest.
     */
    public void setAct(boolean value) {
        this.act = value;
    }

    /**
     * Ruft den Wert der pub-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPub() {
        return pub;
    }

    /**
     * Legt den Wert der pub-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPub(String value) {
        this.pub = value;
    }

    /**
     * Ruft den Wert der head-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHead() {
        return head;
    }

    /**
     * Legt den Wert der head-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHead(String value) {
        this.head = value;
    }

    /**
     * Ruft den Wert der lead-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLead() {
        return lead;
    }

    /**
     * Legt den Wert der lead-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLead(String value) {
        this.lead = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der tckr-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTckr() {
        return tckr;
    }

    /**
     * Legt den Wert der tckr-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTckr(String value) {
        this.tckr = value;
    }

    /**
     * Ruft den Wert der company-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompany() {
        return company;
    }

    /**
     * Legt den Wert der company-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Ruft den Wert der priority-Eigenschaft ab.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der products-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getProducts() {
        return products;
    }

    /**
     * Legt den Wert der products-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setProducts(Integer value) {
        this.products = value;
    }

    /**
     * Ruft den Wert der icon-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Legt den Wert der icon-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Ruft den Wert der routeIdxFrom-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
    }

    /**
     * Legt den Wert der routeIdxFrom-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRouteIdxFrom(Integer value) {
        this.routeIdxFrom = value;
    }

    /**
     * Ruft den Wert der routeIdxTo-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRouteIdxTo() {
        return routeIdxTo;
    }

    /**
     * Legt den Wert der routeIdxTo-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRouteIdxTo(Integer value) {
        this.routeIdxTo = value;
    }

    /**
     * Ruft den Wert der sTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSTime() {
        return sTime;
    }

    /**
     * Legt den Wert der sTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSTime(String value) {
        this.sTime = value;
    }

    /**
     * Ruft den Wert der sDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSDate() {
        return sDate;
    }

    /**
     * Legt den Wert der sDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSDate(String value) {
        this.sDate = value;
    }

    /**
     * Ruft den Wert der eTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getETime() {
        return eTime;
    }

    /**
     * Legt den Wert der eTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setETime(String value) {
        this.eTime = value;
    }

    /**
     * Ruft den Wert der eDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEDate() {
        return eDate;
    }

    /**
     * Legt den Wert der eDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEDate(String value) {
        this.eDate = value;
    }

    /**
     * Ruft den Wert der altStart-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAltStart() {
        return altStart;
    }

    /**
     * Legt den Wert der altStart-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAltStart(String value) {
        this.altStart = value;
    }

    /**
     * Ruft den Wert der altEnd-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAltEnd() {
        return altEnd;
    }

    /**
     * Legt den Wert der altEnd-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAltEnd(String value) {
        this.altEnd = value;
    }

}
