/*
 * 4 Fa�a um programa em que permita a entrada de um n�mero qualquer 
 *e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m 
 *a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 * */


package lacosdedecisao;

import java.util.Scanner;

public class Exercicio4 {
		public static void main(String[] args) {
			double numIn, numOut;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite o n�mero: ");
			numIn = s.nextDouble();
			
			if (numIn%2==0) {
				numOut = Math.pow(numIn, 2);
				System.out.println("O n�mero � par e o seu quadrado � "+numOut);
			} else {
				numOut = Math.pow(numIn, 0.5);
				System.out.println("O n�mero � �mpar e a sua raiz quadrada � "+numOut);
			}
			
			s.close();
		}
}
