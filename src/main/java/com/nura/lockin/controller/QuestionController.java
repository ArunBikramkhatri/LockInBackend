package com.nura.lockin.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @GetMapping("/fetch")
    public ResponseEntity<String> fetchQuestions(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-header", "String");
        return ResponseEntity.ok().headers(headers).body("question1");
    }

    @GetMapping("/error")
    public ResponseEntity<String> simulateError(){
        return ResponseEntity.badRequest().body("Invalid request");
    }
}
