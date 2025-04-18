package com.futurodev.joinville.exercicio.M1s08.services;

import com.futurodev.joinville.exercicio.M1s08.entities.ProjectEntity;
import com.futurodev.joinville.exercicio.M1s08.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
    public ProjectService(ProjectRepository repository) {
        this.projectRepository = repository;
    }

    public List<ProjectEntity> findAll() {
        return projectRepository.findAll();
    }
    public ProjectEntity findById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
    public ProjectEntity create(ProjectEntity project) {
        return projectRepository.save(project);
    }
    public ProjectEntity update(Long id, ProjectEntity project) {
        if (!projectRepository.existsById(id)) {
            return null;
        }
        project.setId(id);
        return projectRepository.save(project);
    }
    public ProjectEntity delete(Long id) {
        if (!projectRepository.existsById(id)) {
            return null;
        }
        ProjectEntity project = projectRepository.findById(id).orElse(null);
        projectRepository.delete(project);
        return project;
    }
}
