package com.yahia.dictionaryservice.service;

import com.yahia.dictionaryservice.entities.Provoquer;
import com.yahia.dictionaryservice.entities.ProvoquerPK;
import com.yahia.dictionaryservice.repository.ProvoquerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvoquerService {

    @Autowired
    private ProvoquerRepository provoquerRepository;

    public List<Provoquer> getAllProvoques() {
        return provoquerRepository.findAll();
    }

    public Provoquer getProvoquerById(ProvoquerPK id) {
        return provoquerRepository.findById(id).orElse(null);
    }

    public Provoquer createProvoquer(Provoquer provoquer) {
        return provoquerRepository.save(provoquer);
    }

    public Provoquer updateProvoquer(ProvoquerPK id, Provoquer provoquer) {
        if (provoquerRepository.existsById(id)) {
            return provoquerRepository.save(provoquer);
        }
        return null;
    }

    public boolean deleteProvoquer(ProvoquerPK id) {
        if (provoquerRepository.existsById(id)) {
            provoquerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
