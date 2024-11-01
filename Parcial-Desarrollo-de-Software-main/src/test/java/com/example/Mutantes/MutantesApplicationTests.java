package com.example.Mutantes;

import com.example.Mutantes.services.DnaService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class MutantesApplicationTests {

	@Test
	void testIsMutant3x3() {
		String[] dna = {
				"ATG",
				"CGA",
				"TGC"
		};
		assertEquals(false, DnaService.isMutant(dna));
	}

	@Test
	void testIsMutant1(){
		String[] dnaTrue0 = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};

		assertEquals(true, DnaService.isMutant(dnaTrue0));

	}

	@Test
	void testIsMutantColumna(){
		String[] dnaTrue1 = {"ATCG","ATGC","ATGC","ATCG"};

		assertEquals(true, DnaService.isMutant(dnaTrue1));
	}

	@Test
	void testIsMutant3(){
		String[] dna = {
				"ATGCGATA",
				"CAGTGCTA",
				"TTATGTGG",
				"AGAAGGCT",
				"CCCCTATT",
				"TCACTGGA",
				"TGCATCGG",
				"CGATAGCC"
		};

		assertEquals(true, DnaService.isMutant(dna));
	}

	@Test
	void testIsMutant4(){
		String[] dna = {
				"ATGCGATACTGG",
				"CAGTGCATGTGC",
				"TTATGTGGTTAC",
				"AGAAGGCTGCCT",
				"CCACTATTCAAA",
				"TCACTGGATGGG",
				"TGCATCGGACTA",
				"CGATAGCCAGTT",
				"GCTTAGCGTTAC",
				"ATTGCGGTTACC",
				"TGCCTAGGGAAC",
				"TCAAGGGTTTAA"
		};

		assertEquals(true, DnaService.isMutant(dna));
	}


	@Test
	void testIsMutant5(){
		String[] dna = {
				"ATGCGATACTGGAAA",
				"CAGTGCATGTGCAAA",
				"TTATGTGGTTACCCC",
				"AGAAGGCTGCCTCCC",
				"CCCCTATTCAAGGGG",
				"TCACTGGATGGGGAA",
				"TGCATCGGAAAAATA",
				"CGATAGCCAGTTAAA",
				"GCTTAGCGTTACAAA",
				"ATTGCGGTTACCGGG",
				"TGCCTAGGGAACAAA",
				"TCAAGGGTTTAAAGA",
				"GATCCTGGAATCAGA",
				"CTAGCCTGAATCGGA",
				"GTCGGCAGTCGGCAT"
		};

		assertEquals(true, DnaService.isMutant(dna));
	}

	@Test
	void testIsMutantDiagonal(){
		String[] dna = {
				"AGCC",
				"GACG",
				"ACAG",
				"CCCA"
		};

		assertEquals(true, DnaService.isMutant(dna));
	}


	@Test
	void testIsMutantDiagonalJuguete(){
		String[] dna = {
				"AGCCG",
				"ACCGG",
				"AAGGC",
				"CGACA",
				"ACGAA"
		};

		assertEquals(true, DnaService.isMutant(dna));
	}

	@Test
	void testTodasIguales(){
		String[] dna = {
				"AAAAA",
				"AAAAA",
				"AAAAA",
				"AAAAA",
				"AAAAA"
		};

		assertEquals(false, DnaService.isMutant(dna));
	}

	@Test
	void testFalsa(){

		String[] dna = {
				"AAGAA",
				"AATAA",
				"ATCTG",
				"AATAA",
				"GAGAA"
		};
		assertEquals(false, DnaService.isMutant(dna));
	}

}
