package de.blackforestsolutions.generatedcontent.hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class Penalty {

    private int changeEvent;
    private int extraFare;
    private int walker;
    private int anyHandicap;
    private int toStartStationBy;
    private int timeRange;
    private int forVisitors;
    private String desiredType;
    private String desiredLine;
}
