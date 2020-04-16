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
 * <p>Java-Klasse für PublicTransportProductType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicTransportProductType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="LongDistanceTrains"/&gt;
 *     &lt;enumeration value="RegionalTrains"/&gt;
 *     &lt;enumeration value="SuburbanTrains"/&gt;
 *     &lt;enumeration value="Underground"/&gt;
 *     &lt;enumeration value="LightRail"/&gt;
 *     &lt;enumeration value="Bus"/&gt;
 *     &lt;enumeration value="OnDemandServices"/&gt;
 *     &lt;enumeration value="CommunityBus"/&gt;
 *     &lt;enumeration value="Boat"/&gt;
 *     &lt;enumeration value="RailReplacementServices"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PublicTransportProductType")
@XmlEnum
public enum PublicTransportProductType {

    @XmlEnumValue("LongDistanceTrains")
    LONG_DISTANCE_TRAINS("LongDistanceTrains"),
    @XmlEnumValue("RegionalTrains")
    REGIONAL_TRAINS("RegionalTrains"),
    @XmlEnumValue("SuburbanTrains")
    SUBURBAN_TRAINS("SuburbanTrains"),
    @XmlEnumValue("Underground")
    UNDERGROUND("Underground"),
    @XmlEnumValue("LightRail")
    LIGHT_RAIL("LightRail"),
    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("OnDemandServices")
    ON_DEMAND_SERVICES("OnDemandServices"),
    @XmlEnumValue("CommunityBus")
    COMMUNITY_BUS("CommunityBus"),
    @XmlEnumValue("Boat")
    BOAT("Boat"),
    @XmlEnumValue("RailReplacementServices")
    RAIL_REPLACEMENT_SERVICES("RailReplacementServices"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    PublicTransportProductType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicTransportProductType fromValue(String v) {
        for (PublicTransportProductType c: PublicTransportProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
