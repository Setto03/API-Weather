package project.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {

    @JsonProperty("name")
    private String name;

    @JsonProperty("country")
    private String country;

    @JsonProperty("tz_id")
    private String timezone;

    @JsonProperty("localtime")
    private String time;
}
