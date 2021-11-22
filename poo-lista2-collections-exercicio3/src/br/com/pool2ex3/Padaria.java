package br.com.pool2ex3;

import java.util.ArrayList;

public class Padaria extends Produtos {
	static ArrayList<Padaria> criarLista()  { // <--- forma de declarar um método q retorna objeto tipo ArrayList
		   
		   
	    Padaria paoFrances = new Padaria();
				
				paoFrances.setNome("Pao frânces");
				paoFrances.setPreco(6);
				paoFrances.setTipo("Pao frânces");
		
		Padaria paoDeFormaPlusVita = new Padaria();
		
				paoDeFormaPlusVita.setNome("Pão Plus Vita");
				paoDeFormaPlusVita.setPreco(5);
				paoDeFormaPlusVita.setTipo("Forma");
		
		Padaria mortadelaSadiaOuroDefumada = new Padaria();
				
				mortadelaSadiaOuroDefumada.setNome("Mortadela Sadia");
				mortadelaSadiaOuroDefumada.setPreco(19);
				mortadelaSadiaOuroDefumada.setTipo("Ouro defumada");
		
		Padaria margarinaQualy500g = new Padaria();
				
				margarinaQualy500g.setNome("Margarina Qualy");
				margarinaQualy500g.setPreco(7);
				margarinaQualy500g.setTipo("500g");
		
		ArrayList<Padaria> Padaria = new ArrayList<Padaria>();
		
		Padaria.add(paoFrances);
		Padaria.add(paoDeFormaPlusVita);
		Padaria.add(mortadelaSadiaOuroDefumada);
		Padaria.add(margarinaQualy500g);
		
		return Padaria;
}

	public String toString() { // essa função é necessária para, sempre que o obj for impresso,
							   // todos os seus atributos serem impressos também.
		String nome = this.getNome();
		int preco = this.getPreco();
		String tipo = this.getTipo();
		
		return ("\n | nome: " + nome + ", preço: " + preco + " tipo: " + tipo + " |");
	}
}
