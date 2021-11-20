package br.com.pool2ex3;


public class ExecutaLista {
		
		public static void main(String[] args) {				
				
			int resposta;
			
				Produtos produtos = new Produtos();
				resposta = produtos.boasVindas();
				produtos.criaListapedida(resposta);
				
				//Próximo passo: criar funções estáticas criaListaPedida(); em cada classe -> Consultar: Como fazer interface com métodos estáticos???
				//Verificar funcionamento
				//implementar função perguntafuncionalidades();
				//implementar funcionalidades
				//implementar despedidia
				
						//Correção: fazer os elementos com toString() com toString <--- // -> não deu certo!
						//Não deu certo --> fazer teste com um outro nome qualquer -- https://pt.stackoverflow.com/questions/212754/qual-%c3%a9-a-fun%c3%a7%c3%a3o-do-m%c3%a9todo-tostring
			    
			}




}
