package com.cleverds.controller;

import com.cleverds.logic.model.schedule.Schedule;
import com.cleverds.logic.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/schedule")
    List<Schedule> getSchedule(){
        return scheduleService.getSchedule();
    }

    @PostMapping("/schedule")
    List<Schedule> addEvent(Schedule schedule){
        return scheduleService.addEvent(schedule);
    }
}
