package de.blackforestsolutions.generatedcontent.hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class Penalty {

    private long changeEvent;
    private long extraFare;
    private long walker;
    private long anyHandicap;
    private long toStartStationBy;
    private long timeRange;
    private long forVisitors;
    private String desiredType;
    private String desiredLine;
}
