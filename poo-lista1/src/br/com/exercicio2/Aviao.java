package br.com.exercicio2;

public class Aviao {
	
	//Declara��o de vari�veis:
	
	String cor, tamanho, estadoMotor = "desligado";
	int velocidade = 0, altura = 0, avisaInstancias = 0; // CRIEI
														// ESSE AVISAINSTANCIAS
														//APENAS PARA USAR COMO CONTROLE
														//E IMPRIMIR AS INTANCIAS APENAS 1 VEZ
														//NAO SEI SE VAI DAR CERTO...
	void situacao() {
			if (estadoMotor == "ligado") {
				if (velocidade!=0 && altura == 0) {
					System.out.println("Correndo no ch�o!");
				} else if (velocidade !=0 && altura != 0) {
					System.out.println("Voando!");
				} else {
					System.out.println("o motor t� ligado, mas n�o est� andando. Verifique a mec�nica do avi�o");
				}
			}	else {
				if (velocidade!=0 && altura == 0) {
					System.out.println("O avi�o est� em in�rcia, andando com o motor desligado");
				} else if (velocidade ==0 && altura == 0) {
					System.out.println("O avi�o est� parado.");
				} else {
					System.out.println("O avi�o est� no alto, mas com o motor desligado..."
							+ " REZA, PORQUE QUE VC VAI CAIR!!!!");
				}
			}
	}
}
