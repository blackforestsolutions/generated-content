//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import de.blackforestsolutions.generatedcontent.vrs.generated.GeoSRSType;
import de.blackforestsolutions.generatedcontent.vrs.generated.ObjectSearchType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Kurzstreckenziele abfragen
 * 
 * <p>Java-Klasse für RequestShortHaulType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestShortHaulType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{}ObjectSearchType"/&gt;
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
@XmlType(name = "RequestShortHaulType", propOrder = {
    "location",
    "options"
})
public class RequestShortHaulType {

    @XmlElement(name = "Location", required = true)
    protected ObjectSearchType location;
    @XmlElement(name = "Options")
    protected RequestShortHaulType.Options options;

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectSearchType }
     *     
     */
    public ObjectSearchType getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectSearchType }
     *     
     */
    public void setLocation(ObjectSearchType value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der options-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestShortHaulType.Options }
     *     
     */
    public RequestShortHaulType.Options getOptions() {
        return options;
    }

    /**
     * Legt den Wert der options-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShortHaulType.Options }
     *     
     */
    public void setOptions(RequestShortHaulType.Options value) {
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
        "output"
    })
    public static class Options {

        @XmlElement(name = "Output")
        protected RequestShortHaulType.Options.Output output;

        /**
         * Ruft den Wert der output-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RequestShortHaulType.Options.Output }
         *     
         */
        public RequestShortHaulType.Options.Output getOutput() {
            return output;
        }

        /**
         * Legt den Wert der output-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestShortHaulType.Options.Output }
         *     
         */
        public void setOutput(RequestShortHaulType.Options.Output value) {
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
