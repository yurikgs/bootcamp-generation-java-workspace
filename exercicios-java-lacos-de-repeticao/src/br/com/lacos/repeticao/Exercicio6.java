/*
 * 
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 *
 * */


package br.com.lacos.repeticao;

import java.util.Scanner;

public class Exercicio6 {
		public static void main(String[] args) throws InterruptedException{
			int numero, soma = 0, quantidadeDeMultiplos3 = 0;
			double media;
			Scanner s = new Scanner(System.in);
			
			do {
				System.out.println("Digite o n�mero: ");
				numero = s.nextInt();
				
				if (numero%3==0) {  
					soma+=numero;
					quantidadeDeMultiplos3++;
				}
				Thread.sleep(500);
			} while(numero!=0);
			
			Thread.sleep(500);
			
			media=(double)soma/quantidadeDeMultiplos3;
			System.out.println("A m�dia dos n�meros m�ltiplos de 3 � "+media);
			
			s.close();
		}
}
