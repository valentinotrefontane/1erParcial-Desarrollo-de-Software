package com.example.Mutantes.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class DnaResponse {

    // Este DTO devuelve si es true o falso el mutante

    private boolean isMutant;

    public boolean isMutant() {
        return isMutant;
    }
}
