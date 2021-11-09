/*
 * 4 Faça um programa em que permita a entrada de um número qualquer 
 *e exiba se este número é par ou ímpar. Se for par exiba também 
 *a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 * */


package lacosdedecisao;

import java.util.Scanner;

public class Exercicio4 {
		public static void main(String[] args) {
			double numIn, numOut;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite o número: ");
			numIn = s.nextDouble();
			
			if (numIn%2==0) {
				numOut = Math.pow(numIn, 2);
				System.out.println("O número é par e o seu quadrado é "+numOut);
			} else {
				numOut = Math.pow(numIn, 0.5);
				System.out.println("O número é ímpar e a sua raiz quadrada é "+numOut);
			}
			
			s.close();
		}
}
