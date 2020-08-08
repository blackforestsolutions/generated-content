package de.blackforestsolutions.generatedcontent.hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class TariffDetails {
    private Boolean innerCity;
    private Boolean cityTraffic;
    private Boolean gratis;
    private Boolean greaterArea;
    private List<Long> tariffZones;
    private List<String> counties;
    private List<String> rings;
    private Boolean fareStage;
    private int fareStageName;
    private List<String> tariffNames;

}
