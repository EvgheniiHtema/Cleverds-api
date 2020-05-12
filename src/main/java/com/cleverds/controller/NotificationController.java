package com.cleverds.controller;

import com.cleverds.logic.model.NotificationDto;
import com.cleverds.logic.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.OK;

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping("/notifications/all")
    List<NotificationDto> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @PostMapping("/notifications")
    Response addNotification(@RequestBody NotificationDto notification) {
        notificationService.addNotification(notification);
        return Response.status(OK).build();
    }

    @DeleteMapping("/notifications")
    List<NotificationDto> expired(@RequestBody NotificationDto notification) {
        return notificationService.deleteNotification(notification);
    }
}
