package com.jfsd.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    // Mapping for the Admin Dashboard
    @GetMapping("/dboard")
    public String adminDashboard(Model model) {
        return "admin/dboard"; // Correct path to the Thymeleaf template
    }
    // Mapping for Upload Assignment
    @GetMapping("/upload_assignment")
    public String uploadAssignment() {
        // Redirect to the upload assignment page or handle any required logic
        return "admin/upload_assignment"; // Ensure the uploadAssignment.html exists in the admin folder
    }

    // Mapping for Grade Submissions
    @GetMapping("/grade_submissions")
    public String gradeSubmissions() {
        // Redirect to the grade submissions page or handle any required logic
        return "admin/grade_submissions"; // Ensure the gradeSubmissions.html exists in the admin folder
    }

    // Mapping for Provide Feedback
    @GetMapping("/provide_feedback")
    public String provideFeedback() {
        // Redirect to the provide feedback page or handle any required logic
        return "admin/provide_feedback"; // Ensure the provideFeedback.html exists in the admin folder
    }

    // Mapping for Logout
    @GetMapping("/logout")
    public String logout() {
        // Handle the logout logic (e.g., clearing session data, redirecting to login page)
        return "redirect:/login"; // Redirect to the login page
    }
}
