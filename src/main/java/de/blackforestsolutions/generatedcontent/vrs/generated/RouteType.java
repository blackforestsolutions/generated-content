//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.*;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Route
 * 
 * <p>Java-Klasse für RouteType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Legs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="LegPublicTransport" type="{}LegPublicTransportType"/&gt;
 *                     &lt;element name="LegCar" type="{}LegCarType"/&gt;
 *                     &lt;element name="LegBicycle" type="{}LegBicycleType"/&gt;
 *                     &lt;element name="LegWalk" type="{}LegWalkType"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteType", propOrder = {
    "legs",
    "infoMessages"
})
public class RouteType {

    @XmlElement(name = "Legs", required = true)
    protected RouteType.Legs legs;
    @XmlElement(name = "InfoMessages")
    protected InfoMessagesType infoMessages;

    /**
     * Ruft den Wert der legs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteType.Legs }
     *     
     */
    public RouteType.Legs getLegs() {
        return legs;
    }

    /**
     * Legt den Wert der legs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteType.Legs }
     *     
     */
    public void setLegs(RouteType.Legs value) {
        this.legs = value;
    }

    /**
     * Ruft den Wert der infoMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessagesType }
     *     
     */
    public InfoMessagesType getInfoMessages() {
        return infoMessages;
    }

    /**
     * Legt den Wert der infoMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessagesType }
     *     
     */
    public void setInfoMessages(InfoMessagesType value) {
        this.infoMessages = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;choice&gt;
     *           &lt;element name="LegPublicTransport" type="{}LegPublicTransportType"/&gt;
     *           &lt;element name="LegCar" type="{}LegCarType"/&gt;
     *           &lt;element name="LegBicycle" type="{}LegBicycleType"/&gt;
     *           &lt;element name="LegWalk" type="{}LegWalkType"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legPublicTransportOrLegCarOrLegBicycle"
    })
    public static class Legs {

        @XmlElements({
            @XmlElement(name = "LegPublicTransport", type = LegPublicTransportType.class),
            @XmlElement(name = "LegCar", type = LegCarType.class),
            @XmlElement(name = "LegBicycle", type = LegBicycleType.class),
            @XmlElement(name = "LegWalk", type = LegWalkType.class)
        })
        protected List<Object> legPublicTransportOrLegCarOrLegBicycle;

        /**
         * Gets the value of the legPublicTransportOrLegCarOrLegBicycle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legPublicTransportOrLegCarOrLegBicycle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegPublicTransportOrLegCarOrLegBicycle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LegPublicTransportType }
         * {@link LegCarType }
         * {@link LegBicycleType }
         * {@link LegWalkType }
         * 
         * 
         */
        public List<Object> getLegPublicTransportOrLegCarOrLegBicycle() {
            if (legPublicTransportOrLegCarOrLegBicycle == null) {
                legPublicTransportOrLegCarOrLegBicycle = new ArrayList<Object>();
            }
            return this.legPublicTransportOrLegCarOrLegBicycle;
        }

    }

}
