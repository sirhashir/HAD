package com.example.had.contoller;


import com.example.had.entity.Doctor;
import com.example.had.entity.PrepopulatedArticle;
import com.example.had.request.answersBody;
import com.example.had.service.PrepopulatedArticleService;
import com.example.had.service.doctorService;
import com.example.had.service.loginService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@PreAuthorize("permitAll()")
public class TemplateController {
    public static final Logger logger = LogManager.getLogger(TemplateController.class);
    private final loginService loginService;
    private final doctorService doctorService;
    private final PrepopulatedArticleService prepopulatedArticleService;


    public TemplateController(loginService loginService, doctorService doctorService, PrepopulatedArticleService prepopulatedArticleService) {
        this.loginService = loginService;
        this.doctorService = doctorService;
        this.prepopulatedArticleService = prepopulatedArticleService;
    }
    @GetMapping("custom-logout")
    public String connectionCheck(){
        return "courses";
    }
    @GetMapping("get/doctors")
    public ResponseEntity<?> getDoctors(){
        List<Doctor> allDoctors = doctorService.getAllDoctors();
        if (allDoctors != null)
            return ResponseEntity.ok(allDoctors);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("preData")
    public ResponseEntity<?> getPreData(){
        List<PrepopulatedArticle> preData = prepopulatedArticleService.getPreData();
        if (preData.size() == 0)
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(preData);
    }
}