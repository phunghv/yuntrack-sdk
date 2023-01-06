package com.yuntrack.sdk;

import com.yuntrack.sdk.model.TrackingRequest;
import com.yuntrack.sdk.model.TrackingResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface YunTrackAPI {

    @POST("Track/Query")
    @Headers({"Content-Type: application/json", "Referer: https://www.yuntrack.com/"})
    Call<TrackingResponse> queryTracking(@Header("Cookie") String cookie, @Body TrackingRequest request);
}
