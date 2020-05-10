package com.cleverds.logic.model.child;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SettingsDto {

    private String cabinet;

    private String date;

    private String duration;

    private ArrayList<String> examiners;

    private String group;

    private String subject;
}
