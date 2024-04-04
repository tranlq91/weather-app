package com.weather.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {
    public String observationTime;

    public String temperature;

    public int weather_code;

    public List<String> weatherIcons;

    public List<String> weatherDescriptions;
    @JsonProperty("wind_speed")
    public int windSpeed;

    public String windDegree;

    public String pressure;

    public String windDir;

    public float precip;

    public int humidity;
    public int feelslike;
    public int cloudcover;
    public int uv_index;
    public int visibility;
    public boolean isDay;
}
