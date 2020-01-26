package lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Effective",
        "Expiration"
})
public class DatePeriod implements Serializable {

    private static final long serialVersionUID = 1230460670173933781L;
    @JsonProperty("Effective")
    private String effective;
    @JsonProperty("Expiration")
    private String expiration;

    @JsonProperty("Effective")
    public String getEffective() {
        return effective;
    }

    @JsonProperty("Effective")
    public void setEffective(String effective) {
        this.effective = effective;
    }

    @JsonProperty("Expiration")
    public String getExpiration() {
        return expiration;
    }

    @JsonProperty("Expiration")
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

}
