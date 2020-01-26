package de.blackforestsolutions.generatedcontent.lufthansa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@Href",
        "@Rel"
})
public class Link implements Serializable {

    private static final long serialVersionUID = 6839600105833747204L;
    @JsonProperty("@Href")
    private String href;
    @JsonProperty("@Rel")
    private String rel;

    @JsonProperty("@Href")
    public String getHref() {
        return href;
    }

    @JsonProperty("@Href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("@Rel")
    public String getRel() {
        return rel;
    }

    @JsonProperty("@Rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

}
