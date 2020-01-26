//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für GisRouteSegment complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GisRouteSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{hafas_rest}Notes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rType" type="{hafas_rest}GisRouteRoadType" /&gt;
 *       &lt;attribute name="rNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="man" type="{hafas_rest}GisRouteManoeuvre" /&gt;
 *       &lt;attribute name="manTx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dirTx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ori" type="{hafas_rest}GisRouteOrientation" /&gt;
 *       &lt;attribute name="polyS" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="polyE" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="dist" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GisRouteSegment", propOrder = {
        "notes"
})
public class GisRouteSegment {

    @XmlElement(name = "Notes")
    protected Notes notes;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "rType")
    protected GisRouteRoadType rType;
    @XmlAttribute(name = "rNum")
    protected String rNum;
    @XmlAttribute(name = "man")
    protected GisRouteManoeuvre man;
    @XmlAttribute(name = "manTx")
    protected String manTx;
    @XmlAttribute(name = "dirTx")
    protected String dirTx;
    @XmlAttribute(name = "ori")
    protected GisRouteOrientation ori;
    @XmlAttribute(name = "polyS")
    protected Integer polyS;
    @XmlAttribute(name = "polyE")
    protected Integer polyE;
    @XmlAttribute(name = "dist")
    protected Integer dist;

    /**
     * Ruft den Wert der notes-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Notes }
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Legt den Wert der notes-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Notes }
     */
    public void setNotes(Notes value) {
        this.notes = value;
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
     * Ruft den Wert der rType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link GisRouteRoadType }
     */
    public GisRouteRoadType getRType() {
        return rType;
    }

    /**
     * Legt den Wert der rType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link GisRouteRoadType }
     */
    public void setRType(GisRouteRoadType value) {
        this.rType = value;
    }

    /**
     * Ruft den Wert der rNum-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRNum() {
        return rNum;
    }

    /**
     * Legt den Wert der rNum-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRNum(String value) {
        this.rNum = value;
    }

    /**
     * Ruft den Wert der man-Eigenschaft ab.
     *
     * @return possible object is
     * {@link GisRouteManoeuvre }
     */
    public GisRouteManoeuvre getMan() {
        return man;
    }

    /**
     * Legt den Wert der man-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link GisRouteManoeuvre }
     */
    public void setMan(GisRouteManoeuvre value) {
        this.man = value;
    }

    /**
     * Ruft den Wert der manTx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getManTx() {
        return manTx;
    }

    /**
     * Legt den Wert der manTx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setManTx(String value) {
        this.manTx = value;
    }

    /**
     * Ruft den Wert der dirTx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirTx() {
        return dirTx;
    }

    /**
     * Legt den Wert der dirTx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirTx(String value) {
        this.dirTx = value;
    }

    /**
     * Ruft den Wert der ori-Eigenschaft ab.
     *
     * @return possible object is
     * {@link GisRouteOrientation }
     */
    public GisRouteOrientation getOri() {
        return ori;
    }

    /**
     * Legt den Wert der ori-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link GisRouteOrientation }
     */
    public void setOri(GisRouteOrientation value) {
        this.ori = value;
    }

    /**
     * Ruft den Wert der polyS-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getPolyS() {
        return polyS;
    }

    /**
     * Legt den Wert der polyS-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPolyS(Integer value) {
        this.polyS = value;
    }

    /**
     * Ruft den Wert der polyE-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getPolyE() {
        return polyE;
    }

    /**
     * Legt den Wert der polyE-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPolyE(Integer value) {
        this.polyE = value;
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

}
