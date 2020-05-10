package com.cleverds.logic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AnswerDto {

    private Boolean isTrue;

    private Long key;

    private String name;

    private Long questionId;
}
