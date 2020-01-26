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
 * Describes a polyline structure
 *
 * <p>Java-Klasse für PolylineDesc complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PolylineDesc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crd" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="delta" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="dim" type="{http://www.w3.org/2001/XMLSchema}int" default="2" /&gt;
 *       &lt;attribute name="crdEncYX" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="crdEncZ" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="crdEncS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolylineDesc", propOrder = {
        "crd"
})
public class PolylineDesc {

    @XmlElement(type = Double.class)
    protected List<Double> crd;
    @XmlAttribute(name = "delta", required = true)
    protected boolean delta;
    @XmlAttribute(name = "dim")
    protected Integer dim;
    @XmlAttribute(name = "crdEncYX")
    protected String crdEncYX;
    @XmlAttribute(name = "crdEncZ")
    protected String crdEncZ;
    @XmlAttribute(name = "crdEncS")
    protected String crdEncS;

    /**
     * Gets the value of the crd property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crd property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrd().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     */
    public List<Double> getCrd() {
        if (crd == null) {
            crd = new ArrayList<Double>();
        }
        return this.crd;
    }

    /**
     * Ruft den Wert der delta-Eigenschaft ab.
     */
    public boolean isDelta() {
        return delta;
    }

    /**
     * Legt den Wert der delta-Eigenschaft fest.
     */
    public void setDelta(boolean value) {
        this.delta = value;
    }

    /**
     * Ruft den Wert der dim-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public int getDim() {
        if (dim == null) {
            return 2;
        } else {
            return dim;
        }
    }

    /**
     * Legt den Wert der dim-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDim(Integer value) {
        this.dim = value;
    }

    /**
     * Ruft den Wert der crdEncYX-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCrdEncYX() {
        return crdEncYX;
    }

    /**
     * Legt den Wert der crdEncYX-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCrdEncYX(String value) {
        this.crdEncYX = value;
    }

    /**
     * Ruft den Wert der crdEncZ-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCrdEncZ() {
        return crdEncZ;
    }

    /**
     * Legt den Wert der crdEncZ-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCrdEncZ(String value) {
        this.crdEncZ = value;
    }

    /**
     * Ruft den Wert der crdEncS-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCrdEncS() {
        return crdEncS;
    }

    /**
     * Legt den Wert der crdEncS-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCrdEncS(String value) {
        this.crdEncS = value;
    }

}
