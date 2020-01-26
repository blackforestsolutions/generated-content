//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package rmv.hafas_rest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Direction"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "value"
})
@XmlRootElement(name = "Direction")
public class Direction {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "routeIdxFrom")
    protected Integer routeIdxFrom;
    @XmlAttribute(name = "routeIdxTo")
    protected Integer routeIdxTo;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der routeIdxFrom-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public int getRouteIdxFrom() {
        if (routeIdxFrom == null) {
            return -1;
        } else {
            return routeIdxFrom;
        }
    }

    /**
     * Legt den Wert der routeIdxFrom-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRouteIdxFrom(Integer value) {
        this.routeIdxFrom = value;
    }

    /**
     * Ruft den Wert der routeIdxTo-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public int getRouteIdxTo() {
        if (routeIdxTo == null) {
            return -1;
        } else {
            return routeIdxTo;
        }
    }

    /**
     * Legt den Wert der routeIdxTo-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRouteIdxTo(Integer value) {
        this.routeIdxTo = value;
    }

}
