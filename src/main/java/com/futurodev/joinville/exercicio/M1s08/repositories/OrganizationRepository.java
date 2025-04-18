package com.futurodev.joinville.exercicio.M1s08.repositories;

import com.futurodev.joinville.exercicio.M1s08.entities.OrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository <OrganizationEntity, Long> {
}
