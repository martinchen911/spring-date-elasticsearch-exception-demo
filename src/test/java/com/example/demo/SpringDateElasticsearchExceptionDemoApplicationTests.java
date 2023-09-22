package com.example.demo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Range;

import java.time.LocalTime;
import java.util.List;

@SpringBootTest(classes = SpringDateElasticsearchExceptionDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringDateElasticsearchExceptionDemoApplicationTests {

    @Resource
    private MyDocumentRepository repository;


    @Test
    void text() {
        MyDocument myDocument = new MyDocument("1", List.of(Range.closed(LocalTime.of(9, 0), LocalTime.of(18, 0))));
        repository.save(myDocument);
    }

}
