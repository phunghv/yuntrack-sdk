
package com.yuntrack.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingDetail {

    @JsonProperty("Id")
    public String id;
    @JsonProperty("Status")
    public Integer status;
    @JsonProperty("TrackInfo")
    public TrackInfo trackInfo;
    @JsonProperty("TrackData")
    public TrackData trackData;

}
