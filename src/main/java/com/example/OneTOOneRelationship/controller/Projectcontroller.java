package com.example.OneTOOneRelationship.controller;


import com.example.OneTOOneRelationship.model.Project;
import com.example.OneTOOneRelationship.service.Projectservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/project")
    public class Projectcontroller {
        @Autowired
        private Projectservices projectService;
        @PostMapping("/add")
        public Project addProject(@RequestBody Project project){
            return projectService.addProject(project);
        }
    }

