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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{hafas_rest}ArrivalBoard" minOccurs="0"/&gt;
 *         &lt;element ref="{hafas_rest}DepartureBoard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "arrivalBoardAndDepartureBoard"
})
@XmlRootElement(name = "MultiBoard")
public class MultiBoard {

    @XmlElements({
            @XmlElement(name = "ArrivalBoard", type = ArrivalBoard.class),
            @XmlElement(name = "DepartureBoard", type = DepartureBoard.class)
    })
    protected List<Object> arrivalBoardAndDepartureBoard;

    /**
     * Gets the value of the arrivalBoardAndDepartureBoard property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalBoardAndDepartureBoard property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalBoardAndDepartureBoard().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrivalBoard }
     * {@link DepartureBoard }
     */
    public List<Object> getArrivalBoardAndDepartureBoard() {
        if (arrivalBoardAndDepartureBoard == null) {
            arrivalBoardAndDepartureBoard = new ArrayList<Object>();
        }
        return this.arrivalBoardAndDepartureBoard;
    }

}
