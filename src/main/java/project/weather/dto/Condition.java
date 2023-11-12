package project.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Condition {

    @JsonProperty("text")
    private String text;

    @JsonProperty("icon")
    private String icon;
}
