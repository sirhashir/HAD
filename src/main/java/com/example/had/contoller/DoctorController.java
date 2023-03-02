package com.example.had.contoller;

import com.example.had.entity.User;
import com.example.had.service.doctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
    private final doctorService doctorService;

    public DoctorController(doctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/dashboard/get-reg-patients")
    @PreAuthorize("hasRole('ROLE_DOCTOR')")
    public List<User> getRegisteredPatients(@RequestBody String doctorId){
        return doctorService.getRegisteredPatients(doctorId);
    }
    @GetMapping("/dashboard/requests/{doctorId}")
    @PreAuthorize("hasRole('ROLE_DOCTOR')")
    public ResponseEntity<List<User>> getRequests(@PathVariable UUID doctorId){
        List<User> requests = doctorService.getRequests(doctorId);
        return ResponseEntity.ok(requests);
    }
    @GetMapping("/dashboard/request-response/{doctorId}/{userId}")
    @PreAuthorize("hasRole('ROLE_DOCTOR')")
    public ResponseEntity<String> getOrder(
            @PathVariable UUID doctorId,
            @PathVariable UUID userId
    ) {
        doctorService.getResponse(doctorId, userId);
        return ResponseEntity.ok(doctorId.toString()+" "+userId.toString());
    }
}
