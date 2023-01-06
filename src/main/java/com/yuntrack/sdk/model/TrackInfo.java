
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
public class TrackInfo {

    @JsonProperty("WaybillNumber")
    public String waybillNumber;
    @JsonProperty("TrackingNumber")
    public String trackingNumber;
    @JsonProperty("RelatedNumber")
    public String relatedNumber;
    @JsonProperty("CustomerOrderNumber")
    public String customerOrderNumber;
    @JsonProperty("ChannelCodeIn")
    public String channelCodeIn;
    @JsonProperty("ChannelNameIn")
    public String channelNameIn;
    @JsonProperty("ChannelEnNameIn")
    public String channelEnNameIn;
    @JsonProperty("ChannelCodeOut")
    public String channelCodeOut;
    @JsonProperty("ProviderName")
    public String providerName;
    @JsonProperty("ProviderSite")
    public String providerSite;
    @JsonProperty("Telephone")
    public String telephone;
    @JsonProperty("AdditionalNotes")
    public String additionalNotes;
    @JsonProperty("CheckInDate")
    public LocalDateTime checkInDate;
    @JsonProperty("CheckOutDate")
    public LocalDateTime checkOutDate;
    @JsonProperty("PickupDate")
    public LocalDateTime pickupDate;
    @JsonProperty("ChannelNameOut")
    public String channelNameOut;
    @JsonProperty("ChannelEnNameOut")
    public String channelEnNameOut;
    @JsonProperty("TrackingFlag")
    public Integer trackingFlag;
    @JsonProperty("CustomerCode")
    public String customerCode;
    @JsonProperty("DestinationCountryCode")
    public String destinationCountryCode;
    @JsonProperty("OriginCountryCode")
    public String originCountryCode;
    @JsonProperty("PostalCode")
    public String postalCode;
    @JsonProperty("Weight")
    public Double weight;
    @JsonProperty("TrackingStatus")
    public Integer trackingStatus;
    @JsonProperty("IntervalDays")
    public Double intervalDays;
    @JsonProperty("IntervalWorkdays")
    public Double intervalWorkdays;
    @JsonProperty("TrackEventCount")
    public Integer trackEventCount;
    @JsonProperty("LastTrackEvent")
    public LastTrackEvent lastTrackEvent;
    @JsonProperty("CreatedOn")
    public LocalDateTime createdOn;
    @JsonProperty("UpdatedOn")
    public LocalDateTime updatedOn;
    @JsonProperty("Remarks")
    public String remarks;
    @JsonProperty("TrackEventDetails")
    public List<TrackEventDetail> trackEventDetails = new ArrayList<TrackEventDetail>();
    @JsonProperty("SystemCode")
    public Integer systemCode;
    @JsonProperty("ArrivedOn")
    public String arrivedOn;
    @JsonProperty("TotalPackageNumber")
    public String totalPackageNumber;
    @JsonProperty("IsVirtual")
    public Boolean isVirtual;
    @JsonProperty("QueryMode")
    public Integer queryMode;
    @JsonProperty("DisplayMode")
    public Integer displayMode;
    @JsonProperty("BillingWeight")
    public Double billingWeight;
    @JsonProperty("Amount")
    public Double amount;
    @JsonProperty("SellerCode")
    public String sellerCode;
    @JsonProperty("AirWaybillNumber")
    public String airWaybillNumber;
    @JsonProperty("OrderSource")
    public String orderSource;
    @JsonProperty("PackageNumber")
    public String packageNumber;
    @JsonProperty("IsServerPickup")
    public Boolean isServerPickup;
    @JsonProperty("Pod")
    public String pod;

}
