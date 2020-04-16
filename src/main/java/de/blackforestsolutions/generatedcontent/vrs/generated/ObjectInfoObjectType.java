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
 * <p>Java-Klasse für ObjectInfoObjectType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectInfoObjectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="City"/&gt;
 *     &lt;enumeration value="Address"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObjectInfoObjectType")
@XmlEnum
public enum ObjectInfoObjectType {

    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    POI("POI"),
    @XmlEnumValue("Stop")
    STOP("Stop");
    private final String value;

    ObjectInfoObjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectInfoObjectType fromValue(String v) {
        for (ObjectInfoObjectType c: ObjectInfoObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
