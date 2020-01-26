package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "proximity",
        "routes"
})
public class DeparturePassengerRouting implements Serializable {

    private final static long serialVersionUID = -8296725116550222482L;
    @JsonProperty("proximity")
    private String proximity;
    @JsonProperty("routes")
    private List<Route> routes = new ArrayList<Route>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public DeparturePassengerRouting() {
    }

    /**
     * @param routes
     * @param proximity
     */
    public DeparturePassengerRouting(String proximity, List<Route> routes) {
        super();
        this.proximity = proximity;
        this.routes = routes;
    }

    @JsonProperty("proximity")
    public String getProximity() {
        return proximity;
    }

    @JsonProperty("proximity")
    public void setProximity(String proximity) {
        this.proximity = proximity;
    }

    @JsonProperty("routes")
    public List<Route> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
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
