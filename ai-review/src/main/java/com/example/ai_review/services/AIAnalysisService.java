package com.example.ai_review.services;

import com.example.ai_review.entities.*;

import com.example.ai_review.repository.*;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AIAnalysisService {

    private final AIAnalysisRepository repository;
    private final OpenAIService openAIService;

    public AIAnalysisService(AIAnalysisRepository repository,
                             OpenAIService openAIService) {
        this.repository = repository;
        this.openAIService = openAIService;
    }

    public AIAnalysis analyzeCode(String code){

        String aiResponse = openAIService.analyzeCode(code);

        AIAnalysis analysis = new AIAnalysis();

        analysis.setIssueType("AI Review");
        analysis.setDescription(aiResponse);
        analysis.setSuggestion("See AI explanation");
        analysis.setSeverity(AIAnalysis.Severity.MEDIUM);

        return repository.save(analysis);
    }
     public List<AIAnalysis> getAllAnalysis(){
        return repository.findAll();
    }
}