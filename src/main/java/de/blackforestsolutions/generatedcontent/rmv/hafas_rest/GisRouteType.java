//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für GisRouteType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GisRouteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seg" type="{hafas_rest}GisRouteSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="polyline" type="{hafas_rest}Polyline" minOccurs="0"/&gt;
 *         &lt;element name="polylineGroup" type="{hafas_rest}PolylineGroup" minOccurs="0"/&gt;
 *         &lt;element name="altPolyline" type="{hafas_rest}Polyline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altPolylineGroup" type="{hafas_rest}PolylineGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dist" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="durS" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durR" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durST" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durW2C" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="durW2D" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="dirTxt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dirGeo" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GisRouteType", propOrder = {
        "seg",
        "polyline",
        "polylineGroup",
        "altPolyline",
        "altPolylineGroup"
})
public class GisRouteType {

    protected List<GisRouteSegment> seg;
    protected Polyline polyline;
    protected PolylineGroup polylineGroup;
    protected List<Polyline> altPolyline;
    protected List<PolylineGroup> altPolylineGroup;
    @XmlAttribute(name = "dist")
    protected Long dist;
    @XmlAttribute(name = "durS")
    protected Duration durS;
    @XmlAttribute(name = "durR")
    protected Duration durR;
    @XmlAttribute(name = "durST")
    protected Duration durST;
    @XmlAttribute(name = "durW2C")
    protected Duration durW2C;
    @XmlAttribute(name = "durW2D")
    protected Duration durW2D;
    @XmlAttribute(name = "dirTxt")
    protected String dirTxt;
    @XmlAttribute(name = "dirGeo")
    protected Long dirGeo;

    /**
     * Gets the value of the seg property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seg property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeg().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GisRouteSegment }
     */
    public List<GisRouteSegment> getSeg() {
        if (seg == null) {
            seg = new ArrayList<GisRouteSegment>();
        }
        return this.seg;
    }

    /**
     * Ruft den Wert der polyline-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Polyline }
     */
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * Legt den Wert der polyline-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Polyline }
     */
    public void setPolyline(Polyline value) {
        this.polyline = value;
    }

    /**
     * Ruft den Wert der polylineGroup-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PolylineGroup }
     */
    public PolylineGroup getPolylineGroup() {
        return polylineGroup;
    }

    /**
     * Legt den Wert der polylineGroup-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PolylineGroup }
     */
    public void setPolylineGroup(PolylineGroup value) {
        this.polylineGroup = value;
    }

    /**
     * Gets the value of the altPolyline property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altPolyline property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPolyline().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polyline }
     */
    public List<Polyline> getAltPolyline() {
        if (altPolyline == null) {
            altPolyline = new ArrayList<Polyline>();
        }
        return this.altPolyline;
    }

    /**
     * Gets the value of the altPolylineGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altPolylineGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPolylineGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolylineGroup }
     */
    public List<PolylineGroup> getAltPolylineGroup() {
        if (altPolylineGroup == null) {
            altPolylineGroup = new ArrayList<PolylineGroup>();
        }
        return this.altPolylineGroup;
    }

    /**
     * Ruft den Wert der dist-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDist() {
        return dist;
    }

    /**
     * Legt den Wert der dist-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDist(Long value) {
        this.dist = value;
    }

    /**
     * Ruft den Wert der durS-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDurS() {
        return durS;
    }

    /**
     * Legt den Wert der durS-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDurS(Duration value) {
        this.durS = value;
    }

    /**
     * Ruft den Wert der durR-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDurR() {
        return durR;
    }

    /**
     * Legt den Wert der durR-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDurR(Duration value) {
        this.durR = value;
    }

    /**
     * Ruft den Wert der durST-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDurST() {
        return durST;
    }

    /**
     * Legt den Wert der durST-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDurST(Duration value) {
        this.durST = value;
    }

    /**
     * Ruft den Wert der durW2C-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDurW2C() {
        return durW2C;
    }

    /**
     * Legt den Wert der durW2C-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDurW2C(Duration value) {
        this.durW2C = value;
    }

    /**
     * Ruft den Wert der durW2D-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDurW2D() {
        return durW2D;
    }

    /**
     * Legt den Wert der durW2D-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDurW2D(Duration value) {
        this.durW2D = value;
    }

    /**
     * Ruft den Wert der dirTxt-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirTxt() {
        return dirTxt;
    }

    /**
     * Legt den Wert der dirTxt-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirTxt(String value) {
        this.dirTxt = value;
    }

    /**
     * Ruft den Wert der dirGeo-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDirGeo() {
        return dirGeo;
    }

    /**
     * Legt den Wert der dirGeo-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDirGeo(Long value) {
        this.dirGeo = value;
    }

}
