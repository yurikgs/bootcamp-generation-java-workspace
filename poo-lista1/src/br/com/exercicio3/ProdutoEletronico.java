package br.com.exercicio3;

import java.util.Scanner;

public class ProdutoEletronico {
		
		String marca;
		int peso;
		boolean ligado = false;
		Scanner s = new Scanner(System.in);
		
		void ligar() {	
			ligado = true;
			System.out.println("liguei!");
		}
		void desligar() {
			ligado = false;
			System.out.println("desliguei!");
		}
		public ProdutoEletronico(String estado) {
			if (estado == "ligado") {
				ligar();
				System.out.println("O produto está ligado.");
				
			} else {				
				System.out.println("O produto está desligado.");
			}
			// TODO Auto-generated constructor stub
		}
}
