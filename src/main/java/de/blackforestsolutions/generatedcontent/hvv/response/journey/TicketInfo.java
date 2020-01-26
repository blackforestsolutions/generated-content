package de.blackforestsolutions.generatedcontent.hvv.response.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tariffKindID",
    "tariffKindLabel",
    "tariffLevelID",
    "tariffLevelLabel",
    "tariffGroupID",
    "tariffGroupLabel",
    "basePrice",
    "extraFarePrice",
    "reducedBasePrice",
    "reducedExtraFarePrice",
    "notRecommended",
    "shopLinkRegular",
    "shopLinkExtraFare"
})
public class TicketInfo implements Serializable {

    @JsonProperty("tariffKindID")
    private int tariffKindID;
    @JsonProperty("tariffKindLabel")
    private String tariffKindLabel;
    @JsonProperty("tariffLevelID")
    private int tariffLevelID;
    @JsonProperty("tariffLevelLabel")
    private String tariffLevelLabel;
    @JsonProperty("tariffGroupID")
    private int tariffGroupID;
    @JsonProperty("tariffGroupLabel")
    private String tariffGroupLabel;
    @JsonProperty("basePrice")
    private double basePrice;
    @JsonProperty("extraFarePrice")
    private double extraFarePrice;
    @JsonProperty("reducedBasePrice")
    private double reducedBasePrice;
    @JsonProperty("reducedExtraFarePrice")
    private double reducedExtraFarePrice;
    @JsonProperty("notRecommended")
    private boolean notRecommended;
    @JsonProperty("shopLinkRegular")
    private String shopLinkRegular;
    @JsonProperty("shopLinkExtraFare")
    private String shopLinkExtraFare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 9121472937472018747L;

    @JsonProperty("tariffKindID")
    public int getTariffKindID() {
        return tariffKindID;
    }

    @JsonProperty("tariffKindID")
    public void setTariffKindID(int tariffKindID) {
        this.tariffKindID = tariffKindID;
    }

    @JsonProperty("tariffKindLabel")
    public String getTariffKindLabel() {
        return tariffKindLabel;
    }

    @JsonProperty("tariffKindLabel")
    public void setTariffKindLabel(String tariffKindLabel) {
        this.tariffKindLabel = tariffKindLabel;
    }

    @JsonProperty("tariffLevelID")
    public int getTariffLevelID() {
        return tariffLevelID;
    }

    @JsonProperty("tariffLevelID")
    public void setTariffLevelID(int tariffLevelID) {
        this.tariffLevelID = tariffLevelID;
    }

    @JsonProperty("tariffLevelLabel")
    public String getTariffLevelLabel() {
        return tariffLevelLabel;
    }

    @JsonProperty("tariffLevelLabel")
    public void setTariffLevelLabel(String tariffLevelLabel) {
        this.tariffLevelLabel = tariffLevelLabel;
    }

    @JsonProperty("tariffGroupID")
    public int getTariffGroupID() {
        return tariffGroupID;
    }

    @JsonProperty("tariffGroupID")
    public void setTariffGroupID(int tariffGroupID) {
        this.tariffGroupID = tariffGroupID;
    }

    @JsonProperty("tariffGroupLabel")
    public String getTariffGroupLabel() {
        return tariffGroupLabel;
    }

    @JsonProperty("tariffGroupLabel")
    public void setTariffGroupLabel(String tariffGroupLabel) {
        this.tariffGroupLabel = tariffGroupLabel;
    }

    @JsonProperty("basePrice")
    public double getBasePrice() {
        return basePrice;
    }

    @JsonProperty("basePrice")
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @JsonProperty("extraFarePrice")
    public double getExtraFarePrice() {
        return extraFarePrice;
    }

    @JsonProperty("extraFarePrice")
    public void setExtraFarePrice(double extraFarePrice) {
        this.extraFarePrice = extraFarePrice;
    }

    @JsonProperty("reducedBasePrice")
    public double getReducedBasePrice() {
        return reducedBasePrice;
    }

    @JsonProperty("reducedBasePrice")
    public void setReducedBasePrice(double reducedBasePrice) {
        this.reducedBasePrice = reducedBasePrice;
    }

    @JsonProperty("reducedExtraFarePrice")
    public double getReducedExtraFarePrice() {
        return reducedExtraFarePrice;
    }

    @JsonProperty("reducedExtraFarePrice")
    public void setReducedExtraFarePrice(double reducedExtraFarePrice) {
        this.reducedExtraFarePrice = reducedExtraFarePrice;
    }

    @JsonProperty("notRecommended")
    public boolean isNotRecommended() {
        return notRecommended;
    }

    @JsonProperty("notRecommended")
    public void setNotRecommended(boolean notRecommended) {
        this.notRecommended = notRecommended;
    }

    @JsonProperty("shopLinkRegular")
    public String getShopLinkRegular() {
        return shopLinkRegular;
    }

    @JsonProperty("shopLinkRegular")
    public void setShopLinkRegular(String shopLinkRegular) {
        this.shopLinkRegular = shopLinkRegular;
    }

    @JsonProperty("shopLinkExtraFare")
    public String getShopLinkExtraFare() {
        return shopLinkExtraFare;
    }

    @JsonProperty("shopLinkExtraFare")
    public void setShopLinkExtraFare(String shopLinkExtraFare) {
        this.shopLinkExtraFare = shopLinkExtraFare;
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
