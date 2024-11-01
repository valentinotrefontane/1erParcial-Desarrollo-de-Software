package com.example.Mutantes.repositories;

import com.example.Mutantes.entities.Dna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {
    //Busca en la db el adn
    Optional<Dna> findByStringDna(String stringDna[]);

    //Cuenta cuantos adn son verdaderos o falsos
    long countByIsMutant(boolean isMutant);
}