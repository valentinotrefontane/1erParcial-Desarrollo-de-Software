package com.example.Mutantes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class StatsResponse {

    private  long count_mutant_dna;

    private  long count_human_dna;

    private  double ratio;

}
