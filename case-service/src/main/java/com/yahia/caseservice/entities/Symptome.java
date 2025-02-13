package com.yahia.caseservice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "symptome")
public class Symptome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_Symptome;

    @Column(nullable = false, length = 255)
    private String nom_symptome;

}
