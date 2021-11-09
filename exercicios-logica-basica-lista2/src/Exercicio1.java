/*
 * 1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
 * de seu trabalho. Toda vez que ele traz um peso de tomate maior que
 * o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos)
 * deve pagar um multa de R$ 4,00 por quilo excedente.
 * Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
 * (peso de tomates) e verifique se h� excesso.
 * Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o
 * dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
				
				System.out.println("O peso em excesso � de "+ e +", a sua multa � de "+ m);
		
				
				//Fechamento do objetos
				s.close();
		}

}
