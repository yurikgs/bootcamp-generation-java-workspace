package br.com.pool2ex3;

import java.util.ArrayList;

public class ExecutaLista {
		
		private static final String String = null;

		public static void main(String[] args, int ArrayList) {				
			//DECLARAÇÃO DE VARIÁVEIS	
			int numeroLista, numeroFuncao, numeroContinua = 0;
			ArrayList<String> nomesDasListas = new ArrayList<String>();
			
			// CRIAÇÃO DA BASE DE DADOS
			
			ArrayList<ArrayList<?>> listaDeSetores = new ArrayList<ArrayList<?>>();
			
			ArrayList<Bebidas> bebidas = Bebidas.criarLista();
			ArrayList<Carnes> carnes = Carnes.criarLista();
			ArrayList<Laticinios> laticinios = Laticinios.criarLista();
			ArrayList<Padaria> padaria = Padaria.criarLista();
			
			listaDeSetores.add(bebidas);
			nomesDasListas.add("bebidas");
			listaDeSetores.add(carnes);
			nomesDasListas.add("carnes");
			listaDeSetores.add(laticinios);
			nomesDasListas.add("laticinios");
			listaDeSetores.add(padaria);
			nomesDasListas.add("padaria");
			
			
			//STATEMENTS
				
			Produtos produtos = new Produtos();
			numeroLista = produtos.boasVindas();
			numeroFuncao = produtos.perguntaFuncionalidades();			
			
			while (numeroContinua==0) { //  numeroContinua == 1 encerra o programa. 
				numeroContinua = produtos.executaFuncao(numeroFuncao, listaDeSetores.get(numeroLista), nomesDasListas.get(numeroLista));
				
				if (numeroContinua==0) {
					numeroLista = produtos.perguntaListas();
					numeroFuncao = produtos.perguntaFuncionalidades();
				}
			
				produtos.despedidaUsuario();
				
			}
			
			
			
			System.out.println(listaDeSetores.get(0));
				
				
				
				


				
				//implementar função perguntafuncionalidades();
				//implementar funcionalidades
				//implementar despedidia
				//implementar método de espera (...) humanização
				//organizar as classes e interfaces em pacotes
				
			}



		
}
