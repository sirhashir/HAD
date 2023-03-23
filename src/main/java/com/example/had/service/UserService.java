package com.example.had.service;

import com.example.had.entity.Question;
import com.example.had.entity.User;
import com.example.had.repository.authRepository;
import com.example.had.repository.questionRepository;
import com.example.had.repository.userRepository;
import com.example.had.request.userProfileUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final userRepository userRepository;
    private final questionRepository questionRepository;
    private final authRepository authRepository;

    public UserService(userRepository userRepository,
                       questionRepository questionRepository,
                       authRepository authRepository) {
        this.userRepository = userRepository;
        this.questionRepository = questionRepository;
        this.authRepository = authRepository;
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

    public boolean updateProfile(UUID patientId, userProfileUpdateRequest updateRequest) {
        try{
            userRepository.updateAddressAndContactById(
                    updateRequest.getAddress(),
                    updateRequest.getContact(),
                    patientId
            );
            authRepository.updatePasswordByUsername(
                    updateRequest.getPassword(),
                    userRepository.findById(patientId).get().getEmail()
            );
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
