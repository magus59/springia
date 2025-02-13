package com.yahia.caseservice.controller;

import com.yahia.caseservice.entities.Symptome;
import com.yahia.caseservice.service.SymptomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/symptomes")
public class SymptomeController {

    @Autowired
    private SymptomeService symptomeService;

    @GetMapping
    public List<Symptome> getAllSymptomes() {
        return symptomeService.getAllSymptomes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Symptome> getSymptomeById(@PathVariable Long id) {
        Optional<Symptome> symptome = symptomeService.getSymptomeById(id);
        return symptome.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Symptome createSymptome(@RequestBody Symptome symptome) {
        return symptomeService.createSymptome(symptome);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Symptome> updateSymptome(@PathVariable Long id, @RequestBody Symptome symptome) {
        Symptome updatedSymptome = symptomeService.updateSymptome(id, symptome);
        return updatedSymptome != null ? ResponseEntity.ok(updatedSymptome) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSymptome(@PathVariable Long id) {
        return symptomeService.deleteSymptome(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
