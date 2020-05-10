package com.cleverds.controller;

import com.cleverds.logic.model.AnswerDto;
import com.cleverds.logic.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
public class AnswerController {

    private final AnswerService answerService;

    @GetMapping("/answers/all")
    List<AnswerDto> getAllAnswers() {
        return answerService.getAllAnswers();
    }

    @PostMapping("/answers")
    List<AnswerDto> addAnswer(@RequestBody AnswerDto answerDto) {
        return answerService.addAnswer(answerDto);
    }

    @PutMapping("/answers")
    List<AnswerDto> updateAnswer(@RequestBody AnswerDto answerDto) {
        return answerService.updateAnswer(answerDto);
    }

    @DeleteMapping("/answers")
    List<AnswerDto> deleteAnswer(@RequestBody AnswerDto answerDto) {
        return answerService.deleteAnswer(answerDto);
    }
}
