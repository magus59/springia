package com.yahia.dictionaryservice.dtos;

import com.yahia.dictionaryservice.entities.Pathologie;
import com.yahia.dictionaryservice.entities.Symptome;
import java.util.List;

public class PathologieDTO {

    private Pathologie pathologie;
    private List<Symptome> symptomes;

    // Constructeur avec arguments
    public PathologieDTO(Pathologie pathologie, List<Symptome> symptomes) {
        this.pathologie = pathologie;
        this.symptomes = symptomes;
    }

    // Getters et Setters
    public Pathologie getPathologie() {
        return pathologie;
    }

    public void setPathologie(Pathologie pathologie) {
        this.pathologie = pathologie;
    }

    public List<Symptome> getSymptomes() {
        return symptomes;
    }

    public void setSymptomes(List<Symptome> symptomes) {
        this.symptomes = symptomes;
    }
}
