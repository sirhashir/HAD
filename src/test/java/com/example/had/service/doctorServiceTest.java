package com.example.had.service;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.had.entity.Doctor;
import com.example.had.repository.doctorConnectionRequestRepository;
import com.example.had.repository.doctorRepository;
import com.example.had.repository.userRepository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {doctorService.class})
@ExtendWith(SpringExtension.class)
class doctorServiceTest {
    @MockBean
    private doctorConnectionRequestRepository doctorConnectionRequestRepository;

    @MockBean
    private doctorRepository doctorRepository;

    @Autowired
    private doctorService doctorService;

    @MockBean
    private userRepository userRepository;

    /**
     * Method under test: {@link doctorService#getProfile(UUID)}
     */
    @Test
    void testGetProfile() {
        // Arrange
        UUID uuid = UUID.fromString("2c8fbe95-f81b-46fa-9c3e-811a63b97ea5");
        Doctor doctor = new Doctor();
        doctor.setAddress("42 Main St");
        doctor.setAge(1);
        doctor.setChatList(new ArrayList<>());
        doctor.setContact("Contact");
        doctor.setDegree("Degree");
        doctor.setEmail("jane.doe@example.org");
        doctor.setExperience(1);
        doctor.setFirstName("Jane");
        doctor.setGender("Gender");
        doctor.setId(UUID.randomUUID());
        doctor.setImageUrl("https://example.org/example");
        doctor.setLastName("Doe");
        doctor.setMiddleName("Middle Name");
        doctor.setPatientCount(3);
        doctor.setPatientLimit(1);
        doctor.setRating(1);
        doctor.setRegistrationNumber("42");
        doctor.setRegistrationStamp("Registration Stamp");
        doctor.setSpecialisation("Specialisation");
        doctor.setUserList(new ArrayList<>());
        doctor.setVerified(true);
        Optional<Doctor> ofResult = Optional.of(doctor);
        when(doctorRepository.findById(uuid)).thenReturn(ofResult);

        // Act and Assert
        assertSame(doctor, doctorService.getProfile(uuid));
        verify(doctorRepository).findById(uuid);
    }

    /**
     * Method under test: {@link doctorService#getProfile(UUID)}
     */
    @Test
    void testGetProfile2() {
        UUID uuid = UUID.fromString("2c8fbe95-f81b-46fa-9c3e-811a63b97ea5");
        // Arrange
        when(doctorRepository.findById(uuid)).thenReturn(Optional.empty());

        // Act and Assert
        assertNull(doctorService.getProfile(uuid));
        verify(doctorRepository).findById(uuid);
    }

    /**
     * Method under test: {@link doctorService#getProfile(UUID)}
     */
    @Test
    void testGetProfile3() {
        UUID uuid = UUID.fromString("2c8fbe95-f81b-46fa-9c3e-811a63b97ea5");
        // Arrange
        when(doctorRepository.findById(uuid)).thenThrow(new RuntimeException());

        // Act and Assert
        assertNull(doctorService.getProfile(uuid));
        verify(doctorRepository).findById(uuid);
    }
}

