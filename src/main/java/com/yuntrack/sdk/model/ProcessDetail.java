
package com.yuntrack.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessDetail {

    @JsonProperty("ProcessDate")
    private LocalDateTime processDate;
    @JsonProperty("ProcessContent")
    private String processContent;
    @JsonProperty("Pod")
    private String pod;

}
