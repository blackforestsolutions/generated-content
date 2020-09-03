package de.blackforestsolutions.generatedcontent.britishairways;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "DepartureStatus",
        "ArrivalStatus",
        "DepartureAirport",
        "ArrivalAirport",
        "DepartureTerminal",
        "ArrivalTerminal",
        "ScheduledDepartureDateTime",
        "ScheduledArrivalDateTime",
        "ReportedDepartureDateTime",
        "ReportedArrivalDateTime",
        "OperatingCarrierCode",
        "AircraftTypeCode",
        "MatchesRequest"
})
public class Sector implements Serializable {

    private final static long serialVersionUID = -576748713817299021L;
    @JsonProperty("DepartureStatus")
    private String departureStatus;
    @JsonProperty("ArrivalStatus")
    private String arrivalStatus;
    @JsonProperty("DepartureAirport")
    private String departureAirport;
    @JsonProperty("ArrivalAirport")
    private String arrivalAirport;
    @JsonProperty("DepartureTerminal")
    private long departureTerminal;
    @JsonProperty("ArrivalTerminal")
    private long arrivalTerminal;
    @JsonProperty("ScheduledDepartureDateTime")
    private String scheduledDepartureDateTime;
    @JsonProperty("ScheduledArrivalDateTime")
    private String scheduledArrivalDateTime;
    @JsonProperty("ReportedDepartureDateTime")
    private String reportedDepartureDateTime;
    @JsonProperty("ReportedArrivalDateTime")
    private String reportedArrivalDateTime;
    @JsonProperty("OperatingCarrierCode")
    private String operatingCarrierCode;
    @JsonProperty("AircraftTypeCode")
    private long aircraftTypeCode;
    @JsonProperty("MatchesRequest")
    private boolean matchesRequest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Sector() {
    }

    /**
     * @param arrivalStatus
     * @param departureTerminal
     * @param aircraftTypeCode
     * @param departureAirport
     * @param departureStatus
     * @param reportedArrivalDateTime
     * @param reportedDepartureDateTime
     * @param operatingCarrierCode
     * @param matchesRequest
     * @param scheduledArrivalDateTime
     * @param arrivalAirport
     * @param arrivalTerminal
     * @param scheduledDepartureDateTime
     */
    public Sector(String departureStatus, String arrivalStatus, String departureAirport, String arrivalAirport, long departureTerminal, long arrivalTerminal, String scheduledDepartureDateTime, String scheduledArrivalDateTime, String reportedDepartureDateTime, String reportedArrivalDateTime, String operatingCarrierCode, long aircraftTypeCode, boolean matchesRequest) {
        super();
        this.departureStatus = departureStatus;
        this.arrivalStatus = arrivalStatus;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTerminal = departureTerminal;
        this.arrivalTerminal = arrivalTerminal;
        this.scheduledDepartureDateTime = scheduledDepartureDateTime;
        this.scheduledArrivalDateTime = scheduledArrivalDateTime;
        this.reportedDepartureDateTime = reportedDepartureDateTime;
        this.reportedArrivalDateTime = reportedArrivalDateTime;
        this.operatingCarrierCode = operatingCarrierCode;
        this.aircraftTypeCode = aircraftTypeCode;
        this.matchesRequest = matchesRequest;
    }

    @JsonProperty("DepartureStatus")
    public String getDepartureStatus() {
        return departureStatus;
    }

    @JsonProperty("DepartureStatus")
    public void setDepartureStatus(String departureStatus) {
        this.departureStatus = departureStatus;
    }

    @JsonProperty("ArrivalStatus")
    public String getArrivalStatus() {
        return arrivalStatus;
    }

    @JsonProperty("ArrivalStatus")
    public void setArrivalStatus(String arrivalStatus) {
        this.arrivalStatus = arrivalStatus;
    }

    @JsonProperty("DepartureAirport")
    public String getDepartureAirport() {
        return departureAirport;
    }

    @JsonProperty("DepartureAirport")
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    @JsonProperty("ArrivalAirport")
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @JsonProperty("ArrivalAirport")
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @JsonProperty("DepartureTerminal")
    public long getDepartureTerminal() {
        return departureTerminal;
    }

    @JsonProperty("DepartureTerminal")
    public void setDepartureTerminal(long departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    @JsonProperty("ArrivalTerminal")
    public long getArrivalTerminal() {
        return arrivalTerminal;
    }

    @JsonProperty("ArrivalTerminal")
    public void setArrivalTerminal(long arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    @JsonProperty("ScheduledDepartureDateTime")
    public String getScheduledDepartureDateTime() {
        return scheduledDepartureDateTime;
    }

    @JsonProperty("ScheduledDepartureDateTime")
    public void setScheduledDepartureDateTime(String scheduledDepartureDateTime) {
        this.scheduledDepartureDateTime = scheduledDepartureDateTime;
    }

    @JsonProperty("ScheduledArrivalDateTime")
    public String getScheduledArrivalDateTime() {
        return scheduledArrivalDateTime;
    }

    @JsonProperty("ScheduledArrivalDateTime")
    public void setScheduledArrivalDateTime(String scheduledArrivalDateTime) {
        this.scheduledArrivalDateTime = scheduledArrivalDateTime;
    }

    @JsonProperty("ReportedDepartureDateTime")
    public String getReportedDepartureDateTime() {
        return reportedDepartureDateTime;
    }

    @JsonProperty("ReportedDepartureDateTime")
    public void setReportedDepartureDateTime(String reportedDepartureDateTime) {
        this.reportedDepartureDateTime = reportedDepartureDateTime;
    }

    @JsonProperty("ReportedArrivalDateTime")
    public String getReportedArrivalDateTime() {
        return reportedArrivalDateTime;
    }

    @JsonProperty("ReportedArrivalDateTime")
    public void setReportedArrivalDateTime(String reportedArrivalDateTime) {
        this.reportedArrivalDateTime = reportedArrivalDateTime;
    }

    @JsonProperty("OperatingCarrierCode")
    public String getOperatingCarrierCode() {
        return operatingCarrierCode;
    }

    @JsonProperty("OperatingCarrierCode")
    public void setOperatingCarrierCode(String operatingCarrierCode) {
        this.operatingCarrierCode = operatingCarrierCode;
    }

    @JsonProperty("AircraftTypeCode")
    public long getAircraftTypeCode() {
        return aircraftTypeCode;
    }

    @JsonProperty("AircraftTypeCode")
    public void setAircraftTypeCode(long aircraftTypeCode) {
        this.aircraftTypeCode = aircraftTypeCode;
    }

    @JsonProperty("MatchesRequest")
    public boolean isMatchesRequest() {
        return matchesRequest;
    }

    @JsonProperty("MatchesRequest")
    public void setMatchesRequest(boolean matchesRequest) {
        this.matchesRequest = matchesRequest;
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
