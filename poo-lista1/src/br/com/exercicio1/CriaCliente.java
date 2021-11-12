package br.com.exercicio1;

public class CriaCliente {
	public static void main(String[] args) throws InterruptedException{
		
		Cliente cliente171 = new Cliente();
		
		cliente171.nome = "Zé";
		cliente171.genero = "Masculino";
		cliente171.idade = 41;
		
		System.out.println(cliente171.nome+" "+
				cliente171.genero+" "+cliente171.idade
				+" "+cliente171.humor);
		
		cliente171.comprar();
		System.out.println("humor = "+cliente171.humor);
		Thread.sleep(2000);
		
		cliente171.elogiar();
		System.out.println("humor = "+cliente171.humor);
		Thread.sleep(2000);
		
		cliente171.reclamar();
		System.out.println("humor = "+cliente171.humor);
		Thread.sleep(2000);
		
		cliente171.devolver();
		System.out.println("humor = "+cliente171.humor);
	}
}