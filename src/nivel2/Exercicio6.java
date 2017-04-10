package nivel2;

import java.util.Scanner;

public class Exercicio6 {
	public Exercicio6(){
		int var1, var2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira dois numeros diferentes");
		
		do{
			System.out.print("Insira o primeiro numero: ");
			var1 = s.nextInt();
			
			System.out.print("Insira o segundo numero: ");
			var2 = s.nextInt();
		}
		while(var1 == var2);
		
		if(var1 > var2){
			for(int i = var2+1; i < var1; i++){
				if(i % 2 == 0){
					System.out.println("" + i);
				}
			}
		}
		else{
			for(int i = var1+1; i < var2; i++){
				if(i % 2 == 0){
					System.out.println("" + i);
				}
			}
		}
	}
}
