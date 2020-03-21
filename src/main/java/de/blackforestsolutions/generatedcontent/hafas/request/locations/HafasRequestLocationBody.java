package de.blackforestsolutions.generatedcontent.hafas.request.locations;

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
import de.blackforestsolutions.generatedcontent.hafas.request.Auth;
import de.blackforestsolutions.generatedcontent.hafas.request.Client;
import de.blackforestsolutions.generatedcontent.hafas.request.SvcReqL;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lang",
    "svcReqL",
    "client",
    "ext",
    "ver",
    "auth"
})
public class HafasRequestLocationBody implements Serializable
{

    @JsonProperty("lang")
    private String lang;
    @JsonProperty("svcReqL")
    private List<SvcReqL> svcReqL = null;
    @JsonProperty("client")
    private Client client;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("ver")
    private String ver;
    @JsonProperty("auth")
    private Auth auth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -9115804248039256935L;

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("svcReqL")
    public List<SvcReqL> getSvcReqL() {
        return svcReqL;
    }

    @JsonProperty("svcReqL")
    public void setSvcReqL(List<SvcReqL> svcReqL) {
        this.svcReqL = svcReqL;
    }

    @JsonProperty("client")
    public Client getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(Client client) {
        this.client = client;
    }

    @JsonProperty("ext")
    public String getExt() {
        return ext;
    }

    @JsonProperty("ext")
    public void setExt(String ext) {
        this.ext = ext;
    }

    @JsonProperty("ver")
    public String getVer() {
        return ver;
    }

    @JsonProperty("ver")
    public void setVer(String ver) {
        this.ver = ver;
    }

    @JsonProperty("auth")
    public Auth getAuth() {
        return auth;
    }

    @JsonProperty("auth")
    public void setAuth(Auth auth) {
        this.auth = auth;
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
