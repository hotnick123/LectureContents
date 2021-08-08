package com.example.demo.controller.vue;

import com.example.demo.entity.Student;
import com.example.demo.service.VueStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/vuestudent")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueStudentController {

    @Autowired
    private VueStudentService service;

    @GetMapping("/grades")
    public ResponseEntity<List<Student>> getStudentGrades () throws Exception {
        log.info("getGrades()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
}