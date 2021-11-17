package br.com.documentacao; //LEIA OS COMENTÁRIOS AO FINAL DESSE ARQUIVO

public abstract class Animal implements AnimalMetodos{

		// Variáveis:
	
		String nome;
		int idade;
	
		// Getters and Setters:
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		//Construtor:
		
		public Animal() {
			
			// TODO Auto-generated constructor stub
		}
}
//NOTE:  IMPLEMENTAÇÃO SÓ VAI FUNCIONAR CPRRETAMENTE EM PARALELO COM A HERANÇA
//SE VC IMPLEMENTAR A SUPERCLASSE.  NO CASO DE A SUPERCLASSE ESTAR PROTEGIDA 
//  (COM ABSTRACT)   CONTRA INSTACIAÇÃO, NÃO SERÁ NECESSÁRIO ESCREVER OS MÉTODOS
// IMPLEMENTADOS NELA, ENTRETANTO. (TIRE O ABSTRACT DESTE CÓDIGO E VEJA O CÓDIGO
// DE ERRO, PARA ENTENDER MELHOR)

//OUTRA COISA!! ABSTRACT SETA AUTOMÁTICAMENTE AS VARIÁVEIS PARA PRIVATE. É preciso criar 
// portanto os getters and setters para acessar essas variáveis.
