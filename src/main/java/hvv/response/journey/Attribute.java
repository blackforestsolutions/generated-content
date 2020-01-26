package hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isPlanned",
    "value",
    "types"
})
public class Attribute implements Serializable {

    @JsonProperty("isPlanned")
    private boolean isPlanned;
    @JsonProperty("value")
    private String value;
    @JsonProperty("types")
    private List<String> types = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -6392271345969464359L;

    @JsonProperty("isPlanned")
    public boolean isIsPlanned() {
        return isPlanned;
    }

    @JsonProperty("isPlanned")
    public void setIsPlanned(boolean isPlanned) {
        this.isPlanned = isPlanned;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("types")
    public List<String> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<String> types) {
        this.types = types;
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
