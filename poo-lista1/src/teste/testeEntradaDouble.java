package teste;

import java.util.Scanner;

public class testeEntradaDouble {
		public static void main(String[] args) {
			double numero;
			Scanner s = new Scanner(System.in);
			
			numero = s.nextDouble();
			System.out.println(numero);
			
			s.close();
		}
}
