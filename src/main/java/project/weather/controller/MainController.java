package project.weather.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.weather.dto.Response;
import project.weather.service.APIService;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final APIService service;

    @RequestMapping("/call")
    public String getCurrentWeather(@RequestParam(name = "query") String query,
                                      Model model) {

        Response response = service.callCurrent(query);
        model.addAttribute("response", response);

        double pressure = response.getCurrent().getPressure();
        double atm = pressure / 1013.25;
        model.addAttribute("atm", String.format("%.2f", atm));

        return "index";
    }
}
