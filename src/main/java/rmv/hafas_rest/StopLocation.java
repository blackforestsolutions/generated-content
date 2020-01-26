//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
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
 *         &lt;element ref="{hafas_rest}LocationNotes" minOccurs="0"/&gt;
 *         &lt;element name="links" type="{hafas_rest}ResourceLinks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.StopLocation"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "locationNotes",
        "links"
})
@XmlRootElement(name = "StopLocation")
public class StopLocation {

    @XmlElement(name = "LocationNotes")
    protected LocationNotes locationNotes;
    protected List<ResourceLinks> links;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "extId", required = true)
    protected String extId;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "lon")
    protected BigDecimal lon;
    @XmlAttribute(name = "lat")
    protected BigDecimal lat;
    @XmlAttribute(name = "track")
    protected String track;
    @XmlAttribute(name = "weight")
    protected Integer weight;
    @XmlAttribute(name = "dist")
    protected Integer dist;
    @XmlAttribute(name = "products")
    protected Integer products;
    @XmlAttribute(name = "meta")
    protected Boolean meta;
    @XmlAttribute(name = "refinable")
    protected Boolean refinable;

    /**
     * Contains a list of notes to be displayed for this location, like attributes or footnotes.
     *
     * @return possible object is
     * {@link LocationNotes }
     */
    public LocationNotes getLocationNotes() {
        return locationNotes;
    }

    /**
     * Legt den Wert der locationNotes-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LocationNotes }
     */
    public void setLocationNotes(LocationNotes value) {
        this.locationNotes = value;
    }

    /**
     * Gets the value of the links property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceLinks }
     */
    public List<ResourceLinks> getLinks() {
        if (links == null) {
            links = new ArrayList<ResourceLinks>();
        }
        return this.links;
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
     * Ruft den Wert der extId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtId() {
        return extId;
    }

    /**
     * Legt den Wert der extId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtId(String value) {
        this.extId = value;
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
     * Ruft den Wert der lon-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * Legt den Wert der lon-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLon(BigDecimal value) {
        this.lon = value;
    }

    /**
     * Ruft den Wert der lat-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * Legt den Wert der lat-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLat(BigDecimal value) {
        this.lat = value;
    }

    /**
     * Ruft den Wert der track-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTrack() {
        return track;
    }

    /**
     * Legt den Wert der track-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTrack(String value) {
        this.track = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der dist-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDist() {
        return dist;
    }

    /**
     * Legt den Wert der dist-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDist(Integer value) {
        this.dist = value;
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
     * Ruft den Wert der meta-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMeta() {
        return meta;
    }

    /**
     * Legt den Wert der meta-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMeta(Boolean value) {
        this.meta = value;
    }

    /**
     * Ruft den Wert der refinable-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isRefinable() {
        if (refinable == null) {
            return false;
        } else {
            return refinable;
        }
    }

    /**
     * Legt den Wert der refinable-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRefinable(Boolean value) {
        this.refinable = value;
    }

}
