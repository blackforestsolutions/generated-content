//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{hafas_rest}JourneyDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nameS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "journeyDetail"
})
@XmlRootElement(name = "JourneyDetailGroup")
public class JourneyDetailGroup {

    @XmlElement(name = "JourneyDetail")
    protected List<JourneyDetail> journeyDetail;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameS")
    protected String nameS;

    /**
     * Gets the value of the journeyDetail property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyDetail property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyDetail().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyDetail }
     */
    public List<JourneyDetail> getJourneyDetail() {
        if (journeyDetail == null) {
            journeyDetail = new ArrayList<JourneyDetail>();
        }
        return this.journeyDetail;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der nameS-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameS() {
        return nameS;
    }

    /**
     * Legt den Wert der nameS-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameS(String value) {
        this.nameS = value;
    }

}
