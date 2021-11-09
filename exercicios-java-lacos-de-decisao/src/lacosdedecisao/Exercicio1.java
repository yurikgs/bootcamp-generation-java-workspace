/*
 * 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
 * */

package lacosdedecisao;

import java.util.Scanner;

public class Exercicio1 {
		public static void main(String[] args) {
			int int1, int2, int3;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			int1 = s.nextInt();
			System.out.println("Digite o segundo número: ");
			int2 = s.nextInt();
			System.out.println("Digite o terciero número: ");
			int3 = s.nextInt();
			
			if (int1>int2 && int1>int3) {
					System.out.println("O maior número é "+int1);
			} else 
			if (int2>int1 && int2>int3) {
					System.out.println("O maior número é "+int2);
			} else {
				System.out.println("O mairo número é o "+int3);
			}
			
			s.close();
		}
}
