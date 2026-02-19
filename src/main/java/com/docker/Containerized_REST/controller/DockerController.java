package com.docker.Containerized_REST.controller;

import com.docker.Containerized_REST.service.DockerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/Docker")
@RequiredArgsConstructor
public class DockerController {
    private final DockerService service;

    @GetMapping("/date")
    public LocalDate getTodayDate(){
        return service.getDate();
    }

    @GetMapping("/dateTime")
    public LocalDateTime getTodayDateAndTime(){
        return service.getDateAndTime();
    }
}
