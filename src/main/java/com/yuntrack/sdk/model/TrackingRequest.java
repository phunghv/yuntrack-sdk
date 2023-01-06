package com.yuntrack.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Collections;
import lombok.Data;

@Data
public class TrackingRequest {

    @JsonProperty("NumberList")
    private Collection<String> numbers;
    @JsonProperty("CaptchaVerification")
    private String captchaVerification = "";

    @JsonProperty("Year")
    private Integer year = 0;

    public static TrackingRequest forTrackingNumber(String number) {
        var request = new TrackingRequest();
        request.setNumbers(Collections.singletonList(number));
        return request;
    }

    public static TrackingRequest forTrackingNumber(Collection<String> numbers) {
        var request = new TrackingRequest();
        request.setNumbers(numbers);
        return request;
    }
}
