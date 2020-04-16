//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//


package de.blackforestsolutions.generatedcontent.vrs.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObjectTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Coordinate"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="Address"/&gt;
 *     &lt;enumeration value="City"/&gt;
 *     &lt;enumeration value="District"/&gt;
 *     &lt;enumeration value="Street"/&gt;
 *     &lt;enumeration value="Line"/&gt;
 *     &lt;enumeration value="CategoryPOI"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObjectTypeType")
@XmlEnum
public enum ObjectTypeType {


    /**
     * Sonderfall: Freie Koordinate; Ist kein Objekt !
     * 
     */
    @XmlEnumValue("Coordinate")
    COORDINATE("Coordinate"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("District")
    DISTRICT("District"),
    @XmlEnumValue("Street")
    STREET("Street"),
    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("CategoryPOI")
    CATEGORY_POI("CategoryPOI"),
    POI("POI");
    private final String value;

    ObjectTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectTypeType fromValue(String v) {
        for (ObjectTypeType c: ObjectTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
