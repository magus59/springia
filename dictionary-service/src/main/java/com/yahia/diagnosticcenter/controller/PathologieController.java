package com.yahia.dictionaryservice.controller;

import com.yahia.dictionaryservice.entities.Pathologie;
import com.yahia.dictionaryservice.service.PathologieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pathologies")
public class PathologieController {

    @Autowired
    private PathologieService pathologieService;

    @GetMapping
    public List<Pathologie> getAllPathologies() {
        return pathologieService.getAllPathologies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pathologie> getPathologieById(@PathVariable Long id) {
        Optional<Pathologie> pathologie = pathologieService.getPathologieById(id);
        return pathologie.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pathologie createPathologie(@RequestBody Pathologie pathologie) {
        return pathologieService.createPathologie(pathologie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pathologie> updatePathologie(@PathVariable Long id, @RequestBody Pathologie pathologie) {
        Pathologie updatedPathologie = pathologieService.updatePathologie(id, pathologie);
        return updatedPathologie != null ? ResponseEntity.ok(updatedPathologie) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePathologie(@PathVariable Long id) {
        return pathologieService.deletePathologie(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
