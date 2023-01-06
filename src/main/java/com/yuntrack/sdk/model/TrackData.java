
package com.yuntrack.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TrackData {

    @JsonProperty("ChildCount")
    public Integer childCount;
    @JsonProperty("TrackStatus")
    public String trackStatus;
    @JsonProperty("IsAlert")
    public Boolean isAlert;
    @JsonProperty("DetailingId")
    public String detailingId;
    @JsonProperty("ProcessGroupList")
    public List<ProcessGroup> processGroupList = new ArrayList<ProcessGroup>();

}
