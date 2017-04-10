package nivel1;

import java.util.Scanner;

public class Exercicio1 {
	public Exercicio1(){
		int[] valores = new int[5];
		int[] minMax = new int[2];
		Scanner s = new Scanner(System.in);
		
		minMax[0] = 0; minMax[1] = 0;
		
		for(int i = 0; i < valores.length; i++){
			System.out.print("Insira o " + (i+1) + " numero: ");
			valores[i] = s.nextInt();
			
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
