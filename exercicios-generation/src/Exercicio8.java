
/*
 *8. O custo ao consumidor de um carro novo é a soma do custo de fábrica 
 *com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).  
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de fábrica de um carro 
 * e escreva o custo ao consumidor. 
 * */

import java.util.Scanner;

public class Exercicio8 {
		public static void main(String[] args) {
			
			double precoDeFabrica, precoDeVenda;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual é o preço de fábrica? ");
			precoDeFabrica = s.nextDouble();
			
			precoDeVenda = precoDeFabrica*1.73;
			
			System.out.println("O valor de venda do carro será de " + precoDeVenda);

			// Fechamento do objeto s (Scanner)
			s.close();
		}
}
