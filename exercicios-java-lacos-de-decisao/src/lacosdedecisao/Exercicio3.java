/*
 * Faça um programa que receba a idade de uma pessoa e mostre 
 * na saída em qual categoria ela se encontra:
 *10-14 infantil
15-17 juvenil
18-25 adulto

 * 
 * */

package lacosdedecisao;

import java.util.Scanner;

public class Exercicio3 {
		public static void main(String[] args) {
			int idade;
			String categoria;
			Scanner s = new Scanner(System.in);
				
			System.out.println("Qual a idade? ");
			idade = s.nextInt();
			
			if (idade>10&&idade<15) {
				categoria = "infantil";
			} else if (idade>14&&idade<18) {
				categoria = "juvenil";
			} else if (idade>17&&idade<26) {
				categoria = "adulto";
			} else {
				categoria = "forbidden";
			}
			
			if (categoria != "forbidden") {
				System.out.println("A categoria é "+categoria);
			} else {
				System.out.println("Idade não permitida!");
			}
			s.close();
		}
}
