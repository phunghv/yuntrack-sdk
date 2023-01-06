
package com.yuntrack.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessGroup {

    @JsonProperty("ProcessGroupDate")
    private LocalDateTime processGroupDate;
    @JsonProperty("ProcessDetailList")
    private List<ProcessDetail> processDetails = new ArrayList<ProcessDetail>();

}
