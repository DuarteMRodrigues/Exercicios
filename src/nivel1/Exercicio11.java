package nivel1;

import java.util.Scanner;

public class Exercicio11 {
	public Exercicio11(){
		double[] notas = new double[6];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			do{
				System.out.print("Introduza a " + (i+1) + " nota: ");
				notas[i] = s.nextDouble();
			}while(notas[i] < 0 || notas[i] > 20);
			notas[notas.length-1] += notas[i];
		}
		
		notas[notas.length-1] /= 5;
		
		System.out.println("A media foi: " + notas[notas.length-1]);
	}
}
