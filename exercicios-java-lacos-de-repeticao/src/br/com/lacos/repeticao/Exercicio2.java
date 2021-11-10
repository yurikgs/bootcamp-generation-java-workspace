/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 *
 * */


package br.com.lacos.repeticao;

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) throws InterruptedException {
			int pares = 0, impares = 0, numero;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite 10 números: ");
			
			for (int i=1;i<=10;i++) {
				
				numero = s.nextInt();
				if (numero%2==0) {
					pares++;
				} else {
					impares++;
				}		
				
			}
			
			System.out.println("A qtdade de pares é "+pares+" e a de ímpares é "+impares);
			s.close();
		}
}
