package com.example.spring_security_core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "lenguage")
public class Lenguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;



}
