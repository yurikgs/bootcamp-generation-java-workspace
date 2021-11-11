/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 * 
 * */


package br.com.vetoresematrizes;

import java.util.Scanner;

public class Exercicio4 {
		public static void main(String[] args) throws InterruptedException {
			
			Scanner s = new Scanner(System.in);
			double[][] matriz = new double[3][3];
			double soma =0, somaDiagonal=0;
			
			System.out.println("Insira os nove valores da Matriz: ");
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					matriz[i][j] = s.nextDouble();
				soma+=matriz[i][j];	
				
					if (i==j) {
						somaDiagonal+=matriz[i][j];
					}
				
				}
			}
		
			System.out.println("A soma dos valores é "+soma+" e a soma dos valores"
					+ "da diagonal principal é "+somaDiagonal);
		}
}
