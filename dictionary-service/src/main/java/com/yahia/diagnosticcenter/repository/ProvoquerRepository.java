package com.yahia.dictionaryservice.repository;

import com.yahia.dictionaryservice.entities.Provoquer;
import com.yahia.dictionaryservice.entities.ProvoquerPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvoquerRepository extends JpaRepository<Provoquer, ProvoquerPK> {
}
