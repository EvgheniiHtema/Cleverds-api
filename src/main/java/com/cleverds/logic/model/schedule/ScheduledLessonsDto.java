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
public class ScheduledLessonsDto implements Schedule {

    private String date;

    private String day;

    private String key;

    private List<LessonDto> list;

    private String teacher;

    private String type;

    @JsonIgnore
    public String getSubject() {
        return null;
    }
}
