package hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tariffName",
    "tariffRegions",
    "extraFareType",
    "ticketInfos",
    "ticketRemarks"
})
public class TariffInfo implements Serializable {

    @JsonProperty("tariffName")
    private String tariffName;
    @JsonProperty("tariffRegions")
    private List<TariffRegion> tariffRegions = new ArrayList<TariffRegion>();
    @JsonProperty("extraFareType")
    private String extraFareType;
    @JsonProperty("ticketInfos")
    private List<TicketInfo> ticketInfos = new ArrayList<TicketInfo>();
    @JsonProperty("ticketRemarks")
    private String ticketRemarks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -426929628952315552L;

    @JsonProperty("tariffName")
    public String getTariffName() {
        return tariffName;
    }

    @JsonProperty("tariffName")
    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    @JsonProperty("tariffRegions")
    public List<TariffRegion> getTariffRegions() {
        return tariffRegions;
    }

    @JsonProperty("tariffRegions")
    public void setTariffRegions(List<TariffRegion> tariffRegions) {
        this.tariffRegions = tariffRegions;
    }

    @JsonProperty("extraFareType")
    public String getExtraFareType() {
        return extraFareType;
    }

    @JsonProperty("extraFareType")
    public void setExtraFareType(String extraFareType) {
        this.extraFareType = extraFareType;
    }

    @JsonProperty("ticketInfos")
    public List<TicketInfo> getTicketInfos() {
        return ticketInfos;
    }

    @JsonProperty("ticketInfos")
    public void setTicketInfos(List<TicketInfo> ticketInfos) {
        this.ticketInfos = ticketInfos;
    }

    @JsonProperty("ticketRemarks")
    public String getTicketRemarks() {
        return ticketRemarks;
    }

    @JsonProperty("ticketRemarks")
    public void setTicketRemarks(String ticketRemarks) {
        this.ticketRemarks = ticketRemarks;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
