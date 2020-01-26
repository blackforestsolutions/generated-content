package hvv.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class TariffInfoSelector {

    @NonNull
    private String tariff;
    private Boolean tariffRegions;
    @NonNull
    private List<Integer> kinds;
}
