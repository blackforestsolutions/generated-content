//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.GeoSRSType;
import de.blackforestsolutions.generatedcontent.vrs.generated.ObjectSearchType;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Anfrage Reisewunsch.
 *         Start-, Via- und Zielpunkt werden über ObjectSearchType spezifiziert. Daher ist Angabe über ID/Typ oder indirekt über Objektsuche möglich, wobei das System bei Mehrdeutigkeit den besten Treffer automatisch auswählt.
 *         Die Viapunkte beziehen sich immer auf den ersten Verkehrsmittelmodus bzw. auf den ÖV, falls im weiteren Verlauf kein Modus angegeben wird.
 *         Bei multimodalen Suchen sind darüber hinaus Start-, Ziel- oder Viaangaben für die einzelnen Modi möglich (siehe "Mode").
 *       
 * 
 * <p>Java-Klasse für RequestJourneyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestJourneyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *         &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}ObjectSearchType"&gt;
 *                 &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *         &lt;element name="SearchTime"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
 *                 &lt;attribute name="SearchDirection" default="Departure"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Arrival"/&gt;
 *                       &lt;enumeration value="Departure"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="PublicTransport" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence maxOccurs="unbounded"&gt;
 *                             &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="Via" type="{}ObjectSearchType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="SearchInterval" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                                       &lt;element name="NumOfRoutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="NumOfRoutesBefore" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                                         &lt;element name="NumOfRoutesAfter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}PublicTransportProductType"&gt;
 *                                   &lt;enumeration value="LongDistanceTrains"/&gt;
 *                                   &lt;enumeration value="RegionalTrains"/&gt;
 *                                   &lt;enumeration value="SuburbanTrains"/&gt;
 *                                   &lt;enumeration value="Underground"/&gt;
 *                                   &lt;enumeration value="LightRail"/&gt;
 *                                   &lt;enumeration value="Bus"/&gt;
 *                                   &lt;enumeration value="OnDemandServices"/&gt;
 *                                   &lt;enumeration value="CommunityBus"/&gt;
 *                                   &lt;enumeration value="Boat"/&gt;
 *                                   &lt;enumeration value="RailReplacementServices"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SupplementalPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="DisabledAccessRequired" type="{}DisabledAccessPublicTransportType" minOccurs="0"/&gt;
 *                             &lt;element name="RadiusExtensionOrigin" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                             &lt;element name="RadiusExtensionDestination" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                             &lt;element name="ShortRadiusExtension" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="LittleTransfer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="FastRoute" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="TransferSpeed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                             &lt;element name="WalkSpeed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Car" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{}ObjectSearchType"&gt;
 *                                     &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="ConsiderTrafficInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="NoDirections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Bicycle" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{}ObjectSearchType"&gt;
 *                                     &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="Speed" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                                   &lt;minExclusive value="0.0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Walk" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{}ObjectSearchType"&gt;
 *                                     &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
 *                             &lt;element name="Speed" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                                   &lt;minExclusive value="0.0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NoDirections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Options" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Output" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
 *                             &lt;element name="NoShape" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="MonitorID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "RequestJourneyType", propOrder = {
    "origin",
    "via",
    "destination",
    "searchTime",
    "mode",
    "options"
})
public class RequestJourneyType {

    @XmlElement(name = "Origin")
    protected ObjectSearchType origin;
    @XmlElement(name = "Via")
    protected List<RequestJourneyType.Via> via;
    @XmlElement(name = "Destination")
    protected ObjectSearchType destination;
    @XmlElement(name = "SearchTime", required = true)
    protected RequestJourneyType.SearchTime searchTime;
    @XmlElement(name = "Mode")
    protected RequestJourneyType.Mode mode;
    @XmlElement(name = "Options")
    protected RequestJourneyType.Options options;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectSearchType }
     *     
     */
    public ObjectSearchType getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectSearchType }
     *     
     */
    public void setOrigin(ObjectSearchType value) {
        this.origin = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestJourneyType.Via }
     * 
     * 
     */
    public List<RequestJourneyType.Via> getVia() {
        if (via == null) {
            via = new ArrayList<RequestJourneyType.Via>();
        }
        return this.via;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectSearchType }
     *     
     */
    public ObjectSearchType getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectSearchType }
     *     
     */
    public void setDestination(ObjectSearchType value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der searchTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestJourneyType.SearchTime }
     *     
     */
    public RequestJourneyType.SearchTime getSearchTime() {
        return searchTime;
    }

    /**
     * Legt den Wert der searchTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestJourneyType.SearchTime }
     *     
     */
    public void setSearchTime(RequestJourneyType.SearchTime value) {
        this.searchTime = value;
    }

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestJourneyType.Mode }
     *     
     */
    public RequestJourneyType.Mode getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestJourneyType.Mode }
     *     
     */
    public void setMode(RequestJourneyType.Mode value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der options-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestJourneyType.Options }
     *     
     */
    public RequestJourneyType.Options getOptions() {
        return options;
    }

    /**
     * Legt den Wert der options-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestJourneyType.Options }
     *     
     */
    public void setOptions(RequestJourneyType.Options value) {
        this.options = value;
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
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="PublicTransport" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence maxOccurs="unbounded"&gt;
     *                   &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="Via" type="{}ObjectSearchType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="SearchInterval" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *                             &lt;element name="NumOfRoutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="NumOfRoutesBefore" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                               &lt;element name="NumOfRoutesAfter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}PublicTransportProductType"&gt;
     *                         &lt;enumeration value="LongDistanceTrains"/&gt;
     *                         &lt;enumeration value="RegionalTrains"/&gt;
     *                         &lt;enumeration value="SuburbanTrains"/&gt;
     *                         &lt;enumeration value="Underground"/&gt;
     *                         &lt;enumeration value="LightRail"/&gt;
     *                         &lt;enumeration value="Bus"/&gt;
     *                         &lt;enumeration value="OnDemandServices"/&gt;
     *                         &lt;enumeration value="CommunityBus"/&gt;
     *                         &lt;enumeration value="Boat"/&gt;
     *                         &lt;enumeration value="RailReplacementServices"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SupplementalPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="DisabledAccessRequired" type="{}DisabledAccessPublicTransportType" minOccurs="0"/&gt;
     *                   &lt;element name="RadiusExtensionOrigin" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *                   &lt;element name="RadiusExtensionDestination" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *                   &lt;element name="ShortRadiusExtension" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="LittleTransfer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="FastRoute" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="TransferSpeed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *                   &lt;element name="WalkSpeed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Car" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{}ObjectSearchType"&gt;
     *                           &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="ConsiderTrafficInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="NoDirections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Bicycle" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{}ObjectSearchType"&gt;
     *                           &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="Speed" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *                         &lt;minExclusive value="0.0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Walk" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{}ObjectSearchType"&gt;
     *                           &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
     *                   &lt;element name="Speed" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *                         &lt;minExclusive value="0.0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NoDirections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publicTransportOrCarOrBicycle"
    })
    public static class Mode {

        @XmlElements({
            @XmlElement(name = "PublicTransport", type = RequestJourneyType.Mode.PublicTransport.class),
            @XmlElement(name = "Car", type = RequestJourneyType.Mode.Car.class),
            @XmlElement(name = "Bicycle", type = RequestJourneyType.Mode.Bicycle.class),
            @XmlElement(name = "Walk", type = RequestJourneyType.Mode.Walk.class)
        })
        protected List<Object> publicTransportOrCarOrBicycle;

        /**
         * Gets the value of the publicTransportOrCarOrBicycle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publicTransportOrCarOrBicycle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublicTransportOrCarOrBicycle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestJourneyType.Mode.PublicTransport }
         * {@link RequestJourneyType.Mode.Car }
         * {@link RequestJourneyType.Mode.Bicycle }
         * {@link RequestJourneyType.Mode.Walk }
         * 
         * 
         */
        public List<Object> getPublicTransportOrCarOrBicycle() {
            if (publicTransportOrCarOrBicycle == null) {
                publicTransportOrCarOrBicycle = new ArrayList<Object>();
            }
            return this.publicTransportOrCarOrBicycle;
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
         *         &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{}ObjectSearchType"&gt;
         *                 &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="Speed" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
         *               &lt;minExclusive value="0.0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
        @XmlType(name = "", propOrder = {
            "origin",
            "via",
            "destination",
            "speed"
        })
        public static class Bicycle {

            @XmlElement(name = "Origin")
            protected ObjectSearchType origin;
            @XmlElement(name = "Via")
            protected List<RequestJourneyType.Mode.Bicycle.Via> via;
            @XmlElement(name = "Destination")
            protected ObjectSearchType destination;
            @XmlElement(name = "Speed", defaultValue = "15.0")
            protected Float speed;

            /**
             * Ruft den Wert der origin-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ObjectSearchType }
             *     
             */
            public ObjectSearchType getOrigin() {
                return origin;
            }

            /**
             * Legt den Wert der origin-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectSearchType }
             *     
             */
            public void setOrigin(ObjectSearchType value) {
                this.origin = value;
            }

            /**
             * Gets the value of the via property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the via property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RequestJourneyType.Mode.Bicycle.Via }
             * 
             * 
             */
            public List<RequestJourneyType.Mode.Bicycle.Via> getVia() {
                if (via == null) {
                    via = new ArrayList<RequestJourneyType.Mode.Bicycle.Via>();
                }
                return this.via;
            }

            /**
             * Ruft den Wert der destination-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ObjectSearchType }
             *     
             */
            public ObjectSearchType getDestination() {
                return destination;
            }

            /**
             * Legt den Wert der destination-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectSearchType }
             *     
             */
            public void setDestination(ObjectSearchType value) {
                this.destination = value;
            }

            /**
             * Ruft den Wert der speed-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getSpeed() {
                return speed;
            }

            /**
             * Legt den Wert der speed-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setSpeed(Float value) {
                this.speed = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{}ObjectSearchType"&gt;
             *       &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Via
                extends ObjectSearchType
            {

                @XmlAttribute(name = "WaitingTime")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger waitingTime;

                /**
                 * Ruft den Wert der waitingTime-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getWaitingTime() {
                    return waitingTime;
                }

                /**
                 * Legt den Wert der waitingTime-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setWaitingTime(BigInteger value) {
                    this.waitingTime = value;
                }

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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{}ObjectSearchType"&gt;
         *                 &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="ConsiderTrafficInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="NoDirections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "origin",
            "via",
            "destination",
            "considerTrafficInformation",
            "noDirections"
        })
        public static class Car {

            @XmlElement(name = "Origin")
            protected ObjectSearchType origin;
            @XmlElement(name = "Via")
            protected List<RequestJourneyType.Mode.Car.Via> via;
            @XmlElement(name = "Destination")
            protected ObjectSearchType destination;
            @XmlElement(name = "ConsiderTrafficInformation", defaultValue = "0")
            protected Boolean considerTrafficInformation;
            @XmlElement(name = "NoDirections", defaultValue = "0")
            protected Boolean noDirections;

            /**
             * Ruft den Wert der origin-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ObjectSearchType }
             *     
             */
            public ObjectSearchType getOrigin() {
                return origin;
            }

            /**
             * Legt den Wert der origin-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectSearchType }
             *     
             */
            public void setOrigin(ObjectSearchType value) {
                this.origin = value;
            }

            /**
             * Gets the value of the via property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the via property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RequestJourneyType.Mode.Car.Via }
             * 
             * 
             */
            public List<RequestJourneyType.Mode.Car.Via> getVia() {
                if (via == null) {
                    via = new ArrayList<RequestJourneyType.Mode.Car.Via>();
                }
                return this.via;
            }

            /**
             * Ruft den Wert der destination-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ObjectSearchType }
             *     
             */
            public ObjectSearchType getDestination() {
                return destination;
            }

            /**
             * Legt den Wert der destination-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectSearchType }
             *     
             */
            public void setDestination(ObjectSearchType value) {
                this.destination = value;
            }

            /**
             * Ruft den Wert der considerTrafficInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isConsiderTrafficInformation() {
                return considerTrafficInformation;
            }

            /**
             * Legt den Wert der considerTrafficInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setConsiderTrafficInformation(Boolean value) {
                this.considerTrafficInformation = value;
            }

            /**
             * Ruft den Wert der noDirections-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNoDirections() {
                return noDirections;
            }

            /**
             * Legt den Wert der noDirections-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNoDirections(Boolean value) {
                this.noDirections = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{}ObjectSearchType"&gt;
             *       &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Via
                extends ObjectSearchType
            {

                @XmlAttribute(name = "WaitingTime")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger waitingTime;

                /**
                 * Ruft den Wert der waitingTime-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getWaitingTime() {
                    return waitingTime;
                }

                /**
                 * Legt den Wert der waitingTime-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setWaitingTime(BigInteger value) {
                    this.waitingTime = value;
                }

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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence maxOccurs="unbounded"&gt;
         *         &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="Via" type="{}ObjectSearchType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="SearchInterval" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
         *                   &lt;element name="NumOfRoutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="NumOfRoutesBefore" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *                     &lt;element name="NumOfRoutesAfter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}PublicTransportProductType"&gt;
         *               &lt;enumeration value="LongDistanceTrains"/&gt;
         *               &lt;enumeration value="RegionalTrains"/&gt;
         *               &lt;enumeration value="SuburbanTrains"/&gt;
         *               &lt;enumeration value="Underground"/&gt;
         *               &lt;enumeration value="LightRail"/&gt;
         *               &lt;enumeration value="Bus"/&gt;
         *               &lt;enumeration value="OnDemandServices"/&gt;
         *               &lt;enumeration value="CommunityBus"/&gt;
         *               &lt;enumeration value="Boat"/&gt;
         *               &lt;enumeration value="RailReplacementServices"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SupplementalPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="DisabledAccessRequired" type="{}DisabledAccessPublicTransportType" minOccurs="0"/&gt;
         *         &lt;element name="RadiusExtensionOrigin" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
         *         &lt;element name="RadiusExtensionDestination" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
         *         &lt;element name="ShortRadiusExtension" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="LittleTransfer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="FastRoute" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="TransferSpeed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
         *         &lt;element name="WalkSpeed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
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
            "originAndViaAndDestination"
        })
        public static class PublicTransport {

            @XmlElementRefs({
                @XmlElementRef(name = "Origin", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Via", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Destination", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "SearchInterval", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Product", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "SupplementalPayment", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "DisabledAccessRequired", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "RadiusExtensionOrigin", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "RadiusExtensionDestination", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "ShortRadiusExtension", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "LittleTransfer", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "FastRoute", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "TransferSpeed", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "WalkSpeed", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<?>> originAndViaAndDestination;

            /**
             * Gets the value of the originAndViaAndDestination property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the originAndViaAndDestination property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOriginAndViaAndDestination().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
             * {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
             * {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
             * {@link JAXBElement }{@code <}{@link RequestJourneyType.Mode.PublicTransport.SearchInterval }{@code >}
             * {@link JAXBElement }{@code <}{@link PublicTransportProductType }{@code >}
             * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * 
             * 
             */
            public List<JAXBElement<?>> getOriginAndViaAndDestination() {
                if (originAndViaAndDestination == null) {
                    originAndViaAndDestination = new ArrayList<JAXBElement<?>>();
                }
                return this.originAndViaAndDestination;
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
             *       &lt;choice&gt;
             *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
             *         &lt;element name="NumOfRoutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="NumOfRoutesBefore" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
             *           &lt;element name="NumOfRoutesAfter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "size",
                "numOfRoutes",
                "numOfRoutesBefore",
                "numOfRoutesAfter"
            })
            public static class SearchInterval {

                @XmlElement(name = "Size")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger size;
                @XmlElement(name = "NumOfRoutes")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger numOfRoutes;
                @XmlElement(name = "NumOfRoutesBefore")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger numOfRoutesBefore;
                @XmlElement(name = "NumOfRoutesAfter")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger numOfRoutesAfter;

                /**
                 * Ruft den Wert der size-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSize() {
                    return size;
                }

                /**
                 * Legt den Wert der size-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSize(BigInteger value) {
                    this.size = value;
                }

                /**
                 * Ruft den Wert der numOfRoutes-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumOfRoutes() {
                    return numOfRoutes;
                }

                /**
                 * Legt den Wert der numOfRoutes-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumOfRoutes(BigInteger value) {
                    this.numOfRoutes = value;
                }

                /**
                 * Ruft den Wert der numOfRoutesBefore-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumOfRoutesBefore() {
                    return numOfRoutesBefore;
                }

                /**
                 * Legt den Wert der numOfRoutesBefore-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumOfRoutesBefore(BigInteger value) {
                    this.numOfRoutesBefore = value;
                }

                /**
                 * Ruft den Wert der numOfRoutesAfter-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumOfRoutesAfter() {
                    return numOfRoutesAfter;
                }

                /**
                 * Legt den Wert der numOfRoutesAfter-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumOfRoutesAfter(BigInteger value) {
                    this.numOfRoutesAfter = value;
                }

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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Origin" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="Via" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{}ObjectSearchType"&gt;
         *                 &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Destination" type="{}ObjectSearchType" minOccurs="0"/&gt;
         *         &lt;element name="Speed" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
         *               &lt;minExclusive value="0.0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NoDirections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "origin",
            "via",
            "destination",
            "speed",
            "noDirections"
        })
        public static class Walk {

            @XmlElement(name = "Origin")
            protected ObjectSearchType origin;
            @XmlElement(name = "Via")
            protected List<RequestJourneyType.Mode.Walk.Via> via;
            @XmlElement(name = "Destination")
            protected ObjectSearchType destination;
            @XmlElement(name = "Speed", defaultValue = "3.0")
            protected Float speed;
            @XmlElement(name = "NoDirections", defaultValue = "0")
            protected Boolean noDirections;

            /**
             * Ruft den Wert der origin-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ObjectSearchType }
             *     
             */
            public ObjectSearchType getOrigin() {
                return origin;
            }

            /**
             * Legt den Wert der origin-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectSearchType }
             *     
             */
            public void setOrigin(ObjectSearchType value) {
                this.origin = value;
            }

            /**
             * Gets the value of the via property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the via property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RequestJourneyType.Mode.Walk.Via }
             * 
             * 
             */
            public List<RequestJourneyType.Mode.Walk.Via> getVia() {
                if (via == null) {
                    via = new ArrayList<RequestJourneyType.Mode.Walk.Via>();
                }
                return this.via;
            }

            /**
             * Ruft den Wert der destination-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ObjectSearchType }
             *     
             */
            public ObjectSearchType getDestination() {
                return destination;
            }

            /**
             * Legt den Wert der destination-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectSearchType }
             *     
             */
            public void setDestination(ObjectSearchType value) {
                this.destination = value;
            }

            /**
             * Ruft den Wert der speed-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getSpeed() {
                return speed;
            }

            /**
             * Legt den Wert der speed-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setSpeed(Float value) {
                this.speed = value;
            }

            /**
             * Ruft den Wert der noDirections-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNoDirections() {
                return noDirections;
            }

            /**
             * Legt den Wert der noDirections-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNoDirections(Boolean value) {
                this.noDirections = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{}ObjectSearchType"&gt;
             *       &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Via
                extends ObjectSearchType
            {

                @XmlAttribute(name = "WaitingTime")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger waitingTime;

                /**
                 * Ruft den Wert der waitingTime-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getWaitingTime() {
                    return waitingTime;
                }

                /**
                 * Legt den Wert der waitingTime-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setWaitingTime(BigInteger value) {
                    this.waitingTime = value;
                }

            }

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Output" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
     *                   &lt;element name="NoShape" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="MonitorID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
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
    @XmlType(name = "", propOrder = {
        "output"
    })
    public static class Options {

        @XmlElement(name = "Output")
        protected RequestJourneyType.Options.Output output;

        /**
         * Ruft den Wert der output-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RequestJourneyType.Options.Output }
         *     
         */
        public RequestJourneyType.Options.Output getOutput() {
            return output;
        }

        /**
         * Legt den Wert der output-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestJourneyType.Options.Output }
         *     
         */
        public void setOutput(RequestJourneyType.Options.Output value) {
            this.output = value;
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
         *         &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
         *         &lt;element name="NoShape" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="MonitorID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "srsName",
            "noShape",
            "monitorID"
        })
        public static class Output {

            @XmlElement(name = "SRSName")
            @XmlSchemaType(name = "NMTOKEN")
            protected GeoSRSType srsName;
            @XmlElement(name = "NoShape")
            protected Boolean noShape;
            @XmlElement(name = "MonitorID")
            protected Boolean monitorID;

            /**
             * Ruft den Wert der srsName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link GeoSRSType }
             *     
             */
            public GeoSRSType getSRSName() {
                return srsName;
            }

            /**
             * Legt den Wert der srsName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link GeoSRSType }
             *     
             */
            public void setSRSName(GeoSRSType value) {
                this.srsName = value;
            }

            /**
             * Ruft den Wert der noShape-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNoShape() {
                return noShape;
            }

            /**
             * Legt den Wert der noShape-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNoShape(Boolean value) {
                this.noShape = value;
            }

            /**
             * Ruft den Wert der monitorID-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMonitorID() {
                return monitorID;
            }

            /**
             * Legt den Wert der monitorID-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMonitorID(Boolean value) {
                this.monitorID = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
     *       &lt;attribute name="SearchDirection" default="Departure"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Arrival"/&gt;
     *             &lt;enumeration value="Departure"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SearchTime {

        @XmlValue
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "SearchDirection")
        protected String searchDirection;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der searchDirection-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchDirection() {
            if (searchDirection == null) {
                return "Departure";
            } else {
                return searchDirection;
            }
        }

        /**
         * Legt den Wert der searchDirection-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchDirection(String value) {
            this.searchDirection = value;
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
     *     &lt;extension base="{}ObjectSearchType"&gt;
     *       &lt;attribute name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Via
        extends ObjectSearchType
    {

        @XmlAttribute(name = "WaitingTime")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger waitingTime;

        /**
         * Ruft den Wert der waitingTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWaitingTime() {
            return waitingTime;
        }

        /**
         * Legt den Wert der waitingTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWaitingTime(BigInteger value) {
            this.waitingTime = value;
        }

    }

}
