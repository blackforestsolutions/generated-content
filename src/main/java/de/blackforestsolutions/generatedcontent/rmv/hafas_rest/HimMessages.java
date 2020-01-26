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
 *         &lt;element ref="{hafas_rest}Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Common"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "message"
})
@XmlRootElement(name = "HimMessages")
public class HimMessages {

    @XmlElement(name = "Message")
    protected List<Message> message;
    @XmlAttribute(name = "serverVersion")
    protected String serverVersion;
    @XmlAttribute(name = "dialectVersion")
    protected String dialectVersion;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "errorCode")
    protected String errorCode;
    @XmlAttribute(name = "errorText")
    protected String errorText;
    @XmlAttribute(name = "requestId")
    protected String requestId;

    /**
     * Gets the value of the message property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     */
    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Message>();
        }
        return this.message;
    }

    /**
     * Ruft den Wert der serverVersion-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServerVersion() {
        return serverVersion;
    }

    /**
     * Legt den Wert der serverVersion-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServerVersion(String value) {
        this.serverVersion = value;
    }

    /**
     * Ruft den Wert der dialectVersion-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDialectVersion() {
        return dialectVersion;
    }

    /**
     * Legt den Wert der dialectVersion-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDialectVersion(String value) {
        this.dialectVersion = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der errorText-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Legt den Wert der errorText-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Ruft den Wert der requestId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Legt den Wert der requestId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
