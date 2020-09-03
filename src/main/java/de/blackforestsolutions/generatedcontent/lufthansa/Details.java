package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Stops",
        "DaysOfOperation",
        "DatePeriod"
})
public class Details implements Serializable {

    private static final long serialVersionUID = 4956721171598898976L;
    @JsonProperty("Stops")
    private Stops stops;
    @JsonProperty("DaysOfOperation")
    private Long daysOfOperation;
    @JsonProperty("DatePeriod")
    private DatePeriod datePeriod;

    @JsonProperty("Stops")
    public Stops getStops() {
        return stops;
    }

    @JsonProperty("Stops")
    public void setStops(Stops stops) {
        this.stops = stops;
    }

    @JsonProperty("DaysOfOperation")
    public Long getDaysOfOperation() {
        return daysOfOperation;
    }

    @JsonProperty("DaysOfOperation")
    public void setDaysOfOperation(Long daysOfOperation) {
        this.daysOfOperation = daysOfOperation;
    }

    @JsonProperty("DatePeriod")
    public DatePeriod getDatePeriod() {
        return datePeriod;
    }

    @JsonProperty("DatePeriod")
    public void setDatePeriod(DatePeriod datePeriod) {
        this.datePeriod = datePeriod;
    }

}
