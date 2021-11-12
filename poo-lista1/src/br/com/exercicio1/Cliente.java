/*
 *1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 * 
 * */

package br.com.exercicio1;

public class Cliente {
		
		//Declara��o de atributos - ficam como vari�veis, mas sem os valores:
		String nome, genero, humor = "neutro";
		int idade;
		
		//Declara��o dos m�todos relacionados
		void comprar() {
			System.out.println("O cliente est� comprando agora.");
			humor = "feliz ;)";
		}
		void reclamar() {
			System.out.println("O cliente tem uma reclama��o.");
			humor = "bolado!";
		}
		void elogiar() {
			System.out.println("O cliente est� elogiando a loja, parab�ns!");
			humor = "satisfeito";
		}
		void devolver() {
			System.out.println("O cliente est� devolvendo o produto.");
			humor = "frustrado";
		}
}
