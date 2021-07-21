package com.example.Quiz.controller.vue;

import com.example.Quiz.entity.Monster;
import com.example.Quiz.service.MonsterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/monster")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class Quiz0721Controller {

    @Autowired
    private MonsterService service;

    @PostMapping("/create")
    public ResponseEntity<Monster> create(@Validated @RequestBody Monster monster) throws Exception {
        log.info("/create monster");

        service.create(monster);

        return new ResponseEntity<>(monster, HttpStatus.OK);
    }

}
