
/*
 *2. Fa?a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. 
 * 
 * */

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) {
			int idadeEmDias, anos, meses, dias;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual a sua idade em dias?");
			idadeEmDias = s.nextInt();
			
			anos = idadeEmDias/360;
			meses = (idadeEmDias%360)/30;
			dias = (idadeEmDias%360)%30;
			
			System.out.println("Voc? tem " + anos + " anos, " + meses + " meses e " + dias + " dias. Voc? ? Velho(a)!!!");
			
			// Fechamento do objeto s (Scanner)
			s.close();
		}
}
