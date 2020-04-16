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
import javax.xml.bind.annotation.XmlType;


/**
 * Antwort Reisewunsch. Route und Kollektion aller referenzierten Objekte.
 * 
 * <p>Java-Klasse für ResponseJourneyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseJourneyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Routes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Route" type="{}RouteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Objects" type="{}ResponseJourneyObjectType"/&gt;
 *         &lt;element name="ResponseStatus" type="{}SystemMessageResponseJourneyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseJourneyType", propOrder = {
    "routes",
    "objects",
    "responseStatus"
})
public class ResponseJourneyType {

    @XmlElement(name = "Routes", required = true)
    protected ResponseJourneyType.Routes routes;
    @XmlElement(name = "Objects", required = true)
    protected ResponseJourneyObjectType objects;
    @XmlElement(name = "ResponseStatus")
    protected SystemMessageResponseJourneyType responseStatus;

    /**
     * Ruft den Wert der routes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseJourneyType.Routes }
     *     
     */
    public ResponseJourneyType.Routes getRoutes() {
        return routes;
    }

    /**
     * Legt den Wert der routes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseJourneyType.Routes }
     *     
     */
    public void setRoutes(ResponseJourneyType.Routes value) {
        this.routes = value;
    }

    /**
     * Ruft den Wert der objects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseJourneyObjectType }
     *     
     */
    public ResponseJourneyObjectType getObjects() {
        return objects;
    }

    /**
     * Legt den Wert der objects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseJourneyObjectType }
     *     
     */
    public void setObjects(ResponseJourneyObjectType value) {
        this.objects = value;
    }

    /**
     * Ruft den Wert der responseStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SystemMessageResponseJourneyType }
     *     
     */
    public SystemMessageResponseJourneyType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Legt den Wert der responseStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMessageResponseJourneyType }
     *     
     */
    public void setResponseStatus(SystemMessageResponseJourneyType value) {
        this.responseStatus = value;
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
     *         &lt;element name="Route" type="{}RouteType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "route"
    })
    public static class Routes {

        @XmlElement(name = "Route")
        protected List<RouteType> route;

        /**
         * Gets the value of the route property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the route property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteType }
         * 
         * 
         */
        public List<RouteType> getRoute() {
            if (route == null) {
                route = new ArrayList<RouteType>();
            }
            return this.route;
        }

    }

}
