//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Routensegmente
 * 
 * <p>Java-Klasse für SegmentsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SegmentPublicTransport" type="{}SegmentPublicTransportType"/&gt;
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
@XmlType(name = "SegmentsType", propOrder = {
    "segmentPublicTransportOrSegmentCarOrSegmentBicycle"
})
@XmlSeeAlso({
    LegBicycleType.Segments.class,
    LegCarType.Segments.class,
    LegPublicTransportType.Segments.class,
    LegWalkType.Segments.class
})
public class SegmentsType {

    @XmlElements({
        @XmlElement(name = "SegmentPublicTransport", type = SegmentPublicTransportType.class),
        @XmlElement(name = "SegmentCar", type = SegmentCarType.class),
        @XmlElement(name = "SegmentBicycle", type = SegmentBicycleType.class),
        @XmlElement(name = "SegmentWalk", type = SegmentWalkType.class)
    })
    protected List<Object> segmentPublicTransportOrSegmentCarOrSegmentBicycle;

    /**
     * Gets the value of the segmentPublicTransportOrSegmentCarOrSegmentBicycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentPublicTransportOrSegmentCarOrSegmentBicycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentPublicTransportOrSegmentCarOrSegmentBicycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentPublicTransportType }
     * {@link SegmentCarType }
     * {@link SegmentBicycleType }
     * {@link SegmentWalkType }
     * 
     * 
     */
    public List<Object> getSegmentPublicTransportOrSegmentCarOrSegmentBicycle() {
        if (segmentPublicTransportOrSegmentCarOrSegmentBicycle == null) {
            segmentPublicTransportOrSegmentCarOrSegmentBicycle = new ArrayList<Object>();
        }
        return this.segmentPublicTransportOrSegmentCarOrSegmentBicycle;
    }

}
