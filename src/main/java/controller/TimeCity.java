package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.CityTimeService;

@Controller
@RequestMapping("/time")
public class TimeCity {
    CityTimeService service = new CityTimeService();
    @GetMapping("/home")
    public ModelAndView getTime1(@RequestParam (name="city" ,required = false ) String city){
        if(city == null) city = "Asia/Ho_Chi_Minh";
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("city", city);
        modelAndView.addObject("date", service.getTimeByTimezone(city));
        return modelAndView;
    }

    @PostMapping("/home")
    public ModelAndView getTime(String city){
        if(city == null) city = "Asia/Ho_Chi_Minh";
        ModelAndView modelAndView = new ModelAndView("/home");
    modelAndView.addObject("city", city);
    modelAndView.addObject("date", service.getTimeByTimezone(city));
    return modelAndView;
    }
}

