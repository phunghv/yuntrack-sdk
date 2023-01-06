```java
        var mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://services.yuntrack.com/")
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .build();
        YunTrackAPI api = retrofit.create(YunTrackAPI.class);
        var cookie = "Cookie";
        var trackingNumber = "YT123123123"
        var request = TrackingRequest.forTrackingNumber(cookie, trackingNumber);
        var response = api.queryTracking(request).execute();
```