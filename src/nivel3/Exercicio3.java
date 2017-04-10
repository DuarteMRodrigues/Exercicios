package nivel3;

import java.util.Random;

public class Exercicio3 {
	public Exercicio3(){
		/*Sabendo à partida que o código que gera um código aleatório é o seguinte:
		Random rand = new Random();
		
		Exemplo atribui à variável numAleatorio um número aleatório entre 0 e 19. 
		int numAleatorio = rand.nextInt(20);

		Crie um array com 20 espaços
		Preencha-o com números aleatórios entre 1 a 9
		Mostre na consola quantas vezes cada número (1-9) se repete.
		Número de repetições: 1 - 2x 2 - 3x 3 - 2x 4 - 5x 5 - 1x 6 - 2x 7 - 1x 8 - 3x 9 - 1x */

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
