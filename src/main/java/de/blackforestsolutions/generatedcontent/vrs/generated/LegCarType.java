//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.InfoMessagesType;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IV-Teilabschnitt einer Route
 * 
 * <p>Java-Klasse für LegCarType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LegCarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Segments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{}SegmentsType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="SegmentCar" type="{}SegmentCarType"/&gt;
 *                     &lt;element name="SegmentBicycle" type="{}SegmentBicycleType"/&gt;
 *                     &lt;element name="SegmentWalk" type="{}SegmentWalkType"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Costs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="InfoMessages" type="{}InfoMessagesType" minOccurs="0"/&gt;
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
@XmlType(name = "LegCarType", propOrder = {
    "segments",
    "costs",
    "infoMessages"
})
public class LegCarType {

    @XmlElement(name = "Segments", required = true)
    protected LegCarType.Segments segments;
    @XmlElement(name = "Costs")
    protected LegCarType.Costs costs;
    @XmlElement(name = "InfoMessages")
    protected InfoMessagesType infoMessages;

    /**
     * Ruft den Wert der segments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegCarType.Segments }
     *     
     */
    public LegCarType.Segments getSegments() {
        return segments;
    }

    /**
     * Legt den Wert der segments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegCarType.Segments }
     *     
     */
    public void setSegments(LegCarType.Segments value) {
        this.segments = value;
    }

    /**
     * Ruft den Wert der costs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegCarType.Costs }
     *     
     */
    public LegCarType.Costs getCosts() {
        return costs;
    }

    /**
     * Legt den Wert der costs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegCarType.Costs }
     *     
     */
    public void setCosts(LegCarType.Costs value) {
        this.costs = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    @XmlType(name = "", propOrder = {
        "amount",
        "infoMessages"
    })
    public static class Costs {

        @XmlElement(name = "Amount", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "InfoMessages")
        protected InfoMessagesType infoMessages;

        /**
         * Ruft den Wert der amount-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Legt den Wert der amount-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
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

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{}SegmentsType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;choice&gt;
     *           &lt;element name="SegmentCar" type="{}SegmentCarType"/&gt;
     *           &lt;element name="SegmentBicycle" type="{}SegmentBicycleType"/&gt;
     *           &lt;element name="SegmentWalk" type="{}SegmentWalkType"/&gt;
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
    @XmlType(name = "")
    public static class Segments
        extends SegmentsType
    {


    }

}
