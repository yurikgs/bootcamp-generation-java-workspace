/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
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
				System.out.println("Digite 0 para lan�ar o dado ");
				inicio = s.nextInt();
				if(inicio!=0) {
					Thread.sleep(500);
					System.out.println("Valor inv�lido! Favor digite 0 para come�ar:");		
				}
			}
			
			System.out.println("\nLan�amentos: \n");
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
			System.out.println("Quantas vezes o maior valor foi lan�ado: "+frequenciaMaiorvalor);
			
			s.close();
			
		}
}
