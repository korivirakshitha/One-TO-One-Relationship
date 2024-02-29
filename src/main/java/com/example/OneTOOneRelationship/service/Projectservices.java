package com.example.OneTOOneRelationship.service;


import com.example.OneTOOneRelationship.model.Project;
import com.example.OneTOOneRelationship.repository.Projectrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Projectservices {
    @Autowired
    private Projectrepository repo;
    public Project addProject(Project project){
        return repo.save(project);
    }
    public Project saveProject(Project project){
        return repo.save(project);
    }
}