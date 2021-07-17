package com.example.demo.controller.vue;

import com.example.demo.entity.Board;
import com.example.demo.service.VueBoardService;
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
@RequestMapping("/vueboard")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")

public class VueBoardController {

    @Autowired
    private VueBoardService service;

    @PostMapping("/register")
    public ResponseEntity<Board> register(@Validated @RequestBody Board board) throws Exception {
        log.info("post register request from vue");

        service.register(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
    //ResponseEntity형식으로 쓰면 데이터가 JSON으로 변환

    @GetMapping("/list")
    public ResponseEntity<List<Board>> getList() throws Exception {
        log.info("getLists(): " + service.list());

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<Board> read(@PathVariable("boardNo") Integer boardNo) throws Exception {
        Board board = service.read(boardNo);

        return new ResponseEntity<Board>(board, HttpStatus.OK);
    }
}
