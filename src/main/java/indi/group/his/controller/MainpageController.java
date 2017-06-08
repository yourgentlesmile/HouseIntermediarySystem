package indi.group.his.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Mainpage")
public class MainpageController {
	@GetMapping("")
    public String mainPage(){
        return "main";
    }
}
