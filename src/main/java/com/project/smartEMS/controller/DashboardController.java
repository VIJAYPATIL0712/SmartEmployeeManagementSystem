package com.project.smartEMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // ✅ use Controller, not RestController
@RequestMapping("/dashboard")
public class DashboardController {

//    @GetMapping("/register")
//    public String showRegisterPage(Model model) {
//        model.addAttribute("user", new com.project.smartEMS.entity.User());
//        return "auth/register"; // templates/auth/register.html
//    }

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("title", "Login Page");
        return "auth/login"; // templates/auth/register.html
    }

    @GetMapping("/admin")
    public String adminDashboard(Model model) {
        model.addAttribute("pageTitle", "Admin Dashboard");
        return "dashboard/admin-dashboard";
    }

    @GetMapping("/hr")
    public String hrDashboard(Model model) {
        model.addAttribute("pageTitle", "HR Dashboard");
        return "dashboard/hr-dashboard";
    }

    @GetMapping("/employee")
    public String employeeDashboard(Model model) {
        model.addAttribute("pageTitle", "Employee Dashboard");
        return "dashboard/employee-dashboard";
    }
}
