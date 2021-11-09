/*
 * 5) A Secretaria de Meio Ambiente que controla o índice de
 *  poluição mantém 3 grupos de indústrias que são
 *   altamente poluentes do meio ambiente. 
 *   O índice de poluição aceitável varia de 0,05 até 0,25. 
 *   Se o índice sobe para 0,3 as indústrias do 1º grupo 
 *   são intimadas a suspenderem suas atividades, 
 *   se o índice crescer para 0,4 as industrias 
 *   do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
 *   se o índice atingir 0,5 todos os grupos devem ser notificados 
 *   a paralisarem suas atividades. Faça um sistema que leia o índice 
 *   de poluição medido e emita a notificação adequada aos 
 *   diferentes grupos de empresas.
 * 
 * */

import java.util.Scanner;

public class Exercicio5 {
		public static void main(String[] args) {
			double indicePoluicao;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual é o índice de poluição? ");
			indicePoluicao = s.nextDouble();
			
			if (indicePoluicao <= 0.25) {
				System.out.println("O índice de Poluição está aceitável.");
			} else if (indicePoluicao<0.3) {
				System.out.println("Atenção! O índice de Poluição está subindo perigosamente. Reduzam suas emissões tóxicas");
			} else if (indicePoluicao<0.4) {
				System.out.println("O ídice de poluição está alto. As atividades das empresas do tipo 1 estão suspensas");
			} else if (indicePoluicao<0.5) {
				System.out.println("O índice de Poluição está muito. As atividades das empresas dos tipos 1 e 2 estão suspensas");
			} else {
				System.out.println("");
				
			s.close();
			
			}
		}
}
