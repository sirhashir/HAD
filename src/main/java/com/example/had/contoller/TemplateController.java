package com.example.had.contoller;


import com.example.had.request.loginRequestBody;
import com.example.had.service.doctorRegisterService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {
    private final doctorRegisterService doctorRegisterService;

    public TemplateController(doctorRegisterService doctorRegisterService) {
        this.doctorRegisterService = doctorRegisterService;
    }
    @GetMapping("login")
    @PreAuthorize("permitAll()")
    public String getLogin(@RequestBody loginRequestBody loginRequestBody) {
        return "login";
    }
}