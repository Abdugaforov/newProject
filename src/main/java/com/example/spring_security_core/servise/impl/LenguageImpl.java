package com.example.spring_security_core.servise.impl;

import com.example.spring_security_core.entity.Lenguage;
import com.example.spring_security_core.repo.LenguageRepo;
import com.example.spring_security_core.servise.LenguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LenguageImpl implements LenguageService {
 private final LenguageRepo repo;
    @Override
    public List<Lenguage> getAllLenguage() {
        return repo.findAll();
    }
}
