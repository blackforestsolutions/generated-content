//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package rmv.hafas_rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für MessageRegionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MessageRegionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="polyline" type="{hafas_rest}Polyline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="polylineGroup" type="{hafas_rest}PolylineGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="iconCoordinate" type="{hafas_rest}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="messageRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageRegionType", propOrder = {
        "polyline",
        "polylineGroup",
        "iconCoordinate",
        "messageRef"
})
public class MessageRegionType {

    protected List<Polyline> polyline;
    protected List<PolylineGroup> polylineGroup;
    protected Coordinate iconCoordinate;
    @XmlElement(type = Integer.class)
    protected List<Integer> messageRef;

    /**
     * Gets the value of the polyline property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polyline property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolyline().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polyline }
     */
    public List<Polyline> getPolyline() {
        if (polyline == null) {
            polyline = new ArrayList<Polyline>();
        }
        return this.polyline;
    }

    /**
     * Gets the value of the polylineGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polylineGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolylineGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolylineGroup }
     */
    public List<PolylineGroup> getPolylineGroup() {
        if (polylineGroup == null) {
            polylineGroup = new ArrayList<PolylineGroup>();
        }
        return this.polylineGroup;
    }

    /**
     * Ruft den Wert der iconCoordinate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Coordinate }
     */
    public Coordinate getIconCoordinate() {
        return iconCoordinate;
    }

    /**
     * Legt den Wert der iconCoordinate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Coordinate }
     */
    public void setIconCoordinate(Coordinate value) {
        this.iconCoordinate = value;
    }

    /**
     * Gets the value of the messageRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getMessageRef() {
        if (messageRef == null) {
            messageRef = new ArrayList<Integer>();
        }
        return this.messageRef;
    }

}
