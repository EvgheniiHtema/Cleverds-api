package com.cleverds.logic.model.schedule;

import com.cleverds.logic.model.child.LessonDto;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

public interface Schedule {

    String getKey();

    String getType();

    String getDate();

    String getDay();

    @JsonIgnore
    String getSubject();

    String getTeacher();

    @JsonIgnore
    List<LessonDto> getList();
}
