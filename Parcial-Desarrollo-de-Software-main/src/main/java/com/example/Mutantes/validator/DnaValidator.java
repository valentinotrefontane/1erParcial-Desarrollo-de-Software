package com.example.Mutantes.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DnaValidator implements ConstraintValidator<ValidDna,String[]> {

    public boolean isValid(String[] dna, ConstraintValidatorContext context) {
        if (dna == null || dna.length == 0) {
            return false;
        }

        // SSL sirvio increible
        for (String secuencia : dna) {
            if (!secuencia.matches("[ATCG]+")) {
                return false;
            }
        }

        return true;
    }
}