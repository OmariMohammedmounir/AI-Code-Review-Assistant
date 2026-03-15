package com.example.ai_review.controller;

import com.example.ai_review.entities.*;

import com.example.ai_review.services.*;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metrics")
public class MetricsController {

    private final CodeMetricsService metricsService;

    public MetricsController(CodeMetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @PostMapping
    public CodeMetrics saveMetrics(@RequestBody CodeMetrics metrics){
        return metricsService.saveMetrics(metrics);
    }

    @GetMapping
    public List<CodeMetrics> getMetrics(){
        return metricsService.getMetrics();
    }
}