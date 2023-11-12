package project.weather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import project.weather.dto.Current;
import project.weather.dto.Response;


@Service
@RequiredArgsConstructor
public class APIService {

    private final ObjectMapper objectMapper;

    @Value("${api.key}")
    private String APIKey;

    public Response callCurrent(String query) {
        String url = "https://api.weatherapi.com/v1/current.json?key=" + APIKey + "&q=" + query + "&aqi=no";
        RestTemplate template = new RestTemplate();

        return template.getForObject(url, Response.class);
    }
}
