package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class InputController {
    @GetMapping("/input")
//    public String getInput(@RequestParam(defaultValue="")String previous, Model model) {
      public String getInput(@RequestParam(required=false)String previous, Model model) {
        model.addAttribute("previous", previous);
        return "input";
    }
}
