/*
 * 2) Elabore um sistema que leia as vari?veis C e N, 
 * respectivamente c?digo e n?mero de horas trabalhadas de um oper?rio. 
 * E calcule o sal?rio sabendo-se que ele ganha R$ 10,00 por hora. 
 * Quando o n?mero de horas exceder a 50 calcule o excesso 
 * de pagamento armazenando-o na vari?vel E, caso contr?rio zerar tal vari?vel. 
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir 
 * o sal?rio total e o sal?rio excedente.
 * 
 * */

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) {
			int c;
			double n, e, total;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual o c?digo do trabalhador? ");
			c = s.nextInt();
			
			System.out.println("Qual o n?mero de horas trabalhadas? ");
			n = s.nextDouble();
			
			if (n>50) {
				e = n-50;
				total = 500 + e*20;
			} else {
				e = 0;
				total = n*10.0;
			}
			
			System.out.println("O trabalhador c?digo "+ c +" dever? receber R$"+total+" no total, sendo R$"+e+" referentes ? horas extras.");
			
			s.close();
		
		}
}
