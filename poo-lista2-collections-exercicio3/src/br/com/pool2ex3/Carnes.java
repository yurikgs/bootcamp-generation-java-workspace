package br.com.pool2ex3;

import java.util.ArrayList;

public class Carnes extends Produtos {
   
	static ArrayList<Carnes> criarLista()  { // <--- forma de declarar um método q retorna objeto
	   
	   
				    Carnes picanha = new Carnes();
							
							picanha.setNome("Picanha");
							picanha.setPreco(70);
							picanha.setTipo("Bovina");
					
					Carnes alcatara = new Carnes();
					
							alcatara.setNome("Alcatara");
							alcatara.setPreco(40);
							alcatara.setTipo("Bovina");
					
					Carnes lombo = new Carnes();
							
							lombo.setNome("Lombo");
							lombo.setPreco(18);
							lombo.setTipo("Suíno");
					
					Carnes fileMerluza = new Carnes();
							
							fileMerluza.setNome("Filé de Merluza");
							fileMerluza.setPreco(25);
							fileMerluza.setTipo("Peixe");
					
					ArrayList<Carnes> carnes = new ArrayList<Carnes>();
					
					carnes.add(picanha);
					carnes.add(alcatara);
					carnes.add(lombo);
					carnes.add(fileMerluza);
					
					return carnes;
   }
	
	public String toString() {        // essa função é necessária para, sempre que o obj for impresso, 
									  // todos os seus atributos serem impressos também.	
		String nome = this.getNome();
		int preco = this.getPreco();
		String tipo = this.getTipo();
		return (" | nome: "+nome+", preço: "+preco+" tipo: "+tipo+" |");
	}
}
