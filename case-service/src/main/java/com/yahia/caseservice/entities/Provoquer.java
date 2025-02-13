package com.yahia.caseservice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "provoquer")
@IdClass(ProvoquerPK.class)
public class Provoquer {

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_Pathologie", nullable = false)
    @JsonBackReference
    private Pathologie pathologie;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_Symptome", nullable = false)
    @JsonManagedReference
    private Symptome symptome;
}
