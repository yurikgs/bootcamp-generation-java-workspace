/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 *
 * 
 * Como usar a biblioteca Random:
 * https://www.youtube.com/watch?v=Gu16nyTaBBU
 * */


package br.com.vetoresematrizes;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;

public class Exercicio2 {
		public static void main(String[] args) throws InterruptedException {
			
			Scanner s = new Scanner(System.in);
			Random aleatorio = new Random();			
			int[] vetor = new int[10];
			int inicio = -1, maiorValor = 1, frequenciaMaiorvalor = 0;
			
			while (inicio!=0) {
				System.out.println("Digite 0 para lançar o dado ");
				inicio = s.nextInt();
				if(inicio!=0) {
					Thread.sleep(500);
					System.out.println("Valor inválido! Favor digite 0 para começar:");		
				}
			}
			
			System.out.println("\nLançamentos: \n");
			for(int i=0;i<vetor.length;i++) {
				 vetor[i] = aleatorio.nextInt(6)+1;
				 System.out.println(" "+vetor[i]);
				 if(maiorValor<=vetor[i]) {
					 maiorValor=vetor[i];
				 }
				 
			}
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i]==maiorValor) {
					frequenciaMaiorvalor++;
				}
			}
			System.out.println("Quantas vezes o maior valor foi lançado: "+frequenciaMaiorvalor);
			
			s.close();
			
		}
}
