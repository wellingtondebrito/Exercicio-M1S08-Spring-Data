package com.futurodev.joinville.exercicio.M1s08.controllers;

import com.futurodev.joinville.exercicio.M1s08.entities.OrganizationEntity;
import com.futurodev.joinville.exercicio.M1s08.services.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController (OrganizationService service) {
        this.organizationService = service;
    }

    @GetMapping
    public List<OrganizationEntity> findAll() {
        return organizationService.findAll();
    }
    @GetMapping("/{id}")
    public OrganizationEntity findById(Long id) {
        return organizationService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationEntity create(@RequestBody  OrganizationEntity organization) {
        return organizationService.create(organization);
    }

    @PutMapping("/{id}")
    public OrganizationEntity update(@PathVariable Long id, @RequestBody OrganizationEntity organization) {
        return organizationService.update(id, organization);
    }
    @DeleteMapping("/{id}")
    public OrganizationEntity delete(@PathVariable Long id) {
        return organizationService.delete(id);
    }


}
