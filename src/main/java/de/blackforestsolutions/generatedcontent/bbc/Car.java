package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "model",
        "make",
        "color",
        "color_hexa",
        "comfort",
        "comfort_nb_star",
        "number_of_seat",
        "category",
        "picture",
        "picture_moderation_status"
})
public class Car implements Serializable {

    private final static long serialVersionUID = -3421085957634926780L;
    @JsonProperty("id")
    private String id;
    @JsonProperty("model")
    private String model;
    @JsonProperty("make")
    private String make;
    @JsonProperty("color")
    private String color;
    @JsonProperty("color_hexa")
    private String colorHexa;
    @JsonProperty("comfort")
    private String comfort;
    @JsonProperty("comfort_nb_star")
    private int comfortNbStar;
    @JsonProperty("number_of_seat")
    private int numberOfSeat;
    @JsonProperty("category")
    private String category;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("picture_moderation_status")
    private String pictureModerationStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Car() {
    }

    /**
     * @param comfortNbStar
     * @param color
     * @param colorHexa
     * @param numberOfSeat
     * @param model
     * @param id
     * @param category
     * @param make
     * @param comfort
     * @param picture
     * @param pictureModerationStatus
     */
    public Car(String id, String model, String make, String color, String colorHexa, String comfort, int comfortNbStar, int numberOfSeat, String category, String picture, String pictureModerationStatus) {
        super();
        this.id = id;
        this.model = model;
        this.make = make;
        this.color = color;
        this.colorHexa = colorHexa;
        this.comfort = comfort;
        this.comfortNbStar = comfortNbStar;
        this.numberOfSeat = numberOfSeat;
        this.category = category;
        this.picture = picture;
        this.pictureModerationStatus = pictureModerationStatus;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("make")
    public String getMake() {
        return make;
    }

    @JsonProperty("make")
    public void setMake(String make) {
        this.make = make;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("color_hexa")
    public String getColorHexa() {
        return colorHexa;
    }

    @JsonProperty("color_hexa")
    public void setColorHexa(String colorHexa) {
        this.colorHexa = colorHexa;
    }

    @JsonProperty("comfort")
    public String getComfort() {
        return comfort;
    }

    @JsonProperty("comfort")
    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    @JsonProperty("comfort_nb_star")
    public int getComfortNbStar() {
        return comfortNbStar;
    }

    @JsonProperty("comfort_nb_star")
    public void setComfortNbStar(int comfortNbStar) {
        this.comfortNbStar = comfortNbStar;
    }

    @JsonProperty("number_of_seat")
    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    @JsonProperty("number_of_seat")
    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("picture")
    public String getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @JsonProperty("picture_moderation_status")
    public String getPictureModerationStatus() {
        return pictureModerationStatus;
    }

    @JsonProperty("picture_moderation_status")
    public void setPictureModerationStatus(String pictureModerationStatus) {
        this.pictureModerationStatus = pictureModerationStatus;
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
