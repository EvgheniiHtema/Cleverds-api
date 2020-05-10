package com.cleverds.controller;

import com.cleverds.logic.model.ExamDto;
import com.cleverds.logic.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@RestController
@RequiredArgsConstructor
public class ExamController {

    private final ExamService examService;

    @PostMapping("/exams")
    String createExam(@RequestBody ExamDto exam){
        return examService.createExam(exam);
    }

    @GetMapping("/exams/all")
    List<ExamDto> loadExams(){
        return examService.getAllExams();
    }

    @DeleteMapping("/exams")
    List<ExamDto> deleteExam(@RequestBody ExamDto exam){
        return examService.deleteExam(exam);
    }
}
