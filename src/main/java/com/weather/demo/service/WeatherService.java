package com.weather.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.weather.demo.model.Weather;
import com.weather.demo.rest.client.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class WeatherService {

    @Autowired
    private WeatherClient weatherClient;

    public String greet(String input) {
        return "HELLO " + input.toUpperCase() + "!";
    }

    public Weather getWeatherToday(String query) throws JsonProcessingException {
        String str = weatherClient.getWeathers(query);
        ObjectMapper objectMapper = new ObjectMapper();
        Weather user = objectMapper.readValue(str, Weather.class);
        Gson gson = new Gson();
        Weather weather = gson.fromJson(str, Weather.class);
        System.out.printf("Nhiet do: %s", user.current.windSpeed);
        return weather;
    }

}