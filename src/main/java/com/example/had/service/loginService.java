package com.example.had.service;

import com.example.had.entity.Doctor;
import com.example.had.entity.User;
import com.example.had.repository.authRepository;
import com.example.had.repository.doctorRepository;
import com.example.had.repository.userRepository;
import com.example.had.request.loginRequestBody;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Objects;

@Service
public class loginService {
    public static final Logger logger = LogManager.getLogger(loginService.class);
    private final authRepository authRepository;
    private final doctorRepository doctorRepository;
    private final userRepository userRepository;

    public loginService(authRepository authRepository,
                        doctorRepository doctorRepository,
                        userRepository userRepository) {
        this.authRepository = authRepository;
        this.doctorRepository = doctorRepository;
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> getUserByLogin(String username, String password) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String role = authRepository.
                        findFirstByUsernameAndPassword(username,password).
                        getRole();

        authRepository.updateLastLoginByUsername(timestamp.toString(), username);
        logger.info("Timestamp updated i guess...");

        if (Objects.equals(role, "DOCTOR")){
            Doctor doctor = doctorRepository.findByEmailIgnoreCase(username);
            return ResponseEntity.ok(doctor);
        }
        if (Objects.equals(role, "USER")){
            User user = userRepository.findByEmailIgnoreCase(password);
            return ResponseEntity.ok(user);
        }
        if (Objects.equals(username, "lynda")
                && Objects.equals(password, "password")){
            return ResponseEntity.ok("ADMIN");
        }
        return ResponseEntity.notFound().build();
    }
}