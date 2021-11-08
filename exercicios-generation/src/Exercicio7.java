/*
 * 7. Um sistema de equa��es lineares do tipo: 
 * 
 * 
 * ax + by = c
 * dx + by = e
 * 
, pode ser resolvido segundo mostrado abaixo : 
 * 
 * x = (ce-bf)/(ae-bd);
 * y = (af-bd)/(ae-bd);
 * 
 * 
 * */

import java.util.Scanner;

public class Exercicio7 {
		public static void main(String[] args) {
			
			double a, b, c, d, e, f, x, y;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual o valor de a? ");
			a = s.nextDouble();
			
			System.out.println("Qual o valor de b? ");
			b = s.nextDouble();
			
			System.out.println("Qual o valor de c? ");
			c = s.nextDouble();
			
			System.out.println("Qual o valor de d? ");
			d = s.nextDouble();
			
			System.out.println("Qual o valor de e? ");
			e = s.nextDouble();
			
			System.out.println("Qual o valor de f? ");
			f = s.nextDouble();
			
			x = (c*e-b*f)/(a*e - b*d);
			y = (a*f-c*d)/(a*e - b*d);
			
			System.out.println("x � igual a " + x + " e y � igual a " + y);
			
			// Fechamento do objeto s (Scanner)
			s.close();
		}
}
