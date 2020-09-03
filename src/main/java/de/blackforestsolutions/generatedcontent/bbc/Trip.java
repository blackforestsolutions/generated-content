
package de.blackforestsolutions.generatedcontent.bbc;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "links",
    "departure_date",
    "departure_date_iso8601",
    "is_passed",
    "departure_place",
    "arrival_place",
    "departure_meeting_point",
    "price",
    "price_with_commission",
    "price_without_commission",
    "commission",
    "seats_left",
    "seats",
    "seats_count_origin",
    "duration",
    "distance",
    "permanent_id",
    "main_permanent_id",
    "comment",
    "multimodal_id",
    "freeway",
    "answer_delay",
    "bucketing_eligible",
    "booking_mode",
    "booking_type",
    "view_count",
    "cross_border_alert",
    "trip_plan",
    "messaging_status",
    "passengers",
    "display_contact",
    "vehicle_pictures",
    "can_report",
    "locations_to_display",
    "corridoring_type",
    "viaggio_rosa",
    "is_comfort",
    "stop_overs",
    "is_booking_allowed",
    "arrival_meeting_point",
    "car"
})
public class Trip implements Serializable
{

    @JsonProperty("links")
    private Links_ links;
    @JsonProperty("departure_date")
    private String departureDate;
    @JsonProperty("departure_date_iso8601")
    private String departureDateIso8601;
    @JsonProperty("is_passed")
    private Boolean isPassed;
    @JsonProperty("departure_place")
    private Place departurePlace;
    @JsonProperty("arrival_place")
    private Place arrivalPlace;
    @JsonProperty("departure_meeting_point")
    private MeetingPoint departureMeetingPoint;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("price_with_commission")
    private PriceWithCommission priceWithCommission;
    @JsonProperty("price_without_commission")
    private PriceWithoutCommission priceWithoutCommission;
    @JsonProperty("commission")
    private Commission commission;
    @JsonProperty("seats_left")
    private Long seatsLeft;
    @JsonProperty("seats")
    private Long seats;
    @JsonProperty("seats_count_origin")
    private Long seatsCountOrigin;
    @JsonProperty("duration")
    private Duration duration;
    @JsonProperty("distance")
    private Distance distance;
    @JsonProperty("permanent_id")
    private String permanentId;
    @JsonProperty("main_permanent_id")
    private String mainPermanentId;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("multimodal_id")
    private MultimodalId multimodalId;
    @JsonProperty("freeway")
    private Boolean freeway;
    @JsonProperty("answer_delay")
    private Long answerDelay;
    @JsonProperty("bucketing_eligible")
    private Boolean bucketingEligible;
    @JsonProperty("booking_mode")
    private String bookingMode;
    @JsonProperty("booking_type")
    private String bookingType;
    @JsonProperty("view_count")
    private Long viewCount;
    @JsonProperty("cross_border_alert")
    private Boolean crossBorderAlert;
    @JsonProperty("trip_plan")
    private List<Place> tripPlan = null;
    @JsonProperty("messaging_status")
    private String messagingStatus;
    @JsonProperty("passengers")
    private List<Object> passengers = null;
    @JsonProperty("display_contact")
    private Boolean displayContact;
    @JsonProperty("vehicle_pictures")
    private List<Object> vehiclePictures = null;
    @JsonProperty("can_report")
    private Boolean canReport;
    @JsonProperty("locations_to_display")
    private List<String> locationsToDisplay = null;
    @JsonProperty("corridoring_type")
    private String corridoringType;
    @JsonProperty("viaggio_rosa")
    private Boolean viaggioRosa;
    @JsonProperty("is_comfort")
    private Boolean isComfort;
    @JsonProperty("stop_overs")
    private List<Object> stopOvers = null;
    @JsonProperty("is_booking_allowed")
    private Boolean isBookingAllowed;
    @JsonProperty("arrival_meeting_point")
    private MeetingPoint arrivalMeetingPoint;
    @JsonProperty("car")
    private Car car;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7090978819666631868L;

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

    @JsonProperty("departure_date_iso8601")
    public String getDepartureDateIso8601() {
        return departureDateIso8601;
    }

    @JsonProperty("departure_date_iso8601")
    public void setDepartureDateIso8601(String departureDateIso8601) {
        this.departureDateIso8601 = departureDateIso8601;
    }

    @JsonProperty("is_passed")
    public Boolean getIsPassed() {
        return isPassed;
    }

    @JsonProperty("is_passed")
    public void setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
    }

    @JsonProperty("departure_place")
    public Place getDeparturePlace() {
        return departurePlace;
    }

    @JsonProperty("departure_place")
    public void setDeparturePlace(Place departurePlace) {
        this.departurePlace = departurePlace;
    }

    @JsonProperty("arrival_place")
    public Place getArrivalPlace() {
        return arrivalPlace;
    }

    @JsonProperty("arrival_place")
    public void setArrivalPlace(Place place) {
        this.arrivalPlace = place;
    }

    @JsonProperty("departure_meeting_point")
    public MeetingPoint getDepartureMeetingPoint() {
        return departureMeetingPoint;
    }

    @JsonProperty("departure_meeting_point")
    public void setDepartureMeetingPoint(MeetingPoint departureMeetingPoint) {
        this.departureMeetingPoint = departureMeetingPoint;
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
    public Long getSeatsLeft() {
        return seatsLeft;
    }

    @JsonProperty("seats_left")
    public void setSeatsLeft(Long seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    @JsonProperty("seats")
    public Long getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(Long seats) {
        this.seats = seats;
    }

    @JsonProperty("seats_count_origin")
    public Long getSeatsCountOrigin() {
        return seatsCountOrigin;
    }

    @JsonProperty("seats_count_origin")
    public void setSeatsCountOrigin(Long seatsCountOrigin) {
        this.seatsCountOrigin = seatsCountOrigin;
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

    @JsonProperty("main_permanent_id")
    public String getMainPermanentId() {
        return mainPermanentId;
    }

    @JsonProperty("main_permanent_id")
    public void setMainPermanentId(String mainPermanentId) {
        this.mainPermanentId = mainPermanentId;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("multimodal_id")
    public MultimodalId getMultimodalId() {
        return multimodalId;
    }

    @JsonProperty("multimodal_id")
    public void setMultimodalId(MultimodalId multimodalId) {
        this.multimodalId = multimodalId;
    }

    @JsonProperty("freeway")
    public Boolean getFreeway() {
        return freeway;
    }

    @JsonProperty("freeway")
    public void setFreeway(Boolean freeway) {
        this.freeway = freeway;
    }

    @JsonProperty("answer_delay")
    public Long getAnswerDelay() {
        return answerDelay;
    }

    @JsonProperty("answer_delay")
    public void setAnswerDelay(Long answerDelay) {
        this.answerDelay = answerDelay;
    }

    @JsonProperty("bucketing_eligible")
    public Boolean getBucketingEligible() {
        return bucketingEligible;
    }

    @JsonProperty("bucketing_eligible")
    public void setBucketingEligible(Boolean bucketingEligible) {
        this.bucketingEligible = bucketingEligible;
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

    @JsonProperty("view_count")
    public Long getViewCount() {
        return viewCount;
    }

    @JsonProperty("view_count")
    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    @JsonProperty("cross_border_alert")
    public Boolean getCrossBorderAlert() {
        return crossBorderAlert;
    }

    @JsonProperty("cross_border_alert")
    public void setCrossBorderAlert(Boolean crossBorderAlert) {
        this.crossBorderAlert = crossBorderAlert;
    }

    @JsonProperty("trip_plan")
    public List<Place> getTripPlan() {
        return tripPlan;
    }

    @JsonProperty("trip_plan")
    public void setTripPlan(List<Place> tripPlan) {
        this.tripPlan = tripPlan;
    }

    @JsonProperty("messaging_status")
    public String getMessagingStatus() {
        return messagingStatus;
    }

    @JsonProperty("messaging_status")
    public void setMessagingStatus(String messagingStatus) {
        this.messagingStatus = messagingStatus;
    }

    @JsonProperty("passengers")
    public List<Object> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Object> passengers) {
        this.passengers = passengers;
    }

    @JsonProperty("display_contact")
    public Boolean getDisplayContact() {
        return displayContact;
    }

    @JsonProperty("display_contact")
    public void setDisplayContact(Boolean displayContact) {
        this.displayContact = displayContact;
    }

    @JsonProperty("vehicle_pictures")
    public List<Object> getVehiclePictures() {
        return vehiclePictures;
    }

    @JsonProperty("vehicle_pictures")
    public void setVehiclePictures(List<Object> vehiclePictures) {
        this.vehiclePictures = vehiclePictures;
    }

    @JsonProperty("can_report")
    public Boolean getCanReport() {
        return canReport;
    }

    @JsonProperty("can_report")
    public void setCanReport(Boolean canReport) {
        this.canReport = canReport;
    }

    @JsonProperty("locations_to_display")
    public List<String> getLocationsToDisplay() {
        return locationsToDisplay;
    }

    @JsonProperty("locations_to_display")
    public void setLocationsToDisplay(List<String> locationsToDisplay) {
        this.locationsToDisplay = locationsToDisplay;
    }

    @JsonProperty("corridoring_type")
    public String getCorridoringType() {
        return corridoringType;
    }

    @JsonProperty("corridoring_type")
    public void setCorridoringType(String corridoringType) {
        this.corridoringType = corridoringType;
    }

    @JsonProperty("viaggio_rosa")
    public Boolean getViaggioRosa() {
        return viaggioRosa;
    }

    @JsonProperty("viaggio_rosa")
    public void setViaggioRosa(Boolean viaggioRosa) {
        this.viaggioRosa = viaggioRosa;
    }

    @JsonProperty("is_comfort")
    public Boolean getIsComfort() {
        return isComfort;
    }

    @JsonProperty("is_comfort")
    public void setIsComfort(Boolean isComfort) {
        this.isComfort = isComfort;
    }

    @JsonProperty("stop_overs")
    public List<Object> getStopOvers() {
        return stopOvers;
    }

    @JsonProperty("stop_overs")
    public void setStopOvers(List<Object> stopOvers) {
        this.stopOvers = stopOvers;
    }

    @JsonProperty("is_booking_allowed")
    public Boolean getIsBookingAllowed() {
        return isBookingAllowed;
    }

    @JsonProperty("is_booking_allowed")
    public void setIsBookingAllowed(Boolean isBookingAllowed) {
        this.isBookingAllowed = isBookingAllowed;
    }

    @JsonProperty("arrival_meeting_point")
    public MeetingPoint getArrivalMeetingPoint() {
        return arrivalMeetingPoint;
    }

    @JsonProperty("arrival_meeting_point")
    public void setArrivalMeetingPoint(MeetingPoint arrivalMeetingPoint) {
        this.arrivalMeetingPoint = arrivalMeetingPoint;
    }

    @JsonProperty("car")
    public Car getCar() {
        return car;
    }

    @JsonProperty("car")
    public void setCar(Car car) {
        this.car = car;
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
