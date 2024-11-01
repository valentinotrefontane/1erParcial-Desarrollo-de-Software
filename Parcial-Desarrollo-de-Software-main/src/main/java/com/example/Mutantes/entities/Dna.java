package com.example.Mutantes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@Table(name ="DNA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
@Builder
public class Dna extends Base {

    private String[] stringDna;

    private boolean isMutant;
}
