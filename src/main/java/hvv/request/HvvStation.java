package hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class HvvStation {

    private String name;
    private String city;
    @NonNull
    private String combinedName;
    private String id;
    private SDType type;
    private Coordinate coordinate;
    private TariffDetails tariffDetails;
    private List<String> serviceTypes;
    private Boolean hasStationInformation;
}
