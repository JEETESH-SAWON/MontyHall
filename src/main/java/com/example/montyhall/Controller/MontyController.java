package com.example.montyhall.Controller;

import com.example.montyhall.Services.MontyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MontyController {
    private MontyService ms;
    public MontyController(MontyService ms){
        this.ms = ms;
    }
    @GetMapping("/monty")
    public String getMonty(Model model){
        double[] data = ms.process();
        String json = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(data);
        }catch(Exception e){
            e.printStackTrace();
        }
        model.addAttribute("data", json);
        return "home";
    }
}
