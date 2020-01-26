
package de.blackforestsolutions.generatedcontent.searchCh;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "departure",
    "tripid",
    "number",
    "stopid",
    "x",
    "y",
    "name",
    "sbb_name",
    "type",
    "line",
    "terminal",
    "fgcolor",
    "bgcolor",
    "*G",
    "*L",
    "operator",
    "stops",
    "runningtime",
    "exit",
    "track",
    "type_name",
    "arrival",
    "waittime",
    "normal_time",
    "isaddress"
})
public class Leg implements Serializable {

    @JsonProperty("departure")
    private String departure;
    @JsonProperty("tripid")
    private String tripid;
    @JsonProperty("number")
    private String number;
    @JsonProperty("stopid")
    private String stopid;
    @JsonProperty("x")
    private int x;
    @JsonProperty("y")
    private int y;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sbb_name")
    private String sbbName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("line")
    private String line;
    @JsonProperty("terminal")
    private String terminal;
    @JsonProperty("fgcolor")
    private String fgcolor;
    @JsonProperty("bgcolor")
    private String bgcolor;
    @JsonProperty("*G")
    private String g;
    @JsonProperty("*L")
    private String l;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("stops")
    private List<Stop> stops = null;
    @JsonProperty("runningtime")
    private int runningtime;
    @JsonProperty("exit")
    private Exit exit;
    @JsonProperty("track")
    private String track;
    @JsonProperty("type_name")
    private String typeName;
    @JsonProperty("arrival")
    private String arrival;
    @JsonProperty("waittime")
    private int waittime;
    @JsonProperty("normal_time")
    private int normalTime;
    @JsonProperty("isaddress")
    private boolean isaddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 854116973236240035L;

    @JsonProperty("departure")
    public String getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @JsonProperty("tripid")
    public String getTripid() {
        return tripid;
    }

    @JsonProperty("tripid")
    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("stopid")
    public String getStopid() {
        return stopid;
    }

    @JsonProperty("stopid")
    public void setStopid(String stopid) {
        this.stopid = stopid;
    }

    @JsonProperty("x")
    public int getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(int x) {
        this.x = x;
    }

    @JsonProperty("y")
    public int getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(int y) {
        this.y = y;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("sbb_name")
    public String getSbbName() {
        return sbbName;
    }

    @JsonProperty("sbb_name")
    public void setSbbName(String sbbName) {
        this.sbbName = sbbName;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("line")
    public String getLine() {
        return line;
    }

    @JsonProperty("line")
    public void setLine(String line) {
        this.line = line;
    }

    @JsonProperty("terminal")
    public String getTerminal() {
        return terminal;
    }

    @JsonProperty("terminal")
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @JsonProperty("fgcolor")
    public String getFgcolor() {
        return fgcolor;
    }

    @JsonProperty("fgcolor")
    public void setFgcolor(String fgcolor) {
        this.fgcolor = fgcolor;
    }

    @JsonProperty("bgcolor")
    public String getBgcolor() {
        return bgcolor;
    }

    @JsonProperty("bgcolor")
    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    @JsonProperty("*G")
    public String getG() {
        return g;
    }

    @JsonProperty("*G")
    public void setG(String g) {
        this.g = g;
    }

    @JsonProperty("*L")
    public String getL() {
        return l;
    }

    @JsonProperty("*L")
    public void setL(String l) {
        this.l = l;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("stops")
    public List<Stop> getStops() {
        return stops;
    }

    @JsonProperty("stops")
    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    @JsonProperty("runningtime")
    public int getRunningtime() {
        return runningtime;
    }

    @JsonProperty("runningtime")
    public void setRunningtime(int runningtime) {
        this.runningtime = runningtime;
    }

    @JsonProperty("exit")
    public Exit getExit() {
        return exit;
    }

    @JsonProperty("exit")
    public void setExit(Exit exit) {
        this.exit = exit;
    }

    @JsonProperty("track")
    public String getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(String track) {
        this.track = track;
    }

    @JsonProperty("type_name")
    public String getTypeName() {
        return typeName;
    }

    @JsonProperty("type_name")
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @JsonProperty("arrival")
    public String getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("waittime")
    public int getWaittime() {
        return waittime;
    }

    @JsonProperty("waittime")
    public void setWaittime(int waittime) {
        this.waittime = waittime;
    }

    @JsonProperty("normal_time")
    public int getNormalTime() {
        return normalTime;
    }

    @JsonProperty("normal_time")
    public void setNormalTime(int normalTime) {
        this.normalTime = normalTime;
    }

    @JsonProperty("isaddress")
    public boolean isIsaddress() {
        return isaddress;
    }

    @JsonProperty("isaddress")
    public void setIsaddress(boolean isaddress) {
        this.isaddress = isaddress;
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
