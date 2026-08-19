package com.julian.curso.springboot.calendar.interceptor.springboot_horario.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppController {

    @GetMapping("/inicio")
    public ResponseEntity<?> inicio(HttpServletRequest request){
        Map<String, String> data = new HashMap<>(); 
        data.put("title", "Bienvenido al sistema de atención de citas");
        data.put("date", new Date().toString());
        data.put("message", (String) request.getAttribute("message"));
        return ResponseEntity.ok(data);
    }
}
