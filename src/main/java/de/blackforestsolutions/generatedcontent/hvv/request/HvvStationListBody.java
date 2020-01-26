package de.blackforestsolutions.generatedcontent.hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class HvvStationListBody extends HvvBaseBody {

    private String dataReleaseID;
    private ModificationType modificationTypes;
    private Coordinate coordinateType;
    private Boolean filterEquivalent;
}
