package nivel1;

import java.util.Scanner;

public class Exercicio1 {
	public Exercicio1(){
		double[] valores = new double[5];
		double[] minMax = new double[2];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < valores.length; i++){
			System.out.print("Insira o " + (i+1) + " numero: ");
			valores[i] = s.nextDouble();
			
			if(i == 0){
				minMax[0] = valores[i];
				minMax[1] = valores[i];
			}
			else{
				if(minMax[0] > valores[i])
					minMax[0] = valores[i];
				
				else if(minMax[1] < valores[i])
					minMax[1] = valores[i];
			}
		}
		
		System.out.println("O numero mais pequeno é o " + minMax[0]);
		System.out.println("O maior numero é o " + minMax[1]);
	}
}
