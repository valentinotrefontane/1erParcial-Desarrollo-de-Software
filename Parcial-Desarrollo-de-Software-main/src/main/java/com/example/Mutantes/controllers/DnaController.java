package com.example.Mutantes.controllers;

import com.example.Mutantes.dto.DnaRequest;
import com.example.Mutantes.dto.DnaResponse;
import com.example.Mutantes.services.DnaService;
import com.example.Mutantes.validator.ValidDna;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mutant")
public class DnaController {

    private final DnaService dnaService;

    public DnaController(DnaService dnaService) {
        this.dnaService = dnaService;
    }

    @PostMapping
    public ResponseEntity<DnaResponse> checkMutant(@Valid @RequestBody DnaRequest dnaRequest) {
        boolean isMutant = dnaService.detector(dnaRequest.getStringDna());
        DnaResponse dnaResponse = new DnaResponse(isMutant);

        if (isMutant) {
            return ResponseEntity.ok(dnaResponse);

        } else
        {
            return  ResponseEntity.status(HttpStatus.FORBIDDEN).body(dnaResponse);
        }

    }

}
