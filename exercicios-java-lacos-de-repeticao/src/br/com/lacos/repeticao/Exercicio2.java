/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 *
 * */


package br.com.lacos.repeticao;

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) throws InterruptedException {
			int pares = 0, impares = 0, numero;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite 10 n�meros: ");
			
			for (int i=1;i<=10;i++) {
				
				numero = s.nextInt();
				if (numero%2==0) {
					pares++;
				} else {
					impares++;
				}		
				
			}
			
			System.out.println("A qtdade de pares � "+pares+" e a de �mpares � "+impares);
			s.close();
		}
}
