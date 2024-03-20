package com.example.spring_security_core.servise.impl;

import com.example.spring_security_core.entity.Translate;
import com.example.spring_security_core.entity.TranslateProjection;
import com.example.spring_security_core.repo.TranslateRepo;
import com.example.spring_security_core.servise.TranslateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TranslateImpl implements TranslateService {
    private final TranslateRepo translateRepo;

    @Override
    public List<TranslateProjection> getFromAndToLenguageId(String text, Long fromLanguageId, Long toLanguageId) {
        List<Translate> text1 = translateRepo.getTextIgnoreCase(text);
        if (!text1.isEmpty()) {
            return translateRepo.getTranslate(toLanguageId, fromLanguageId);
        }
        return Collections.emptyList();
    }


}
