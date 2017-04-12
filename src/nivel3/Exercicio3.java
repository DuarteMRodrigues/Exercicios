package nivel3;

import java.util.Random;

public class Exercicio3 {
	public Exercicio3(){
		int[] nums = new int[20];
		int[] qtdNums = new int[10];
		Random rand = new Random();
		
		/* A Minha Logica
		for(int i = 0; i < 20; i++){
			nums[i] = rand.nextInt(9) + 1;
		
			for(int j = 0; j < 9; j++){
				if(j + 1 == nums[i]){
					qtdNums[j]++;
					break;
				}
			}
		}*/
		
		// A Logica do Filipe
		for(int i = 0; i < 20; i++){
			nums[i] = rand.nextInt(9) + 1;
			qtdNums[nums[i]-1]++;
		}
		
		for(int i = 0; i < 9; i++){
			System.out.println("Existem " + qtdNums[i] + " \"" + (i+1) + "s\"");
		}
	}
}
