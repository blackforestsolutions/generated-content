package de.blackforestsolutions.generatedcontent.hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class HvvBaseBody {
    private String language;
    private double version;
    private FilterType filterType;
}
