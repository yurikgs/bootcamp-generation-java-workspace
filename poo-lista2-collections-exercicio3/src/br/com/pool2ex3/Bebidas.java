package br.com.pool2ex3;

import java.util.ArrayList;

public class Bebidas extends Produtos {
	
			static ArrayList<Bebidas> criarLista()  { // <--- forma de declarar um método q retorna objeto tipo ArrayList
				   
				   
			    Bebidas brahmaLatao = new Bebidas();
						
						brahmaLatao.setNome("Cerveja Brahma");
						brahmaLatao.setPreco(4);
						brahmaLatao.setTipo("Latao");
				
				Bebidas coca2l = new Bebidas();
				
						coca2l.setNome("Coca Cola");
						coca2l.setPreco(9);
						coca2l.setTipo("2l");
				
				Bebidas delValleSuco1l = new Bebidas();
						
						delValleSuco1l.setNome("Suco Del Valle");
						delValleSuco1l.setPreco(6);
						delValleSuco1l.setTipo("1l");
				
				Bebidas cachaça511l = new Bebidas();
						
						cachaça511l.setNome("Cachaça 51");
						cachaça511l.setPreco(7);
						cachaça511l.setTipo("1l");
				
				ArrayList<Bebidas> Bebidas = new ArrayList<Bebidas>();
				
				Bebidas.add(brahmaLatao);
				Bebidas.add(coca2l);
				Bebidas.add(delValleSuco1l);
				Bebidas.add(cachaça511l);
				
				return Bebidas;
		}
	
			public String toString() { // essa função é necessária para, sempre que o obj for impresso,
									   // todos os seus atributos serem impressos também.
				String nome = this.getNome();
				int preco = this.getPreco();
				String tipo = this.getTipo();
				
				return ("\n | nome: " + nome + ", preço: " + preco + " tipo: " + tipo + " |");
			}
}
