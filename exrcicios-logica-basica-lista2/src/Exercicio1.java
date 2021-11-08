/*
 * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
 * de seu trabalho. Toda vez que ele traz um peso de tomate maior que
 * o estabelecido pelo regulamento do estado de São Paulo (50 quilos)
 * deve pagar um multa de R$ 4,00 por quilo excedente.
 * João precisa que você faça um sistema que leia a variável P
 * (peso de tomates) e verifique se há excesso.
 * Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João
 * deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 *  
 * */

import java.util.Scanner;

public class Exercicio1 {
		public static void main(String[] args) {
				double p, e, m; // respectivamente, peso, excesso, multa
				Scanner s = new Scanner(System.in);
				
				System.out.println("Qual o  peso dos tomates? ");
				p = s.nextDouble();
				
				if (p>50.00) {
						e = p-50.00;
						m = e*4.00;
				} else {
					e = 0.00;
					m = 0.00;
				}
				
				System.out.println("O peso em excesso é de "+ e +", a sua multa é de "+ m);
		
				
				//Fechamento do objetos
				s.close();
		}

}
