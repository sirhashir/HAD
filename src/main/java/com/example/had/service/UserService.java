package com.example.had.service;

import com.example.had.entity.Doctor;
import com.example.had.entity.Question;
import com.example.had.entity.User;
import com.example.had.repository.questionRepository;
import com.example.had.repository.userRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final userRepository userRepository;
    private final questionRepository questionRepository;

    public UserService(userRepository userRepository, questionRepository questionRepository) {
        this.userRepository = userRepository;
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestions(int week, int session) {
        return questionRepository.findByWeekNumberAndSessionNumber(week,session);
    }

    public User getProfile(UUID patientId) {
        try {
            return userRepository.findById(patientId).get();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
