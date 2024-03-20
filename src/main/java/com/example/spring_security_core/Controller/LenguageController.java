package com.example.spring_security_core.Controller;

import com.example.spring_security_core.entity.Lenguage;
import com.example.spring_security_core.entity.TranslateProjection;
import com.example.spring_security_core.servise.LenguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/lenguage")
public class LenguageController {
    @Autowired
    LenguageService service;
    @GetMapping
    public HttpEntity<?> getLenguage(){
        List<Lenguage> allLenguage = service.getAllLenguage();
        return ResponseEntity.ok(allLenguage);
    }
}
