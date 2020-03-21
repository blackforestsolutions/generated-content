
package de.blackforestsolutions.generatedcontent.hafas.response.journey;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "icoX",
    "cls",
    "nameS",
    "number",
    "prodCtx",
    "oprX",
    "addName"
})
public class ProdL implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("icoX")
    private Integer icoX;
    @JsonProperty("cls")
    private Integer cls;
    @JsonProperty("nameS")
    private String nameS;
    @JsonProperty("number")
    private String number;
    @JsonProperty("prodCtx")
    private ProdCtx prodCtx;
    @JsonProperty("oprX")
    private Integer oprX;
    @JsonProperty("addName")
    private String addName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1750195123266028261L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("icoX")
    public Integer getIcoX() {
        return icoX;
    }

    @JsonProperty("icoX")
    public void setIcoX(Integer icoX) {
        this.icoX = icoX;
    }

    @JsonProperty("cls")
    public Integer getCls() {
        return cls;
    }

    @JsonProperty("cls")
    public void setCls(Integer cls) {
        this.cls = cls;
    }

    @JsonProperty("nameS")
    public String getNameS() {
        return nameS;
    }

    @JsonProperty("nameS")
    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("prodCtx")
    public ProdCtx getProdCtx() {
        return prodCtx;
    }

    @JsonProperty("prodCtx")
    public void setProdCtx(ProdCtx prodCtx) {
        this.prodCtx = prodCtx;
    }

    @JsonProperty("oprX")
    public Integer getOprX() {
        return oprX;
    }

    @JsonProperty("oprX")
    public void setOprX(Integer oprX) {
        this.oprX = oprX;
    }

    @JsonProperty("addName")
    public String getAddName() {
        return addName;
    }

    @JsonProperty("addName")
    public void setAddName(String addName) {
        this.addName = addName;
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
