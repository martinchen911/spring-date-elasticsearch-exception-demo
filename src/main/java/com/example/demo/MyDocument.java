package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Range;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalTime;
import java.util.List;


@Document(indexName = "mydocument")
public class MyDocument {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Date_Range, format = DateFormat.hour_minute)
    private List<Range<LocalTime>> businessHours;

    public MyDocument(String id, List<Range<LocalTime>> businessHours) {
        this.id = id;
        this.businessHours = businessHours;
    }

    public MyDocument() {
    }
}
