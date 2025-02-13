package com.yahia.caseservice.service;

import com.yahia.caseservice.entities.Pathologie;
import com.yahia.caseservice.repository.PathologieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PathologieService {

    @Autowired
    private PathologieRepository pathologieRepository;

    public List<Pathologie> getAllPathologies() {
        return pathologieRepository.findAll();
    }

    public Optional<Pathologie> getPathologieById(Long id) {
        return pathologieRepository.findById(id);
    }

    public Pathologie createPathologie(Pathologie pathologie) {
        return pathologieRepository.save(pathologie);
    }

    public Pathologie updatePathologie(Long id, Pathologie pathologie) {
        if (pathologieRepository.existsById(id)) {
            pathologie.setID_Pathologie(id);
            return pathologieRepository.save(pathologie);
        }
        return null;
    }

    public boolean deletePathologie(Long id) {
        if (pathologieRepository.existsById(id)) {
            pathologieRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
