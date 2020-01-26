//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package rmv.hafas_rest;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
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
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{hafas_rest}Messages" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}Notes" minOccurs="0"/&gt;
 *         &lt;element name="Eco" type="{hafas_rest}EcoType" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}ServiceDays" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}LegList"/&gt;
 *         &lt;element ref="{hafas_rest}TariffResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{hafas_rest}attlist.Trip"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "messages",
        "notes",
        "eco",
        "serviceDays",
        "legList",
        "tariffResult"
})
@XmlRootElement(name = "Trip")
public class Trip {

    @XmlElement(name = "Messages")
    protected Messages messages;
    @XmlElement(name = "Notes")
    protected Notes notes;
    @XmlElement(name = "Eco")
    protected EcoType eco;
    @XmlElement(name = "ServiceDays")
    protected List<ServiceDays> serviceDays;
    @XmlElement(name = "LegList")
    protected LegList legList;
    @XmlElement(name = "TariffResult")
    protected TariffResult tariffResult;
    @XmlAttribute(name = "alternative")
    protected Boolean alternative;
    @XmlAttribute(name = "valid")
    protected Boolean valid;
    @XmlAttribute(name = "idx")
    protected Integer idx;
    @XmlAttribute(name = "tripId")
    protected String tripId;
    @XmlAttribute(name = "ctxRecon")
    protected String ctxRecon;
    @XmlAttribute(name = "duration")
    protected Duration duration;
    @XmlAttribute(name = "return")
    protected Boolean _return;
    @XmlAttribute(name = "ecoUrl")
    protected String ecoUrl;
    @XmlAttribute(name = "checksum")
    protected String checksum;
    @XmlAttribute(name = "transferCount")
    protected Integer transferCount;

    /**
     * Ruft den Wert der messages-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Messages }
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Legt den Wert der messages-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Messages }
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

    /**
     * Ruft den Wert der notes-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Notes }
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Legt den Wert der notes-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Notes }
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Ruft den Wert der eco-Eigenschaft ab.
     *
     * @return possible object is
     * {@link EcoType }
     */
    public EcoType getEco() {
        return eco;
    }

    /**
     * Legt den Wert der eco-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link EcoType }
     */
    public void setEco(EcoType value) {
        this.eco = value;
    }

    /**
     * Gets the value of the serviceDays property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDays property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDays().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDays }
     */
    public List<ServiceDays> getServiceDays() {
        if (serviceDays == null) {
            serviceDays = new ArrayList<ServiceDays>();
        }
        return this.serviceDays;
    }

    /**
     * The element LegList contains all legs of the computed trip.
     *
     * @return possible object is
     * {@link LegList }
     */
    public LegList getLegList() {
        return legList;
    }

    /**
     * Legt den Wert der legList-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LegList }
     */
    public void setLegList(LegList value) {
        this.legList = value;
    }

    /**
     * Ruft den Wert der tariffResult-Eigenschaft ab.
     *
     * @return possible object is
     * {@link TariffResult }
     */
    public TariffResult getTariffResult() {
        return tariffResult;
    }

    /**
     * Legt den Wert der tariffResult-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link TariffResult }
     */
    public void setTariffResult(TariffResult value) {
        this.tariffResult = value;
    }

    /**
     * Ruft den Wert der alternative-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isAlternative() {
        if (alternative == null) {
            return false;
        } else {
            return alternative;
        }
    }

    /**
     * Legt den Wert der alternative-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAlternative(Boolean value) {
        this.alternative = value;
    }

    /**
     * Ruft den Wert der valid-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isValid() {
        if (valid == null) {
            return true;
        } else {
            return valid;
        }
    }

    /**
     * Legt den Wert der valid-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

    /**
     * Ruft den Wert der idx-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * Legt den Wert der idx-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIdx(Integer value) {
        this.idx = value;
    }

    /**
     * Ruft den Wert der tripId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTripId() {
        return tripId;
    }

    /**
     * Legt den Wert der tripId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTripId(String value) {
        this.tripId = value;
    }

    /**
     * Ruft den Wert der ctxRecon-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCtxRecon() {
        return ctxRecon;
    }

    /**
     * Legt den Wert der ctxRecon-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCtxRecon(String value) {
        this.ctxRecon = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isReturn() {
        if (_return == null) {
            return false;
        } else {
            return _return;
        }
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReturn(Boolean value) {
        this._return = value;
    }

    /**
     * Ruft den Wert der ecoUrl-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEcoUrl() {
        return ecoUrl;
    }

    /**
     * Legt den Wert der ecoUrl-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEcoUrl(String value) {
        this.ecoUrl = value;
    }

    /**
     * Ruft den Wert der checksum-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Legt den Wert der checksum-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * Ruft den Wert der transferCount-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Integer }
     */
    public int getTransferCount() {
        if (transferCount == null) {
            return 0;
        } else {
            return transferCount;
        }
    }

    /**
     * Legt den Wert der transferCount-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTransferCount(Integer value) {
        this.transferCount = value;
    }

}
