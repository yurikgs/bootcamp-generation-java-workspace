
import java.util.Scanner;

/* * 
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.

 * */

public class Exercicio1 {
		public static void main(String[] args) {
		
			int anos, meses, dias, idadeEmDias;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Quantos anos você tem? ");
			anos = s.nextInt();
			
			System.out.println("E quantos meses? ");
			meses = s.nextInt();
			
			System.out.println("E quantos dias?");
			dias = s.nextInt();			
			
			idadeEmDias = anos*360 + meses*30 + dias;
			
			System.out.println("Sua idade em dias é "+idadeEmDias+" dias.");
			
			// Fechamento do objeto s (Scanner)
			s.close();
		}
}
