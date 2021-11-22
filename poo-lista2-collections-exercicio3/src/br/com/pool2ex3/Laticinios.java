package br.com.pool2ex3;

import java.util.ArrayList;

public class Laticinios extends Produtos {
	static ArrayList<Laticinios> criarLista()  { // <--- forma de declarar um método q retorna objeto tipo ArrayList
		   
		   
			    Laticinios leiteParmalat1l = new Laticinios();
						
						leiteParmalat1l.setNome("Leite Parmalat");
						leiteParmalat1l.setPreco(5);
						leiteParmalat1l.setTipo("UHT Longa Vida 1l");
				
				Laticinios queijoBolaBoaNataFatiado = new Laticinios();
				
						queijoBolaBoaNataFatiado.setNome("Queijo Boa Nata");
						queijoBolaBoaNataFatiado.setPreco(45);
						queijoBolaBoaNataFatiado.setTipo("Bola Fatiado");
				
				Laticinios yogurteElegeCartela = new Laticinios();
						
						yogurteElegeCartela.setNome("Ygurte Elegê");
						yogurteElegeCartela.setPreco(4);
						yogurteElegeCartela.setTipo("Cartela com 6");
				
				Laticinios bebidaLacteaVacaBraba1l = new Laticinios();
						
						bebidaLacteaVacaBraba1l.setNome("Beb Láctea Vaca Braba");
						bebidaLacteaVacaBraba1l.setPreco(1);
						bebidaLacteaVacaBraba1l.setTipo("1l");
				
				ArrayList<Laticinios> Laticinios = new ArrayList<Laticinios>();
				
				Laticinios.add(leiteParmalat1l);
				Laticinios.add(queijoBolaBoaNataFatiado);
				Laticinios.add(yogurteElegeCartela);
				Laticinios.add(bebidaLacteaVacaBraba1l);
				
				return Laticinios;
		}
		
			public String toString() { // essa função é necessária para, sempre que o obj for impresso,
									   // todos os seus atributos serem impressos também.
				String nome = this.getNome();
				int preco = this.getPreco();
				String tipo = this.getTipo();
				
				return ("\n | nome: " + nome + ", preço: " + preco + " tipo: " + tipo + " |");
			}
}
