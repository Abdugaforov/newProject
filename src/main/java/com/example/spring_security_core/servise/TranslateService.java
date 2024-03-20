package com.example.spring_security_core.servise;

import com.example.spring_security_core.entity.Translate;
import com.example.spring_security_core.entity.TranslateProjection;

import java.util.List;

public interface TranslateService {
    List<TranslateProjection> getFromAndToLenguageId(String text, Long fromLenguageId, Long toLenguage);
}
