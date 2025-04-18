package com.futurodev.joinville.exercicio.M1s08.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    private String description;

    private String region;
    @Column(nullable = false)
    private double reduction;

    @ManyToOne
    private OrganizationEntity organization;
}
