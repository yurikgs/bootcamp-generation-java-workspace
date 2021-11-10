/*
 * 3 -Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99. (WHILE)
 * */

package br.com.lacos.repeticao;

import java.util.Scanner;

public class Exercicio3 {
		public static void main(String[] args) throws InterruptedException {
			int idade = 0, totalSub21 = 0, totalMaisde50 = 0;
			Scanner s = new Scanner(System.in);
			
			while (idade != -99) {
					System.out.println("\nQual a sua idade? ");
					idade = s.nextInt();
					
					if (idade<21) {
						totalSub21++;
					} 
					if (idade>50) {
						totalMaisde50++;
					}
					
			System.out.println("Total de pessoas com menos de 21:  "+totalSub21);
			System.out.println("Total de pessoas com mais de 50:  "+totalMaisde50);
			Thread.sleep(1000);
			
			}
			s.close();
		}
}
