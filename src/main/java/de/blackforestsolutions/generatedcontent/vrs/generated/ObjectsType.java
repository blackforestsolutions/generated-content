//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.*;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Kollektion der definierten Objekte in ASS.
 * 
 * <p>Java-Klasse für ObjectsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObjectsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="City" type="{}CityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="District" type="{}DistrictType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Stop" type="{}StopType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{}StreetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CategoryPOI" type="{}CategoryPOIType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="POI" type="{}POIType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Line" type="{}LineType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectsType", propOrder = {
    "city",
    "district",
    "stop",
    "street",
    "address",
    "categoryPOI",
    "poi",
    "line"
})
public class ObjectsType {

    @XmlElement(name = "City")
    protected List<CityType> city;
    @XmlElement(name = "District")
    protected List<DistrictType> district;
    @XmlElement(name = "Stop")
    protected List<StopType> stop;
    @XmlElement(name = "Street")
    protected List<StreetType> street;
    @XmlElement(name = "Address")
    protected List<AddressType> address;
    @XmlElement(name = "CategoryPOI")
    protected List<CategoryPOIType> categoryPOI;
    @XmlElement(name = "POI")
    protected List<POIType> poi;
    @XmlElement(name = "Line")
    protected List<LineType> line;

    /**
     * Gets the value of the city property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the city property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CityType }
     * 
     * 
     */
    public List<CityType> getCity() {
        if (city == null) {
            city = new ArrayList<CityType>();
        }
        return this.city;
    }

    /**
     * Gets the value of the district property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the district property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistrictType }
     * 
     * 
     */
    public List<DistrictType> getDistrict() {
        if (district == null) {
            district = new ArrayList<DistrictType>();
        }
        return this.district;
    }

    /**
     * Gets the value of the stop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopType }
     * 
     * 
     */
    public List<StopType> getStop() {
        if (stop == null) {
            stop = new ArrayList<StopType>();
        }
        return this.stop;
    }

    /**
     * Gets the value of the street property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the street property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreetType }
     * 
     * 
     */
    public List<StreetType> getStreet() {
        if (street == null) {
            street = new ArrayList<StreetType>();
        }
        return this.street;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the categoryPOI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryPOI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryPOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryPOIType }
     * 
     * 
     */
    public List<CategoryPOIType> getCategoryPOI() {
        if (categoryPOI == null) {
            categoryPOI = new ArrayList<CategoryPOIType>();
        }
        return this.categoryPOI;
    }

    /**
     * Gets the value of the poi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POIType }
     * 
     * 
     */
    public List<POIType> getPOI() {
        if (poi == null) {
            poi = new ArrayList<POIType>();
        }
        return this.poi;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineType }
     * 
     * 
     */
    public List<LineType> getLine() {
        if (line == null) {
            line = new ArrayList<LineType>();
        }
        return this.line;
    }

}
