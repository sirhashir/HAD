package com.example.had.service;

import com.example.had.entity.Auth;
import com.example.had.entity.Doctor;
import com.example.had.repository.doctorRepository;
import com.example.had.request.doctorRegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.had.repository.authRepository;

import javax.print.Doc;
import java.util.List;

@Service
public class doctorRegisterService {
    private final authRepository authRepository;
    private final doctorRepository doctorRepository;
    public doctorRegisterService(authRepository authRepository, doctorRepository doctorRepository) {
        this.authRepository = authRepository;
        this.doctorRepository = doctorRepository;
    }

    public ResponseEntity registerDoctor(doctorRegisterRequest doctorRegisterRequest) {
        try{
            doctorRepository.save(new Doctor(doctorRegisterRequest.getEmail(),
                    doctorRegisterRequest.getFirstName(),
                    doctorRegisterRequest.getMiddleName(),
                    doctorRegisterRequest.getLastName(),
                    doctorRegisterRequest.getGender(),
                    doctorRegisterRequest.getAge(),
                    doctorRegisterRequest.getDegree(),
                    doctorRegisterRequest.getSpecialisation(),
                    doctorRegisterRequest.getExperience(),
                    doctorRegisterRequest.getAddress(),
                    doctorRegisterRequest.getContact(),
                    doctorRegisterRequest.getImageUrl(),
                    4,
                    doctorRegisterRequest.getPatientLimit(),
                    doctorRegisterRequest.getPatientCount(),
                    doctorRegisterRequest.getRegistrationNumber(),
                    doctorRegisterRequest.getRegistrationStamp()));
            return ResponseEntity.ok("Awaiting Response from Admin");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body("Not able to register");
        }
    }

    public ResponseEntity authDoctor(doctorRegisterRequest doctorRegisterRequest) {
        try{
            doctorRepository.updateIsVerifiedByEmailIgnoreCase(true,doctorRegisterRequest.getEmail());
            authRepository.save(
                    new Auth(doctorRegisterRequest.getEmail()
                    ,doctorRegisterRequest.getPassword(),
                            "DOCTOR")
            );
            return ResponseEntity.ok("Registered Successfully");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body("Not able to register");
        }
    }

    public ResponseEntity getAllRequests() {
        try{
            List<Doctor> byIsVerified = doctorRepository.findByIsVerified(false);
            System.out.println(byIsVerified);
            return ResponseEntity.ok(byIsVerified);
        }catch (Exception e){
            System.out.println("Not able to find");
            return ResponseEntity.noContent().build();
        }
    }
}
