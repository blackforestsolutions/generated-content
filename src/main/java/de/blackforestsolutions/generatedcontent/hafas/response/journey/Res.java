
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import com.fasterxml.jackson.annotation.*;
import de.blackforestsolutions.generatedcontent.hafas.response.locations.Match;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "common",
    "outConL",
    "outCtxScrB",
    "outCtxScrF",
    "retCtxScrF",
    "fpB",
    "fpE",
    "bfATS",
    "bfIOSTS",
    "planrtTS",
    "match"
})
public class Res implements Serializable
{

    @JsonProperty("common")
    private de.blackforestsolutions.generatedcontent.hafas.response.journey.Common common;
    @JsonProperty("outConL")
    private List<de.blackforestsolutions.generatedcontent.hafas.response.journey.OutConL> outConL = new ArrayList<de.blackforestsolutions.generatedcontent.hafas.response.journey.OutConL>();
    @JsonProperty("outCtxScrB")
    private String outCtxScrB;
    @JsonProperty("outCtxScrF")
    private String outCtxScrF;
    @JsonProperty("retCtxScrF")
    private String retCtxScrF;
    @JsonProperty("fpB")
    private String fpB;
    @JsonProperty("fpE")
    private String fpE;
    @JsonProperty("bfATS")
    private Integer bfATS;
    @JsonProperty("bfIOSTS")
    private Integer bfIOSTS;
    @JsonProperty("planrtTS")
    private String planrtTS;
    @JsonProperty("match")
    private Match match;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5588335616522291185L;

    @JsonProperty("common")
    public de.blackforestsolutions.generatedcontent.hafas.response.journey.Common getCommon() {
        return common;
    }

    @JsonProperty("common")
    public void setCommon(de.blackforestsolutions.generatedcontent.hafas.response.journey.Common common) {
        this.common = common;
    }

    @JsonProperty("outConL")
    public List<de.blackforestsolutions.generatedcontent.hafas.response.journey.OutConL> getOutConL() {
        return outConL;
    }

    @JsonProperty("outConL")
    public void setOutConL(List<de.blackforestsolutions.generatedcontent.hafas.response.journey.OutConL> outConL) {
        this.outConL = outConL;
    }

    @JsonProperty("outCtxScrB")
    public String getOutCtxScrB() {
        return outCtxScrB;
    }

    @JsonProperty("outCtxScrB")
    public void setOutCtxScrB(String outCtxScrB) {
        this.outCtxScrB = outCtxScrB;
    }

    @JsonProperty("outCtxScrF")
    public String getOutCtxScrF() {
        return outCtxScrF;
    }

    @JsonProperty("outCtxScrF")
    public void setOutCtxScrF(String outCtxScrF) {
        this.outCtxScrF = outCtxScrF;
    }

    @JsonProperty("retCtxScrF")
    public String getRetCtxScrF() {
        return retCtxScrF;
    }

    @JsonProperty("retCtxScrF")
    public void setRetCtxScrF(String retCtxScrF) {
        this.retCtxScrF = retCtxScrF;
    }

    @JsonProperty("fpB")
    public String getFpB() {
        return fpB;
    }

    @JsonProperty("fpB")
    public void setFpB(String fpB) {
        this.fpB = fpB;
    }

    @JsonProperty("fpE")
    public String getFpE() {
        return fpE;
    }

    @JsonProperty("fpE")
    public void setFpE(String fpE) {
        this.fpE = fpE;
    }

    @JsonProperty("bfATS")
    public Integer getBfATS() {
        return bfATS;
    }

    @JsonProperty("bfATS")
    public void setBfATS(Integer bfATS) {
        this.bfATS = bfATS;
    }

    @JsonProperty("bfIOSTS")
    public Integer getBfIOSTS() {
        return bfIOSTS;
    }

    @JsonProperty("bfIOSTS")
    public void setBfIOSTS(Integer bfIOSTS) {
        this.bfIOSTS = bfIOSTS;
    }

    @JsonProperty("planrtTS")
    public String getPlanrtTS() {
        return planrtTS;
    }

    @JsonProperty("planrtTS")
    public void setPlanrtTS(String planrtTS) {
        this.planrtTS = planrtTS;
    }

    @JsonProperty("match")
    public Match getMatch() {
        return match;
    }

    @JsonProperty("match")
    public void setMatch(Match match) {
        this.match = match;
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
