
package searchCh;

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
    "count",
    "min_duration",
    "rawtime",
    "max_duration",
    "maxtime",
    "connections",
    "url",
    "points",
    "description",
    "request",
    "eof"
})
public class Route implements Serializable {

    @JsonProperty("count")
    private int count;
    @JsonProperty("min_duration")
    private int minDuration;
    @JsonProperty("rawtime")
    private int rawtime;
    @JsonProperty("max_duration")
    private int maxDuration;
    @JsonProperty("maxtime")
    private int maxtime;
    @JsonProperty("connections")
    private List<Connection> connections = null;
    @JsonProperty("url")
    private String url;
    @JsonProperty("points")
    private List<Point> points = null;
    @JsonProperty("description")
    private String description;
    @JsonProperty("request")
    private String request;
    @JsonProperty("eof")
    private int eof;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 3211818289615755824L;

    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(int count) {
        this.count = count;
    }

    @JsonProperty("min_duration")
    public int getMinDuration() {
        return minDuration;
    }

    @JsonProperty("min_duration")
    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    @JsonProperty("rawtime")
    public int getRawtime() {
        return rawtime;
    }

    @JsonProperty("rawtime")
    public void setRawtime(int rawtime) {
        this.rawtime = rawtime;
    }

    @JsonProperty("max_duration")
    public int getMaxDuration() {
        return maxDuration;
    }

    @JsonProperty("max_duration")
    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    @JsonProperty("maxtime")
    public int getMaxtime() {
        return maxtime;
    }

    @JsonProperty("maxtime")
    public void setMaxtime(int maxtime) {
        this.maxtime = maxtime;
    }

    @JsonProperty("connections")
    public List<Connection> getConnections() {
        return connections;
    }

    @JsonProperty("connections")
    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("points")
    public List<Point> getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("request")
    public String getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(String request) {
        this.request = request;
    }

    @JsonProperty("eof")
    public int getEof() {
        return eof;
    }

    @JsonProperty("eof")
    public void setEof(int eof) {
        this.eof = eof;
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
