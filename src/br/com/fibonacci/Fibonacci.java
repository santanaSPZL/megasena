package br.com.fibonacci;

public class Fibonacci {

	static long fibonacciRecursivo(int numero) {
		if (numero < 2) {
			return numero;
		} else {
			return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
		}
	}

	static long fibonacciRecursivoTernario(int numero) {
		return (numero < 2) ? numero : fibonacciRecursivoTernario(numero - 1) + fibonacciRecursivoTernario(numero - 2);
	}
	
	static long fibonacciIterativo(int numero) {
		int numeroAtual = 0;
		int numeroAnterior = 0;
		
		for(int i = 1; i <= numero; i++) {
			if(i == 1) {
				numeroAtual = 1;
				numeroAnterior = 0;
			} else {
				numeroAtual += numeroAnterior;
				numeroAnterior = numeroAtual - numeroAnterior;
			}
		}
		
		return numeroAtual;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Fibonacci recursivo tradicional:");    
		
	    for (int i = 0; i < 10; i++) {
	            System.out.print("[" + fibonacciRecursivo(i) + "]" + "\t");
	        }
	    
	    System.out.println("");
	    System.out.println("");
	    
	    System.out.println("Fibonacci recursivo com uso de operador ternario:");
	    for (int i = 0; i < 15; i++) {
            System.out.print("[" + fibonacciRecursivoTernario(i) + "]" + "\t");
	    }
	    
	    System.out.println("");
	    System.out.println("");
	    
	    System.out.println("Fibonacci Iterativo:");
	    for (int i = 0; i < 20; i++) {
            System.out.print("[" + fibonacciIterativo(i) + "]" + "\t");
	    }
	}
}
