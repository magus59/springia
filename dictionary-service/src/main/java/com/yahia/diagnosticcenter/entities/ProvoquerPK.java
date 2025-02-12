package com.yahia.dictionaryservice.entities;

import java.io.Serializable;
import java.util.Objects;

public class ProvoquerPK implements Serializable {

    private Long pathologie;
    private Long symptome;

    public ProvoquerPK() {}

    public ProvoquerPK(Long pathologie, Long symptome) {
        this.pathologie = pathologie;
        this.symptome = symptome;
    }

    public Long getPathologie() {
        return pathologie;
    }

    public void setPathologie(Long pathologie) {
        this.pathologie = pathologie;
    }

    public Long getSymptome() {
        return symptome;
    }

    public void setSymptome(Long symptome) {
        this.symptome = symptome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProvoquerPK that = (ProvoquerPK) o;
        return Objects.equals(pathologie, that.pathologie) && Objects.equals(symptome, that.symptome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathologie, symptome);
    }
}
