
/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 * */

package br.com.vetoresematrizes;

import java.util.Scanner;

public class Exercicio3 {

		public static void main(String[] args) throws InterruptedException {
			
			//DECLARAÇÕES DE VARIÁVEIS: 
			
			Scanner s = new Scanner(System.in);
			
			double[][] n1 = new double [4] [6];
			double[][] n2 = new double [4] [6];
			double[][] m1 = new double [4] [6];
			double[][] m2 = new double [4] [6];
		
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 6; j++) {
					
					//ENTRADA: 
					
					System.out.println("Insira o valor de N1["+i+"]["+j+"]: ");
					n1[i][j] = s.nextDouble();
					System.out.println("Insira o valor de N2["+i+"]["+j+"]: ");
					n2[i][j] = s.nextDouble();
					
					//PROCESSAMENTO:
					
					m1[i][j] = n1[i][j] + n2[i][j];
					m2[i][j] = n1[i][j] - n2[i][j];
				}
				
				}
			//SAÍDA:
			
			System.out.println("Valores de m1: \n");
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.println(" "+m1[i][j]);
				}
			}
			
			System.out.println("Valores de m2: \n");
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.println(" "+m2[i][j]);
				}
			}
			
			s.close();
		}
}
