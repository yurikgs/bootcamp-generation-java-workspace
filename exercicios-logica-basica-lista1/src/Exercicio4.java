/*
 * 4. Escreva  um sistema que leia tr?s n?meros inteiros e positivos (A, B, C) e calcule a seguinte express?o: 
  D = (R+S)/2, onde R = (A+B)^2   e S = (B+C)^2;  

 * 
 * */

import java.util.Scanner;

public class Exercicio4 {
		public static void main(String[] args) {
			
			double a, b, c, r, s, d;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual o n?mero A?");
			a = sc.nextDouble();
			
			System.out.println("Qual o n?mero B?");
			b = sc.nextDouble();

			System.out.println("Qual o n?mero C?");
			c = sc.nextDouble();
			
			r = Math.pow((a+b), 2);
			s = Math.pow((a+c), 2);
			
			d = (r+s)/2; 
			
			System.out.println("D vale " + d);
			
			
			// Fechamento do objeto sc (Scanner)
			sc.close();	
	
		}
}
