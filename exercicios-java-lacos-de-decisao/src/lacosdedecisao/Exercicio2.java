/*
 * 
 * 
 * */

package lacosdedecisao;

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) {
			double num1,num2,num3,primeiro,segundo,terceiro;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Escreva o primeiro número: ");
			num1 = s.nextDouble();
			
			System.out.println("Escreva o primeiro número: ");
			num2 = s.nextDouble();
			
			System.out.println("Escreva o primeiro número: ");
			num3 = s.nextDouble();
			
			if (num1>num2&&num1>num3) {
				terceiro = num1;
				if (num2>num3) {
					segundo = num2;
					primeiro = num3;
				} else {
					segundo = num3;
					primeiro = num2;
				}
			} else if (num2>num1&&num2>num3) {
				terceiro = num2;
				if (num1>num3) {
					segundo = num1;
					primeiro = num3;
				} else {
					segundo = num3;
					primeiro = num1;
				}
			} else {
				terceiro = num3;
				if (num1>num2) {
					segundo = num1;
					primeiro = num2;
				} else {
					segundo = num2;
					primeiro = num1;
				}
			}
			
			System.out.println("Em ordem crescente: "+primeiro+" "+segundo+" "+terceiro);
			s.close();
		}
}
