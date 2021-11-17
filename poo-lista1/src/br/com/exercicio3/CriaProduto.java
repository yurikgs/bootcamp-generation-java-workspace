package br.com.exercicio3;

import java.util.Scanner;

public class CriaProduto {
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			ProdutoEletronico celular = new ProdutoEletronico("ligado");
			
			celular.marca = "Motorola";
			celular.peso = 2;
			
			System.out.println("O produto da marca "+celular.marca+" pesa "+celular.peso+"kgs");
		
			System.out.println("Quer apertar o botão? 1 / sim   2/não");
			int resposta = s.nextInt();
			
			if(resposta==1) {
				if(celular.ligado == false) {
					celular.ligado = true;
					System.out.println("Agora ele está ligado");
				} else {
					celular.ligado = false;
					System.out.println("Agora ele está desligado");
				}
			}
			
			s.close();
		}
}
