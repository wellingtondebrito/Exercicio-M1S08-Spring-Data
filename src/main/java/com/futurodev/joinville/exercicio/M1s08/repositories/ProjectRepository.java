package com.futurodev.joinville.exercicio.M1s08.repositories;

import com.futurodev.joinville.exercicio.M1s08.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
