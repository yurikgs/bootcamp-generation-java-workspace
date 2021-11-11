/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 * 
 * */

package br.com.vetoresematrizes;

import java.util.Scanner;

public class Exerccicio1 {
			public static void main(String[] args) throws InterruptedException{
				
				double[] vetor = new double[5];
				Scanner s = new Scanner(System.in);
				double maiorPontuacao = 0;
				
				System.out.println("Digite os 5 valores de pontuação: ");
				vetor[0] = s.nextDouble();
				vetor[1] = s.nextDouble();
				vetor[2] = s.nextDouble();
				vetor[3] = s.nextDouble();
				vetor[4] = s.nextDouble();
				
				for (int i=0;i<vetor.length;i++) {
					
					if (maiorPontuacao<vetor[i]) {
						maiorPontuacao=vetor[i];
					}
					System.out.printf(" "+vetor[i]);						
					
				}
				System.out.println("\nO maior valor do vetor é: "+maiorPontuacao);
				
				s.close();
			}
}
