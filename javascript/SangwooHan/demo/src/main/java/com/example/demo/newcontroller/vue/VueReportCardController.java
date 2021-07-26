package com.example.demo.newcontroller.vue;

import com.example.demo.entity.Monster;
import com.example.demo.entity.Reportcard;
import com.example.demo.service.VueMonsterService;
import com.example.demo.service.VueReportcardService;
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
@RequestMapping("/vuereportcard")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueReportCardController {

    @Autowired
    private VueReportcardService service;

    @PostMapping("/register")
    public ResponseEntity<Reportcard> registerReportcard(@Validated @RequestBody Reportcard reportcard) throws Exception {
        log.info("post register request from vue");

        service.register(reportcard);

        return new ResponseEntity<>(reportcard, HttpStatus.OK);
    }

    @GetMapping("/lists")
    public ResponseEntity<List<Reportcard>> getListsReportcard () throws Exception {
        log.info("getLists(): " + service.list());

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @GetMapping("/{reportcardNo}")
    public ResponseEntity<Reportcard> read(@PathVariable("reportcardNo") Integer reportcardNo) throws Exception {
        Reportcard reportcard = service.read(reportcardNo);

        return new ResponseEntity<Reportcard>(reportcard, HttpStatus.OK);
    }

    @PutMapping("/{reportcardNo}")
    public ResponseEntity<Reportcard> modifyReportcard(@PathVariable("reportcardNo") Integer reportcardNo,
                                                    @Validated @RequestBody Reportcard reportcard) throws Exception {

        log.info("modifyReportcard() - ReportcardNo: " + reportcardNo);

       reportcard.setReportcardNo(reportcardNo);

        log.info("modifyReportcard(): " + reportcard);

        service.modify(reportcard);

        return new ResponseEntity<>(reportcard, HttpStatus.OK);
    }

    @DeleteMapping("/{reportcardNo}")
    public ResponseEntity<Void> remove(@PathVariable("reportcardNo") Integer reportcardNo) throws Exception {
        service.remove(reportcardNo);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}