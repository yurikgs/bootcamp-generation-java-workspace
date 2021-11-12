/*
 *1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 * 
 * */

package br.com.exercicio1;

public class Cliente {
		
		//Declaração de atributos - ficam como variáveis, mas sem os valores:
		String nome, genero, humor = "neutro";
		int idade;
		
		//Declaração dos métodos relacionados
		void comprar() {
			System.out.println("O cliente está comprando agora.");
			humor = "feliz ;)";
		}
		void reclamar() {
			System.out.println("O cliente tem uma reclamação.");
			humor = "bolado!";
		}
		void elogiar() {
			System.out.println("O cliente está elogiando a loja, parabéns!");
			humor = "satisfeito";
		}
		void devolver() {
			System.out.println("O cliente está devolvendo o produto.");
			humor = "frustrado";
		}
}
