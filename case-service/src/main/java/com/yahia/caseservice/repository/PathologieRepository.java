package com.yahia.caseservice.repository;

import com.yahia.caseservice.entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie, Long> {
}
