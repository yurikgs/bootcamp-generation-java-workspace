/*
 * 
 * 
 * */


package br.com.lacos.repeticao;

import java.util.Scanner;

public class Exercicio4 {
			public static void main(String[] args) throws InterruptedException{
				int i = 1, tamanhoDaLista = 2, idade, genero, agressividade, pessoasCalmas =0,
						mulheresNervosas =0, homensAgressivos =0, outrosCalmos =0, 
						pessoasNervosasMaisDe40 =0, pessoasCalmasMenosDe18 =0;
				
				Scanner s = new Scanner(System.in);
				
				while(i<=tamanhoDaLista) {
					
					System.out.println("Qual a idade da pessoa? ");
					idade = s.nextInt();
					System.out.println("Qual o gênero? Responda: 1 para feminino, 2 para masculino, "
							+ "3 para outros.");
					genero = s.nextInt();
					System.out.println("É agressivo? Responda: 1 para calmo(a), "
							+ "2 para nervoso(a), 3 para agressvo(a)");
					agressividade = s.nextInt();
					
				if (agressividade==1) {
					pessoasCalmas++;
				}
				if (genero==1 && agressividade==2) {
					mulheresNervosas++;
				}
				if (genero==2 && agressividade==3) {
					homensAgressivos++;
				}
				if (genero==3 && agressividade==1) {
					outrosCalmos++;
				}
				if (agressividade==2 && idade>40) {
					pessoasNervosasMaisDe40++;
				}
				if (agressividade==1 && idade<18) {
					pessoasCalmasMenosDe18++;
				}
				i++;
				}
				
				
				System.out.println("\nNúmero de pessoas calmas: "+pessoasCalmas);
				System.out.println("Número de mulheres nervosas: "+mulheresNervosas);
				System.out.println("Número de homens agressivos: "+homensAgressivos);
				System.out.println("Número de outros calmos: "+outrosCalmos);
				System.out.println("Número de pessoas nervosas com mais de 40: "+pessoasNervosasMaisDe40);
				System.out.println("Número de pessoas calmas com menos de 18: "+pessoasCalmasMenosDe18);
				
			s.close();	
			}
}
