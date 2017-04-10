package nivel2;

import java.util.Scanner;

public class Exercicio7 {
	public Exercicio7(){
		int[] tempos = new int[3];
		int[] max = new int[2];
		int[] min = new int[2];
		int soma = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < tempos.length; i++){
			System.out.print("Insira o tempo do " + (i+1) + " piloto: ");
			tempos[i] = s.nextInt();
			
			soma += tempos[i];
			
			if(i == 0){
				min[0] = tempos[i];
				min[1] = i + 1;
			}
			
			if(min[0] > tempos[i]){
				min[0] = tempos[i];
				min[1] = i + 1;
			}
			
			if(max[0] < tempos[i]){
				max[0] = tempos[i];
				max[1] = i + 1;
			}
		}
		
		System.out.println("O piloto com o tempo mais rapido foi o: " + min[1]);
		System.out.println("O piloto com o tempo mais lento foi o: " + max[1]);
		System.out.println("A soma dos tres tempos foi: " + soma);
	}
}
