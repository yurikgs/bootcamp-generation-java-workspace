/*
 * 1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 * */

package lacosdedecisao;

import java.util.Scanner;

public class Exercicio1 {
		public static void main(String[] args) {
			int int1, int2, int3;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite o primeiro n�mero: ");
			int1 = s.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			int2 = s.nextInt();
			System.out.println("Digite o terciero n�mero: ");
			int3 = s.nextInt();
			
			if (int1>int2 && int1>int3) {
					System.out.println("O maior n�mero � "+int1);
			} else 
			if (int2>int1 && int2>int3) {
					System.out.println("O maior n�mero � "+int2);
			} else {
				System.out.println("O mairo n�mero � o "+int3);
			}
			
			s.close();
		}
}
