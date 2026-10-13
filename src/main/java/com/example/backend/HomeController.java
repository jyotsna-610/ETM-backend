package com.example.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "forward:/index.html";
    }

    @GetMapping("/employee-login")
    public String employeeLogin() {
        return "forward:/employee-login.html";
    }

    @GetMapping("/admin-login")
    public String adminLogin() {
        return "forward:/admin-login.html";
    }
    @GetMapping("/apply-leave")
public String applyLeave() {
    return "forward:/apply-leave.html";
}
}