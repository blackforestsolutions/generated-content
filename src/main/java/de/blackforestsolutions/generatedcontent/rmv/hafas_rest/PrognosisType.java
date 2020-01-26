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
 * <p>Java-Klasse für PrognosisType.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PrognosisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROGNOSED"/&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *     &lt;enumeration value="REPORTED"/&gt;
 *     &lt;enumeration value="CORRECTED"/&gt;
 *     &lt;enumeration value="CALCULATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PrognosisType")
@XmlEnum
public enum PrognosisType {


    /**
     * Prognosis was reported from an external provider as a prognosis for the future.
     */
    PROGNOSED,

    /**
     * Prognosis was reported from an external provider from a manual entry.
     */
    MANUAL,

    /**
     * Prognosis was reported from an external provider as a delay for previously passed stations.
     */
    REPORTED,

    /**
     * Prognosis was corrected by the system to adjust the prognoses over the train's journey to ensure
     * proper continuation.
     */
    CORRECTED,

    /**
     * Prognosis was calculated by the system for upcoming stations or to fill gaps for previously
     * passed stations where no delay was reported.
     */
    CALCULATED;

    public static PrognosisType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
