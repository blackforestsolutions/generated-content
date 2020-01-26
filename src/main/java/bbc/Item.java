package bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "count",
        "is_selected"
})
public class Item implements Serializable {

    private final static long serialVersionUID = -3909157649575633231L;
    @JsonProperty("value")
    private int value;
    @JsonProperty("count")
    private int count;
    @JsonProperty("is_selected")
    private boolean isSelected;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Item() {
    }

    /**
     * @param count
     * @param isSelected
     * @param value
     */
    public Item(int value, int count, boolean isSelected) {
        super();
        this.value = value;
        this.count = count;
        this.isSelected = isSelected;
    }

    @JsonProperty("value")
    public int getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(int count) {
        this.count = count;
    }

    @JsonProperty("is_selected")
    public boolean isIsSelected() {
        return isSelected;
    }

    @JsonProperty("is_selected")
    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
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
