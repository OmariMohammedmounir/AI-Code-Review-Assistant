package com.example.ai_review.controller;

import com.example.ai_review.entities.*;

import com.example.ai_review.services.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/api/analysis")
public class AIAnalysisController {

    private final AIAnalysisService aiAnalysisService;

    public AIAnalysisController(AIAnalysisService aiAnalysisService) {
        this.aiAnalysisService = aiAnalysisService;
    }

    @PostMapping("/analyze")
    public AIAnalysis analyzeCode(@RequestBody String code){

        return aiAnalysisService.analyzeCode(code);
    }

    @GetMapping
    public List<AIAnalysis> getAllAnalysis(){
        return aiAnalysisService.getAllAnalysis();
    }
}