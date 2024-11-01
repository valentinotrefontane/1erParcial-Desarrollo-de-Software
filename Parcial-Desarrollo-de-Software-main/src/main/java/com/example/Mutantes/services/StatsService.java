package com.example.Mutantes.services;

import com.example.Mutantes.dto.StatsResponse;
import com.example.Mutantes.repositories.DnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {

    private final DnaRepository dnaRepository;

    @Autowired
    public StatsService(DnaRepository dnaRepository){
        this.dnaRepository = dnaRepository;
    }

    // Devuelve la cantidad de humanos, mutantes y su ratio en la db
    public StatsResponse getStats(){

        long count_mutant_dna = dnaRepository.countByIsMutant(true);

        long count_human_dna = dnaRepository.countByIsMutant(false);

        double ratio;

        if (count_human_dna != 0 ) {
            ratio = (double) count_mutant_dna / count_human_dna;
        } else {
            ratio = 0;
        }

        return new StatsResponse(count_mutant_dna , count_human_dna, ratio);

    }


}
