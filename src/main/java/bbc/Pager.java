package bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "page",
        "pages",
        "total",
        "limit"
})
public class Pager implements Serializable {

    private final static long serialVersionUID = 7221817185848457290L;
    @JsonProperty("page")
    private int page;
    @JsonProperty("pages")
    private int pages;
    @JsonProperty("total")
    private int total;
    @JsonProperty("limit")
    private int limit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Pager() {
    }

    /**
     * @param total
     * @param pages
     * @param limit
     * @param page
     */
    public Pager(int page, int pages, int total, int limit) {
        super();
        this.page = page;
        this.pages = pages;
        this.total = total;
        this.limit = limit;
    }

    @JsonProperty("page")
    public int getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(int page) {
        this.page = page;
    }

    @JsonProperty("pages")
    public int getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(int pages) {
        this.pages = pages;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }

    @JsonProperty("limit")
    public int getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(int limit) {
        this.limit = limit;
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
