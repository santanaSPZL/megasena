package br.com.megasena.model;

import java.util.ArrayList;
import java.util.List;

public class Volante {

	private List<Integer> volante = new ArrayList<>();

	public List<Integer> getVolante(int numero) {
		for (int i = 0; i < numero; i++) {
			volante.add(i + 1);
		}
		
		return volante;
	}
	
	
}
