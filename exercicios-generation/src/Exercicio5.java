
/*
 * 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 

 * */

import java.util.Scanner;

public class Exercicio5 {
		public static void main(String[] args) {
			
			double med1, med2, med3, resultado;
			Scanner s = new Scanner(System.in);	
			
			System.out.println("Qual a primeira nota? ");
			med1 = s.nextDouble();
			
			System.out.println("Qual a segunda nota? ");
			med2 = s.nextDouble();
		
			System.out.println("Qual a terceira nota? ");
			med3 = s.nextDouble();
			
			resultado = (med1*2 + med2*3 + med3*5)/10;
					
			System.out.println("A M�dia Final �: " + resultado);
			
			// Fechamento do objeto s (Scanner)
			s.close();	
		}
}
