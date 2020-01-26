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
 * <p>Java-Klasse für NoteType.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NoteType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "NoteType")
@XmlEnum
public enum NoteType {


    /**
     * Unknown
     */
    U,

    /**
     * Attribute
     */
    A,

    /**
     * Infotext
     */
    I,

    /**
     * Realtime
     */
    R,

    /**
     * Hint
     */
    H;

    public static NoteType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
