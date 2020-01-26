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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für PolylineGroup complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PolylineGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="polylineDesc" type="{hafas_rest}PolylineDesc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="coordType" type="{hafas_rest}CoordType" default="WGS84" /&gt;
 *       &lt;attribute name="layerName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolylineGroup", propOrder = {
        "polylineDesc"
})
public class PolylineGroup {

    protected List<PolylineDesc> polylineDesc;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "coordType")
    protected CoordType coordType;
    @XmlAttribute(name = "layerName")
    protected String layerName;

    /**
     * Gets the value of the polylineDesc property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polylineDesc property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolylineDesc().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolylineDesc }
     */
    public List<PolylineDesc> getPolylineDesc() {
        if (polylineDesc == null) {
            polylineDesc = new ArrayList<PolylineDesc>();
        }
        return this.polylineDesc;
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
     * Ruft den Wert der coordType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CoordType }
     */
    public CoordType getCoordType() {
        if (coordType == null) {
            return CoordType.WGS_84;
        } else {
            return coordType;
        }
    }

    /**
     * Legt den Wert der coordType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CoordType }
     */
    public void setCoordType(CoordType value) {
        this.coordType = value;
    }

    /**
     * Ruft den Wert der layerName-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLayerName() {
        return layerName;
    }

    /**
     * Legt den Wert der layerName-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLayerName(String value) {
        this.layerName = value;
    }

}
