
package com.yuntrack.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LastTrackEvent {

    @JsonProperty("SortCode")
    private Integer sortCode;
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;
    @JsonProperty("ProcessDate")
    private LocalDateTime processDate;
    @JsonProperty("ProcessDateTimestamp")
    private Long processDateTimestamp;
    @JsonProperty("ProcessContent")
    private String processContent;
    @JsonProperty("ProcessContentCode")
    private String processContentCode;
    @JsonProperty("ProcessLocation")
    private String processLocation;
    @JsonProperty("ProcessCountry")
    private String processCountry;
    @JsonProperty("ProcessProvince")
    private String processProvince;
    @JsonProperty("ProcessCity")
    private String processCity;
    @JsonProperty("TrackingStatus")
    private Integer trackingStatus;
    @JsonProperty("CreatedOn")
    private LocalDateTime createdOn;
    @JsonProperty("FlowType")
    private Integer flowType;
    @JsonProperty("AirportCode")
    private String airportCode;
    @JsonProperty("ReturnReason")
    private String returnReason;
    @JsonProperty("TrackCode")
    private String trackCode;
    @JsonProperty("TrackCodeName")
    private String trackCodeName;
    @JsonProperty("TrackCodeEx")
    private String trackCodeEx;
    @JsonProperty("TrackCodeNameEx")
    private String trackCodeNameEx;
    @JsonProperty("Pod")
    private String pod;
}
