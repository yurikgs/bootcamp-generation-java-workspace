/*
 * 4) Fa?a um sistema que leia um n?mero inteiro e mostre uma mensagem 
 * indicando se este n?mero ? par ou ?mpar, e se ? positivo ou negativo.
 * 
 * */

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
			int numero;
			String paridade, sinal;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual o n?mero? ");
			numero = s.nextInt();
			
			if (numero % 2 == 0) {
					paridade = "par";
			} else {
				paridade = "?mpar";
			}
			
			if (numero>0) {
				sinal = "positivo";
			} else if (numero == 0) {
					sinal = "neutro";
			} else {
				sinal = "negativo";
			}
			
			System.out.println("O seu n?mero ? "+sinal+" e "+paridade+".");
			
			s.close();
	}
}
