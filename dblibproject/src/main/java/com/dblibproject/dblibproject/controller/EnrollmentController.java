package com.dblibproject.dblibproject.controller;

import com.dblibproject.dblibproject.entity.Enrollment;
import com.dblibproject.dblibproject.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.save(enrollment);
    }

    @GetMapping("/count/{studentId}")
    public int getEnrollmentsCountByStudentId(@PathVariable Long studentId) {
        return enrollmentService.getEnrollmentsCountByStudentId(studentId);
    }
}
