package br.com.pool2ex3;

import java.util.ArrayList;

//import java.util.ArrayList;

public interface EntradaSaida {
	int boasVindas();
	int perguntaListas();
	int perguntaFuncionalidades();
	public int executaFuncao( int numeroFuncao, ArrayList<?> lista, String nomeDaLista);
	String despedidaUsuario();	
	int testaResposta0A4(int resposta);
	int testaResposta0E1(int resposta);
}
