package nivel2;

import java.util.Scanner;

public class Exercicio2 {
	public Exercicio2(){
		char[] valores = new char[5];
		int cont = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < valores.length; i++){
			System.out.print("Insira o " + (i+1) + " carater: ");
			valores[i] = s.next().charAt(0);
			
			if(valores[i] > 47 && valores[i] < 58){
				cont++;
			}
		}
		
		System.out.println("Houveram " + cont + " carateres correspondentes a um numero.");
	}
}
