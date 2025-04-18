package com.futurodev.joinville.exercicio.M1s08.services;

import com.futurodev.joinville.exercicio.M1s08.entities.OrganizationEntity;
import com.futurodev.joinville.exercicio.M1s08.repositories.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository repository){
        this.organizationRepository = repository;
    }

    public List<OrganizationEntity> findAll(){
        return organizationRepository.findAll();
    }

    public OrganizationEntity findById(Long id){
        return organizationRepository.findById(id).orElse(null);
    }

    public OrganizationEntity create(OrganizationEntity organization){
        return organizationRepository.save(organization);
    }

    public OrganizationEntity update(Long id, OrganizationEntity organization){
        if(!organizationRepository.existsById(id)){
            return null;
        }
        organization.setId(id);
        return organizationRepository.save(organization);
    }

    public OrganizationEntity delete(Long id){
        if(!organizationRepository.existsById(id)){
            return null;
        }
        OrganizationEntity organization = organizationRepository.findById(id).orElse(null);
        organizationRepository.delete(organization);
        return organization;
    }



}
