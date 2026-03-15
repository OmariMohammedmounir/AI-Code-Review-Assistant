package com.example.ai_review.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class OpenAIService {

    @Value("${openai.api.key}")
    private String apiKey;

    private final String OPENAI_URL = "https://api.openai.com/v1/chat/completions";

    public String analyzeCode(String code){

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        Map<String, Object> body = Map.of(
                "model","gpt-4o-mini",
                "messages", new Object[]{
                        Map.of("role","user",
                               "content","Analyze this code and return issues, description and suggestion:\n" + code)
                }
        );

        HttpEntity<Map<String,Object>> request = new HttpEntity<>(body, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(
                OPENAI_URL,
                request,
                String.class
        );

        return response.getBody();
    }
}