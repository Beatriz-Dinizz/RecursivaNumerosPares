package controller;

public class NumerosParesController {

	public NumerosParesController() {
		super();
	}
	
	public int somarNumerosParesVetor(int[] vetor, int tamanho) {
		if(tamanho == 0) {
			return 0;
		}
		
		int ultimaPosicao = vetor[tamanho - 1];
		int cta = 0;
		
		if(ultimaPosicao % 2 == 0) {
			cta = cta + 1;
		}
		
		return cta + somarNumerosParesVetor(vetor, tamanho - 1);
	}
}
