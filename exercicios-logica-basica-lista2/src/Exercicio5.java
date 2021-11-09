/*
 * 5) A Secretaria de Meio Ambiente que controla o �ndice de
 *  polui��o mant�m 3 grupos de ind�strias que s�o
 *   altamente poluentes do meio ambiente. 
 *   O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
 *   Se o �ndice sobe para 0,3 as ind�strias do 1� grupo 
 *   s�o intimadas a suspenderem suas atividades, 
 *   se o �ndice crescer para 0,4 as industrias 
 *   do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, 
 *   se o �ndice atingir 0,5 todos os grupos devem ser notificados 
 *   a paralisarem suas atividades. Fa�a um sistema que leia o �ndice 
 *   de polui��o medido e emita a notifica��o adequada aos 
 *   diferentes grupos de empresas.
 * 
 * */

import java.util.Scanner;

public class Exercicio5 {
		public static void main(String[] args) {
			double indicePoluicao;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Qual � o �ndice de polui��o? ");
			indicePoluicao = s.nextDouble();
			
			if (indicePoluicao <= 0.25) {
				System.out.println("O �ndice de Polui��o est� aceit�vel.");
			} else if (indicePoluicao<0.3) {
				System.out.println("Aten��o! O �ndice de Polui��o est� subindo perigosamente. Reduzam suas emiss�es t�xicas");
			} else if (indicePoluicao<0.4) {
				System.out.println("O �dice de polui��o est� alto. As atividades das empresas do tipo 1 est�o suspensas");
			} else if (indicePoluicao<0.5) {
				System.out.println("O �ndice de Polui��o est� muito. As atividades das empresas dos tipos 1 e 2 est�o suspensas");
			} else {
				System.out.println("");
				
			s.close();
			
			}
		}
}
