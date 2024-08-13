package view;

import controller.NumerosParesController;

public class Principal {

	public static void main(String[] args) {
		NumerosParesController numerosPares = new NumerosParesController();
		
		int[] vetor = {5, 13, 2, 44, 81};
		int tamanho = vetor.length;
		boolean numeroValido = true;
		
		for(int i : vetor) {
			if(i <= 0) {
				numeroValido = false;
				break;
			}
		}
		
		if(numeroValido) {
			int ctaNumerosPares = numerosPares.somarNumerosParesVetor(vetor, tamanho);
			System.out.println("A quantidade de números pares no vetor é de: " + ctaNumerosPares);
		} else {
			System.out.println("Número inválido! O vetor deve conter apenas números naturais diferentes de zero.");
		}
	}
}
