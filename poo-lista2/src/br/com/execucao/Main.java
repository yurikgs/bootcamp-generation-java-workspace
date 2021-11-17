package br.com.execucao;

import br.com.documentacao.*;


public class Main {
		public static void main(String[] args) {
			
			Cavalo tornado  = new Cavalo();
			Cachorro rex    = new Cachorro();
			Preguiça flecha = new Preguiça();
			
			tornado.setNome("Tornado");
			rex.setNome("Rex");
			flecha.setNome("Flecha");
			
			tornado.emitirSom();
			rex.emitirSom();
			flecha.emitirSom();
		}
}
