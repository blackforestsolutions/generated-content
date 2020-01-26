//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package de.blackforestsolutions.generatedcontent.rmv.hafas_rest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GisRouteOrientation.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GisRouteOrientation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "GisRouteOrientation")
@XmlEnum
public enum GisRouteOrientation {


    /**
     * Unknown
     */
    U,

    /**
     * North
     */
    N,

    /**
     * South
     */
    S,

    /**
     * East
     */
    E,

    /**
     * West
     */
    W,

    /**
     * Northeast
     */
    NE,

    /**
     * Southeast
     */
    SE,

    /**
     * Northwest
     */
    NW,

    /**
     * Southwest
     */
    SW;

    public static GisRouteOrientation fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
