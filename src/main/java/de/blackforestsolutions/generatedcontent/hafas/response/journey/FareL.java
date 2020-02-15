
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prc",
    "isFromPrice",
    "isBookable",
    "isUpsell",
    "targetCtx",
    "addHint",
    "buttonText"
})
public class FareL implements Serializable
{

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 388393274708884811L;

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
