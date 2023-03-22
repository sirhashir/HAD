package com.example.had.service;

import com.example.had.entity.Doctor;
import com.example.had.entity.User;
import com.example.had.repository.authRepository;
import com.example.had.repository.doctorRepository;
import com.example.had.repository.userRepository;
import com.example.had.request.loginRequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class loginService {
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

    public ResponseEntity<?> getUserByLogin(loginRequestBody loginRequestBody) {
        String role = authRepository.
                        findFirstByUsernameAndPassword(loginRequestBody.getUsername(), loginRequestBody.getPassword()).
                        getRole();
        if (Objects.equals(role, "DOCTOR")){
            Doctor doctor = doctorRepository.findByEmailIgnoreCase(loginRequestBody.getUsername());
            return ResponseEntity.ok(doctor);
        }
        if (Objects.equals(role, "USER")){
            User user = userRepository.findByEmailIgnoreCase(loginRequestBody.getUsername());
            return ResponseEntity.ok(user);
        }
        if (Objects.equals(loginRequestBody.getUsername(), "lynda")
                && Objects.equals(loginRequestBody.getPassword(), "password")){
            return ResponseEntity.ok("ADMIN");
        }
        return ResponseEntity.notFound().build();
    }
}
