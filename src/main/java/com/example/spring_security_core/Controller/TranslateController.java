package com.example.spring_security_core.Controller;

import com.example.spring_security_core.entity.TranslateProjection;
import com.example.spring_security_core.servise.TranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/translate")
public class TranslateController {
    @Autowired
    TranslateService service;
    @GetMapping
    public HttpEntity<?>getTransLate(@RequestParam String text,@RequestParam Long fromLanguageId,@RequestParam Long toLanguageId){
        List<TranslateProjection> fromAndToLenguageId = service.getFromAndToLenguageId(text, fromLanguageId, toLanguageId);
        return ResponseEntity.ok(fromAndToLenguageId);
    }
}
