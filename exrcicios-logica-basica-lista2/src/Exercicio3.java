/*
 * 
 * 
 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

import java.util.Scanner;

public class Exercicio3 {
		public static void main(String[] args) {
			double num1, num2, num3, num4, quad1, quad2, quad3, quad4;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			num1 = s.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			num2 = s.nextDouble();
			
			System.out.println("Digite o terceiro número: ");
			num3 = s.nextDouble();
			
			System.out.println("Digite o quarto número: ");
			num4 = s.nextDouble();
			
			quad1 = Math.pow(num1, 2);
			quad2 = Math.pow(num2, 2);
			quad3 = Math.pow(num3, 2);
			quad4 = Math.pow(num4, 2);
			
			if (quad3 >= 1000) {
				System.out.println("O valor do quadrado do terceiro número é: " + quad3);
			} else {
				System.out.println(num1+"->"+quad1+"  "+num2+"->"+quad2+"  "+num3+"->"+quad3+"  "+num4+"->"+quad4);
			
			s.close();
			}
		}
}
