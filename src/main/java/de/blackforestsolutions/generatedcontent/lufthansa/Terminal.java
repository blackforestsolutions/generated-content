package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Name"
})
public class Terminal implements Serializable {

    private static final long serialVersionUID = -4106768367671573080L;
    @JsonProperty("Name")
    private Long name;

    @JsonProperty("Name")
    public Long getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(Long name) {
        this.name = name;
    }

}
