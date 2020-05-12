package com.cleverds.controller;

import com.cleverds.logic.model.QuestionDto;
import com.cleverds.logic.service.QuestionServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class QuestionsController {

    private final QuestionServise questionServise;

    @GetMapping("/questions")
    QuestionDto getQuestion(@RequestHeader String key) {
        return questionServise.getQuestion(key);
    }

    @GetMapping("/questions/all")
    List<QuestionDto> getAllQuestions() {
        return questionServise.getAllQuestions();
    }

    @PostMapping("/questions")
    List<QuestionDto> createQuestion(@RequestBody QuestionDto question) {
        return questionServise.createQuestion(question);
    }

    @PutMapping("/questions")
    List<QuestionDto> updateQuestion(@RequestBody QuestionDto question) {
        return questionServise.updateQuestion(question);
    }

    @DeleteMapping("/questions")
    List<QuestionDto> deleteQuestion(@RequestBody QuestionDto question) {
        return questionServise.deleteQuestion(question);
    }
}
