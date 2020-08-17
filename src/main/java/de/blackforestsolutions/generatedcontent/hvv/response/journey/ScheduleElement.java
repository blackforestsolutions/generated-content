package de.blackforestsolutions.generatedcontent.hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cancelled",
    "from",
    "to",
    "line",
    "paths",
    "intermediateStops",
    "serviceId",
    "attributes"
})
public class ScheduleElement implements Serializable {

    @JsonProperty("cancelled")
    private boolean cancelled;
    @JsonProperty("from")
    private From from;
    @JsonProperty("to")
    private From to;
    @JsonProperty("line")
    private Line line;
    @JsonProperty("paths")
    private List<Path> paths = new ArrayList<Path>();
    @JsonProperty("intermediateStops")
    private List<From> intermediateStops = new ArrayList<From>();
    @JsonProperty("serviceId")
    private long serviceId;
    @JsonProperty("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -245386752074537349L;

    @JsonProperty("cancelled")
    public boolean isCancelled() {
        return cancelled;
    }

    @JsonProperty("cancelled")
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    @JsonProperty("to")
    public From getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(From to) {
        this.to = to;
    }

    @JsonProperty("line")
    public Line getLine() {
        return line;
    }

    @JsonProperty("line")
    public void setLine(Line line) {
        this.line = line;
    }

    @JsonProperty("paths")
    public List<Path> getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    @JsonProperty("intermediateStops")
    public List<From> getIntermediateStops() {
        return intermediateStops;
    }

    @JsonProperty("intermediateStops")
    public void setIntermediateStops(List<From> intermediateStops) {
        this.intermediateStops = intermediateStops;
    }

    @JsonProperty("serviceId")
    public long getServiceId() {
        return serviceId;
    }

    @JsonProperty("serviceId")
    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
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
