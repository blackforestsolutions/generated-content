package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ScheduleResource"
})
public class ScheduleResource implements Serializable {

    private static final long serialVersionUID = -343976295328329173L;
    @JsonProperty("ScheduleResource")
    private ScheduleResource_ scheduleResource;

    @JsonProperty("ScheduleResource")
    public ScheduleResource_ getScheduleResource() {
        return scheduleResource;
    }

    @JsonProperty("ScheduleResource")
    public void setScheduleResource(ScheduleResource_ scheduleResource) {
        this.scheduleResource = scheduleResource;
    }

}
