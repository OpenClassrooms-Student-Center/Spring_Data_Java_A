package com.openclassrooms.springdatarest.petitionservice.repository;

import com.openclassrooms.springdatarest.petitionservice.domain.Petition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;


@RepositoryRestResource(collectionResourceRel = "patch-petitions", path = "patch-petitions")
public interface PetitionRepository extends CrudRepository<Petition, Long> {

    @RestResource(exported = false)
    @Override
    Optional<Petition> findById(Long aLong);

    @RestResource(exported = false)
    @Override
    Iterable<Petition> findAll();

    @RestResource(exported = false)
    @Override
    void deleteById(Long aLong);

    @RestResource(exported = false)
    @Override
    void deleteAll();
}