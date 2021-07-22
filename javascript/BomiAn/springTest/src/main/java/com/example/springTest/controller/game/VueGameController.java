package com.example.springTest.controller.game;

import com.example.springTest.entity.game.Monster;
import com.example.springTest.service.game.VueMonsterService;
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
@RequestMapping("/vuemonster")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueGameController {

    @Autowired
    private VueMonsterService service;

    @PostMapping("/registerMon")
    public ResponseEntity<Monster> getRegisterMonster (@Validated @RequestBody Monster monster) throws Exception {
        log.info("post register request from vue");

        service.register(monster);
        return new ResponseEntity<>(monster, HttpStatus.OK);
    }

    @GetMapping("/listsMon")
    public ResponseEntity<List<Monster>> getListsMonster () throws Exception {
        log.info("getLists(): " + service.list());

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
}
