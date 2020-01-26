package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "links",
        "departure_date",
        "departure_place",
        "arrival_place",
        "price",
        "price_with_commission",
        "price_without_commission",
        "commission",
        "seats_left",
        "seats",
        "duration",
        "distance",
        "permanent_id",
        "car",
        "multimodal_id",
        "viaggio_rosa",
        "is_comfort",
        "freeway",
        "answer_delay",
        "booking_mode",
        "booking_type",
        "locations_to_display",
        "departure_passenger_routing",
        "arrival_passenger_routing",
        "corridoring_type",
        "vehicle_pictures"
})
public class Trip implements Serializable {

    private final static long serialVersionUID = -2879490205485868486L;
    @JsonProperty("links")
    private Links_ links;
    @JsonProperty("departure_date")
    private String departureDate;
    @JsonProperty("departure_place")
    private DeparturePlace departurePlace;
    @JsonProperty("arrival_place")
    private ArrivalPlace arrivalPlace;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("price_with_commission")
    private PriceWithCommission priceWithCommission;
    @JsonProperty("price_without_commission")
    private PriceWithoutCommission priceWithoutCommission;
    @JsonProperty("commission")
    private Commission commission;
    @JsonProperty("seats_left")
    private int seatsLeft;
    @JsonProperty("seats")
    private int seats;
    @JsonProperty("duration")
    private Duration duration;
    @JsonProperty("distance")
    private Distance distance;
    @JsonProperty("permanent_id")
    private String permanentId;
    @JsonProperty("car")
    private Car car;
    @JsonProperty("multimodal_id")
    private MultimodalId multimodalId;
    @JsonProperty("viaggio_rosa")
    private boolean viaggioRosa;
    @JsonProperty("is_comfort")
    private boolean isComfort;
    @JsonProperty("freeway")
    private boolean freeway;
    @JsonProperty("answer_delay")
    private int answerDelay;
    @JsonProperty("booking_mode")
    private String bookingMode;
    @JsonProperty("booking_type")
    private String bookingType;
    @JsonProperty("locations_to_display")
    private List<String> locationsToDisplay = new ArrayList<String>();
    @JsonProperty("departure_passenger_routing")
    private DeparturePassengerRouting departurePassengerRouting;
    @JsonProperty("arrival_passenger_routing")
    private ArrivalPassengerRouting arrivalPassengerRouting;
    @JsonProperty("corridoring_type")
    private String corridoringType;
    @JsonProperty("vehicle_pictures")
    private List<Object> vehiclePictures = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Trip() {
    }

    /**
     * @param freeway
     * @param distance
     * @param seats
     * @param corridoringType
     * @param seatsLeft
     * @param answerDelay
     * @param duration
     * @param priceWithCommission
     * @param car
     * @param price
     * @param isComfort
     * @param bookingType
     * @param arrivalPlace
     * @param links
     * @param commission
     * @param departureDate
     * @param viaggioRosa
     * @param priceWithoutCommission
     * @param arrivalPassengerRouting
     * @param multimodalId
     * @param locationsToDisplay
     * @param departurePassengerRouting
     * @param permanentId
     * @param vehiclePictures
     * @param departurePlace
     * @param bookingMode
     */
    public Trip(Links_ links, String departureDate, DeparturePlace departurePlace, ArrivalPlace arrivalPlace, Price price, PriceWithCommission priceWithCommission, PriceWithoutCommission priceWithoutCommission, Commission commission, int seatsLeft, int seats, Duration duration, Distance distance, String permanentId, Car car, MultimodalId multimodalId, boolean viaggioRosa, boolean isComfort, boolean freeway, int answerDelay, String bookingMode, String bookingType, List<String> locationsToDisplay, DeparturePassengerRouting departurePassengerRouting, ArrivalPassengerRouting arrivalPassengerRouting, String corridoringType, List<Object> vehiclePictures) {
        super();
        this.links = links;
        this.departureDate = departureDate;
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
        this.price = price;
        this.priceWithCommission = priceWithCommission;
        this.priceWithoutCommission = priceWithoutCommission;
        this.commission = commission;
        this.seatsLeft = seatsLeft;
        this.seats = seats;
        this.duration = duration;
        this.distance = distance;
        this.permanentId = permanentId;
        this.car = car;
        this.multimodalId = multimodalId;
        this.viaggioRosa = viaggioRosa;
        this.isComfort = isComfort;
        this.freeway = freeway;
        this.answerDelay = answerDelay;
        this.bookingMode = bookingMode;
        this.bookingType = bookingType;
        this.locationsToDisplay = locationsToDisplay;
        this.departurePassengerRouting = departurePassengerRouting;
        this.arrivalPassengerRouting = arrivalPassengerRouting;
        this.corridoringType = corridoringType;
        this.vehiclePictures = vehiclePictures;
    }

    @JsonProperty("links")
    public Links_ getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links_ links) {
        this.links = links;
    }

    @JsonProperty("departure_date")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("departure_date")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("departure_place")
    public DeparturePlace getDeparturePlace() {
        return departurePlace;
    }

    @JsonProperty("departure_place")
    public void setDeparturePlace(DeparturePlace departurePlace) {
        this.departurePlace = departurePlace;
    }

    @JsonProperty("arrival_place")
    public ArrivalPlace getArrivalPlace() {
        return arrivalPlace;
    }

    @JsonProperty("arrival_place")
    public void setArrivalPlace(ArrivalPlace arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("price_with_commission")
    public PriceWithCommission getPriceWithCommission() {
        return priceWithCommission;
    }

    @JsonProperty("price_with_commission")
    public void setPriceWithCommission(PriceWithCommission priceWithCommission) {
        this.priceWithCommission = priceWithCommission;
    }

    @JsonProperty("price_without_commission")
    public PriceWithoutCommission getPriceWithoutCommission() {
        return priceWithoutCommission;
    }

    @JsonProperty("price_without_commission")
    public void setPriceWithoutCommission(PriceWithoutCommission priceWithoutCommission) {
        this.priceWithoutCommission = priceWithoutCommission;
    }

    @JsonProperty("commission")
    public Commission getCommission() {
        return commission;
    }

    @JsonProperty("commission")
    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    @JsonProperty("seats_left")
    public int getSeatsLeft() {
        return seatsLeft;
    }

    @JsonProperty("seats_left")
    public void setSeatsLeft(int seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    @JsonProperty("seats")
    public int getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @JsonProperty("duration")
    public Duration getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @JsonProperty("distance")
    public Distance getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    @JsonProperty("permanent_id")
    public String getPermanentId() {
        return permanentId;
    }

    @JsonProperty("permanent_id")
    public void setPermanentId(String permanentId) {
        this.permanentId = permanentId;
    }

    @JsonProperty("car")
    public Car getCar() {
        return car;
    }

    @JsonProperty("car")
    public void setCar(Car car) {
        this.car = car;
    }

    @JsonProperty("multimodal_id")
    public MultimodalId getMultimodalId() {
        return multimodalId;
    }

    @JsonProperty("multimodal_id")
    public void setMultimodalId(MultimodalId multimodalId) {
        this.multimodalId = multimodalId;
    }

    @JsonProperty("viaggio_rosa")
    public boolean isViaggioRosa() {
        return viaggioRosa;
    }

    @JsonProperty("viaggio_rosa")
    public void setViaggioRosa(boolean viaggioRosa) {
        this.viaggioRosa = viaggioRosa;
    }

    @JsonProperty("is_comfort")
    public boolean isIsComfort() {
        return isComfort;
    }

    @JsonProperty("is_comfort")
    public void setIsComfort(boolean isComfort) {
        this.isComfort = isComfort;
    }

    @JsonProperty("freeway")
    public boolean isFreeway() {
        return freeway;
    }

    @JsonProperty("freeway")
    public void setFreeway(boolean freeway) {
        this.freeway = freeway;
    }

    @JsonProperty("answer_delay")
    public int getAnswerDelay() {
        return answerDelay;
    }

    @JsonProperty("answer_delay")
    public void setAnswerDelay(int answerDelay) {
        this.answerDelay = answerDelay;
    }

    @JsonProperty("booking_mode")
    public String getBookingMode() {
        return bookingMode;
    }

    @JsonProperty("booking_mode")
    public void setBookingMode(String bookingMode) {
        this.bookingMode = bookingMode;
    }

    @JsonProperty("booking_type")
    public String getBookingType() {
        return bookingType;
    }

    @JsonProperty("booking_type")
    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    @JsonProperty("locations_to_display")
    public List<String> getLocationsToDisplay() {
        return locationsToDisplay;
    }

    @JsonProperty("locations_to_display")
    public void setLocationsToDisplay(List<String> locationsToDisplay) {
        this.locationsToDisplay = locationsToDisplay;
    }

    @JsonProperty("departure_passenger_routing")
    public DeparturePassengerRouting getDeparturePassengerRouting() {
        return departurePassengerRouting;
    }

    @JsonProperty("departure_passenger_routing")
    public void setDeparturePassengerRouting(DeparturePassengerRouting departurePassengerRouting) {
        this.departurePassengerRouting = departurePassengerRouting;
    }

    @JsonProperty("arrival_passenger_routing")
    public ArrivalPassengerRouting getArrivalPassengerRouting() {
        return arrivalPassengerRouting;
    }

    @JsonProperty("arrival_passenger_routing")
    public void setArrivalPassengerRouting(ArrivalPassengerRouting arrivalPassengerRouting) {
        this.arrivalPassengerRouting = arrivalPassengerRouting;
    }

    @JsonProperty("corridoring_type")
    public String getCorridoringType() {
        return corridoringType;
    }

    @JsonProperty("corridoring_type")
    public void setCorridoringType(String corridoringType) {
        this.corridoringType = corridoringType;
    }

    @JsonProperty("vehicle_pictures")
    public List<Object> getVehiclePictures() {
        return vehiclePictures;
    }

    @JsonProperty("vehicle_pictures")
    public void setVehiclePictures(List<Object> vehiclePictures) {
        this.vehiclePictures = vehiclePictures;
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
