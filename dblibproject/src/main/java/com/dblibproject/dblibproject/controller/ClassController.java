package com.dblibproject.dblibproject.controller;

import com.dblibproject.dblibproject.entity.Classx;
import com.dblibproject.dblibproject.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping
    public Classx addClass(@RequestBody Classx classx) {
        return classService.save(classx);
    }

    @GetMapping
    public List<Classx> getAllClasses() {
        return classService.getAllClasses();
    }
}
