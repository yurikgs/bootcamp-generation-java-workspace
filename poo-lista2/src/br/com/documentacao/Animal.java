package br.com.documentacao; //LEIA OS COMENT�RIOS AO FINAL DESSE ARQUIVO

public abstract class Animal implements AnimalMetodos{

		// Vari�veis:
	
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
//NOTE:  IMPLEMENTA��O S� VAI FUNCIONAR CPRRETAMENTE EM PARALELO COM A HERAN�A
//SE VC IMPLEMENTAR A SUPERCLASSE.  NO CASO DE A SUPERCLASSE ESTAR PROTEGIDA 
//  (COM ABSTRACT)   CONTRA INSTACIA��O, N�O SER� NECESS�RIO ESCREVER OS M�TODOS
// IMPLEMENTADOS NELA, ENTRETANTO. (TIRE O ABSTRACT DESTE C�DIGO E VEJA O C�DIGO
// DE ERRO, PARA ENTENDER MELHOR)

//OUTRA COISA!! ABSTRACT SETA AUTOM�TICAMENTE AS VARI�VEIS PARA PRIVATE. � preciso criar 
// portanto os getters and setters para acessar essas vari�veis.
