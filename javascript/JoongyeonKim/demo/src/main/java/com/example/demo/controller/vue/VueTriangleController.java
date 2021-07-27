package com.example.demo.controller.vue;

import com.example.demo.entity.Product;
import com.example.demo.entity.Student;
import com.example.demo.entity.Triangle;
import com.example.demo.service.VueStudentService;
import com.example.demo.service.VueTriangleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/vuetriangle")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueTriangleController {

    @Autowired
    private VueTriangleService service;

    @PostMapping("/register")
    public ResponseEntity<Triangle> register(@Validated @RequestBody Triangle triangle) {
        log.info("post register request from vue");

        service.register(triangle);

        return new ResponseEntity<>(triangle, HttpStatus.OK);
    }
}
