package nivel3;

import java.util.Random;

public class Exercicio3 {
	public Exercicio3(){
		/*Sabendo � partida que o c�digo que gera um c�digo aleat�rio � o seguinte:
		Random rand = new Random();
		
		Exemplo atribui � vari�vel numAleatorio um n�mero aleat�rio entre 0 e 19. 
		int numAleatorio = rand.nextInt(20);

		Crie um array com 20 espa�os
		Preencha-o com n�meros aleat�rios entre 1 a 9
		Mostre na consola quantas vezes cada n�mero (1-9) se repete.
		N�mero de repeti��es: 1 - 2x 2 - 3x 3 - 2x 4 - 5x 5 - 1x 6 - 2x 7 - 1x 8 - 3x 9 - 1x */

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
