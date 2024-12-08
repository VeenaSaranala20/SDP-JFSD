package com.jfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.jfsd.entity.User;
import com.jfsd.service.UserService;

@Controller
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegistrationForm() {
        return "register";  // Return the registration page (GET request)
    }

    @PostMapping
    public String register(@RequestParam String name, 
                           @RequestParam String mobileNumber, 
                           @RequestParam String email, 
                           @RequestParam String password, 
                           @RequestParam String cpassword,
                           @RequestParam MultipartFile profile_image,
                           Model model) {
        if (!password.equals(cpassword)) {
            model.addAttribute("error", "Passwords do not match.");
            return "register";  // Return to registration page with error
        }

        User user = new User();
        user.setName(name);
        user.setMobileNumber(mobileNumber);
        user.setEmail(email);
        user.setPassword(password);  // Ideally, encrypt the password here
        user.setProfileImage(profile_image.getOriginalFilename());

        userService.registerUser(user);

        return "redirect:/login";  // Redirect to login page after successful registration
    }

}

