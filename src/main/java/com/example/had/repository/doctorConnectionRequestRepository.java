package com.example.had.repository;

import com.example.had.entity.DoctorConnectionRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface doctorConnectionRequestRepository extends JpaRepository<DoctorConnectionRequest, UUID> {
    @Query("select d from DoctorConnectionRequest d where d.user.id = ?1")
    List<DoctorConnectionRequest> findByUser_Id(UUID id);
    void deleteByUser_Id(UUID id);
    @Query("select d from DoctorConnectionRequest d where d.user.id = ?1 and d.doctor.id = ?2")
    DoctorConnectionRequest findByUser_IdAndDoctor_Id(UUID id, UUID id1);
    @Query("select d from DoctorConnectionRequest d where d.doctor.id = ?1")
    List<DoctorConnectionRequest> findByDoctor_Id(UUID id);
}
