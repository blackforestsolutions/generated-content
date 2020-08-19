
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
    "type",
    "code",
    "icoX",
    "txtN"
})
public class RemL implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("code")
    private String code;
    @JsonProperty("icoX")
    private Long icoX;
    @JsonProperty("txtN")
    private String txtN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6011977161020542962L;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("icoX")
    public Long getIcoX() {
        return icoX;
    }

    @JsonProperty("icoX")
    public void setIcoX(Long icoX) {
        this.icoX = icoX;
    }

    @JsonProperty("txtN")
    public String getTxtN() {
        return txtN;
    }

    @JsonProperty("txtN")
    public void setTxtN(String txtN) {
        this.txtN = txtN;
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
