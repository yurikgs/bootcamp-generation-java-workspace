package br.com.pool2ex3;
import java.util.ArrayList;
//import java.util.ArrayList;
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
		return testaResposta0A4(resposta);
	}	
	
	
	@Override
	public int perguntaListas() {
		int resposta = 0;
		System.out.println("Okay! Qual lista você gostaria de consultar?"
				+ " Digite: \n |1-Bebidas| |2-Carnes| |3-Laticínios| |4-Padaria|");
		resposta = s.nextInt();
		return testaResposta0A4(resposta);
	}
	
	@Override
	public int perguntaFuncionalidades() {
		int resposta;
		System.out.println("Okay! O que você gostaria de fazer nessa lista? Digite: "
				+ " |1 - Adicionar Item| \n |2 - Remover Item| \n |3 - Atualizar Item| \n |4 - Apagar List|");
		resposta = s.nextInt();
		testaResposta0A4(resposta);
		return resposta;
	}
	
	public int executaFuncao( int numeroFuncao, ArrayList<?> lista, String nomeDaLista, int numeroDaLista) {
		
		System.out.println("Okay! \n\n  Você Selecionou a Lista "+nomeDaLista);
		
		if (numeroFuncao==1) {
			return armazenar(lista);
		} else
		if (numeroFuncao==2) {
			return remover(lista);
		} else
		if (numeroFuncao==3) {
			return atualizar(lista);
		} else
		if (numeroFuncao==4) {
			return apresentar(lista);
		} else {return 0;}
	}

	@Override
	public String despedidaUsuario() {
		
		return "\n\n        Obrigado por usar nosso sistema!  :) ";
	}
	
	@Override
	public int testaResposta0A4(int resposta) {
		while(resposta<1||resposta>4) {
			System.out.println("Resposta inválida. Por favor, Digite: "
					+ " \n\n |1-Bebidas| |2-Carnes| |3-Laticínios| |4-Padaria|");
			resposta = s.nextInt();
		}
		return resposta;
	}	
	
	@Override
	public int testaResposta0E1(int resposta) {
		while(resposta<1||resposta>2) {
			System.out.println("Resposta inválida. Por favor, Digite: "
					+ "\n  0 para sim e 1 para não\n");
			resposta = s.nextInt();
		}
		return resposta;
	}
	
	// Métodos de Funcionalidades:
	
	@Override
	public int armazenar(ArrayList<?> lista, int numeroDaLista) {
	
	System.out.println("Digite o nome do item que você quer armazenar: /n");
	String nome = s.nextLine();
	System.out.println("Qual o preço? ");
	String preço = s.nextLine();
	System.out.println("Adicione quaisquer descrições de tipo: ");
	String tipo = s.nextLine();
		
	///////Adicionar variável lista de setores aos parametros, 
	//criar um if para gerar um objeto correspondente, deacordo com o num da Lista
	//Fazer um teste aqui	
	System.out.println("    Você gostaria de executar mais alguma tarefa? /n"
				+ "    Digte 0 para sim e 1 para não/n/n");
	return testaResposta0E1(s.nextInt());
		
	}

	@Override
	public int remover(ArrayList<?> lista) {
	
		// TODO Auto-generated method stub

	
		
		
		
		
	System.out.println("    Você gostaria de executar mais alguma tarefa? /n"
				+ "    Digte 0 para sim e 1 para não/n/n");
	return testaResposta0E1(s.nextInt());
	}

	@Override
	public int atualizar(ArrayList<?> lista) {

		// TODO Auto-generated method stub

		
		
		
		
	System.out.println("    Você gostaria de executar mais alguma tarefa? /n"
				+ "    Digte 0 para sim e 1 para não/n/n");
	return testaResposta0E1(s.nextInt());		
	}

	@Override
	public int apresentar(ArrayList<?> lista) {
	

		
		
		
		
	System.out.println("    Você gostaria de executar mais alguma tarefa? /n"
				+ "    Digte 0 para sim e 1 para não/n/n");
	return testaResposta0E1(s.nextInt());

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
