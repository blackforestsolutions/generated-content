package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@Version",
        "Link"
})
public class Meta implements Serializable {

    private static final long serialVersionUID = 6885342715431512961L;
    @JsonProperty("@Version")
    private String version;
    @JsonProperty("Link")
    private List<Link> link = null;

    @JsonProperty("@Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("@Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("Link")
    public List<Link> getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(List<Link> link) {
        this.link = link;
    }

}
