package com.weather.demo.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "weatherFeign", url = "http://api.weatherstack.com")
public interface WeatherClient {
    @RequestMapping(
        method = RequestMethod.GET,
        consumes = "application/json",
        produces = "application/json",
        value = "/current?access_key=f8fcd05ba0f86e9d1b87916b3086ae8e&query={query}"
    )
    String getWeathers(@PathVariable(value = "query") String query);
}
