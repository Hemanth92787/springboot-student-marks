package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/student")
    public String showForm() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculateMarks(
            @RequestParam("roll") int roll,
            @RequestParam("name") String name,
            @RequestParam("m1") int m1,
            @RequestParam("m2") int m2,
            @RequestParam("m3") int m3,
            Model model) {

        int total = m1 + m2 + m3;
        double percent = total / 3.0;
        String result = (percent >= 35) ? "Pass" : "Fail";

        model.addAttribute("roll", roll);
        model.addAttribute("name", name);
        model.addAttribute("m1", m1);
        model.addAttribute("m2", m2);
        model.addAttribute("m3", m3);
        model.addAttribute("total", total);
        model.addAttribute("percent", String.format("%.2f", percent));
        model.addAttribute("result", result);

        return "result";
    }
}
