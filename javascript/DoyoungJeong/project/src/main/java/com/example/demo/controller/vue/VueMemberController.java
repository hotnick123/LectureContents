package com.example.demo.controller.vue;

import com.example.demo.entity.VueMember;
import com.example.demo.service.VueMemberService;
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
@RequestMapping("/vuemember")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")

public class VueMemberController {

    @Autowired
    private VueMemberService service;

    @PostMapping("/signup")
    public ResponseEntity<VueMember> signup(@Validated @RequestBody VueMember member) throws Exception {
        //@RequestBody은 값을 JSON형태로 출력되게한다.

        log.info("post signup request from vue");

        service.register(member);

        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<VueMember>> getList() throws Exception {
        log.info("getLists(): " + service.list());

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @GetMapping("/{memberNo}")
    public ResponseEntity<VueMember> read(@PathVariable("memberNo") Integer memberNo) throws Exception {
        VueMember member = service.read(memberNo);

        return new ResponseEntity<VueMember>(member, HttpStatus.OK);
    }
}
