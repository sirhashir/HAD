package com.example.had.service;

import com.example.had.entity.Doctor;
import com.example.had.entity.DoctorConnectionRequest;
import com.example.had.entity.User;
import com.example.had.repository.doctorConnectionRequestRepository;
import com.example.had.repository.doctorRepository;
import com.example.had.repository.userRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class doctorService {
    private final userRepository userRepository;
    private final doctorRepository doctorRepository;
    private final doctorConnectionRequestRepository requestRepository;

    public doctorService(userRepository userRepository,
                         doctorRepository doctorRepository,
                         doctorConnectionRequestRepository requestRepository) {
        this.userRepository = userRepository;
        this.doctorRepository = doctorRepository;
        this.requestRepository = requestRepository;
    }

    public List<User> getRegisteredPatients(String doctorId) {
        try {
            return userRepository.findByDoctor_Id(UUID.fromString(doctorId));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<User> getRequests(UUID doctorId) {
        try {
            List<DoctorConnectionRequest> requests = requestRepository.findByDoctor_Id(doctorId);
            List<User> userList = new ArrayList<>();
            for (DoctorConnectionRequest request: requests)
                userList.add(userRepository.findById(request.getUser().getId()).get());
            return userList;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public ResponseEntity<String> getResponse(UUID doctorId, UUID userId) {
        try {
            DoctorConnectionRequest request = requestRepository.findByUser_IdAndDoctor_Id(userId,doctorId);
            if (request==null){
                return ResponseEntity.noContent().build();
            }
//        --------- Accepted request ----------
            User user = request.getUser();                      // get requested doctor
            Doctor doctor = request.getDoctor();                // get requested user

            List<DoctorConnectionRequest> requestsByUser = requestRepository.findByUser_Id(user.getId());
            requestRepository.deleteAll(requestsByUser);        // purge all requests related to this user

            List<User> doctorUserList = doctor.getUserList();   // get all users connected to that doctor
            doctorUserList.add(user);                           // add this user to doctor
            user.setDoctor(doctor);                             // add this doctor to user
            doctorRepository.save(doctor);                      // persist in database

            return ResponseEntity.ok("Request confirmed");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}