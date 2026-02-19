package com.docker.Containerized_REST.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class DockerService {

    public LocalDate getDate(){
        return LocalDate.now();
    }

    public LocalDateTime getDateAndTime(){
        return LocalDateTime.now();
    }
}
