package com.yahia.dictionaryservice.service;

import com.yahia.dictionaryservice.entities.Symptome;
import com.yahia.dictionaryservice.repository.SymptomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SymptomeService {

    @Autowired
    private SymptomeRepository symptomeRepository;

    public List<Symptome> getAllSymptomes() {
        return symptomeRepository.findAll();
    }

    public Optional<Symptome> getSymptomeById(Long id) {
        return symptomeRepository.findById(id);
    }

    public Symptome createSymptome(Symptome symptome) {
        return symptomeRepository.save(symptome);
    }

    public Symptome updateSymptome(Long id, Symptome symptome) {
        if (symptomeRepository.existsById(id)) {
            symptome.setID_Symptome(id);
            return symptomeRepository.save(symptome);
        }
        return null;
    }

    public boolean deleteSymptome(Long id) {
        if (symptomeRepository.existsById(id)) {
            symptomeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
