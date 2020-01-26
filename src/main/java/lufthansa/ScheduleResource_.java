package lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Schedule",
        "Meta"
})
public class ScheduleResource_ implements Serializable {

    private final static long serialVersionUID = 1858697765257017523L;
    @JsonProperty("Schedule")
    private List<Schedule> schedule = null;
    @JsonProperty("Meta")
    private Meta meta;

    @JsonProperty("Schedule")
    public List<Schedule> getSchedule() {
        return schedule;
    }

    @JsonProperty("Schedule")
    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    @JsonProperty("Meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("Meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
