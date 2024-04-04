package com.weather.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    public String name;
    public String country;

    public String region;

    public String lat;

    public String lon;

    @JsonProperty("timezone_id")
    public String timezoneId;

    public String localtime;

    @JsonProperty("localtime_epoch")
    public String localtimeEpoch;

    @JsonProperty("utc_offset")
    public String utcOffset;
}
