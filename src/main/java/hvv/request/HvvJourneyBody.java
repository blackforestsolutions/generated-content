package hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class HvvJourneyBody extends HvvBaseBody {

    private HvvStation start;
    private HvvStation dest;
    private HvvStation via;
    private Time time;
    private Boolean timeIsDeparture;
    private Integer numberOfSchedules;
    private Boolean tariffDetails;
    private Boolean continousSearch;
    private ContSearchByServiceId contSearchByServiceId;
    private CoordinateType coordinateType;
    private Integer schedulesBefore;
    private Integer schedulesAfter;
    private Boolean returnReduced;
    private List<TariffInfoSelector> tariffInfoSelector;
    private Penalty penalties;
    private Boolean returnPartialTickets;
    private RealtimeType realtime;
    private Boolean intermediateStops;
    private Boolean useStationPosition;
    private HvvStation forcedStart;
    private HvvStation forcedDest;
    private SimpleServiceType toStartBy;
    private SimpleServiceType toDestBy;
    private Boolean returnContSearchData;

}
