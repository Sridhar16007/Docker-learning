package com.docker.docker_demo_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping("/getstudents")
    public List<Student> getStudents()
    {
        return studentRepo.findAll();
    }
}
