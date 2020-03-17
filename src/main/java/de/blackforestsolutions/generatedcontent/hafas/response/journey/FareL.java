
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "prc",
    "isFromPrice",
    "isBookable",
    "isUpsell",
    "targetCtx",
    "addHint",
    "buttonText",
    "shpCtx",
    "ticketL"
})
public class FareL implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("prc")
    private Integer prc;
    @JsonProperty("isFromPrice")
    private Boolean isFromPrice;
    @JsonProperty("isBookable")
    private Boolean isBookable;
    @JsonProperty("isUpsell")
    private Boolean isUpsell;
    @JsonProperty("targetCtx")
    private String targetCtx;
    @JsonProperty("addHint")
    private String addHint;
    @JsonProperty("buttonText")
    private String buttonText;
    @JsonProperty("shpCtx")
    private String shpCtx;
    @JsonProperty("ticketL")
    private List<TicketL> ticketL = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 388393274708884811L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("prc")
    public Integer getPrc() {
        return prc;
    }

    @JsonProperty("prc")
    public void setPrc(Integer prc) {
        this.prc = prc;
    }

    @JsonProperty("isFromPrice")
    public Boolean getIsFromPrice() {
        return isFromPrice;
    }

    @JsonProperty("isFromPrice")
    public void setIsFromPrice(Boolean isFromPrice) {
        this.isFromPrice = isFromPrice;
    }

    @JsonProperty("isBookable")
    public Boolean getIsBookable() {
        return isBookable;
    }

    @JsonProperty("isBookable")
    public void setIsBookable(Boolean isBookable) {
        this.isBookable = isBookable;
    }

    @JsonProperty("isUpsell")
    public Boolean getIsUpsell() {
        return isUpsell;
    }

    @JsonProperty("isUpsell")
    public void setIsUpsell(Boolean isUpsell) {
        this.isUpsell = isUpsell;
    }

    @JsonProperty("targetCtx")
    public String getTargetCtx() {
        return targetCtx;
    }

    @JsonProperty("targetCtx")
    public void setTargetCtx(String targetCtx) {
        this.targetCtx = targetCtx;
    }

    @JsonProperty("addHint")
    public String getAddHint() {
        return addHint;
    }

    @JsonProperty("addHint")
    public void setAddHint(String addHint) {
        this.addHint = addHint;
    }

    @JsonProperty("buttonText")
    public String getButtonText() {
        return buttonText;
    }

    @JsonProperty("buttonText")
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    @JsonProperty("shpCtx")
    public String getShpCtx() {
        return shpCtx;
    }

    @JsonProperty("shpCtx")
    public void setShpCtx(String shpCtx) {
        this.shpCtx = shpCtx;
    }

    @JsonProperty("ticketL")
    public List<TicketL> getTicketL() {
        return ticketL;
    }

    @JsonProperty("ticketL")
    public void setTicketL(List<TicketL> ticketL) {
        this.ticketL = ticketL;
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
