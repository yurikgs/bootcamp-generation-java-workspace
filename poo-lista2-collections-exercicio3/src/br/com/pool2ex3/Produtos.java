package br.com.pool2ex3;
import java.util.ArrayList;
import java.util.Scanner;

public class Produtos implements Funcionalidades, EntradaSaida {
	
	private String nome;
	private String tipo;
	private int preco;


	Scanner s = new Scanner(System.in);
	

	
	//Métodos entrada saída:
	
	@Override
	public int boasVindas() {
		int resposta = 0;
		System.out.println("Olá! Qual lista você gostaria de consultar hoje?"
				+ " Digite: \n |1-Bebidas| |2-Carnes| |3-Laticínios| |4-Padaria|");
		resposta = s.nextInt();
		return testaResposta(resposta);
	}
	
	@Override
	public void criaListapedida(int entrada) {
		switch (entrada) {
		case 1: {
			ArrayList<Bebidas> bebidas = Bebidas.criarLista();
			System.out.println(bebidas);
		}
		case 2:{
			ArrayList<Carnes> bebidas = Carnes.criarLista();
			System.out.println(bebidas);
		}
		case 3:{
			ArrayList<Laticinios> laticinios = Laticinios.criarLista();
			System.out.println(laticinios);
		}
		case 4: {
			ArrayList<Padaria> laticinios = Laticinios.criarLista();
			System.out.println(laticinios);
		}
		default:
			throw new IllegalArgumentException("Valor Inválido: " + entrada + " Reinicie o programa!");
		}
	}
	
	@Override
	public int perguntaListas() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int perguntaFuncionalidades() {
		int resposta;
		System.out.println("Okay! O que você gostaria de fazer nessa lista? Digite: "
				+ " |1 - Adicionar Item| \n |2 - Remover Item| \n |3 - Atualizar Item| \n |4 - Apagar List|");
		resposta = s.nextInt();
		testaResposta(resposta);
		return resposta;
	}

	@Override
	public String despedidaUsuario() {
		
		return "\n\n        Obrigado por usar nosso sistema!  :) ";
	}
	
	@Override
	public int testaResposta(int resposta) {
		while(resposta<0||resposta>4) {
			System.out.println("Resposta inválida. Por favor, Digite: "
					+ " Digite: \n |1-Bebidas| |2-Carnes| |3-Laticínios| |4-Padaria|");
			resposta = s.nextInt();
		}
		return resposta;
	}	

	
	// Métodos de Funcionalidades
	@Override
	public void armazenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		
	}


// SETTERS AND GETTERS:
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}




	


	
	
	
	
}
