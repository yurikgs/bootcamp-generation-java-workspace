/*
 * 3. Fa�a um sistema que leia o tempo de dura��o 
 * de um evento em uma f�brica expressa em segundos e 
 * mostre-o expresso em horas, minutos e segundos.
 * */

import java.util.Scanner;

public class Exercicio3 {
		public static void main(String[] args) {
			int tempoSegundos, horas, minutos, segundos;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual foi o tempo, em segundos? ");
			tempoSegundos = s.nextInt();
			
			horas = tempoSegundos/3600;
			minutos = (tempoSegundos%3600)/60;
			segundos = (tempoSegundos%60)%60;
			
			System.out.println("O tempo decorrido foi: " +horas+ " horas " +minutos+ " minutos e " +segundos+ " segundos.");
		
			// Fechamento do objeto s (Scanner)
			s.close();
		}
}
