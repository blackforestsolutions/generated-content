//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.ObjectSearchType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indirekt durch Kombination beliebiger Suchresultate definierte Menge, die zur Einschränkung des Suchraums dient.
 * 
 * <p>Java-Klasse für SearchSetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Union"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Set" type="{}SearchSetType" maxOccurs="unbounded" minOccurs="2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ObjectSearch" type="{}ObjectSearchType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSetType", propOrder = {
    "union",
    "objectSearch"
})
public class SearchSetType {

    @XmlElement(name = "Union")
    protected SearchSetType.Union union;
    @XmlElement(name = "ObjectSearch")
    protected ObjectSearchType objectSearch;

    /**
     * Ruft den Wert der union-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchSetType.Union }
     *     
     */
    public SearchSetType.Union getUnion() {
        return union;
    }

    /**
     * Legt den Wert der union-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSetType.Union }
     *     
     */
    public void setUnion(SearchSetType.Union value) {
        this.union = value;
    }

    /**
     * Ruft den Wert der objectSearch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectSearchType }
     *     
     */
    public ObjectSearchType getObjectSearch() {
        return objectSearch;
    }

    /**
     * Legt den Wert der objectSearch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectSearchType }
     *     
     */
    public void setObjectSearch(ObjectSearchType value) {
        this.objectSearch = value;
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
     *         &lt;element name="Set" type="{}SearchSetType" maxOccurs="unbounded" minOccurs="2"/&gt;
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
        "set"
    })
    public static class Union {

        @XmlElement(name = "Set", required = true)
        protected List<SearchSetType> set;

        /**
         * Gets the value of the set property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the set property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchSetType }
         * 
         * 
         */
        public List<SearchSetType> getSet() {
            if (set == null) {
                set = new ArrayList<SearchSetType>();
            }
            return this.set;
        }

    }

}
