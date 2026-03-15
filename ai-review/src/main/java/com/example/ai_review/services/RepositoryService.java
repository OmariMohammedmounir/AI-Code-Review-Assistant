package com.example.ai_review.services;

import com.example.ai_review.entities.*;

import com.example.ai_review.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryService {

    private final RepositoryRepository repositoryRepository;

    public RepositoryService(RepositoryRepository repositoryRepository) {
        this.repositoryRepository = repositoryRepository;
    }

    public Repository saveRepository(Repository repository){
        return repositoryRepository.save(repository);
    }

    public List<Repository> getAllRepositories(){
        return repositoryRepository.findAll();
    }

    public Repository getRepository(Long id){
        return repositoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Repository not found"));
    }
}