package com.weather.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.weather.demo.model.Weather;
import com.weather.demo.service.WeatherService;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather-forecast")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable(name = "name") String name) {
        return weatherService.greet(name);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/today")
    public Weather getWeather(@RequestParam(name = "query") String query) throws JsonProcessingException {
        System.out.println("Query" + query);
        return weatherService.getWeatherToday(query);
    }

}
