package com.example.ai_review.services;

import com.example.ai_review.entities.*;

import com.example.ai_review.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeMetricsService {

    private final CodeMetricsRepository codeMetricsRepository;

    public CodeMetricsService(CodeMetricsRepository codeMetricsRepository) {
        this.codeMetricsRepository = codeMetricsRepository;
    }

    public CodeMetrics saveMetrics(CodeMetrics metrics){
        return codeMetricsRepository.save(metrics);
    }

    public List<CodeMetrics> getMetrics(){
        return codeMetricsRepository.findAll();
    }
}