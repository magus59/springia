package com.yahia.dictionaryservice.repository;

import com.yahia.dictionaryservice.entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie, Long> {
}
