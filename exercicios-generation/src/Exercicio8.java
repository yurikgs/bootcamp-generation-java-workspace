
/*
 *8. O custo ao consumidor de um carro novo � a soma do custo de f�brica 
 *com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).  
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de f�brica de um carro 
 * e escreva o custo ao consumidor. 
 * */

import java.util.Scanner;

public class Exercicio8 {
		public static void main(String[] args) {
			
			double precoDeFabrica, precoDeVenda;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual � o pre�o de f�brica? ");
			precoDeFabrica = s.nextDouble();
			
			precoDeVenda = precoDeFabrica*1.73;
			
			System.out.println("O valor de venda do carro ser� de " + precoDeVenda);

			// Fechamento do objeto s (Scanner)
			s.close();
		}
}
