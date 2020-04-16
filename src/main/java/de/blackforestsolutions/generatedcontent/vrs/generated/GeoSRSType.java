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
 * <p>Java-Klasse für GeoSRSType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoSRSType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="urn:adv:crs:DE_DHDN_3GK2"/&gt;
 *     &lt;enumeration value="urn:adv:crs:DE_DHDN_3GK3"/&gt;
 *     &lt;enumeration value="urn:adv:crs:DE_DHDN_3GK4"/&gt;
 *     &lt;enumeration value="urn:adv:crs:DE_DHDN_3GK5"/&gt;
 *     &lt;enumeration value="urn:ivv:crs:DE_DHDN_3GK2_KM"/&gt;
 *     &lt;enumeration value="urn:ivv:crs:DE_DHDN_3GK3_KM"/&gt;
 *     &lt;enumeration value="urn:ivv:crs:DE_DHDN_3GK4_KM"/&gt;
 *     &lt;enumeration value="urn:ivv:crs:DE_DHDN_3GK5_KM"/&gt;
 *     &lt;enumeration value="urn:adv:crs:WGS84_Lat-Lon"/&gt;
 *     &lt;enumeration value="urn:adv:crs:ETRS89_UTM31"/&gt;
 *     &lt;enumeration value="urn:adv:crs:ETRS89_UTM32"/&gt;
 *     &lt;enumeration value="urn:adv:crs:ETRS89_UTM33"/&gt;
 *     &lt;enumeration value="urn:ivv:crs:ETRS89_UTM31_KM"/&gt;
 *     &lt;enumeration value="urn:ivv:crs:ETRS89_UTM32_KM"/&gt;
 *     &lt;enumeration value="urn:ivv:crs:ETRS89_UTM33_KM"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeoSRSType")
@XmlEnum
public enum GeoSRSType {

    @XmlEnumValue("urn:adv:crs:DE_DHDN_3GK2")
    URN_ADV_CRS_DE_DHDN_3_GK_2("urn:adv:crs:DE_DHDN_3GK2"),
    @XmlEnumValue("urn:adv:crs:DE_DHDN_3GK3")
    URN_ADV_CRS_DE_DHDN_3_GK_3("urn:adv:crs:DE_DHDN_3GK3"),
    @XmlEnumValue("urn:adv:crs:DE_DHDN_3GK4")
    URN_ADV_CRS_DE_DHDN_3_GK_4("urn:adv:crs:DE_DHDN_3GK4"),
    @XmlEnumValue("urn:adv:crs:DE_DHDN_3GK5")
    URN_ADV_CRS_DE_DHDN_3_GK_5("urn:adv:crs:DE_DHDN_3GK5"),
    @XmlEnumValue("urn:ivv:crs:DE_DHDN_3GK2_KM")
    URN_IVV_CRS_DE_DHDN_3_GK_2_KM("urn:ivv:crs:DE_DHDN_3GK2_KM"),
    @XmlEnumValue("urn:ivv:crs:DE_DHDN_3GK3_KM")
    URN_IVV_CRS_DE_DHDN_3_GK_3_KM("urn:ivv:crs:DE_DHDN_3GK3_KM"),
    @XmlEnumValue("urn:ivv:crs:DE_DHDN_3GK4_KM")
    URN_IVV_CRS_DE_DHDN_3_GK_4_KM("urn:ivv:crs:DE_DHDN_3GK4_KM"),
    @XmlEnumValue("urn:ivv:crs:DE_DHDN_3GK5_KM")
    URN_IVV_CRS_DE_DHDN_3_GK_5_KM("urn:ivv:crs:DE_DHDN_3GK5_KM"),
    @XmlEnumValue("urn:adv:crs:WGS84_Lat-Lon")
    URN_ADV_CRS_WGS_84_LAT_LON("urn:adv:crs:WGS84_Lat-Lon"),
    @XmlEnumValue("urn:adv:crs:ETRS89_UTM31")
    URN_ADV_CRS_ETRS_89_UTM_31("urn:adv:crs:ETRS89_UTM31"),
    @XmlEnumValue("urn:adv:crs:ETRS89_UTM32")
    URN_ADV_CRS_ETRS_89_UTM_32("urn:adv:crs:ETRS89_UTM32"),
    @XmlEnumValue("urn:adv:crs:ETRS89_UTM33")
    URN_ADV_CRS_ETRS_89_UTM_33("urn:adv:crs:ETRS89_UTM33"),
    @XmlEnumValue("urn:ivv:crs:ETRS89_UTM31_KM")
    URN_IVV_CRS_ETRS_89_UTM_31_KM("urn:ivv:crs:ETRS89_UTM31_KM"),
    @XmlEnumValue("urn:ivv:crs:ETRS89_UTM32_KM")
    URN_IVV_CRS_ETRS_89_UTM_32_KM("urn:ivv:crs:ETRS89_UTM32_KM"),
    @XmlEnumValue("urn:ivv:crs:ETRS89_UTM33_KM")
    URN_IVV_CRS_ETRS_89_UTM_33_KM("urn:ivv:crs:ETRS89_UTM33_KM"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GeoSRSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeoSRSType fromValue(String v) {
        for (GeoSRSType c: GeoSRSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
