package project.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response {

    @JsonProperty("location")
    private Location location;

    @JsonProperty("current")
    private Current current;
}
