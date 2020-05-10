package com.cleverds.controller;

import com.cleverds.logic.model.NotificationDto;
import com.cleverds.logic.service.NotificationService;
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
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping("/notifications/all")
    List<NotificationDto> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @PostMapping("/notifications")
    List<NotificationDto> addNotification(@RequestBody NotificationDto notification) {
        return notificationService.addNotification(notification);
    }

    @DeleteMapping("/notifications")
    List<NotificationDto> expired(@RequestBody NotificationDto notification) {
        return notificationService.deleteNotification(notification);
    }
}
