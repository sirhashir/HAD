package com.example.had.contoller;


import com.example.had.request.loginRequestBody;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.sasl.AuthenticationException;
import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/")
public class TemplateController {
    @GetMapping("login")
    @PreAuthorize("permitAll()")
    public String getLogin() {
        return "login";
    }
}