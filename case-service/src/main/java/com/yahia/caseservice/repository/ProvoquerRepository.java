package com.yahia.caseservice.repository;

import com.yahia.caseservice.entities.Provoquer;
import com.yahia.caseservice.entities.ProvoquerPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvoquerRepository extends JpaRepository<Provoquer, ProvoquerPK> {
}
