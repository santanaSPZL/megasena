package br.com.megasena.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dezenas {
	
	private List<Integer> dezenas = new ArrayList<>();

	public List<Integer> getDezenas() {
		for (int i = 0; i < 6; i++) {
			int aleatorio = 1 + (int) (Math.random() * 60);
			dezenas.add(aleatorio);
			
			
		}	
		
		Collections.sort(dezenas);
		System.out.println(dezenas);
		
		return dezenas;
	}
	
	
	
	
	public int[] ordenacaoSelectSort(int vet[]) {
		int indice, menor;
				
		for (int i = 0; i < vet.length; i++) {
			indice = i;
			menor = vet[i];
			for(int j = i+1; j < vet.length; j++) {
				if(vet[j] < menor) {
					indice = j;
					menor = vet[j];
				}
			}
			vet[indice] = vet[i];
			vet[i] = menor;
		}
		
		return vet;
	}
	
}
