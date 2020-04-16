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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Informationen Objekten abfragen
 * 
 * <p>Java-Klasse für RequestObjectInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestObjectInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectSearch" type="{}ObjectSearchType"/&gt;
 *         &lt;element name="Options" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NumOfObjects" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="Output" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
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
@XmlType(name = "RequestObjectInfoType", propOrder = {
    "objectSearch",
    "options"
})
public class RequestObjectInfoType {

    @XmlElement(name = "ObjectSearch", required = true)
    protected ObjectSearchType objectSearch;
    @XmlElement(name = "Options")
    protected RequestObjectInfoType.Options options;

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
     * Ruft den Wert der options-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestObjectInfoType.Options }
     *     
     */
    public RequestObjectInfoType.Options getOptions() {
        return options;
    }

    /**
     * Legt den Wert der options-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestObjectInfoType.Options }
     *     
     */
    public void setOptions(RequestObjectInfoType.Options value) {
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
     *       &lt;sequence&gt;
     *         &lt;element name="NumOfObjects" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="Output" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SRSName" type="{}GeoSRSType" minOccurs="0"/&gt;
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
        "numOfObjects",
        "output"
    })
    public static class Options {

        @XmlElement(name = "NumOfObjects")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger numOfObjects;
        @XmlElement(name = "Output")
        protected RequestObjectInfoType.Options.Output output;

        /**
         * Ruft den Wert der numOfObjects-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumOfObjects() {
            return numOfObjects;
        }

        /**
         * Legt den Wert der numOfObjects-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumOfObjects(BigInteger value) {
            this.numOfObjects = value;
        }

        /**
         * Ruft den Wert der output-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RequestObjectInfoType.Options.Output }
         *     
         */
        public RequestObjectInfoType.Options.Output getOutput() {
            return output;
        }

        /**
         * Legt den Wert der output-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestObjectInfoType.Options.Output }
         *     
         */
        public void setOutput(RequestObjectInfoType.Options.Output value) {
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
            "srsName"
        })
        public static class Output {

            @XmlElement(name = "SRSName")
            @XmlSchemaType(name = "NMTOKEN")
            protected GeoSRSType srsName;

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

        }

    }

}
