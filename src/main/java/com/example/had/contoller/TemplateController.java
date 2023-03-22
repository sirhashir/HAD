package com.example.had.contoller;


import com.example.had.request.loginRequestBody;
import com.example.had.service.loginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {
    private final loginService loginService;

    public TemplateController(loginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("login")
    @PreAuthorize("permitAll()")
    public ResponseEntity<?> getLogin(@RequestBody loginRequestBody loginRequestBody) {
        return loginService.getUserByLogin(loginRequestBody);
    }
    @GetMapping("connection_check")
    public String connectionCheck(){
        return "new ResponseEntity<>(HttpStatus.ACCEPTED)";
    }
}