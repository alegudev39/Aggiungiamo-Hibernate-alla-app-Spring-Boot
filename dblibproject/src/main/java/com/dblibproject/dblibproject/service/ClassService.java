package com.dblibproject.dblibproject.service;

import com.dblibproject.dblibproject.entity.Classx;
import com.dblibproject.dblibproject.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public Classx save(Classx classx) {
        return classRepository.save(classx);
    }

    public List<Classx> getAllClasses() {
        return classRepository.findAll();
    }
}
