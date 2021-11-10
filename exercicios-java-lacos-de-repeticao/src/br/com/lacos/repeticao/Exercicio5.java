/*
 * Crie um programa que leia um n�mero do teclado 
 * at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 * 
 * */

package br.com.lacos.repeticao;

import java.util.Scanner;

public class Exercicio5 {
			public static void main(String[] args) throws InterruptedException {
				int numero, soma = 0;
				Scanner s = new Scanner(System.in);
						
				do {
					System.out.println("Digite o n�mero do teclado: ");
					numero = s.nextInt();
					
					if (numero<0 || numero>9) {
						System.out.println("N�mero inv�lido");
						Thread.sleep(1000);
						
					} else {
						soma+=numero;
					}
				}
				while (numero!=0);
				System.out.println("A soma dos valores � "+soma);
				
				s.close();
			}
}
