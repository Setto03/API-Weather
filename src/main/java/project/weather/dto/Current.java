package project.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Current {

    @JsonProperty("last_updated")
    private String lastUpdate;

    @JsonProperty("temp_c")
    private double celsius;

    @JsonProperty("temp_f")
    private double fahrenheit;

    @JsonProperty("wind_kph")
    private double wind;

    @JsonProperty("humidity")
    private int humid;

    @JsonProperty("uv")
    private double uv;

    @JsonProperty("condition")
    private Condition condition;

    @JsonProperty("vis_km")
    private double visibilityK;

    @JsonProperty("vis_miles")
    private double visibilityM;

    @JsonProperty("pressure_mb")
    private double pressure;
}
