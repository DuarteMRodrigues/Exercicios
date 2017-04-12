package nivel1;

import java.util.Scanner;

public class Exercicio5 {
	public Exercicio5(){
		double[] numero = new double[2];
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("Insira um numero: ");
			numero[0] = s.nextDouble();
			numero[1] += numero[0];
		}while(numero[0] != 0);
		
		System.out.print("A soma de todos os numeros foi: " + numero[1]);
	}
}
