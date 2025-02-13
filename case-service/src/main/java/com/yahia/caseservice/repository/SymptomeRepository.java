package com.yahia.caseservice.repository;

import com.yahia.caseservice.entities.Symptome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomeRepository extends JpaRepository<Symptome, Long> {
}
