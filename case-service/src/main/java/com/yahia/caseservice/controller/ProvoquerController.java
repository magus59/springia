package com.yahia.caseservice.controller;

import com.yahia.caseservice.entities.Provoquer;
import com.yahia.caseservice.entities.ProvoquerPK;
import com.yahia.caseservice.service.ProvoquerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/provoques")
public class ProvoquerController {

    @Autowired
    private ProvoquerService provoquerService;

    @GetMapping
    public List<Provoquer> getAllProvoques() {
        return provoquerService.getAllProvoques();
    }

    @GetMapping("/{pathologieId}/{symptomeId}")
    public ResponseEntity<Provoquer> getProvoquerById(@PathVariable Long pathologieId, @PathVariable Long symptomeId) {
        ProvoquerPK pk = new ProvoquerPK(pathologieId, symptomeId);
        Provoquer provoquer = provoquerService.getProvoquerById(pk);
        return provoquer != null ? ResponseEntity.ok(provoquer) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Provoquer createProvoquer(@RequestBody Provoquer provoquer) {
        return provoquerService.createProvoquer(provoquer);
    }

    @PutMapping("/{pathologieId}/{symptomeId}")
    public ResponseEntity<Provoquer> updateProvoquer(@PathVariable Long pathologieId, @PathVariable Long symptomeId, @RequestBody Provoquer provoquer) {
        ProvoquerPK pk = new ProvoquerPK(pathologieId, symptomeId);
        Provoquer updatedProvoquer = provoquerService.updateProvoquer(pk, provoquer);
        return updatedProvoquer != null ? ResponseEntity.ok(updatedProvoquer) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{pathologieId}/{symptomeId}")
    public ResponseEntity<Void> deleteProvoquer(@PathVariable Long pathologieId, @PathVariable Long symptomeId) {
        ProvoquerPK pk = new ProvoquerPK(pathologieId, symptomeId);
        return provoquerService.deleteProvoquer(pk) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
