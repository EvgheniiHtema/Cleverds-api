package com.cleverds.controller;

import com.cleverds.logic.model.CurrentExamDto;
import com.cleverds.logic.model.ExamDto;
import com.cleverds.logic.service.CurrentExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class CurrentExamController {

    private final CurrentExamService currentExamService;

    @GetMapping("/currentExam")
    CurrentExamDto getExam() {
        return currentExamService.getExam();
    }

    @PostMapping("/startExam")
    CurrentExamDto startExam(@RequestBody String time) {
        return currentExamService.startExam(time);
    }

    @PostMapping("/selectExam")
    String selectExam(@RequestBody ExamDto exam) {
        return currentExamService.selectExam(exam);
    }
}
