//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.DirectionsType;
import de.blackforestsolutions.generatedcontent.vrs.generated.GeoLineType;
import de.blackforestsolutions.generatedcontent.vrs.generated.InfoMessagesType;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Fußweg-Routensegment
 * 
 * <p>Java-Klasse für SegmentWalkType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentWalkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{}OriginType"/&gt;
 *         &lt;element name="Destination" type="{}DestinationType"/&gt;
 *         &lt;element name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Directions" type="{}DirectionsType" minOccurs="0"/&gt;
 *         &lt;element name="Shape" type="{}GeoLineType" minOccurs="0"/&gt;
 *         &lt;element name="InfoMessages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}InfoMessagesType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Code"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;enumeration value="10001"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentWalkType", propOrder = {
    "origin",
    "destination",
    "travelTime",
    "distance",
    "directions",
    "shape",
    "infoMessages"
})
public class SegmentWalkType {

    @XmlElement(name = "Origin", required = true)
    protected OriginType origin;
    @XmlElement(name = "Destination", required = true)
    protected DestinationType destination;
    @XmlElement(name = "TravelTime", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger travelTime;
    @XmlElement(name = "Distance", required = true)
    protected BigDecimal distance;
    @XmlElement(name = "Directions")
    protected DirectionsType directions;
    @XmlElement(name = "Shape")
    protected GeoLineType shape;
    @XmlElement(name = "InfoMessages")
    protected SegmentWalkType.InfoMessages infoMessages;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OriginType }
     *     
     */
    public OriginType getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginType }
     *     
     */
    public void setOrigin(OriginType value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setDestination(DestinationType value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der travelTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelTime() {
        return travelTime;
    }

    /**
     * Legt den Wert der travelTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelTime(BigInteger value) {
        this.travelTime = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der directions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionsType }
     *     
     */
    public DirectionsType getDirections() {
        return directions;
    }

    /**
     * Legt den Wert der directions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionsType }
     *     
     */
    public void setDirections(DirectionsType value) {
        this.directions = value;
    }

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoLineType }
     *     
     */
    public GeoLineType getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLineType }
     *     
     */
    public void setShape(GeoLineType value) {
        this.shape = value;
    }

    /**
     * Ruft den Wert der infoMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentWalkType.InfoMessages }
     *     
     */
    public SegmentWalkType.InfoMessages getInfoMessages() {
        return infoMessages;
    }

    /**
     * Legt den Wert der infoMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentWalkType.InfoMessages }
     *     
     */
    public void setInfoMessages(SegmentWalkType.InfoMessages value) {
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
     *     &lt;extension base="{}InfoMessagesType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Code"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;enumeration value="10001"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code"
    })
    public static class InfoMessages
        extends InfoMessagesType
    {

        @XmlElement(name = "Code", required = true)
        protected BigInteger code;

        /**
         * Ruft den Wert der code-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCode() {
            return code;
        }

        /**
         * Legt den Wert der code-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCode(BigInteger value) {
            this.code = value;
        }

    }

}
