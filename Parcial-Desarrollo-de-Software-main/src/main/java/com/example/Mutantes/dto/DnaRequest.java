package com.example.Mutantes.dto;

import com.example.Mutantes.validator.ValidDna;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DnaRequest {

    @ValidDna
    private String[] stringDna;

}
