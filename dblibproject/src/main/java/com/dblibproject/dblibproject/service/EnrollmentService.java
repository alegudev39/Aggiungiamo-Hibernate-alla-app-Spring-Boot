package com.dblibproject.dblibproject.service;

import com.dblibproject.dblibproject.entity.Enrollment;
import com.dblibproject.dblibproject.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment save(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public int getEnrollmentsCountByStudentId(Long studentId) {
        return enrollmentRepository.countByStudentId(studentId);
    }
}
