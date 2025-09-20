package com.project.smartEMS.controller;


import com.project.smartEMS.entity.User;
import com.project.smartEMS.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@ModelAttribute User user , Model model){
        authService.register(user);
        return ResponseEntity.ok("User Registered");
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        boolean success = authService.login(user);

        if (!success) {
            return "redirect:/auth/login?error=true";
        }

        String role = user.getRole();

        if ("hr".equalsIgnoreCase(role)) {
            return "redirect:/dashboard/hr";
        } else if ("employee".equalsIgnoreCase(role)) {
            return "redirect:/dashboard/employee";
        } else if ("admin".equalsIgnoreCase(role)) {
            return "redirect:/dashboard/admin";
        } else {
            return "redirect:/auth/login";
        }
    }

}
