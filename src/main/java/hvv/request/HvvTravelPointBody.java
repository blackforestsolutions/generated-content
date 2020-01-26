package hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class HvvTravelPointBody extends HvvBaseBody {
    private HvvStation theName;
    private int maxList;
    private int maxDistance;
    private CoordinateType coordinateType;
    private Boolean tariffDetails;
    private Boolean allowTypeSwitch;
}
