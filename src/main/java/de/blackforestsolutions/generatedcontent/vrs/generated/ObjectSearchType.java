//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Suche bzw. Identifikation eines Objektes über ID mit Typ, Namen oder Geometrie. Eine Koordinate ohne ID- und Type-Attribut und ohne sonstige Angaben identifiziert einen Punkt.
 * 
 * <p>Java-Klasse für ObjectSearchType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObjectSearchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="String"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;minLength value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Coordinate" type="{}GeoPointType"/&gt;
 *           &lt;element name="CoordinateRectangle" type="{}GeoRectangleType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Classes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="City" type="{}SearchClassCityType" minOccurs="0"/&gt;
 *                   &lt;element name="Stop" type="{}SearchClassStopType" minOccurs="0"/&gt;
 *                   &lt;element name="Street" type="{}SearchClassStreetType" minOccurs="0"/&gt;
 *                   &lt;element name="Address" type="{}SearchClassAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="CategoryPOI" type="{}SearchClassCategoryPOIType" minOccurs="0"/&gt;
 *                   &lt;element name="POI" type="{}SearchClassPOIType" minOccurs="0"/&gt;
 *                   &lt;element name="TariffRegion" type="{}SearchClassTariffRegionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Set" type="{}SearchSetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" type="{}IDType" /&gt;
 *       &lt;attribute name="Type" type="{}ObjectTypeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectSearchType", propOrder = {
    "string",
    "coordinate",
    "coordinateRectangle",
    "classes",
    "set"
})
@XmlSeeAlso({
    RequestJourneyType.Via.class,
    RequestJourneyType.Mode.Car.Via.class,
    RequestJourneyType.Mode.Bicycle.Via.class,
    RequestJourneyType.Mode.Walk.Via.class
})
public class ObjectSearchType {

    @XmlElement(name = "String")
    protected String string;
    @XmlElement(name = "Coordinate")
    protected GeoPointType coordinate;
    @XmlElement(name = "CoordinateRectangle")
    protected GeoRectangleType coordinateRectangle;
    @XmlElement(name = "Classes")
    protected ObjectSearchType.Classes classes;
    @XmlElement(name = "Set")
    protected SearchSetType set;
    @XmlAttribute(name = "ID")
    protected BigInteger id;
    @XmlAttribute(name = "Type")
    protected ObjectTypeType type;

    /**
     * Ruft den Wert der string-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Legt den Wert der string-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Ruft den Wert der coordinate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoPointType }
     *     
     */
    public GeoPointType getCoordinate() {
        return coordinate;
    }

    /**
     * Legt den Wert der coordinate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPointType }
     *     
     */
    public void setCoordinate(GeoPointType value) {
        this.coordinate = value;
    }

    /**
     * Ruft den Wert der coordinateRectangle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoRectangleType }
     *     
     */
    public GeoRectangleType getCoordinateRectangle() {
        return coordinateRectangle;
    }

    /**
     * Legt den Wert der coordinateRectangle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoRectangleType }
     *     
     */
    public void setCoordinateRectangle(GeoRectangleType value) {
        this.coordinateRectangle = value;
    }

    /**
     * Ruft den Wert der classes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectSearchType.Classes }
     *     
     */
    public ObjectSearchType.Classes getClasses() {
        return classes;
    }

    /**
     * Legt den Wert der classes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectSearchType.Classes }
     *     
     */
    public void setClasses(ObjectSearchType.Classes value) {
        this.classes = value;
    }

    /**
     * Ruft den Wert der set-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchSetType }
     *     
     */
    public SearchSetType getSet() {
        return set;
    }

    /**
     * Legt den Wert der set-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSetType }
     *     
     */
    public void setSet(SearchSetType value) {
        this.set = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectTypeType }
     *     
     */
    public ObjectTypeType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectTypeType }
     *     
     */
    public void setType(ObjectTypeType value) {
        this.type = value;
    }


    /**
     * Wahl der Objektklassen für die Suche
     * 
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="City" type="{}SearchClassCityType" minOccurs="0"/&gt;
     *         &lt;element name="Stop" type="{}SearchClassStopType" minOccurs="0"/&gt;
     *         &lt;element name="Street" type="{}SearchClassStreetType" minOccurs="0"/&gt;
     *         &lt;element name="Address" type="{}SearchClassAddressType" minOccurs="0"/&gt;
     *         &lt;element name="CategoryPOI" type="{}SearchClassCategoryPOIType" minOccurs="0"/&gt;
     *         &lt;element name="POI" type="{}SearchClassPOIType" minOccurs="0"/&gt;
     *         &lt;element name="TariffRegion" type="{}SearchClassTariffRegionType" minOccurs="0"/&gt;
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
        "city",
        "stop",
        "street",
        "address",
        "categoryPOI",
        "poi",
        "tariffRegion"
    })
    public static class Classes {

        @XmlElement(name = "City")
        protected SearchClassCityType city;
        @XmlElement(name = "Stop")
        protected SearchClassStopType stop;
        @XmlElement(name = "Street")
        protected SearchClassStreetType street;
        @XmlElement(name = "Address")
        protected SearchClassAddressType address;
        @XmlElement(name = "CategoryPOI")
        protected SearchClassCategoryPOIType categoryPOI;
        @XmlElement(name = "POI")
        protected SearchClassPOIType poi;
        @XmlElement(name = "TariffRegion")
        protected SearchClassTariffRegionType tariffRegion;

        /**
         * Ruft den Wert der city-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SearchClassCityType }
         *     
         */
        public SearchClassCityType getCity() {
            return city;
        }

        /**
         * Legt den Wert der city-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchClassCityType }
         *     
         */
        public void setCity(SearchClassCityType value) {
            this.city = value;
        }

        /**
         * Ruft den Wert der stop-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SearchClassStopType }
         *     
         */
        public SearchClassStopType getStop() {
            return stop;
        }

        /**
         * Legt den Wert der stop-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchClassStopType }
         *     
         */
        public void setStop(SearchClassStopType value) {
            this.stop = value;
        }

        /**
         * Ruft den Wert der street-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SearchClassStreetType }
         *     
         */
        public SearchClassStreetType getStreet() {
            return street;
        }

        /**
         * Legt den Wert der street-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchClassStreetType }
         *     
         */
        public void setStreet(SearchClassStreetType value) {
            this.street = value;
        }

        /**
         * Ruft den Wert der address-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SearchClassAddressType }
         *     
         */
        public SearchClassAddressType getAddress() {
            return address;
        }

        /**
         * Legt den Wert der address-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchClassAddressType }
         *     
         */
        public void setAddress(SearchClassAddressType value) {
            this.address = value;
        }

        /**
         * Ruft den Wert der categoryPOI-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SearchClassCategoryPOIType }
         *     
         */
        public SearchClassCategoryPOIType getCategoryPOI() {
            return categoryPOI;
        }

        /**
         * Legt den Wert der categoryPOI-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchClassCategoryPOIType }
         *     
         */
        public void setCategoryPOI(SearchClassCategoryPOIType value) {
            this.categoryPOI = value;
        }

        /**
         * Ruft den Wert der poi-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SearchClassPOIType }
         *     
         */
        public SearchClassPOIType getPOI() {
            return poi;
        }

        /**
         * Legt den Wert der poi-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchClassPOIType }
         *     
         */
        public void setPOI(SearchClassPOIType value) {
            this.poi = value;
        }

        /**
         * Ruft den Wert der tariffRegion-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SearchClassTariffRegionType }
         *     
         */
        public SearchClassTariffRegionType getTariffRegion() {
            return tariffRegion;
        }

        /**
         * Legt den Wert der tariffRegion-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchClassTariffRegionType }
         *     
         */
        public void setTariffRegion(SearchClassTariffRegionType value) {
            this.tariffRegion = value;
        }

    }

}
