package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class OutputController {
    @PostMapping("/output")
    public String getInput(@RequestParam String val, Model model) {
        model.addAttribute("val", val);
        return "output";
    }
}
