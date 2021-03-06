/*
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer 
 * no plano, P(x1, y1) e P(x2, y2), escreva a dist?ncia entre eles. 
 * A f?rmula que efetua tal c?lculo ?:
 *
 *			d = raiz((x2-x1)^2 +(y2-y1)^2)
 *  
 * */

import java.util.Scanner;

public class Exercicio6 {
		public static void main(String[] args) {
			
			double x1, x2, y1, y2, distancia;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual o valor da abcissa do primeiro ponto?");
			x1 = s.nextDouble();
			
			System.out.println("Qual o valor da ordenada do primeiro ponto?");
			y1 = s.nextDouble();
			
			System.out.println("Qual o valor da abcissa do segundo ponto?");
			x2 = s.nextDouble();
			
			System.out.println("Qual o valor da ordenada do segundo ponto?");
			y2 = s.nextDouble();
			
			distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
			
			System.out.println("A dist?ncia entre os pontos ? "+distancia);
			
			// Fechamento do objeto s (Scanner)
			s.close();
					
		}
}
