package br.com.exercicio2;

public class CriaAviao {
		public static void main(String[] args) throws InterruptedException{
			
			Aviao boeng = new Aviao();
			
			boeng.cor = "Vermelho";
			boeng.tamanho = "100m";
			boeng.estadoMotor = "desligado";
			boeng.velocidade = 900;
			boeng.altura = 8000;
			
			System.out.println("\nO aviao "+boeng.cor+" de "+boeng.tamanho+
					" de comprimento est� a "+boeng.altura+" metros de altura e a "+" km/h. "+
					"\n\nResumo da situa��o: \n");
			System.out.printf("--> ");
			boeng.situacao();
		}
}
