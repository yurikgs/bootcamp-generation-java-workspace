/*
 * Crie um programa que leia um número do teclado 
 * até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 * 
 * */

package br.com.lacos.repeticao;

import java.util.Scanner;

public class Exercicio5 {
			public static void main(String[] args) throws InterruptedException {
				int numero, soma = 0;
				Scanner s = new Scanner(System.in);
						
				do {
					System.out.println("Digite o número do teclado: ");
					numero = s.nextInt();
					
					if (numero<0 || numero>9) {
						System.out.println("Número inválido");
						Thread.sleep(1000);
						
					} else {
						soma+=numero;
					}
				}
				while (numero!=0);
				System.out.println("A soma dos valores é "+soma);
				
				s.close();
			}
}
