package com.yahia.caseservice.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "pathologie")
public class Pathologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_Pathologie;

    @Column(nullable = false, length = 255)
    private String nom_pathologie;

    @Column(length = 500)
    private String description_pathologie;

    @OneToMany(mappedBy = "pathologie")
    @JsonManagedReference
    private List<Provoquer> provoques;
}
