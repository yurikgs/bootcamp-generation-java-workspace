package br.com.pool2ex3;

import java.util.ArrayList;

public class Laticinios extends Produtos {
	static ArrayList<Laticinios> criarLista()  { // <--- forma de declarar um m�todo q retorna objeto tipo ArrayList
		   
		   
			    Laticinios leiteParmalat1l = new Laticinios();
						
						leiteParmalat1l.setNome("Leite Parmalat");
						leiteParmalat1l.setPreco(5);
						leiteParmalat1l.setTipo("UHT Longa Vida 1l");
				
				Laticinios queijoBolaBoaNataFatiado = new Laticinios();
				
						queijoBolaBoaNataFatiado.setNome("Queijo Boa Nata");
						queijoBolaBoaNataFatiado.setPreco(45);
						queijoBolaBoaNataFatiado.setTipo("Bola Fatiado");
				
				Laticinios yogurteElegeCartela = new Laticinios();
						
						yogurteElegeCartela.setNome("Ygurte Eleg�");
						yogurteElegeCartela.setPreco(4);
						yogurteElegeCartela.setTipo("Cartela com 6");
				
				Laticinios bebidaLacteaVacaBraba1l = new Laticinios();
						
						bebidaLacteaVacaBraba1l.setNome("Beb L�ctea Vaca Braba");
						bebidaLacteaVacaBraba1l.setPreco(1);
						bebidaLacteaVacaBraba1l.setTipo("1l");
				
				ArrayList<Laticinios> Laticinios = new ArrayList<Laticinios>();
				
				Laticinios.add(leiteParmalat1l);
				Laticinios.add(queijoBolaBoaNataFatiado);
				Laticinios.add(yogurteElegeCartela);
				Laticinios.add(bebidaLacteaVacaBraba1l);
				
				return Laticinios;
		}
		
			public String toString() { // essa fun��o � necess�ria para, sempre que o obj for impresso,
									   // todos os seus atributos serem impressos tamb�m.
				String nome = this.getNome();
				int preco = this.getPreco();
				String tipo = this.getTipo();
				
				return ("\n | nome: " + nome + ", pre�o: " + preco + " tipo: " + tipo + " |");
			}
}
