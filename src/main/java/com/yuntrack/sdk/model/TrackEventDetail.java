
package com.yuntrack.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TrackEventDetail {

    @JsonProperty("ProcessLocation")
    public String processLocation;
    @JsonProperty("CreatedOn")
    public LocalDateTime createdOn;
    @JsonProperty("ProcessContent")
    public String processContent;

}
