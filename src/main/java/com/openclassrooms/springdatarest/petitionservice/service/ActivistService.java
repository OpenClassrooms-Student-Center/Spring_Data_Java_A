package com.openclassrooms.springdatarest.petitionservice.service;

import com.openclassrooms.springdatarest.petitionservice.domain.Activist;
import com.openclassrooms.springdatarest.petitionservice.repository.ActivistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.Optional;

/**
 * Provides capabilities for creating and managing Activists
 */
@Service
public class ActivistService {

    @Autowired
    ActivistRepository activistRepository;

    /**
     * Creates a new activist in our system
     * @param activist to be created
     * @return Activist created
     */
    public Activist createActivist(Activist activist) {
        return activistRepository.save(activist);
    }

    /**
     * Fetches an Activist from the database
     * @param id of the activist
     * @return Optional&gt;Activist&lt; retrieved
     * @throws EntityNotFoundException when the Activist is not there
     */
    public Optional<Activist> getActivistById(Long id) {
        return activistRepository.findById(id);
    }
}