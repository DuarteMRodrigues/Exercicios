package nivel2;

import java.util.Scanner;

public class Exercicio2 {
	public Exercicio2(){
		char[] valores = new char[1];
		int cont = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.print("Insira o " + (i+1) + " carater: ");
			valores[0] = s.next().charAt(0);
			
			if(valores[0] > 47 && valores[0] < 58){
				cont++;
			}
		}
		
		System.out.println("Houveram " + cont + " carateres correspondentes a um numero.");
	}
}
