package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Name"
})
public class Terminal_ implements Serializable {

    private final static long serialVersionUID = 9219458815289889589L;
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
