package nivel1;

import java.util.Scanner;

public class Exercicio5 {
	public Exercicio5(){
		int numero = 0;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("Insira um numero: ");
			numero = s.nextInt();
			numero += numero;
		}while(numero != 0);
		
		System.out.print("A soma de todos os numeros foi: " + numero);
	}
}
