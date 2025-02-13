package com.yahia.dictionaryservice.repository;

import com.yahia.dictionaryservice.entities.Symptome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomeRepository extends JpaRepository<Symptome, Long> {
}
