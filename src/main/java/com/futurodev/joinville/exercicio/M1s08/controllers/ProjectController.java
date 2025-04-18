package com.futurodev.joinville.exercicio.M1s08.controllers;

import com.futurodev.joinville.exercicio.M1s08.entities.ProjectEntity;
import com.futurodev.joinville.exercicio.M1s08.services.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService service) {
        this.projectService = service;
    }

    @GetMapping
    public List<ProjectEntity> findAll() {
        return projectService.findAll();
    }
    @GetMapping("/{id}")
    public ProjectEntity findById(Long id) {
        return projectService.findById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectEntity create(@RequestBody  ProjectEntity project) {
        return projectService.create(project);
    }

    @PutMapping("/{id}")
    public ProjectEntity update(@PathVariable Long id, @RequestBody ProjectEntity project) {
        return projectService.update(id, project);
    }
    @DeleteMapping("/{id}")
    public ProjectEntity delete(@PathVariable Long id) {
        return projectService.delete(id);
    }

}
