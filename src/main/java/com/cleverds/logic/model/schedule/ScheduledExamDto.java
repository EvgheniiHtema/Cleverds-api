package com.cleverds.logic.model.schedule;

import com.cleverds.logic.model.child.LessonDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ScheduledExamDto implements Schedule {

    private String date;

    private String day;

    private String key;

    private String subject;

    private String teacher;

    private String type;

    @Override
    public List<LessonDto> getList() {
        return null;
    }
}
