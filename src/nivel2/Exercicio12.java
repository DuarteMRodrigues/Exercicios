package nivel2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {
	public Exercicio12(){
		int[] array = new int[10];
		int cont = 0;
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(21);
			
			if(array[i] >= 10){
				cont++;
			}
		}
		System.out.println("A quantidade de positivas na turma foi: " + cont);
	}
}
