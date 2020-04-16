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
 * <p>Java-Klasse für ModeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="PublicTransport"/&gt;
 *     &lt;enumeration value="Car"/&gt;
 *     &lt;enumeration value="Bicycle"/&gt;
 *     &lt;enumeration value="Walk"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModeType")
@XmlEnum
public enum ModeType {

    @XmlEnumValue("PublicTransport")
    PUBLIC_TRANSPORT("PublicTransport"),
    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Bicycle")
    BICYCLE("Bicycle"),
    @XmlEnumValue("Walk")
    WALK("Walk");
    private final String value;

    ModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModeType fromValue(String v) {
        for (ModeType c: ModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
