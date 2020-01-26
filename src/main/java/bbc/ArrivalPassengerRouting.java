package bbc;

import com.fasterxml.jackson.annotation.*;
import bbc.Route_;

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
public class ArrivalPassengerRouting implements Serializable {

    private final static long serialVersionUID = -6182487337696463553L;
    @JsonProperty("proximity")
    private String proximity;
    @JsonProperty("routes")
    private List<Route_> routes = new ArrayList<Route_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ArrivalPassengerRouting() {
    }

    /**
     * @param routes
     * @param proximity
     */
    public ArrivalPassengerRouting(String proximity, List<Route_> routes) {
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
    public List<Route_> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<Route_> routes) {
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
