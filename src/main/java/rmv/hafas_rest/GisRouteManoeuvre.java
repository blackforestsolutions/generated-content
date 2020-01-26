//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.28 um 05:09:31 PM CET 
//


package rmv.hafas_rest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GisRouteManoeuvre.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GisRouteManoeuvre"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *     &lt;enumeration value="RI"/&gt;
 *     &lt;enumeration value="KL"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="HL"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="KHL"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="KSL"/&gt;
 *     &lt;enumeration value="KSR"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="UT"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="SIR"/&gt;
 *     &lt;enumeration value="LR"/&gt;
 *     &lt;enumeration value="EF"/&gt;
 *     &lt;enumeration value="LF"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="COF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "GisRouteManoeuvre")
@XmlEnum
public enum GisRouteManoeuvre {


    /**
     * Not set
     */
    NO,

    /**
     * From
     */
    FR,

    /**
     * To
     */
    TO,

    /**
     * On
     */
    ON,

    /**
     * Left
     */
    LE,

    /**
     * Right
     */
    RI,

    /**
     * Keep left
     */
    KL,

    /**
     * Keep right
     */
    KR,

    /**
     * Half left
     */
    HL,

    /**
     * Half right
     */
    HR,

    /**
     * Keep half left
     */
    KHL,

    /**
     * Keep half right
     */
    KHR,

    /**
     * Sharp left
     */
    SL,

    /**
     * Sharp right
     */
    SR,

    /**
     * Keep sharp left
     */
    KSL,

    /**
     * Keep sharp right
     */
    KSR,

    /**
     * Straight
     */
    ST,

    /**
     * U-Turn
     */
    UT,

    /**
     * Enter
     */
    EN,

    /**
     * Leave
     */
    LV,

    /**
     * Enter roundabout
     */
    ER,

    /**
     * Stay in roundabout
     */
    SIR,

    /**
     * Leave roundabout
     */
    LR,

    /**
     * Enter ferry
     */
    EF,

    /**
     * Leave ferry
     */
    LF,

    /**
     * Change highway
     */
    CH,

    /**
     * Check-in ferry
     */
    CIF,

    /**
     * Check-out ferry
     */
    COF;

    public static GisRouteManoeuvre fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
