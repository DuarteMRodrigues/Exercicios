package nivel3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
	public Exercicio8(){
		char[] valor = new char[1];
		int prev = 0, random, cont = 0;
		boolean continuar = true;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		random = r.nextInt(11);
		prev = random;
		
		do{
			random = r.nextInt(11);
			
			System.out.println("O valor foi: " + prev);
			
			do{
				System.out.println("Insira se o proximo valor vai ser menor ou maior que o numero anterior");
				valor[0] = s.next().charAt(0);
			}while(valor[0] != 'c' && valor[0] != 'C' && valor[0] != 'b' && valor[0] != 'b');
		
			if(random <= prev && valor[0] == 'b' || valor[0] == 'B'){
				System.out.println("Acertou!");
				cont++;
			}
			else if(random >= prev && valor[0] == 'c' || valor[0] == 'C'){
				System.out.println("Acertou!");
				cont++;
			}
			else{
				System.out.println("Errou");
				continuar = false;
			}
				
			
			prev = random;
		}while(continuar);
		
		System.out.println("O valor era " + prev);
		System.out.println("Acertou um total de " + cont + " vezes");
	}
}
