package lufthansa;

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
    private Integer name;

    @JsonProperty("Name")
    public Integer getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(Integer name) {
        this.name = name;
    }

}
