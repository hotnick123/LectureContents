package com.example.projectTest.controller;

import com.example.projectTest.entity.Project;

import com.example.projectTest.service.VueProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/first")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueProjectController {

    @Autowired
    private VueProjectService service;

    @PostMapping("/register")
    public ResponseEntity<Project> register(@Validated @RequestBody Project project) throws Exception {
        log.info("post register request from vue");

        service.register(project);

        return new ResponseEntity<>(project, HttpStatus.OK);
    }

   /* @GetMapping("/lists")
    public ResponseEntity<List<Board>> getLists () throws Exception {
        log.info("getLists(): " + service.list());

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<Board> read(@PathVariable("boardNo") Integer boardNo) throws Exception {
        Board board = service.read(boardNo);

        return new ResponseEntity<Board>(board, HttpStatus.OK);
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<Board> modify(@PathVariable("boardNo") Integer boardNo,
                                        @Validated @RequestBody Board board) throws Exception {
        board.setBoardNo(boardNo);
        service.modify(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @DeleteMapping("/{boardNo}")
    public ResponseEntity<Void> remove(@PathVariable("boardNo") Integer boardNo) throws  Exception{
        service.remove(boardNo);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }*/
}