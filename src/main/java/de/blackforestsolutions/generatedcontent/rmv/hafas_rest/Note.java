//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

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
 *       &lt;attGroup ref="{hafas_rest}attlist.Note"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "value"
})
@XmlRootElement(name = "Note")
public class Note {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "type")
    protected NoteType type;
    @XmlAttribute(name = "priority")
    protected Integer priority;
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
     * Ruft den Wert der key-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     *
     * @return possible object is
     * {@link NoteType }
     */
    public NoteType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link NoteType }
     */
    public void setType(NoteType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der routeIdxFrom-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
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
    public Integer getRouteIdxTo() {
        return routeIdxTo;
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
