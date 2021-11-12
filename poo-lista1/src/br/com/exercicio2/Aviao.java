package br.com.exercicio2;

public class Aviao {
	
	//Declaração de variáveis:
	
	String cor, tamanho, estadoMotor = "desligado";
	int velocidade = 0, altura = 0, avisaInstancias = 0; // CRIEI
														// ESSE AVISAINSTANCIAS
														//APENAS PARA USAR COMO CONTROLE
														//E IMPRIMIR AS INTANCIAS APENAS 1 VEZ
														//NAO SEI SE VAI DAR CERTO...
	void situacao() {
			if (estadoMotor == "ligado") {
				if (velocidade!=0 && altura == 0) {
					System.out.println("Correndo no chão!");
				} else if (velocidade !=0 && altura != 0) {
					System.out.println("Voando!");
				} else {
					System.out.println("o motor tá ligado, mas não está andando. Verifique a mecãnica do avião");
				}
			}	else {
				if (velocidade!=0 && altura == 0) {
					System.out.println("O avião está em inércia, andando com o motor desligado");
				} else if (velocidade ==0 && altura == 0) {
					System.out.println("O avião está parado.");
				} else {
					System.out.println("O avião está no alto, mas com o motor desligado..."
							+ " REZA, PORQUE QUE VC VAI CAIR!!!!");
				}
			}
	}
}
