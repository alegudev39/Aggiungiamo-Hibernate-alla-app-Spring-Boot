package com.dblibproject.dblibproject.repository;

import com.dblibproject.dblibproject.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    // count
    int countByStudentId(Long studentId);
}
