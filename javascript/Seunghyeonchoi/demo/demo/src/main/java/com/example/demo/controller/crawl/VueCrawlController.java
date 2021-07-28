package com.example.demo.controller.crawl;


import com.example.demo.entity.DaumNews;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueCrawlController {

    @Autowired
    VueDaumNewsCrawlService service;

    @GetMapping("{category}")
    public List<DaumNews> getDaumNewsCategory(@pathVariable String category) {
        log.info("Crawling with getDaumNewsCategory" + category);

//        service.mainDaumCrawler(category);

//        return service.newsFindAll();
    }

}
