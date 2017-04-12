package nivel3;

import java.util.Scanner;

public class Exercicio15 {
	public Exercicio15(){
		int[] vendas = new int[5];
		int[] dia = {1, 2, 3, 4, 5};
		int temp = 0, tempDia = 0;
		double media = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < vendas.length; i++){
			System.out.print("Insira as vendas do dia " + (i+1) + ": ");
			vendas[i] = s.nextInt();
			media += vendas[i];
			
			for(int j = 4; j >= 1; j--){
				if(vendas[j-1] < vendas[j]){
					temp = vendas[j-1];
					tempDia = dia[j-1];
					vendas[j-1] = vendas[j];
					dia[j-1] = dia[j];
					vendas[j] = temp;
					dia[j] = tempDia;
				}
			}
		}
		
		media /= 5;
		System.out.println("A media de vendas por dia foi: " + media);
		
		for(int i = 0; i < vendas.length; i++){
			System.out.println("Dia " + dia[i] + ": " + vendas[i]);
		}
		
	}
}
