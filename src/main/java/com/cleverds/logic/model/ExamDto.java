package com.cleverds.logic.model;

import com.cleverds.logic.model.child.SettingsDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExamDto {

    private Long key;

    private ArrayList<QuestionDto> questions;

    private SettingsDto settings;
}
